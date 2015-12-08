(function(f){if(typeof exports==="object"&&typeof module!=="undefined"){module.exports=f()}else if(typeof define==="function"&&define.amd){define([],f)}else{var g;if(typeof window!=="undefined"){g=window}else if(typeof global!=="undefined"){g=global}else if(typeof self!=="undefined"){g=self}else{g=this}g.AvatarBuilder = f()}})(function(){var define,module,exports;return (function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);var f=new Error("Cannot find module '"+o+"'");throw f.code="MODULE_NOT_FOUND",f}var l=n[o]={exports:{}};t[o][0].call(l.exports,function(e){var n=t[o][1][e];return s(n?n:e)},l,l.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({1:[function(require,module,exports){
var AvatarMutableState = require('../stores/avatar');


var BODY_TYPE   = 'body_type';
var BODY_HEIGHT = 'body_height';
var BREAST_TYPE = 'breast_type';

function get(type) {
    var deltaValue = getDeltaValue(type);
    return typeof deltaValue !== "undefined" ? deltaValue : getCurrentValue(type);
}


function getDeltaValue(type) {
    var delta = AvatarMutableState.delta;
    return delta.body[type];
}


function getCurrentValue(type) {
    var currentData = AvatarMutableState.currentData;

    if (currentData.body && typeof currentData.body[type] !== "undefined") {
        return currentData.body[type];
    }

  return null;
}

function set(type, value) {
    var delta = AvatarMutableState.delta;
    delta.body[type] = value;
}


function setBodyType(optionNumber) {
    set(BODY_TYPE, optionNumber);
}


function setBodyHeight(optionNumber) {
    set(BODY_HEIGHT, optionNumber);
}


function setBreastType(optionNumber) {
    set(BREAST_TYPE, optionNumber);
}

function getBodyType (optionNumber) {
    return get(BODY_TYPE);
}

function getBodyHeight (optionNumber) {
    return get(BODY_HEIGHT);
}

function getBreastType (optionNumber) {
    return get(BREAST_TYPE);
}

module.exports = {
    BODY_TYPE: BODY_TYPE,
    BODY_HEIGHT: BODY_HEIGHT,
    BREAST_TYPE: BREAST_TYPE,
    getBodyType: getBodyType,
    getBodyHeight: getBodyHeight,
    getBreastType: getBreastType,
    setBodyType: setBodyType,
    setBodyHeight: setBodyHeight,
    setBreastType: setBreastType
};

},{"../stores/avatar":48}],2:[function(require,module,exports){
var AvatarArtHead = require('./head');
var AvatarArtHair = require('./hair');

// These lists come directly from CharacterCreatorData.as and may require
// modifications for HTML5 Avatar Builder - DB


// These are the categories that appear in the drop menu. It includes some
//categories that do not appear by default in the scrolling list.
var categoriesMenu = {
	"man": [
    "faceProportions", "skinTones", "hairTones", "hairLengths", "hairTypes",
    "hairStyles", "jawTypes", "eyeBrowTypes", "eyeTypes", "eyelashTypes", "pupilTypes", "pupilTones",
    "noseTypes", "mouthTypes", "earTypes", "earringTypes", "lineCombos", "beardTypes", "eyeDetails",
    "cheekDetails", "faceLines", "blushTones", "eyeshadowTones", "lipstickTones", "glasses",
    "hats", "hairAccessories", "bodyHeight", "bodyType", 'outfit',
    "finish"
  ],
  "woman": [
    "faceProportions", "skinTones", "hairTones", "hairLengths", "hairTypes",
    "hairStyles", "jawTypes", "eyeBrowTypes", "eyeTypes", "eyelashTypes", "pupilTypes", "pupilTones",
    "noseTypes", "mouthTypes", "earTypes", "earringTypes", "lineCombos", "eyeDetails",
    "cheekDetails", "faceLines", "blushTones", "eyeshadowTones", "lipstickTones", "glasses",
    "hats", "hairAccessories", "bodyHeight", "bodyType", "breastType", 'outfit',
    "finish"
  ]
};


// These are the categories that appear by default when the user scrolls
// horizontally through the list.
var categoriesScroll = {
	"man": [
    "FaceProportions", "SkinTone", "HairTone", "HairLength", "HairType",
    "HairStyle", "JawType", "EyeBrowType", "EyeType", "PupilType", "PupilTone",
    "NoseType", "MouthType", "EarType", "LineCombos", "BeardType", "Glasses",
    "BodyHeight", "BodyType", 'Outfit', "finish"
  ],
  "woman": [
    "FaceProportions", "SkinTone", "HairTone", "HairLength", "HairType",
    "HairStyle", "JawType", "EyeBrowType", "EyeType", "EyelashType", "PupilType", "PupilTone",
    "NoseType", "MouthType", "EarType", "EarringType", "LineCombos", "BlushTone",
    "EyeshadowTone", "LipstickTone", "Glasses", "BodyHeight", "BodyType", "BreastType",
    'Outfit', "finish"
  ]
};


// Categories that appear in this list use the body view. All other categories
// use the head view.
var bodyView = ['BodyHeight', 'BodyType', 'BreastType', 'Outfit'];


// A list of hairStyles that would cause us to hide the "ears" category
var hair_front_hides_ear = [
  "hair_front_ashton", "hair_front_asymm","hair_front_ayano",
  "hair_front_bangs", "hair_front_bangs02", "hair_front_bangspulled",
  "hair_front_beyonce", "hair_front_bob01", "hair_front_bob02",
  "hair_front_bob03", "hair_front_dorian", "hair_front_dreadsdown01",
  "hair_front_dreadsdown02", "hair_front_kennyg", "hair_front_longcurl01",
  "hair_front_longcurl04", "hair_front_longcurl05", "hair_front_longcurl06",
  "hair_front_longcurl07", "hair_front_longcurl08", "hair_front_longcurl09",
  "hair_front_longcurlfem", "hair_front_longerwavy", "hair_front_longpart02",
  "hair_front_longstraight01", "hair_front_longstraight02",
  "hair_front_longstraight03", "hair_front_longstraight04",
  "hair_front_longstraight05", "hair_front_longstraight06",
  "hair_front_longstraight07", "hair_front_longstraight09",
  "hair_front_longstraight10", "hair_front_longstraight12",
  "hair_front_longstraightfem", "hair_front_longwavy", "hair_front_longwavy02",
  "hair_front_longwavy04", "hair_front_longwavy05", "hair_front_longwavy07",
  "hair_front_longwavy08", "hair_front_longwavy09", "hair_front_longwavy10",
  "hair_front_longwavy11", "hair_front_longwavy12", "hair_front_longwavy13",
  "hair_front_longwavy14", "hair_front_longwavyfem", "hair_front_midcurl01",
  "hair_front_midcurl02", "hair_front_midcurl03", "hair_front_midcurl04",
  "hair_front_midcurl05", "hair_front_midcurl06", "hair_front_midcurl07",
  "hair_front_midcurl08", "hair_front_midcurl09", "hair_front_midcurl10",
  "hair_front_midcurl11", "hair_front_midcurl13", "hair_front_midcurl14",
  "hair_front_midcurl15", "hair_front_midstraight01",
  "hair_front_midstraight03", "hair_front_midstraight04",
  "hair_front_midstraight05", "hair_front_midstraight06",
  "hair_front_midstraight07", "hair_front_midstraight08",
  "hair_front_midstraight09", "hair_front_midwavy01", "hair_front_midwavy03",
  "hair_front_midwavy03", "hair_front_midwavy06", "hair_front_midwavy09",
  "hair_front_midwavy10", "hair_front_midwavy11", "hair_front_midwavy13",
  "hair_front_midwavy14", "hair_front_ozzy", "hair_front_pixie",
  "hair_front_ringu", "hair_front_roro", "hair_front_shortcurl10",
  "hair_front_shortwavy09", "hair_front_skywalker", "hair_front_trethew",
  "hair_front_werewolf"];


// A list of pupil types that would cause us to hide the "pupilTones" category
var pupilWithoutTone = ["pupil_n1", "pupil_n2", "pupil_n3"];


function isWizardCategory(category, sex) {
  var scrollCategories = categoriesScroll[sex];

  // We need the name instead of the full object
  if (typeof category === "object") {
    category = category.name;
  }

  if (scrollCategories.indexOf(category) === -1) {
    return false;
  }

  if (category === "PupilTone") {
    return isPupilToneVisible();
  }

  if (category === "EarType" || category == "EarringType") {
    return areEarsVisible();
  }

  if (category === "HairType") {
      return isHairWithType();
  }

  return true;
}

function addCategoryToWizard(category, position, sex) {
    position = Math.max(position, 0);
    categoriesScroll[sex].splice(position, 0, category);
}


function isBodyCategory(categoryName) {
  return bodyView.indexOf(categoryName) !== -1;
}

function isFinalPreview(categoryName) {
  return categoryName === 'finish';
}


function isPupilToneVisible() {
  var currentPupilType = AvatarArtHead.getPupilType();

  if (pupilWithoutTone.indexOf(currentPupilType) === -1) {
    return true;
  }

  return false;
}


function areEarsVisible() {
  var hairFrontType = AvatarArtHead.getFrontHairType();
  return hair_front_hides_ear.indexOf(hairFrontType) === -1;
}


function isHairWithType() {
  var length =  AvatarArtHair.getHairLength();
  return length !== AvatarArtHair.HAIR_BALD && length !== AvatarArtHair.HAIR_SPECIAL;
}


function getHeadRotation(categoryName, styleName) {
  return (categoryName === "NoseType" && styleName !== "bitmoji") ? 1 : 0;
}


module.exports = {
  categoriesMenu: categoriesMenu,
  isWizardCategory: isWizardCategory,
  addCategoryToWizard: addCategoryToWizard,
  isBodyCategory: isBodyCategory,
  isFinalPreview: isFinalPreview,
  areEarsVisible: areEarsVisible,
  getHeadRotation: getHeadRotation
};

},{"./hair":23,"./head":24}],3:[function(require,module,exports){
module.exports = [
    '663d22',
    '592f1e',
    '311c1c',
    '181b1a',
    'b08b35',
    '937328',
    '6d4b1b',
    '372926',
    'db8402',
    'b14701',
    '7d2d24',
    '760101',
    'e6e6e6',
    '756f60',
    '8e927e',
    '36372f',
    'd2d202',
    '72b8b8',
    'fe67b3',
    'abacfe',
    'd2d202',
    '03ca02',
    'aa2b2b',
    '0280fd',
    '017647',
    'a00182',
    '0253ca'
];

},{}],4:[function(require,module,exports){
module.exports = [
    "_blank",
    "f3b9b0",
    "fda999",
    "fb9992",
    "db978f",
    "d28d78",
    "cb807d",
    "e99db4",
    "d18292",
    "c16f7b",
    "2f5973",
    "2669bf",
    "a2c5f2",
    "6c7dbc",
    "f2e3d5",
    "222222",
    "cccccc",
    "666666"
];

},{}],5:[function(require,module,exports){
var localize  = require('../../../lib/localize');


module.exports = function() {
    return [
      {value: 2, title: localize('Tallest')},
      {value: 1, title: localize('Tall')},
      {value: 0, title: localize('Average')},
      {value: 3, title: localize('Short')},
      {value: 4, title: localize('Shortest')}
    ];
};

},{"../../../lib/localize":45}],6:[function(require,module,exports){
var localize  = require('../../../lib/localize');


module.exports = function() {
    return [
      {value: 0, title: localize('Average')},
      {value: 3, title: localize('Slim')},
      {value: 5, title: localize('Athletic')},
      {value: 1, title: localize('Heavy')},
      {value: 4, title: localize('Slimmer')},
      {value: 2, title: localize('Heavier')},
      {value: 6, title: localize('Buff')}
    ];
};

},{"../../../lib/localize":45}],7:[function(require,module,exports){
var localize  = require('../../../lib/localize');


module.exports = function() {
    return [
      {value: 7, title: localize('Average')},
      {value: 9, title: localize('Slim')},
      {value: 10, title: localize('Athletic')},
      {value: 8, title: localize('Heavy')},
      {value: 4, title: localize('Slimmer')},
      {value: 2, title: localize('Heavier')},
      {value: 6, title: localize('Buff')}
    ];
};

},{"../../../lib/localize":45}],8:[function(require,module,exports){
var localize  = require('../../../lib/localize');


module.exports = function() {
    return [
      {value: 3, title: localize('Small')},
      {value: 0, title: localize('Medium')},
      {value: 1, title: localize('Bigger')},
      {value: 2, title: localize('Large')}
    ];
};

},{"../../../lib/localize":45}],9:[function(require,module,exports){
arguments[4][3][0].apply(exports,arguments)
},{"dup":3}],10:[function(require,module,exports){
module.exports = [
    "_blank",
    "cd9791",
    "b9978b",
    "90786c",
    "87a0b4",
    "a8abb4",
    "f2f2f2",
    "a3a679",
    "907655",
    "595959",
    "e0cdbe",
    "cfb3aa",
    "c79fb1",
    "bfd3d7",
    "c9c3e2",
    "a87e96",
    "af9284",
    "7a524a"
];

},{}],11:[function(require,module,exports){
var localize  = require('../../../lib/localize');


module.exports = function() {
    return [
      {value: 'short', title: localize('Short')},
      {value: 'medium', title: localize('Medium')},
      {value: 'long', title: localize('Long')},
      {value: 'bald', title: localize('Bald')},
      {value: 'special', title: localize('Wacky')}
    ];
};

},{"../../../lib/localize":45}],12:[function(require,module,exports){
var DATA = require('../content.json');


var BITSTRIPS_KEY = "1";
var MAN_KEY = "1";
var WOMAN_KEY = "2";


var BITSTRIPS_DATA = DATA[BITSTRIPS_KEY];


module.exports = {
    '1': {
        'bald': BITSTRIPS_DATA[MAN_KEY].hair_bald,
        'special': BITSTRIPS_DATA[MAN_KEY].hair_special,
        'long': {
            'curly': BITSTRIPS_DATA[MAN_KEY].hair_long_curly,
            'wavy': BITSTRIPS_DATA[MAN_KEY].hair_long_wavey,
            'straight': BITSTRIPS_DATA[MAN_KEY].hair_long_straight
        },
        'medium': {
            'curly': BITSTRIPS_DATA[MAN_KEY].hair_medium_curly,
            'wavy': BITSTRIPS_DATA[MAN_KEY].hair_medium_wavey,
            'straight': BITSTRIPS_DATA[MAN_KEY].hair_medium_straight
        },
        'short': {
            'curly': BITSTRIPS_DATA[MAN_KEY].hair_short_curly,
            'wavy': BITSTRIPS_DATA[MAN_KEY].hair_short_wavey,
            'straight': BITSTRIPS_DATA[MAN_KEY].hair_short_straight
        }
    },
    '2': {
        'bald': BITSTRIPS_DATA[WOMAN_KEY].hair_bald,
        'special': BITSTRIPS_DATA[WOMAN_KEY].hair_special,
        'long': {
            'curly': BITSTRIPS_DATA[WOMAN_KEY].hair_long_curly,
            'wavy': BITSTRIPS_DATA[WOMAN_KEY].hair_long_wavey,
            'straight': BITSTRIPS_DATA[WOMAN_KEY].hair_long_straight
        },
        'medium': {
            'curly': BITSTRIPS_DATA[WOMAN_KEY].hair_medium_curly,
            'wavy': BITSTRIPS_DATA[WOMAN_KEY].hair_medium_wavey,
            'straight': BITSTRIPS_DATA[WOMAN_KEY].hair_medium_straight
        },
        'short': {
            'curly': BITSTRIPS_DATA[WOMAN_KEY].hair_short_curly,
            'wavy': BITSTRIPS_DATA[WOMAN_KEY].hair_short_wavey,
            'straight': BITSTRIPS_DATA[WOMAN_KEY].hair_short_straight
        }
    }
};

},{"../content.json":19}],13:[function(require,module,exports){
module.exports = [
    '84532a',
    '653521',
    '492d2a',
    '272b2a',
    'e1cb9a',
    'bc9b34',
    'a67c26',
    '55413a',
    'ff9900',
    'd85a00',
    'a94631',
    '990000',
    'f7f7f7',
    'cfccc3',
    'a3a695',
    '7e836c',
    'ffffcc',
    '99cccc',
    'ff99cc',
    'ccccff',
    'ffff00',
    '00ff00',
    'cc3333',
    '3399ff',
    '009966',
    'cc0099',
    '0066ff'
];

},{}],14:[function(require,module,exports){
var localize  = require('../../../lib/localize');


module.exports = function() {
    return [
      {value: 'straight', title: localize('Straight')},
      {value: 'wavy', title: localize('Wavy')},
      {value: 'curly', title: localize('Curly')}
    ];
};

},{"../../../lib/localize":45}],15:[function(require,module,exports){
module.exports = [
    'f4c5c2',
    'ddb880',
    'ab704c',
    '733429',
    'ff9866',
    'd8ac6b',
    'b05f5a',
    '5E3322',
    'd79573',
    'c7866d',
    'a04f40',
    '5a281a',
    'b46f65',
    'ab8d53',
    '894a37',
    '3f261d',
    'b48e80',
    'bf8f8d',
    'dbaea4',
    'ffd5d5',
    '483728',
    'e47023',
    'ecbe0b',
    '127e32',
    '0c9e8f',
    '738df2',
    'aa61f3',
    'ec4646'
];

},{}],16:[function(require,module,exports){
module.exports = [
    "_blank",
    "cd1c43",
    "ea4a6a",
    "db523c",
    "cb786a",
    "9e1a54",
    "ef5142",
    "a66553",
    "750e32",
    "4a151b",
    "2f5973",
    "2669bf",
    "a2c5f2",
    "6c7dbc",
    "f2e3d5",
    "222222",
    "cccccc",
    "666666"
];

},{}],17:[function(require,module,exports){
module.exports = [
    "5b341c",
    "803c2e",
    "aa8452",
    "396bb5",
    "5c89b4",
    "75666a",
    "246436",
    "538a63",
    "111111",
    "655074",
    "586669",
    "585566",
    "465d6f",
    "327891",
    "71a8df",
    "b38d44",
    "a9ab86",
    "aab9cd"
];

},{}],18:[function(require,module,exports){
module.exports = [
    "fae7d0",
    "e8cda8",
    "b58a3f",
    "7b4b2a",
    "ffcc99",
    "dfc183",
    "b98865",
    "6a4126",
    "feb186",
    "ceab69",
    "aa724b",
    "5f3719",
    "c18e74",
    "caa661",
    "935d37",
    "483728",
    "c0a183",
    "c8aca3",
    "e3c2b7",
    "ffeeee",
    "db2d02",
    "e98849",
    "f7d03c",
    "159d3e",
    "0db7a5",
    "91a6f7",
    "c48ff8"
];

},{}],19:[function(require,module,exports){
module.exports={
    "1": {
        "1": {
            "hair_short_straight": [
                [
                    "cranium_default",
                    "forehead_standard",
                    "hair_back_default",
                    "hair_front_default",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight01",
                    "forehead_standard",
                    "hair_back_shortstraight01",
                    "hair_front_shortstraight01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_tom",
                    "forehead_standard",
                    "hair_back_tom",
                    "hair_front_tom",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwind",
                    "forehead_standard",
                    "hair_back_shortwind",
                    "hair_front_shortwind",
                    "hairbottom_blank"
                ],
                [
                    "cranium_smart02",
                    "forehead_standard",
                    "hair_back_smart02",
                    "hair_front_smart02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_smart",
                    "forehead_standard",
                    "hair_back_smart",
                    "hair_front_smart",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight06",
                    "forehead_standard",
                    "hair_back_shortstraight06",
                    "hair_front_shortstraight06",
                    "hairbottom_blank"
                ],
                [
                    "cranium_tjg",
                    "forehead_standard",
                    "hair_back_tjg",
                    "hair_front_tjg",
                    "hairbottom_blank"
                ],
                [
                    "cranium_beckham",
                    "forehead_standard",
                    "hair_back_beckham",
                    "hair_front_beckham",
                    "hairbottom_blank"
                ],
                [
                    "cranium_conan",
                    "forehead_standard",
                    "hair_back_conan",
                    "hair_front_conan",
                    "hairbottom_blank"
                ],
                [
                    "cranium_elvis",
                    "forehead_standard",
                    "hair_back_elvis",
                    "hair_front_elvis",
                    "hairbottom_blank"
                ],
                [
                    "cranium_puddy",
                    "forehead_standard",
                    "hair_back_puddy",
                    "hair_front_puddy",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bowlpart",
                    "forehead_standard",
                    "hair_back_bowlpart",
                    "hair_front_bowlpart",
                    "hairbottom_blank"
                ],
                [
                    "cranium_fauxhawk",
                    "forehead_standard",
                    "hair_back_fauxhawk",
                    "hair_front_fauxhawk",
                    "hairbottom_blank"
                ],
                [
                    "cranium_mayor",
                    "forehead_standard",
                    "hair_back_mayor",
                    "hair_front_mayor",
                    "hairbottom_blank"
                ],
                [
                    "cranium_slickback",
                    "forehead_standard",
                    "hair_back_slickback",
                    "hair_front_slickback",
                    "hairbottom_blank"
                ],
                [
                    "cranium_smart03",
                    "forehead_standard",
                    "hair_back_smart03",
                    "hair_front_smart03",
                    "hairbottom_blank"
                ]
            ],
            "hair_short_wavey": [
                [
                    "cranium_shortwavymale",
                    "forehead_standard",
                    "hair_back_shortwavymale",
                    "hair_front_shortwavymale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy01",
                    "forehead_standard",
                    "hair_back_shortwavy01",
                    "hair_front_shortwavy01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy02",
                    "forehead_standard",
                    "hair_back_shortwavy02",
                    "hair_front_shortwavy02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_sethgreen",
                    "forehead_standard",
                    "hair_back_sethgreen",
                    "hair_front_sethgreen",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy02",
                    "forehead_standard",
                    "hair_back_midwavy02",
                    "hair_front_midwavy02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_gerard",
                    "forehead_standard",
                    "hair_back_gerard",
                    "hair_front_gerard",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortmess",
                    "forehead_standard",
                    "hair_back_shortmess",
                    "hair_front_shortmess",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy03",
                    "forehead_standard",
                    "hair_back_shortwavy03",
                    "hair_front_shortwavy03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_mushroom",
                    "forehead_standard",
                    "hair_back_mushroom",
                    "hair_front_mushroom",
                    "hairbottom_blank"
                ],
                [
                    "cranium_conan",
                    "forehead_standard",
                    "hair_back_conan",
                    "hair_front_conan",
                    "hairbottom_blank"
                ],
                [
                    "cranium_kramer",
                    "forehead_standard",
                    "hair_back_kramer",
                    "hair_front_kramer",
                    "hairbottom_blank"
                ]
            ],
            "hair_short_curly": [
                [
                    "cranium_shortcurl11",
                    "forehead_standard",
                    "hair_back_shortcurl11",
                    "hair_front_shortcurl11",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl03",
                    "forehead_standard",
                    "hair_back_shortcurl03",
                    "hair_front_shortcurl03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midfro01",
                    "forehead_standard",
                    "hair_back_midfro01",
                    "hair_front_midfro01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_davek",
                    "forehead_standard",
                    "hair_back_davek",
                    "hair_front_davek",
                    "hairbottom_blank"
                ],
                [
                    "cranium_mcbride",
                    "forehead_standard",
                    "hair_back_mcbride",
                    "hair_front_mcbride",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl07",
                    "forehead_standard",
                    "hair_back_shortcurl07",
                    "hair_front_shortcurl07",
                    "hairbottom_blank"
                ],
                [
                    "cranium_jerry",
                    "forehead_standard",
                    "hair_back_jerry",
                    "hair_front_jerry",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shahan",
                    "forehead_standard",
                    "hair_back_shahan",
                    "hair_front_shahan",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ba",
                    "forehead_standard",
                    "hair_back_ba",
                    "hair_front_ba",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl06",
                    "forehead_standard",
                    "hair_back_shortcurl06",
                    "hair_front_shortcurl06",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl04",
                    "forehead_standard",
                    "hair_back_shortcurl04",
                    "hair_front_shortcurl04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl02",
                    "forehead_standard",
                    "hair_back_shortcurl02",
                    "hair_front_shortcurl02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_flattop01",
                    "forehead_standard",
                    "hair_back_flattop01",
                    "hair_front_flattop01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_flattop02",
                    "forehead_standard",
                    "hair_back_flattop02",
                    "hair_front_flattop02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_flattop03",
                    "forehead_standard",
                    "hair_back_flattop03",
                    "hair_front_flattop03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl",
                    "forehead_standard",
                    "hair_back_shortcurl",
                    "hair_front_shortcurl",
                    "hairbottom_blank"
                ],
                [
                    "cranium_kramer",
                    "forehead_standard",
                    "hair_back_kramer",
                    "hair_front_kramer",
                    "hairbottom_blank"
                ],
                [
                    "cranium_cornrows",
                    "forehead_standard",
                    "hair_back_cornrows",
                    "hair_front_cornrows",
                    "hairbottom_blank"
                ]
            ],
            "hair_medium_straight": [
                [
                    "cranium_midstraightmale",
                    "forehead_standard",
                    "hair_back_midstraightmale",
                    "hair_front_midstraightmale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midstraight02",
                    "forehead_standard",
                    "hair_back_midstraight02",
                    "hair_front_midstraight02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midstraight05",
                    "forehead_standard",
                    "hair_back_midstraight05",
                    "hair_front_midstraight05",
                    "hairbottom_midstraight05"
                ],
                [
                    "cranium_midstraight01",
                    "forehead_standard",
                    "hair_back_midstraight01",
                    "hair_front_midstraight01",
                    "hairbottom_midstraight01"
                ],
                [
                    "cranium_midstraight04",
                    "forehead_standard",
                    "hair_back_midstraight04",
                    "hair_front_midstraight04",
                    "hairbottom_midstraight04"
                ],
                [
                    "cranium_ashton",
                    "forehead_standard",
                    "hair_back_ashton",
                    "hair_front_ashton",
                    "hairbottom_ashton"
                ],
                [
                    "cranium_midstraight03",
                    "forehead_standard",
                    "hair_back_midstraight03",
                    "hair_front_midstraight03",
                    "hairbottom_midstraight03"
                ],
                [
                    "cranium_longwavy04",
                    "forehead_standard",
                    "hair_back_longwavy04",
                    "hair_front_longwavy04",
                    "hairbottom_longwavy04"
                ],
                [
                    "cranium_skywalker",
                    "forehead_standard",
                    "hair_back_skywalker",
                    "hair_front_skywalker",
                    "hairbottom_skywalker"
                ],
                [
                    "cranium_bob02",
                    "forehead_standard",
                    "hair_back_bob02",
                    "hair_front_bob02",
                    "hairbottom_bob02"
                ],
                [
                    "cranium_bangs02",
                    "forehead_standard",
                    "hair_back_bangs02",
                    "hair_front_bangs02",
                    "hairbottom_bangs02"
                ],
                [
                    "cranium_asymm",
                    "forehead_standard",
                    "hair_back_asymm",
                    "hair_front_asymm",
                    "hairbottom_asymm"
                ]
            ],
            "hair_medium_wavey": [
                [
                    "cranium_midwavymale",
                    "forehead_standard",
                    "hair_back_midwavymale",
                    "hair_front_midwavymale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy04",
                    "forehead_standard",
                    "hair_back_midwavy04",
                    "hair_front_midwavy04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy07",
                    "forehead_standard",
                    "hair_back_midwavy07",
                    "hair_front_midwavy07",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy05",
                    "forehead_standard",
                    "hair_back_midwavy05",
                    "hair_front_midwavy05",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy06",
                    "forehead_standard",
                    "hair_back_midwavy06",
                    "hair_front_midwavy06",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy08",
                    "forehead_standard",
                    "hair_back_midwavy08",
                    "hair_front_midwavy08",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy01",
                    "forehead_standard",
                    "hair_back_midwavy01",
                    "hair_front_midwavy01",
                    "hairbottom_midwavy01"
                ],
                [
                    "cranium_pixie",
                    "forehead_standard",
                    "hair_back_pixie",
                    "hair_front_pixie",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longpart02",
                    "forehead_standard",
                    "hair_back_longpart02",
                    "hair_front_longpart02",
                    "hairbottom_longpart02"
                ],
                [
                    "cranium_dorian",
                    "forehead_standard",
                    "hair_back_dorian",
                    "hair_front_dorian",
                    "hairbottom_dorian"
                ]
            ],
            "hair_medium_curly": [
                [
                    "cranium_shortcurl05",
                    "forehead_standard",
                    "hair_back_shortcurl05",
                    "hair_front_shortcurl05",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midcurl11",
                    "forehead_standard",
                    "hair_back_midcurl11",
                    "hair_front_midcurl11",
                    "hairbottom_midcurl11"
                ],
                [
                    "cranium_midcurl12",
                    "forehead_standard",
                    "hair_back_midcurl12",
                    "hair_front_midcurl12",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midcurl09",
                    "forehead_standard",
                    "hair_back_midcurl09",
                    "hair_front_midcurl09",
                    "hairbottom_midcurl09"
                ],
                [
                    "cranium_midcurl14",
                    "forehead_standard",
                    "hair_back_midcurl14",
                    "hair_front_midcurl14",
                    "hairbottom_midcurl14"
                ],
                [
                    "cranium_dreadsdown01",
                    "forehead_standard",
                    "hair_back_dreadsdown01",
                    "hair_front_dreadsdown01",
                    "hairbottom_dreadsdown01"
                ],
                [
                    "cranium_midcurl10",
                    "forehead_standard",
                    "hair_back_midcurl10",
                    "hair_front_midcurl10",
                    "hairbottom_midcurl10"
                ],
                [
                    "cranium_midcurl13",
                    "forehead_standard",
                    "hair_back_midcurl13",
                    "hair_front_midcurl13",
                    "hairbottom_midcurl13"
                ],
                [
                    "cranium_midcurl15",
                    "forehead_standard",
                    "hair_back_midcurl15",
                    "hair_front_midcurl15",
                    "hairbottom_midcurl15"
                ],
                [
                    "cranium_bigfro01",
                    "forehead_standard",
                    "hair_back_bigfro01",
                    "hair_front_bigfro01",
                    "hairbottom_blank"
                ]
            ],
            "hair_long_straight": [
                [
                    "cranium_longstraightmale",
                    "forehead_standard",
                    "hair_back_longstraightmale",
                    "hair_front_longstraightmale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longstraight01",
                    "forehead_standard",
                    "hair_back_longstraight01",
                    "hair_front_longstraight01",
                    "hairbottom_longstraight01"
                ],
                [
                    "cranium_longstraight02",
                    "forehead_standard",
                    "hair_back_longstraight02",
                    "hair_front_longstraight02",
                    "hairbottom_longstraight02"
                ],
                [
                    "cranium_longstraight03",
                    "forehead_standard",
                    "hair_back_longstraight03",
                    "hair_front_longstraight03",
                    "hairbottom_longstraight03"
                ],
                [
                    "cranium_longstraight08",
                    "forehead_standard",
                    "hair_back_longstraight08",
                    "hair_front_longstraight08",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longwavy05",
                    "forehead_standard",
                    "hair_back_longwavy05",
                    "hair_front_longwavy05",
                    "hairbottom_longwavy05"
                ],
                [
                    "cranium_longstraight09",
                    "forehead_standard",
                    "hair_back_longstraight09",
                    "hair_front_longstraight09",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longstraight10",
                    "forehead_standard",
                    "hair_back_longstraight10",
                    "hair_front_longstraight10",
                    "hairbottom_longstraight10"
                ],
                [
                    "cranium_longstraight11",
                    "forehead_standard",
                    "hair_back_longstraight11",
                    "hair_front_longstraight11",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longstraight12",
                    "forehead_standard",
                    "hair_back_longstraight12",
                    "hair_front_longstraight12",
                    "hairbottom_longstraight12"
                ],
                [
                    "cranium_ponytail01",
                    "forehead_standard",
                    "hair_back_ponytail01",
                    "hair_front_ponytail01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail03",
                    "forehead_standard",
                    "hair_back_ponytail03",
                    "hair_front_ponytail03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_hairbun",
                    "forehead_standard",
                    "hair_back_hairbun",
                    "hair_front_hairbun",
                    "hairbottom_blank"
                ]
            ],
            "hair_long_wavey": [
                [
                    "cranium_longwavy",
                    "forehead_standard",
                    "hair_back_longwavy",
                    "hair_front_longwavy",
                    "hairbottom_longwavy"
                ],
                [
                    "cranium_longwavymale",
                    "forehead_standard",
                    "hair_back_longwavymale",
                    "hair_front_longwavymale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longerwavy",
                    "forehead_standard",
                    "hair_back_longerwavy",
                    "hair_front_longerwavy",
                    "hairbottom_longerwavy"
                ],
                [
                    "cranium_longwavy09",
                    "forehead_standard",
                    "hair_back_longwavy09",
                    "hair_front_longwavy09",
                    "hairbottom_longwavy09"
                ],
                [
                    "cranium_longcurl05",
                    "forehead_standard",
                    "hair_back_longcurl05",
                    "hair_front_longcurl05",
                    "hairbottom_longcurl05"
                ],
                [
                    "cranium_longwavy10",
                    "forehead_standard",
                    "hair_back_longwavy10",
                    "hair_front_longwavy10",
                    "hairbottom_longwavy10"
                ],
                [
                    "cranium_longwavy05",
                    "forehead_standard",
                    "hair_back_longwavy05",
                    "hair_front_longwavy05",
                    "hairbottom_longwavy05"
                ],
                [
                    "cranium_longwavy08",
                    "forehead_standard",
                    "hair_back_longwavy08",
                    "hair_front_longwavy08",
                    "hairbottom_longwavy08"
                ],
                [
                    "cranium_longwavy06",
                    "forehead_standard",
                    "hair_back_longwavy06",
                    "hair_front_longwavy06",
                    "hairbottom_blank"
                ],
                [
                    "cranium_mjackson",
                    "forehead_standard",
                    "hair_back_mjackson",
                    "hair_front_mjackson",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail02",
                    "forehead_standard",
                    "hair_back_ponytail02",
                    "hair_front_ponytail02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail04",
                    "forehead_standard",
                    "hair_back_ponytail04",
                    "hair_front_ponytail04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longpart",
                    "forehead_standard",
                    "hair_back_longpart",
                    "hair_front_longpart",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longwavy02",
                    "forehead_standard",
                    "hair_back_longwavy02",
                    "hair_front_longwavy02",
                    "hairbottom_blank"
                ]
            ],
            "hair_long_curly": [
                [
                    "cranium_longcurlmale",
                    "forehead_standard",
                    "hair_back_longcurlmale",
                    "hair_front_longcurlmale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ozzy",
                    "forehead_standard",
                    "hair_back_ozzy",
                    "hair_front_ozzy",
                    "hairbottom_ozzy"
                ],
                [
                    "cranium_longwavy03",
                    "forehead_standard",
                    "hair_back_longwavy03",
                    "hair_front_longwavy03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longcurl02",
                    "forehead_standard",
                    "hair_back_longcurl02",
                    "hair_front_longcurl02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_cornrows02",
                    "forehead_standard",
                    "hair_back_cornrows02",
                    "hair_front_cornrows02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_dreadsdown02",
                    "forehead_standard",
                    "hair_back_dreadsdown02",
                    "hair_front_dreadsdown02",
                    "hairbottom_dreadsdown02"
                ],
                [
                    "cranium_dreadspony",
                    "forehead_standard",
                    "hair_back_dreadspony",
                    "hair_front_dreadspony",
                    "hairbottom_blank"
                ],
                [
                    "cranium_dreadsup",
                    "forehead_standard",
                    "hair_back_dreadsup",
                    "hair_front_dreadsup",
                    "hairbottom_blank"
                ],
                [
                    "cranium_kennyg",
                    "forehead_standard",
                    "hair_back_kennyg",
                    "hair_front_kennyg",
                    "hairbottom_kennyg"
                ],
                [
                    "cranium_longcurl03",
                    "forehead_standard",
                    "hair_back_longcurl03",
                    "hair_front_longcurl03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_curlbun",
                    "forehead_standard",
                    "hair_back_curlbun",
                    "hair_front_curlbun",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longcurl04",
                    "forehead_standard",
                    "hair_back_longcurl04",
                    "hair_front_longcurl04",
                    "hairbottom_longcurl04"
                ],
                [
                    "cranium_longcurl01",
                    "forehead_standard",
                    "hair_back_longcurl01",
                    "hair_front_longcurl01",
                    "hairbottom_longcurl01"
                ],
                [
                    "cranium_beyonce",
                    "forehead_standard",
                    "hair_back_beyonce",
                    "hair_front_beyonce",
                    "hairbottom_beyonce"
                ],
                [
                    "cranium_ponytail02",
                    "forehead_standard",
                    "hair_back_ponytail02",
                    "hair_front_ponytail02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail04",
                    "forehead_standard",
                    "hair_back_ponytail04",
                    "hair_front_ponytail04",
                    "hairbottom_blank"
                ]
            ],
            "hair_bald": [
                [
                    "cranium_bald01",
                    "forehead_bald01",
                    "hair_back_bald01",
                    "hair_front_bald01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_buzz",
                    "forehead_buzz",
                    "hair_back_buzz",
                    "hair_front_blank",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ian",
                    "forehead_standard",
                    "hair_back_ian",
                    "hair_front_ian",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortbald01",
                    "forehead_standard",
                    "hair_back_shortbald01",
                    "hair_front_shortbald01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_wavybald",
                    "forehead_standard",
                    "hair_back_wavybald",
                    "hair_front_wavybald",
                    "hairbottom_blank"
                ],
                [
                    "cranium_george",
                    "forehead_standard",
                    "hair_back_george",
                    "hair_front_george",
                    "hairbottom_blank"
                ],
                [
                    "cranium_buzzbald",
                    "forehead_standard",
                    "hair_back_buzzbald",
                    "hair_front_buzzbald",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortbald02",
                    "forehead_standard",
                    "hair_back_shortbald02",
                    "hair_front_shortbald02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_letterman",
                    "forehead_standard",
                    "hair_back_letterman",
                    "hair_front_letterman",
                    "hairbottom_blank"
                ],
                [
                    "cranium_combover01",
                    "forehead_standard",
                    "hair_back_combover01",
                    "hair_front_combover01",
                    "hairbottom_blank"
                ]
            ],
            "hair_special": [
                [
                    "cranium_frohawk",
                    "forehead_standard",
                    "hair_back_frohawk",
                    "hair_front_frohawk",
                    "hairbottom_blank"
                ],
                [
                    "cranium_mohawk01",
                    "forehead_standard",
                    "hair_back_mohawk01",
                    "hair_front_mohawk01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_anime",
                    "forehead_standard",
                    "hair_back_anime",
                    "hair_front_anime",
                    "hairbottom_blank"
                ],
                [
                    "cranium_logan",
                    "forehead_standard",
                    "hair_back_logan",
                    "hair_front_logan",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bjork",
                    "forehead_standard",
                    "hair_back_bjork",
                    "hair_front_bjork",
                    "hairbottom_blank"
                ],
                [
                    "cranium_spikey",
                    "forehead_standard",
                    "hair_back_spikey",
                    "hair_front_spikey",
                    "hairbottom_blank"
                ],
                [
                    "cranium_einstein",
                    "forehead_standard",
                    "hair_back_einstein",
                    "hair_front_einstein",
                    "hairbottom_blank"
                ],
                [
                    "cranium_limphawk",
                    "forehead_standard",
                    "hair_back_limphawk",
                    "hair_front_limphawk",
                    "hairbottom_blank"
                ],
                [
                    "cranium_messhawk",
                    "forehead_messhawk",
                    "hair_back_messhawk",
                    "hair_front_messhawk",
                    "hairbottom_blank"
                ]
            ],
            "hairstyles": [
                [
                    "cranium_elvis",
                    "forehead_standard",
                    "hair_back_elvis",
                    "hair_front_elvis",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ashton",
                    "forehead_standard",
                    "hair_back_ashton",
                    "hair_front_ashton",
                    "hairbottom_ashton"
                ],
                [
                    "cranium_bob01",
                    "forehead_standard",
                    "hair_back_bob01",
                    "hair_front_bob01",
                    "hairbottom_bob01"
                ],
                [
                    "cranium_bob02",
                    "forehead_standard",
                    "hair_back_bob02",
                    "hair_front_bob02",
                    "hairbottom_bob02"
                ],
                [
                    "cranium_longpart",
                    "forehead_standard",
                    "hair_back_longpart",
                    "hair_front_longpart",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longwavy",
                    "forehead_standard",
                    "hair_back_longwavy",
                    "hair_front_longwavy",
                    "hairbottom_longwavy"
                ],
                [
                    "cranium_mushroom",
                    "forehead_standard",
                    "hair_back_mushroom",
                    "hair_front_mushroom",
                    "hairbottom_blank"
                ],
                [
                    "cranium_pixie",
                    "forehead_standard",
                    "hair_back_pixie",
                    "hair_front_pixie",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortmess",
                    "forehead_standard",
                    "hair_back_shortmess",
                    "hair_front_shortmess",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwind",
                    "forehead_standard",
                    "hair_back_shortwind",
                    "hair_front_shortwind",
                    "hairbottom_blank"
                ],
                [
                    "cranium_smart",
                    "forehead_standard",
                    "hair_back_smart",
                    "hair_front_smart",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bangspulled",
                    "forehead_standard",
                    "hair_back_bangspulled",
                    "hair_front_bangspulled",
                    "hairbottom_bangspulled"
                ],
                [
                    "cranium_bangs",
                    "forehead_standard",
                    "hair_back_bangs",
                    "hair_front_bangs",
                    "hairbottom_bangs"
                ],
                [
                    "cranium_bangs02",
                    "forehead_standard",
                    "hair_back_bangs02",
                    "hair_front_bangs02",
                    "hairbottom_bangs02"
                ],
                [
                    "cranium_jerry",
                    "forehead_standard",
                    "hair_back_jerry",
                    "hair_front_jerry",
                    "hairbottom_blank"
                ],
                [
                    "cranium_kramer",
                    "forehead_standard",
                    "hair_back_kramer",
                    "hair_front_kramer",
                    "hairbottom_blank"
                ],
                [
                    "cranium_elaine",
                    "forehead_standard",
                    "hair_back_elaine",
                    "hair_front_elaine",
                    "hairbottom_blank"
                ],
                [
                    "cranium_conan",
                    "forehead_standard",
                    "hair_back_conan",
                    "hair_front_conan",
                    "hairbottom_blank"
                ],
                [
                    "cranium_fauxhawk",
                    "forehead_standard",
                    "hair_back_fauxhawk",
                    "hair_front_fauxhawk",
                    "hairbottom_blank"
                ],
                [
                    "cranium_skywalker",
                    "forehead_standard",
                    "hair_back_skywalker",
                    "hair_front_skywalker",
                    "hairbottom_skywalker"
                ],
                [
                    "cranium_trethew",
                    "forehead_standard",
                    "hair_back_trethew",
                    "hair_front_trethew",
                    "hairbottom_trethew"
                ],
                [
                    "cranium_longpart02",
                    "forehead_standard",
                    "hair_back_longpart02",
                    "hair_front_longpart02",
                    "hairbottom_longpart02"
                ],
                [
                    "cranium_flattop01",
                    "forehead_standard",
                    "hair_back_flattop01",
                    "hair_front_flattop01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bob03",
                    "forehead_standard",
                    "hair_back_bob03",
                    "hair_front_bob03",
                    "hairbottom_bob03"
                ],
                [
                    "cranium_bowlpart",
                    "forehead_standard",
                    "hair_back_bowlpart",
                    "hair_front_bowlpart",
                    "hairbottom_blank"
                ],
                [
                    "cranium_george",
                    "forehead_standard",
                    "hair_back_george",
                    "hair_front_george",
                    "hairbottom_blank"
                ],
                [
                    "cranium_asymm",
                    "forehead_standard",
                    "hair_back_asymm",
                    "hair_front_asymm",
                    "hairbottom_asymm"
                ],
                [
                    "cranium_beckham",
                    "forehead_standard",
                    "hair_back_beckham",
                    "hair_front_beckham",
                    "hairbottom_blank"
                ],
                [
                    "cranium_wavybald",
                    "forehead_standard",
                    "hair_back_wavybald",
                    "hair_front_wavybald",
                    "hairbottom_blank"
                ],
                [
                    "cranium_letterman",
                    "forehead_standard",
                    "hair_back_letterman",
                    "hair_front_letterman",
                    "hairbottom_blank"
                ],
                [
                    "cranium_default",
                    "forehead_standard",
                    "hair_back_default",
                    "hair_front_default",
                    "hairbottom_blank"
                ],
                [
                    "cranium_flattop02",
                    "forehead_standard",
                    "hair_back_flattop02",
                    "hair_front_flattop02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_combover01",
                    "forehead_standard",
                    "hair_back_combover01",
                    "hair_front_combover01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_davek",
                    "forehead_standard",
                    "hair_back_davek",
                    "hair_front_davek",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shahan",
                    "forehead_standard",
                    "hair_back_shahan",
                    "hair_front_shahan",
                    "hairbottom_blank"
                ],
                [
                    "cranium_dorian",
                    "forehead_standard",
                    "hair_back_dorian",
                    "hair_front_dorian",
                    "hairbottom_dorian"
                ],
                [
                    "cranium_ba",
                    "forehead_standard",
                    "hair_back_ba",
                    "hair_front_ba",
                    "hairbottom_blank"
                ],
                [
                    "cranium_tjg",
                    "forehead_standard",
                    "hair_back_tjg",
                    "hair_front_tjg",
                    "hairbottom_blank"
                ],
                [
                    "cranium_tom",
                    "forehead_standard",
                    "hair_back_tom",
                    "hair_front_tom",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midfro01",
                    "forehead_standard",
                    "hair_back_midfro01",
                    "hair_front_midfro01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bigfro01",
                    "forehead_standard",
                    "hair_back_bigfro01",
                    "hair_front_bigfro01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_flattop03",
                    "forehead_standard",
                    "hair_back_flattop03",
                    "hair_front_flattop03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_sideswipe",
                    "forehead_standard",
                    "hair_back_sideswipe",
                    "hair_front_sideswipe",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl",
                    "forehead_standard",
                    "hair_back_shortcurl",
                    "hair_front_shortcurl",
                    "hairbottom_blank"
                ],
                [
                    "cranium_casey",
                    "forehead_standard",
                    "hair_back_casey",
                    "hair_front_casey",
                    "hairbottom_blank"
                ],
                [
                    "cranium_dreadsup",
                    "forehead_standard",
                    "hair_back_dreadsup",
                    "hair_front_dreadsup",
                    "hairbottom_blank"
                ],
                [
                    "cranium_dreadspony",
                    "forehead_standard",
                    "hair_back_dreadspony",
                    "hair_front_dreadspony",
                    "hairbottom_blank"
                ],
                [
                    "cranium_cornrows",
                    "forehead_standard",
                    "hair_back_cornrows",
                    "hair_front_cornrows",
                    "hairbottom_blank"
                ],
                [
                    "cranium_cornrows02",
                    "forehead_standard",
                    "hair_back_cornrows02",
                    "hair_front_cornrows02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longerwavy",
                    "forehead_standard",
                    "hair_back_longerwavy",
                    "hair_front_longerwavy",
                    "hairbottom_longerwavy"
                ],
                [
                    "cranium_shortcurl02",
                    "forehead_standard",
                    "hair_back_shortcurl02",
                    "hair_front_shortcurl02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl03",
                    "forehead_standard",
                    "hair_back_shortcurl03",
                    "hair_front_shortcurl03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl04",
                    "forehead_standard",
                    "hair_back_shortcurl04",
                    "hair_front_shortcurl04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy01",
                    "forehead_standard",
                    "hair_back_midwavy01",
                    "hair_front_midwavy01",
                    "hairbottom_midwavy01"
                ],
                [
                    "cranium_midpart01",
                    "forehead_standard",
                    "hair_back_midpart01",
                    "hair_front_midpart01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longcurl01",
                    "forehead_standard",
                    "hair_back_longcurl01",
                    "hair_front_longcurl01",
                    "hairbottom_longcurl01"
                ],
                [
                    "cranium_midstraight01",
                    "forehead_standard",
                    "hair_back_midstraight01",
                    "hair_front_midstraight01",
                    "hairbottom_midstraight01"
                ],
                [
                    "cranium_beyonce",
                    "forehead_standard",
                    "hair_back_beyonce",
                    "hair_front_beyonce",
                    "hairbottom_beyonce"
                ],
                [
                    "cranium_smart02",
                    "forehead_standard",
                    "hair_back_smart02",
                    "hair_front_smart02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_dreadsdown01",
                    "forehead_standard",
                    "hair_back_dreadsdown01",
                    "hair_front_dreadsdown01",
                    "hairbottom_dreadsdown01"
                ],
                [
                    "cranium_roro",
                    "forehead_standard",
                    "hair_back_roro",
                    "hair_front_roro",
                    "hairbottom_roro"
                ],
                [
                    "cranium_longstraight01",
                    "forehead_standard",
                    "hair_back_longstraight01",
                    "hair_front_longstraight01",
                    "hairbottom_longstraight01"
                ],
                [
                    "cranium_longstraight02",
                    "forehead_standard",
                    "hair_back_longstraight02",
                    "hair_front_longstraight02",
                    "hairbottom_longstraight02"
                ],
                [
                    "cranium_longwavy02",
                    "forehead_standard",
                    "hair_back_longwavy02",
                    "hair_front_longwavy02",
                    "hairbottom_longwavy02"
                ],
                [
                    "cranium_longwavy03",
                    "forehead_standard",
                    "hair_back_longwavy03",
                    "hair_front_longwavy03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midcurl01",
                    "forehead_standard",
                    "hair_back_midcurl01",
                    "hair_front_midcurl01",
                    "hairbottom_midcurl01"
                ],
                [
                    "cranium_mjackson",
                    "forehead_standard",
                    "hair_back_mjackson",
                    "hair_front_mjackson",
                    "hairbottom_blank"
                ],
                [
                    "cranium_pigtails",
                    "forehead_standard",
                    "hair_back_pigtails",
                    "hair_front_pigtails",
                    "hairbottom_pigtails"
                ],
                [
                    "cranium_curlbun",
                    "forehead_standard",
                    "hair_back_curlbun",
                    "hair_front_curlbun",
                    "hairbottom_blank"
                ],
                [
                    "cranium_mayor",
                    "forehead_standard",
                    "hair_back_mayor",
                    "hair_front_mayor",
                    "hairbottom_blank"
                ],
                [
                    "cranium_slickback",
                    "forehead_standard",
                    "hair_back_slickback",
                    "hair_front_slickback",
                    "hairbottom_blank"
                ],
                [
                    "cranium_smart03",
                    "forehead_standard",
                    "hair_back_smart03",
                    "hair_front_smart03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_buzzbald",
                    "forehead_standard",
                    "hair_back_buzzbald",
                    "hair_front_buzzbald",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortbald01",
                    "forehead_standard",
                    "hair_back_shortbald01",
                    "hair_front_shortbald01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortbald02",
                    "forehead_standard",
                    "hair_back_shortbald02",
                    "hair_front_shortbald02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl05",
                    "forehead_standard",
                    "hair_back_shortcurl05",
                    "hair_front_shortcurl05",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midcurl02",
                    "forehead_standard",
                    "hair_back_midcurl02",
                    "hair_front_midcurl02",
                    "hairbottom_midcurl02"
                ],
                [
                    "cranium_midcurl03",
                    "forehead_standard",
                    "hair_back_midcurl03",
                    "hair_front_midcurl03",
                    "hairbottom_midcurl03"
                ],
                [
                    "cranium_midwavy02",
                    "forehead_standard",
                    "hair_back_midwavy02",
                    "hair_front_midwavy02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy03",
                    "forehead_standard",
                    "hair_back_midwavy03",
                    "hair_front_midwavy03",
                    "hairbottom_midwavy03"
                ],
                [
                    "cranium_longcurl02",
                    "forehead_standard",
                    "hair_back_longcurl02",
                    "hair_front_longcurl02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longcurl03",
                    "forehead_standard",
                    "hair_back_longcurl03",
                    "hair_front_longcurl03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longwavy04",
                    "forehead_standard",
                    "hair_back_longwavy04",
                    "hair_front_longwavy04",
                    "hairbottom_longwavy04"
                ],
                [
                    "cranium_longwavy05",
                    "forehead_standard",
                    "hair_back_longwavy05",
                    "hair_front_longwavy05",
                    "hairbottom_longwavy05"
                ],
                [
                    "cranium_longwavy06",
                    "forehead_standard",
                    "hair_back_longwavy06",
                    "hair_front_longwavy06",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longwavy07",
                    "forehead_standard",
                    "hair_back_longwavy07",
                    "hair_front_longwavy07",
                    "hairbottom_longwavy07"
                ],
                [
                    "cranium_longwavy08",
                    "forehead_standard",
                    "hair_back_longwavy08",
                    "hair_front_longwavy08",
                    "hairbottom_longwavy08"
                ],
                [
                    "cranium_longstraight03",
                    "forehead_standard",
                    "hair_back_longstraight03",
                    "hair_front_longstraight03",
                    "hairbottom_longstraight03"
                ],
                [
                    "cranium_puddy",
                    "forehead_standard",
                    "hair_back_puddy",
                    "hair_front_puddy",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight01",
                    "forehead_standard",
                    "hair_back_shortstraight01",
                    "hair_front_shortstraight01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_gerard",
                    "forehead_standard",
                    "hair_back_gerard",
                    "hair_front_gerard",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy01",
                    "forehead_standard",
                    "hair_back_shortwavy01",
                    "hair_front_shortwavy01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_sethgreen",
                    "forehead_standard",
                    "hair_back_sethgreen",
                    "hair_front_sethgreen",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy02",
                    "forehead_standard",
                    "hair_back_shortwavy02",
                    "hair_front_shortwavy02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy03",
                    "forehead_standard",
                    "hair_back_shortwavy03",
                    "hair_front_shortwavy03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl06",
                    "forehead_standard",
                    "hair_back_shortcurl06",
                    "hair_front_shortcurl06",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl07",
                    "forehead_standard",
                    "hair_back_shortcurl07",
                    "hair_front_shortcurl07",
                    "hairbottom_blank"
                ],
                [
                    "cranium_mcbride",
                    "forehead_standard",
                    "hair_back_mcbride",
                    "hair_front_mcbride",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight02",
                    "forehead_standard",
                    "hair_back_shortstraight02",
                    "hair_front_shortstraight02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight03",
                    "forehead_standard",
                    "hair_back_shortstraight03",
                    "hair_front_shortstraight03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight04",
                    "forehead_standard",
                    "hair_back_shortstraight04",
                    "hair_front_shortstraight04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight05",
                    "forehead_standard",
                    "hair_back_shortstraight05",
                    "hair_front_shortstraight05",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl08",
                    "forehead_standard",
                    "hair_back_shortcurl08",
                    "hair_front_shortcurl08",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl09",
                    "forehead_standard",
                    "hair_back_shortcurl09",
                    "hair_front_shortcurl09",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl10",
                    "forehead_standard",
                    "hair_back_shortcurl10",
                    "hair_front_shortcurl10",
                    "hairbottom_shortcurl10"
                ],
                [
                    "cranium_longwavy09",
                    "forehead_standard",
                    "hair_back_longwavy09",
                    "hair_front_longwavy09",
                    "hairbottom_longwavy09"
                ],
                [
                    "cranium_longwavy10",
                    "forehead_standard",
                    "hair_back_longwavy10",
                    "hair_front_longwavy10",
                    "hairbottom_longwavy10"
                ],
                [
                    "cranium_ozzy",
                    "forehead_standard",
                    "hair_back_ozzy",
                    "hair_front_ozzy",
                    "hairbottom_ozzy"
                ],
                [
                    "cranium_longcurl04",
                    "forehead_standard",
                    "hair_back_longcurl04",
                    "hair_front_longcurl04",
                    "hairbottom_longcurl04"
                ],
                [
                    "cranium_longcurl05",
                    "forehead_standard",
                    "hair_back_longcurl05",
                    "hair_front_longcurl05",
                    "hairbottom_longcurl05"
                ],
                [
                    "cranium_kennyg",
                    "forehead_standard",
                    "hair_back_kennyg",
                    "hair_front_kennyg",
                    "hairbottom_kennyg"
                ],
                [
                    "cranium_dreadsdown02",
                    "forehead_standard",
                    "hair_back_dreadsdown02",
                    "hair_front_dreadsdown02",
                    "hairbottom_dreadsdown02"
                ],
                [
                    "cranium_longstraight04",
                    "forehead_standard",
                    "hair_back_longstraight04",
                    "hair_front_longstraight04",
                    "hairbottom_longstraight04"
                ],
                [
                    "cranium_longstraight05",
                    "forehead_standard",
                    "hair_back_longstraight05",
                    "hair_front_longstraight05",
                    "hairbottom_longstraight05"
                ],
                [
                    "cranium_longstraight06",
                    "forehead_standard",
                    "hair_back_longstraight06",
                    "hair_front_longstraight06",
                    "hairbottom_longstraight06"
                ],
                [
                    "cranium_longstraight07",
                    "forehead_standard",
                    "hair_back_longstraight07",
                    "hair_front_longstraight07",
                    "hairbottom_longstraight07"
                ],
                [
                    "cranium_midstraight02",
                    "forehead_standard",
                    "hair_back_midstraight02",
                    "hair_front_midstraight02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midstraight03",
                    "forehead_standard",
                    "hair_back_midstraight03",
                    "hair_front_midstraight03",
                    "hairbottom_midstraight03"
                ],
                [
                    "cranium_midstraight04",
                    "forehead_standard",
                    "hair_back_midstraight04",
                    "hair_front_midstraight04",
                    "hairbottom_midstraight04"
                ],
                [
                    "cranium_midstraight05",
                    "forehead_standard",
                    "hair_back_midstraight05",
                    "hair_front_midstraight05",
                    "hairbottom_midstraight05"
                ],
                [
                    "cranium_midstraight06",
                    "forehead_standard",
                    "hair_back_midstraight06",
                    "hair_front_midstraight06",
                    "hairbottom_midstraight06"
                ],
                [
                    "cranium_midstraight07",
                    "forehead_standard",
                    "hair_back_midstraight07",
                    "hair_front_midstraight07",
                    "hairbottom_midstraight07"
                ],
                [
                    "cranium_midstraight08",
                    "forehead_standard",
                    "hair_back_midstraight08",
                    "hair_front_midstraight08",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midstraight09",
                    "forehead_standard",
                    "hair_back_midstraight09",
                    "hair_front_midstraight09",
                    "hairbottom_midstraight09"
                ],
                [
                    "cranium_longwavy11",
                    "forehead_standard",
                    "hair_back_longwavy11",
                    "hair_front_longwavy11",
                    "hairbottom_longwavy11"
                ],
                [
                    "cranium_longwavy12",
                    "forehead_standard",
                    "hair_back_longwavy12",
                    "hair_front_longwavy12",
                    "hairbottom_longwavy12"
                ],
                [
                    "cranium_longwavy13",
                    "forehead_standard",
                    "hair_back_longwavy13",
                    "hair_front_longwavy13",
                    "hairbottom_longwavy13"
                ],
                [
                    "cranium_longwavy14",
                    "forehead_standard",
                    "hair_back_longwavy14",
                    "hair_front_longwavy14",
                    "hairbottom_longwavy14"
                ],
                [
                    "cranium_longcurl06",
                    "forehead_standard",
                    "hair_back_longcurl06",
                    "hair_front_longcurl06",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longcurl07",
                    "forehead_standard",
                    "hair_back_longcurl07",
                    "hair_front_longcurl07",
                    "hairbottom_longcurl07"
                ],
                [
                    "cranium_longcurl08",
                    "forehead_standard",
                    "hair_back_longcurl08",
                    "hair_front_longcurl08",
                    "hairbottom_longcurl08"
                ],
                [
                    "cranium_longcurl09",
                    "forehead_standard",
                    "hair_back_longcurl09",
                    "hair_front_longcurl09",
                    "hairbottom_longcurl09"
                ],
                [
                    "cranium_longstraight08",
                    "forehead_standard",
                    "hair_back_longstraight08",
                    "hair_front_longstraight08",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longstraight09",
                    "forehead_standard",
                    "hair_back_longstraight09",
                    "hair_front_longstraight09",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longstraight10",
                    "forehead_standard",
                    "hair_back_longstraight10",
                    "hair_front_longstraight10",
                    "hairbottom_longstraight10"
                ],
                [
                    "cranium_longstraight11",
                    "forehead_standard",
                    "hair_back_longstraight11",
                    "hair_front_longstraight11",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longstraight12",
                    "forehead_standard",
                    "hair_back_longstraight12",
                    "hair_front_longstraight12",
                    "hairbottom_longstraight12"
                ],
                [
                    "cranium_midwavy04",
                    "forehead_standard",
                    "hair_back_midwavy04",
                    "hair_front_midwavy04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy05",
                    "forehead_standard",
                    "hair_back_midwavy05",
                    "hair_front_midwavy05",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy06",
                    "forehead_standard",
                    "hair_back_midwavy06",
                    "hair_front_midwavy06",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy07",
                    "forehead_standard",
                    "hair_back_midwavy07",
                    "hair_front_midwavy07",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy08",
                    "forehead_standard",
                    "hair_back_midwavy08",
                    "hair_front_midwavy08",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy04",
                    "forehead_standard",
                    "hair_back_shortwavy04",
                    "hair_front_shortwavy04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy05",
                    "forehead_standard",
                    "hair_back_shortwavy05",
                    "hair_front_shortwavy05",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy06",
                    "forehead_standard",
                    "hair_back_shortwavy06",
                    "hair_front_shortwavy06",
                    "hairbottom_shortwavy06"
                ],
                [
                    "cranium_shortwavy07",
                    "forehead_standard",
                    "hair_back_shortwavy07",
                    "hair_front_shortwavy07",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy08",
                    "forehead_standard",
                    "hair_back_shortwavy08",
                    "hair_front_shortwavy08",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy09",
                    "forehead_standard",
                    "hair_back_shortwavy09",
                    "hair_front_shortwavy09",
                    "hairbottom_shortwavy09"
                ],
                [
                    "cranium_midwavy09",
                    "forehead_standard",
                    "hair_back_midwavy09",
                    "hair_front_midwavy09",
                    "hairbottom_midwavy09"
                ],
                [
                    "cranium_midwavy10",
                    "forehead_standard",
                    "hair_back_midwavy10",
                    "hair_front_midwavy10",
                    "hairbottom_midwavy10"
                ],
                [
                    "cranium_midwavy11",
                    "forehead_standard",
                    "hair_back_midwavy11",
                    "hair_front_midwavy11",
                    "hairbottom_midwavy11"
                ],
                [
                    "cranium_midwavy12",
                    "forehead_standard",
                    "hair_back_midwavy12",
                    "hair_front_midwavy12",
                    "hairbottom_midwavy12"
                ],
                [
                    "cranium_midwavy13",
                    "forehead_standard",
                    "hair_back_midwavy13",
                    "hair_front_midwavy13",
                    "hairbottom_midwavy13"
                ],
                [
                    "cranium_midwavy14",
                    "forehead_standard",
                    "hair_back_midwavy14",
                    "hair_front_midwavy14",
                    "hairbottom_midwavy14"
                ],
                [
                    "cranium_midcurl04",
                    "forehead_standard",
                    "hair_back_midcurl04",
                    "hair_front_midcurl04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midcurl05",
                    "forehead_standard",
                    "hair_back_midcurl05",
                    "hair_front_midcurl05",
                    "hairbottom_midcurl05"
                ],
                [
                    "cranium_midcurl06",
                    "forehead_standard",
                    "hair_back_midcurl06",
                    "hair_front_midcurl06",
                    "hairbottom_midcurl06"
                ],
                [
                    "cranium_midcurl07",
                    "forehead_standard",
                    "hair_back_midcurl07",
                    "hair_front_midcurl07",
                    "hairbottom_midcurl07"
                ],
                [
                    "cranium_midcurl08",
                    "forehead_standard",
                    "hair_back_midcurl08",
                    "hair_front_midcurl08",
                    "hairbottom_midcurl08"
                ],
                [
                    "cranium_midcurl09",
                    "forehead_standard",
                    "hair_back_midcurl09",
                    "hair_front_midcurl09",
                    "hairbottom_midcurl09"
                ],
                [
                    "cranium_midcurl10",
                    "forehead_standard",
                    "hair_back_midcurl10",
                    "hair_front_midcurl10",
                    "hairbottom_midcurl10"
                ],
                [
                    "cranium_midcurl11",
                    "forehead_standard",
                    "hair_back_midcurl11",
                    "hair_front_midcurl11",
                    "hairbottom_midcurl11"
                ],
                [
                    "cranium_midcurl12",
                    "forehead_standard",
                    "hair_back_midcurl12",
                    "hair_front_midcurl12",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midcurl13",
                    "forehead_standard",
                    "hair_back_midcurl13",
                    "hair_front_midcurl13",
                    "hairbottom_midcurl13"
                ],
                [
                    "cranium_midcurl14",
                    "forehead_standard",
                    "hair_back_midcurl14",
                    "hair_front_midcurl14",
                    "hairbottom_midcurl14"
                ],
                [
                    "cranium_midcurl15",
                    "forehead_standard",
                    "hair_back_midcurl15",
                    "hair_front_midcurl15",
                    "hairbottom_midcurl15"
                ],
                [
                    "cranium_bald01",
                    "forehead_bald01",
                    "hair_back_bald01",
                    "hair_front_bald01",
                    "hairbottom_blank"
                ],
                [
                    "forehead_standard",
                    "hair_front_femcolour"
                ],
                [
                    "cranium_buzz",
                    "forehead_buzz",
                    "hair_back_buzz",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bjork",
                    "forehead_standard",
                    "hair_back_bjork",
                    "hair_front_bjork",
                    "hairbottom_blank"
                ],
                [
                    "cranium_limphawk",
                    "forehead_standard",
                    "hair_back_limphawk",
                    "hair_front_limphawk",
                    "hairbottom_blank"
                ],
                [
                    "cranium_messhawk",
                    "forehead_messhawk",
                    "hair_back_messhawk",
                    "hair_front_messhawk",
                    "hairbottom_blank"
                ],
                [
                    "cranium_anime",
                    "forehead_standard",
                    "hair_back_anime",
                    "hair_front_anime",
                    "hairbottom_blank"
                ],
                [
                    "cranium_logan",
                    "forehead_standard",
                    "hair_back_logan",
                    "hair_front_logan",
                    "hairbottom_blank"
                ],
                [
                    "cranium_mohawk01",
                    "forehead_standard",
                    "hair_back_mohawk01",
                    "hair_front_mohawk01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_frohawk",
                    "forehead_standard",
                    "hair_back_frohawk",
                    "hair_front_frohawk",
                    "hairbottom_blank"
                ],
                [
                    "cranium_spikey",
                    "forehead_standard",
                    "hair_back_spikey",
                    "hair_front_spikey",
                    "hairbottom_blank"
                ],
                [
                    "cranium_einstein",
                    "forehead_standard",
                    "hair_back_einstein",
                    "hair_front_einstein",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ian",
                    "forehead_standard",
                    "hair_back_ian",
                    "hair_front_ian",
                    "hairbottom_blank"
                ],
                [
                    "cranium_hathairsw",
                    "forehead_standard",
                    "hair_back_hathairsw",
                    "hair_front_hathairsw",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ayano",
                    "forehead_standard",
                    "hair_back_ayano",
                    "hair_front_ayano",
                    "hairbottom_ayano"
                ],
                [
                    "cranium_shortcurl11",
                    "forehead_standard",
                    "hair_back_shortcurl11",
                    "hair_front_shortcurl11",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight06",
                    "forehead_standard",
                    "hair_back_shortstraight06",
                    "hair_front_shortstraight06",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail01",
                    "forehead_standard",
                    "hair_back_ponytail01",
                    "hair_front_ponytail01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail02",
                    "forehead_standard",
                    "hair_back_ponytail02",
                    "hair_front_ponytail02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail03",
                    "forehead_standard",
                    "hair_back_ponytail03",
                    "hair_front_ponytail03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail04",
                    "forehead_standard",
                    "hair_back_ponytail04",
                    "hair_front_ponytail04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavymale",
                    "forehead_standard",
                    "hair_back_shortwavymale",
                    "hair_front_shortwavymale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavymale",
                    "forehead_standard",
                    "hair_back_midwavymale",
                    "hair_front_midwavymale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longwavymale",
                    "forehead_standard",
                    "hair_back_longwavymale",
                    "hair_front_longwavymale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midstraightmale",
                    "forehead_standard",
                    "hair_back_midstraightmale",
                    "hair_front_midstraightmale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longstraightmale",
                    "forehead_standard",
                    "hair_back_longstraightmale",
                    "hair_front_longstraightmale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longcurlmale",
                    "forehead_standard",
                    "hair_back_longcurlmale",
                    "hair_front_longcurlmale",
                    "hairbottom_blank"
                ],
                [
                    "cranium_defaultfem",
                    "forehead_standard",
                    "hair_back_defaultfem",
                    "hair_front_defaultfem",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midstraightfem",
                    "forehead_standard",
                    "hair_back_midstraightfem",
                    "hair_front_midstraightfem",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavyfem",
                    "forehead_standard",
                    "hair_back_midwavyfem",
                    "hair_front_midwavyfem",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midcurlfem",
                    "forehead_standard",
                    "hair_back_midcurlfem",
                    "hair_front_midcurlfem",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longstraightfem",
                    "forehead_standard",
                    "hair_back_longstraightfem",
                    "hair_front_longstraightfem",
                    "hairbottom_longstraightfem"
                ],
                [
                    "cranium_longwavyfem",
                    "forehead_standard",
                    "hair_back_longwavyfem",
                    "hair_front_longwavyfem",
                    "hairbottom_longwavyfem"
                ],
                [
                    "cranium_longcurlfem",
                    "forehead_standard",
                    "hair_back_longcurlfem",
                    "hair_front_longcurlfem",
                    "hairbottom_longcurlfem"
                ]
            ],
            "beard": [
                [
                    "beard_blank",
                    "stachin_blank",
                    "stachout_blank"
                ],
                [
                    "beard_n4_1",
                    "stachin_blank",
                    "stachout_n4_1"
                ],
                [
                    "beard_n3_1",
                    "stachin_n1_1",
                    "stachout_n1_1"
                ],
                [
                    "beard_n1_1",
                    "stachin_n1_1",
                    "stachout_n1_1"
                ],
                [
                    "beard_n2_1",
                    "stachin_n1_1",
                    "stachout_n1_1"
                ],
                [
                    "beard_n6_1",
                    "stachin_n1_1",
                    "stachout_n1_1"
                ],
                [
                    "beard_n3_1",
                    "stachin_blank",
                    "stachout_n5_1"
                ],
                [
                    "beard_n3_1",
                    "stachin_blank",
                    "stachout_n6_1"
                ],
                [
                    "beard_n3_1",
                    "stachin_blank",
                    "stachout_n7_1"
                ],
                [
                    "beard_n4_1",
                    "stachin_blank",
                    "stachout_n5_1"
                ],
                [
                    "beard_n4_1",
                    "stachin_blank",
                    "stachout_n6_1"
                ],
                [
                    "beard_n4_1",
                    "stachin_blank",
                    "stachout_n7_1"
                ],
                [
                    "beard_n4_1",
                    "stachin_n1_1",
                    "stachout_n1_1"
                ]
            ],
            "brow": [
                [
                    "brow_n17"
                ],
                [
                    "brow_n19"
                ],
                [
                    "brow_n18"
                ],
                [
                    "brow_n15"
                ],
                [
                    "brow_n21"
                ],
                [
                    "brow_n22"
                ],
                [
                    "brow_n24"
                ],
                [
                    "brow_n32"
                ],
                [
                    "brow_n16"
                ],
                [
                    "brow_n30"
                ],
                [
                    "brow_n26"
                ],
                [
                    "brow_n20"
                ],
                [
                    "brow_n27"
                ],
                [
                    "brow_n25"
                ],
                [
                    "brow_n28"
                ],
                [
                    "brow_n29"
                ],
                [
                    "brow_n31"
                ],
                [
                    "brow_n33"
                ],
                [
                    "brow_n23"
                ],
                [
                    "brow_n1"
                ],
                [
                    "brow_n2"
                ],
                [
                    "brow_n3"
                ],
                [
                    "brow_n4"
                ],
                [
                    "brow_n5"
                ],
                [
                    "brow_n6"
                ],
                [
                    "brow_n7"
                ],
                [
                    "brow_n8"
                ],
                [
                    "brow_n9"
                ],
                [
                    "brow_n10"
                ],
                [
                    "brow_n11"
                ],
                [
                    "brow_n12"
                ],
                [
                    "brow_n13"
                ],
                [
                    "brow_n14"
                ]
            ],
            "detail_E": [
                [
                    "detail_E_n0"
                ],
                [
                    "detail_E_n1"
                ],
                [
                    "detail_E_n2"
                ],
                [
                    "detail_E_n3"
                ],
                [
                    "detail_E_n4"
                ],
                [
                    "detail_E_n5"
                ],
                [
                    "detail_E_n6"
                ],
                [
                    "detail_E_n7"
                ]
            ],
            "detail_L": [
                [
                    "detail_L_n1"
                ],
                [
                    "detail_L_n2"
                ],
                [
                    "detail_L_n3"
                ],
                [
                    "detail_L_n4"
                ],
                [
                    "detail_L_n5"
                ],
                [
                    "detail_L_n6"
                ],
                [
                    "detail_L_n7"
                ],
                [
                    "detail_L_n8"
                ],
                [
                    "detail_L_n9"
                ],
                [
                    "detail_L_n10"
                ],
                [
                    "detail_L_n11"
                ]
            ],
            "detail_T": [
                [
                    "detail_T_n0"
                ],
                [
                    "detail_T_n1"
                ],
                [
                    "detail_T_n2"
                ],
                [
                    "detail_T_n3"
                ],
                [
                    "detail_T_n4"
                ],
                [
                    "detail_T_n5"
                ],
                [
                    "detail_T_n6"
                ],
                [
                    "detail_T_n7"
                ],
                [
                    "detail_T_n8"
                ],
                [
                    "detail_T_n9"
                ],
                [
                    "detail_T_n10"
                ],
                [
                    "detail_T_n11"
                ],
                [
                    "detail_T_n12"
                ],
                [
                    "detail_T_n13"
                ],
                [
                    "detail_T_n14"
                ]
            ],
            "ear": [
                [
                    "ear_n1"
                ],
                [
                    "ear_n2"
                ],
                [
                    "ear_n3"
                ],
                [
                    "ear_n4"
                ],
                [
                    "ear_n5"
                ],
                [
                    "ear_n6"
                ],
                [
                    "ear_n7"
                ],
                [
                    "ear_n8"
                ],
                [
                    "ear_n9"
                ]
            ],
            "earring": [
                [
                    "earring_blank"
                ],
                [
                    "earring_n2"
                ],
                [
                    "earring_n1"
                ]
            ],
            "eye": [
                [
                    "eye_n1"
                ],
                [
                    "eye_n2"
                ],
                [
                    "eye_n11"
                ],
                [
                    "eye_n15"
                ],
                [
                    "eye_n3"
                ],
                [
                    "eye_n7"
                ],
                [
                    "eye_n8"
                ],
                [
                    "eye_n9"
                ],
                [
                    "eye_n12"
                ],
                [
                    "eye_n18"
                ],
                [
                    "eye_n10"
                ],
                [
                    "eye_n4"
                ],
                [
                    "eye_n5"
                ],
                [
                    "eye_n6"
                ],
                [
                    "eye_n13"
                ],
                [
                    "eye_n14"
                ],
                [
                    "eye_n16"
                ],
                [
                    "eye_n17"
                ]
            ],
            "eyelash": [
                [
                    "eyelash_blank"
                ],
                [
                    "eyelash_n1_1"
                ],
                [
                    "eyelash_n2_1"
                ],
                [
                    "eyelash_n3_1"
                ]
            ],
            "glasses": [
                [
                    "glasses_blank"
                ],
                [
                    "glasses_n1"
                ],
                [
                    "glasses_n2"
                ],
                [
                    "glasses_n3"
                ],
                [
                    "glasses_n4"
                ],
                [
                    "glasses_n5"
                ],
                [
                    "glasses_n6"
                ],
                [
                    "glasses_n1a"
                ],
                [
                    "glasses_n1b"
                ],
                [
                    "glasses_n1c"
                ],
                [
                    "glasses_n1d"
                ],
                [
                    "glasses_n2a"
                ],
                [
                    "glasses_n2b"
                ],
                [
                    "glasses_n2c"
                ],
                [
                    "glasses_n2d"
                ],
                [
                    "glasses_n3a"
                ],
                [
                    "glasses_n3b"
                ],
                [
                    "glasses_n3c"
                ],
                [
                    "glasses_n3d"
                ],
                [
                    "glasses_n4a"
                ],
                [
                    "glasses_n4b"
                ],
                [
                    "glasses_n4c"
                ],
                [
                    "glasses_n4d"
                ],
                [
                    "glasses_n5a"
                ],
                [
                    "glasses_n5b"
                ],
                [
                    "glasses_n5c"
                ],
                [
                    "glasses_n5d"
                ],
                [
                    "glasses_n6a"
                ],
                [
                    "glasses_n6b"
                ],
                [
                    "glasses_n6c"
                ],
                [
                    "glasses_n6d"
                ],
                [
                    "glasses_n7"
                ],
                [
                    "glasses_n7a"
                ],
                [
                    "glasses_n7b"
                ],
                [
                    "glasses_n7c"
                ],
                [
                    "glasses_n7d"
                ],
                [
                    "glasses_n8"
                ],
                [
                    "glasses_n8a"
                ],
                [
                    "glasses_n8b"
                ],
                [
                    "glasses_n8c"
                ],
                [
                    "glasses_n8d"
                ],
                [
                    "glasses_n9"
                ],
                [
                    "glasses_n9a"
                ],
                [
                    "glasses_n9b"
                ],
                [
                    "glasses_n9c"
                ],
                [
                    "glasses_n9d"
                ],
                [
                    "glasses_n10"
                ],
                [
                    "glasses_n10a"
                ],
                [
                    "glasses_n10b"
                ],
                [
                    "glasses_n10c"
                ],
                [
                    "glasses_n10d"
                ],
                [
                    "glasses_n11"
                ],
                [
                    "glasses_n12"
                ],
                [
                    "glasses_n13"
                ],
                [
                    "glasses_n13a"
                ],
                [
                    "glasses_n13b"
                ],
                [
                    "glasses_n13c"
                ],
                [
                    "glasses_n13d"
                ],
                [
                    "glasses_n14"
                ],
                [
                    "glasses_n15"
                ],
                [
                    "glasses_n15a"
                ],
                [
                    "glasses_n15b"
                ],
                [
                    "glasses_n15c"
                ],
                [
                    "glasses_n15d"
                ],
                [
                    "glasses_n16"
                ],
                [
                    "glasses_n16a"
                ],
                [
                    "glasses_n16b"
                ],
                [
                    "glasses_n16c"
                ],
                [
                    "glasses_n16d"
                ],
                [
                    "glasses_n17"
                ],
                [
                    "glasses_n17a"
                ],
                [
                    "glasses_n17b"
                ],
                [
                    "glasses_n17c"
                ],
                [
                    "glasses_n17d"
                ],
                [
                    "glasses_n18"
                ],
                [
                    "glasses_n19"
                ],
                [
                    "glasses_n20"
                ],
                [
                    "glasses_n21"
                ],
                [
                    "glasses_n22"
                ],
                [
                    "glasses_n23"
                ],
                [
                    "glasses_n24"
                ]
            ],
            "hat": [
                [
                    "hat_blank"
                ],
                [
                    "hat_art1"
                ],
                [
                    "hat_snapback"
                ],
                [
                    "hat_backwards"
                ],
                [
                    "hat_visor"
                ],
                [
                    "hat_biker"
                ],
                [
                    "hat_army"
                ],
                [
                    "hat_poorboy"
                ],
                [
                    "hat_fedora2"
                ],
                [
                    "hat_straw"
                ],
                [
                    "hat_art5"
                ],
                [
                    "hat_art8"
                ],
                [
                    "hat_boater"
                ],
                [
                    "hat_artsylvain"
                ],
                [
                    "hat_art4"
                ],
                [
                    "hat_art10"
                ],
                [
                    "hat_yarmulke"
                ],
                [
                    "hat_kufi"
                ],
                [
                    "hat_turban2"
                ],
                [
                    "hat_turban3"
                ],
                [
                    "hat_hairwrap"
                ],
                [
                    "hat_rasta"
                ],
                [
                    "hat_toque1"
                ],
                [
                    "hat_toque2"
                ],
                [
                    "hat_toque3"
                ],
                [
                    "hat_art2"
                ],
                [
                    "hat_fargo"
                ],
                [
                    "hat_art7"
                ],
                [
                    "hat_art6"
                ],
                [
                    "hat_towel"
                ],
                [
                    "hat_art11"
                ],
                [
                    "hat_helmet1"
                ],
                [
                    "hat_art12"
                ],
                [
                    "hat_crown1"
                ],
                [
                    "hat_crown2"
                ],
                [
                    "hat_chef"
                ],
                [
                    "hat_art3"
                ],
                [
                    "hat_visor2"
                ],
                [
                    "hat_art15"
                ],
                [
                    "hat_cop2"
                ],
                [
                    "hat_art13"
                ],
                [
                    "hat_pirate2"
                ],
                [
                    "hat_catinthehat"
                ],
                [
                    "hat_art14"
                ],
                [
                    "hat_cap2"
                ],
                [
                    "hat_cap"
                ],
                [
                    "hat_knit1"
                ],
                [
                    "hat_knit2"
                ],
                [
                    "hat_floppy"
                ],
                [
                    "hat_golfback"
                ],
                [
                    "hat_art9"
                ],
                [
                    "hat_art16"
                ],
                [
                    "hat_clochet"
                ],
                [
                    "hat_hijab2"
                ],
                [
                    "hat_headwrap"
                ],
                [
                    "hat_arrowed"
                ],
                [
                    "hat_sweatband"
                ],
                [
                    "hat_bunny"
                ],
                [
                    "hat_clown"
                ],
                [
                    "hat_dillybopper"
                ],
                [
                    "hat_fez"
                ],
                [
                    "hat_madhatter"
                ],
                [
                    "hat_viking"
                ],
                [
                    "hat_egyptian"
                ],
                [
                    "hat_knight"
                ],
                [
                    "hat_pilgrim"
                ],
                [
                    "hat_robinhood"
                ],
                [
                    "hat_native"
                ],
                [
                    "hat_spacehelmet"
                ],
                [
                    "hat_sleep"
                ],
                [
                    "hat_elf"
                ],
                [
                    "hat_santa"
                ],
                [
                    "hat_halo"
                ],
                [
                    "hat_devil"
                ],
                [
                    "hat_reindeer"
                ],
                [
                    "hat_wizard"
                ],
                [
                    "hat_leprechaun"
                ],
                [
                    "hat_church"
                ],
                [
                    "hat_headphones"
                ],
                [
                    "hat_headset"
                ],
                [
                    "hat_lampshade"
                ],
                [
                    "hat_spartan"
                ],
                [
                    "hat_samurai"
                ],
                [
                    "hat_safari2"
                ],
                [
                    "hat_safari"
                ],
                [
                    "hat_pope"
                ],
                [
                    "hat_motorcycle"
                ],
                [
                    "hat_bike"
                ],
                [
                    "hat_dunce"
                ],
                [
                    "hat_foxy"
                ],
                [
                    "hat_football"
                ],
                [
                    "hat_grad"
                ],
                [
                    "hat_hobo"
                ],
                [
                    "hat_hockey"
                ],
                [
                    "hat_jockey"
                ],
                [
                    "hat_hockey2"
                ],
                [
                    "hat_bonnet"
                ],
                [
                    "hat_fruit"
                ],
                [
                    "hat_judge"
                ],
                [
                    "hat_fireman"
                ],
                [
                    "hat_napoleon"
                ],
                [
                    "hat_baseball"
                ],
                [
                    "hat_boxing"
                ],
                [
                    "hat_nuclear"
                ],
                [
                    "hat_mindcontrol"
                ],
                [
                    "hat_construction"
                ]
            ],
            "acchair": [
                [
                    "hat_blank"
                ],
                [
                    "hat_headphones"
                ],
                [
                    "hat_earmuff"
                ],
                [
                    "hat_sweatband"
                ],
                [
                    "hat_string"
                ],
                [
                    "hat_flower01"
                ],
                [
                    "hat_hairclip01"
                ],
                [
                    "hat_hairclip02"
                ],
                [
                    "hat_hairclip03"
                ],
                [
                    "hat_bow"
                ],
                [
                    "hat_headband"
                ],
                [
                    "hat_headband2"
                ]
            ],
            "jaw": [
                [
                    "jaw_n11"
                ],
                [
                    "jaw_n3"
                ],
                [
                    "jaw_n4"
                ],
                [
                    "jaw_n2"
                ],
                [
                    "jaw_n9"
                ],
                [
                    "jaw_n5"
                ],
                [
                    "jaw_n6"
                ],
                [
                    "jaw_n10"
                ],
                [
                    "jaw_n7"
                ],
                [
                    "jaw_n1"
                ]
            ],
            "mouth": [
                [
                    "mouth_n1",
                    "tongue_n1_3"
                ],
                [
                    "mouth_n2",
                    "tongue_n1_3"
                ],
                [
                    "mouth_n6",
                    "tongue_n1_5"
                ],
                [
                    "mouth_n5",
                    "tongue_n1_5"
                ],
                [
                    "mouth_n3",
                    "tongue_n1_3"
                ],
                [
                    "mouth_n7",
                    "tongue_n1_5"
                ],
                [
                    "mouth_n9",
                    "tongue_n1_3"
                ],
                [
                    "mouth_n4",
                    "tongue_n1_3"
                ],
                [
                    "mouth_n8",
                    "tongue_n1_5"
                ]
            ],
            "nose": [
                [
                    "nose_n1"
                ],
                [
                    "nose_n2"
                ],
                [
                    "nose_n3"
                ],
                [
                    "nose_n4"
                ],
                [
                    "nose_n5"
                ],
                [
                    "nose_n6"
                ],
                [
                    "nose_n7"
                ],
                [
                    "nose_n8"
                ],
                [
                    "nose_n9"
                ],
                [
                    "nose_n10"
                ],
                [
                    "nose_n11"
                ],
                [
                    "nose_n12"
                ],
                [
                    "nose_n13"
                ],
                [
                    "nose_n14"
                ],
                [
                    "nose_n15"
                ],
                [
                    "nose_n16"
                ],
                [
                    "nose_n17"
                ],
                [
                    "nose_n18"
                ]
            ],
            "pupil": [
                [
                    "pupil_n3"
                ],
                [
                    "pupil_n2"
                ],
                [
                    "pupil_n1"
                ],
                [
                    "pupil_n6"
                ],
                [
                    "pupil_n5"
                ],
                [
                    "pupil_n4"
                ],
                [
                    "pupil_n9"
                ],
                [
                    "pupil_n8"
                ],
                [
                    "pupil_n7"
                ]
            ],
            "linecombos": [
                [
                    "detail_E_blank",
                    "detail_L_blank",
                    "detail_T_blank"
                ],
                [
                    "detail_E_n2",
                    "detail_L_blank",
                    "detail_T_blank"
                ],
                [
                    "detail_E_blank",
                    "detail_L_blank",
                    "detail_T_n1"
                ],
                [
                    "detail_E_blank",
                    "detail_L_blank",
                    "detail_T_n8"
                ],
                [
                    "detail_E_blank",
                    "detail_L_n4",
                    "detail_T_blank"
                ],
                [
                    "detail_E_blank",
                    "detail_L_n7",
                    "detail_T_blank"
                ],
                [
                    "detail_E_n2",
                    "detail_L_blank",
                    "detail_T_n1"
                ],
                [
                    "detail_E_n2",
                    "detail_L_n5",
                    "detail_T_n2"
                ],
                [
                    "detail_E_n4",
                    "detail_L_n6",
                    "detail_T_n8"
                ]
            ],
            "wizard_skip_ears": [
                [
                    "hair_front_kennyg"
                ],
                [
                    "hair_front_longstraight07"
                ],
                [
                    "hair_front_midcurl03"
                ],
                [
                    "hair_front_longstraight09"
                ],
                [
                    "hair_front_longcurl01"
                ],
                [
                    "hair_front_longwavy"
                ],
                [
                    "hair_front_midstraight01"
                ],
                [
                    "hair_front_longstraight10"
                ],
                [
                    "hair_front_longcurl04"
                ],
                [
                    "hair_front_longwavy02"
                ],
                [
                    "hair_front_midstraight03"
                ],
                [
                    "hair_front_ashton"
                ],
                [
                    "hair_front_longcurl05"
                ],
                [
                    "hair_front_longwavy04"
                ],
                [
                    "hair_front_midstraight04"
                ],
                [
                    "hair_front_asymm"
                ],
                [
                    "hair_front_longcurl06"
                ],
                [
                    "hair_front_longwavy05"
                ],
                [
                    "hair_front_midstraight05"
                ],
                [
                    "hair_front_ayano"
                ],
                [
                    "hair_front_longcurl07"
                ],
                [
                    "hair_front_longwavy07"
                ],
                [
                    "hair_front_midstraight06"
                ],
                [
                    "hair_front_bangs"
                ],
                [
                    "hair_front_longcurl08"
                ],
                [
                    "hair_front_longwavy08"
                ],
                [
                    "hair_front_midstraight07"
                ],
                [
                    "hair_front_bangs02"
                ],
                [
                    "hair_front_longcurl09"
                ],
                [
                    "hair_front_longwavy09"
                ],
                [
                    "hair_front_midstraight08"
                ],
                [
                    "hair_front_bangspulled"
                ],
                [
                    "hair_front_longerwavy"
                ],
                [
                    "hair_front_longwavy10"
                ],
                [
                    "hair_front_midstraight09"
                ],
                [
                    "hair_front_beyonce"
                ],
                [
                    "hair_front_longpart02"
                ],
                [
                    "hair_front_midwavy03",
                    "hair_front_midwavy03"
                ],
                [
                    "hair_front_midwavy01"
                ],
                [
                    "hair_front_bob01"
                ],
                [
                    "hair_front_longstraight01"
                ],
                [
                    "hair_front_longwavy11"
                ],
                [
                    "hair_front_ozzy"
                ],
                [
                    "hair_front_bob02"
                ],
                [
                    "hair_front_longstraight02"
                ],
                [
                    "hair_front_longwavy12"
                ],
                [
                    "hair_front_pixie"
                ],
                [
                    "hair_front_bob03"
                ],
                [
                    "hair_front_longstraight03"
                ],
                [
                    "hair_front_longwavy13"
                ],
                [
                    "hair_front_roro"
                ],
                [
                    "hair_front_dorian"
                ],
                [
                    "hair_front_longstraight04"
                ],
                [
                    "hair_front_longwavy14"
                ],
                [
                    "hair_front_shortcurl10"
                ],
                [
                    "hair_front_dreadsdown01"
                ],
                [
                    "hair_front_longstraight05"
                ],
                [
                    "hair_front_midcurl01"
                ],
                [
                    "hair_front_skywalker"
                ],
                [
                    "hair_front_dreadsdown02"
                ],
                [
                    "hair_front_longstraight06"
                ],
                [
                    "hair_front_midcurl02"
                ],
                [
                    "hair_front_trethew"
                ],
                [
                    "hair_front_longstraight12"
                ],
                [
                    "hair_front_midwavy06"
                ],
                [
                    "hair_front_shortwavy09"
                ],
                [
                    "hair_front_midwavy09"
                ],
                [
                    "hair_front_midwavy10"
                ],
                [
                    "hair_front_midwavy11"
                ],
                [
                    "hair_front_midwavy13"
                ],
                [
                    "hair_front_midwavy14"
                ],
                [
                    "hair_front_midcurl04"
                ],
                [
                    "hair_front_midcurl05"
                ],
                [
                    "hair_front_midcurl06"
                ],
                [
                    "hair_front_midcurl07"
                ],
                [
                    "hair_front_midcurl08"
                ],
                [
                    "hair_front_midcurl09"
                ],
                [
                    "hair_front_midcurl10"
                ],
                [
                    "hair_front_midcurl11"
                ],
                [
                    "hair_front_midcurl13"
                ],
                [
                    "hair_front_midcurl14"
                ],
                [
                    "hair_front_midcurl15"
                ],
                [
                    "hair_front_longstraightfem"
                ],
                [
                    "hair_front_longwavyfem"
                ],
                [
                    "hair_front_longcurlfem"
                ],
                [
                    "hair_front_werewolf"
                ],
                [
                    "hair_front_ringu"
                ]
            ],
            "over_glasses": [
                [
                    "hair_front_kennyg"
                ],
                [
                    "hair_front_longstraight05"
                ],
                [
                    "hair_front_midcurl02"
                ],
                [
                    "hair_front_shortstraight03"
                ],
                [
                    "hair_front_longcurl01"
                ],
                [
                    "hair_front_longstraight06"
                ],
                [
                    "hair_front_midcurl03"
                ],
                [
                    "hair_front_skywalker"
                ],
                [
                    "hair_front_longcurl02"
                ],
                [
                    "hair_front_longstraight07"
                ],
                [
                    "hair_front_midpart01"
                ],
                [
                    "hair_front_trethew"
                ],
                [
                    "hair_front_ashton"
                ],
                [
                    "hair_front_longcurl04"
                ],
                [
                    "hair_front_longwavy"
                ],
                [
                    "hair_front_midstraight01"
                ],
                [
                    "hair_front_longstraight08"
                ],
                [
                    "hair_front_asymm"
                ],
                [
                    "hair_front_longcurl05"
                ],
                [
                    "hair_front_longwavy02"
                ],
                [
                    "hair_front_midstraight03"
                ],
                [
                    "hair_front_longstraight09"
                ],
                [
                    "hair_front_ayano"
                ],
                [
                    "hair_front_longcurl06"
                ],
                [
                    "hair_front_longwavy04"
                ],
                [
                    "hair_front_midstraight04"
                ],
                [
                    "hair_front_longstraight10"
                ],
                [
                    "hair_front_bangs"
                ],
                [
                    "hair_front_longcurl07"
                ],
                [
                    "hair_front_longwavy05"
                ],
                [
                    "hair_front_midstraight05"
                ],
                [
                    "hair_front_bangs02"
                ],
                [
                    "hair_front_longcurl08"
                ],
                [
                    "hair_front_longwavy07"
                ],
                [
                    "hair_front_midstraight06"
                ],
                [
                    "hair_front_bangspulled"
                ],
                [
                    "hair_front_longcurl09"
                ],
                [
                    "hair_front_longwavy08"
                ],
                [
                    "hair_front_midstraight07"
                ],
                [
                    "hair_front_beyonce"
                ],
                [
                    "hair_front_longerwavy"
                ],
                [
                    "hair_front_longwavy09"
                ],
                [
                    "hair_front_midstraight08"
                ],
                [
                    "hair_front_bob01"
                ],
                [
                    "hair_front_longpart"
                ],
                [
                    "hair_front_longwavy10"
                ],
                [
                    "hair_front_midstraight09"
                ],
                [
                    "hair_front_bob02"
                ],
                [
                    "hair_front_longpart02"
                ],
                [
                    "hair_front_longwavy11"
                ],
                [
                    "hair_front_midwavy01"
                ],
                [
                    "hair_front_bob03"
                ],
                [
                    "hair_front_longstraight01"
                ],
                [
                    "hair_front_longwavy12"
                ],
                [
                    "hair_front_midwavy03"
                ],
                [
                    "hair_front_dorian"
                ],
                [
                    "hair_front_longstraight02"
                ],
                [
                    "hair_front_longwavy13"
                ],
                [
                    "hair_front_ozzy"
                ],
                [
                    "hair_front_dreadsdown01"
                ],
                [
                    "hair_front_longstraight03"
                ],
                [
                    "hair_front_longwavy14"
                ],
                [
                    "hair_front_roro"
                ],
                [
                    "hair_front_dreadsdown02"
                ],
                [
                    "hair_front_longstraight04"
                ],
                [
                    "hair_front_midcurl01"
                ],
                [
                    "hair_front_shortcurl10"
                ],
                [
                    "hair_front_longstraight11"
                ],
                [
                    "hair_front_longstraight12"
                ],
                [
                    "hair_front_midwavy05"
                ],
                [
                    "hair_front_midwavy06"
                ],
                [
                    "hair_front_shortwavy04"
                ],
                [
                    "hair_front_shortwavy06"
                ],
                [
                    "hair_front_shortwavy09"
                ],
                [
                    "hair_front_midwavy09"
                ],
                [
                    "hair_front_midwavy10"
                ],
                [
                    "hair_front_midwavy11"
                ],
                [
                    "hair_front_midwavy12"
                ],
                [
                    "hair_front_midwavy13"
                ],
                [
                    "hair_front_midwavy14"
                ],
                [
                    "hair_front_midcurl04"
                ],
                [
                    "hair_front_midcurl05"
                ],
                [
                    "hair_front_midcurl06"
                ],
                [
                    "hair_front_midcurl07"
                ],
                [
                    "hair_front_midcurl08"
                ],
                [
                    "hair_front_midcurl09"
                ],
                [
                    "hair_front_midcurl10"
                ],
                [
                    "hair_front_midcurl11"
                ],
                [
                    "hair_front_midcurl13"
                ],
                [
                    "hair_front_midcurl14"
                ],
                [
                    "hair_front_midcurl15"
                ],
                [
                    "hair_front_anime"
                ],
                [
                    "hair_front_pigtails"
                ],
                [
                    "hair_front_pixie"
                ],
                [
                    "hair_front_midstraightmale"
                ],
                [
                    "hair_front_midstraightfem"
                ],
                [
                    "hair_front_longstraightmale"
                ],
                [
                    "hair_front_longstraightfem"
                ],
                [
                    "hair_front_longwavyfem"
                ],
                [
                    "hair_front_longcurlfem"
                ]
            ],
            "outfits": {
                "0": 615640,
                "1": 612948,
                "2": 615642,
                "3": 605877,
                "4": 605872,
                "5": 612961,
                "6": 600413,
                "7": 600561,
                "8": 601154,
                "9": 612955,
                "10": 612958,
                "11": 245805,
                "12": 600402,
                "13": 600400,
                "14": 387933,
                "15": 600353,
                "16": 76440,
                "17": 168255,
                "18": 385145,
                "19": 168257,
                "20": 61,
                "21": 168533,
                "22": 51434,
                "23": 168536,
                "24": 51610,
                "25": 51432,
                "26": 168167,
                "27": 168153,
                "28": 168180,
                "29": 387920,
                "30": 168194,
                "31": 44,
                "32": 168528,
                "33": 76395,
                "34": 168493,
                "35": 258255,
                "36": 168490,
                "37": 51435,
                "38": 172492,
                "39": 168496,
                "40": 23797,
                "41": 172489,
                "42": 168494,
                "43": 168491,
                "44": 168504,
                "45": 23780,
                "46": 172488,
                "47": 168526,
                "48": 172493,
                "49": 172491,
                "51": 168243,
                "52": 172395,
                "53": 387930,
                "54": 76435,
                "55": 245956,
                "56": 59,
                "57": 168242,
                "59": 387931,
                "61": 385141,
                "62": 387940,
                "64": 387943,
                "66": 246303,
                "68": 58,
                "69": 168232,
                "70": 54,
                "71": 172462,
                "72": 137926,
                "73": 387925,
                "74": 168227,
                "75": 51607,
                "76": 168228,
                "77": 51427,
                "78": 56,
                "79": 172411,
                "80": 168238,
                "81": 168211,
                "82": 168230,
                "83": 51433,
                "84": 172412,
                "85": 172441,
                "87": 168061,
                "88": 23789,
                "89": 63,
                "91": 194646,
                "92": 194639,
                "93": 194644
            }
        },
        "2": {
            "hair_short_straight": [
                [
                    "cranium_defaultfem",
                    "forehead_standard",
                    "hair_back_defaultfem",
                    "hair_front_defaultfem",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight04",
                    "forehead_standard",
                    "hair_back_shortstraight04",
                    "hair_front_shortstraight04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight02",
                    "forehead_standard",
                    "hair_back_shortstraight02",
                    "hair_front_shortstraight02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_casey",
                    "forehead_standard",
                    "hair_back_casey",
                    "hair_front_casey",
                    "hairbottom_blank"
                ],
                [
                    "cranium_sideswipe",
                    "forehead_standard",
                    "hair_back_sideswipe",
                    "hair_front_sideswipe",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight03",
                    "forehead_standard",
                    "hair_back_shortstraight03",
                    "hair_front_shortstraight03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight05",
                    "forehead_standard",
                    "hair_back_shortstraight05",
                    "hair_front_shortstraight05",
                    "hairbottom_blank"
                ],
                [
                    "cranium_smart02",
                    "forehead_standard",
                    "hair_back_smart02",
                    "hair_front_smart02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_fauxhawk",
                    "forehead_standard",
                    "hair_back_fauxhawk",
                    "hair_front_fauxhawk",
                    "hairbottom_blank"
                ]
            ],
            "hair_short_wavey": [
                [
                    "cranium_shortwavy02",
                    "forehead_standard",
                    "hair_back_shortwavy02",
                    "hair_front_shortwavy02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy07",
                    "forehead_standard",
                    "hair_back_shortwavy07",
                    "hair_front_shortwavy07",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy08",
                    "forehead_standard",
                    "hair_back_shortwavy08",
                    "hair_front_shortwavy08",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy04",
                    "forehead_standard",
                    "hair_back_shortwavy04",
                    "hair_front_shortwavy04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy05",
                    "forehead_standard",
                    "hair_back_shortwavy05",
                    "hair_front_shortwavy05",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy02",
                    "forehead_standard",
                    "hair_back_midwavy02",
                    "hair_front_midwavy02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_trethew",
                    "forehead_standard",
                    "hair_back_trethew",
                    "hair_front_trethew",
                    "hairbottom_trethew"
                ],
                [
                    "cranium_shortwavy06",
                    "forehead_standard",
                    "hair_back_shortwavy06",
                    "hair_front_shortwavy06",
                    "hairbottom_shortwavy06"
                ],
                [
                    "cranium_pixie",
                    "forehead_standard",
                    "hair_back_pixie",
                    "hair_front_pixie",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortwavy09",
                    "forehead_standard",
                    "hair_back_shortwavy09",
                    "hair_front_shortwavy09",
                    "hairbottom_shortwavy09"
                ]
            ],
            "hair_short_curly": [
                [
                    "cranium_shortcurl02",
                    "forehead_standard",
                    "hair_back_shortcurl02",
                    "hair_front_shortcurl02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl",
                    "forehead_standard",
                    "hair_back_shortcurl",
                    "hair_front_shortcurl",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl03",
                    "forehead_standard",
                    "hair_back_shortcurl03",
                    "hair_front_shortcurl03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl05",
                    "forehead_standard",
                    "hair_back_shortcurl05",
                    "hair_front_shortcurl05",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl08",
                    "forehead_standard",
                    "hair_back_shortcurl08",
                    "hair_front_shortcurl08",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midfro01",
                    "forehead_standard",
                    "hair_back_midfro01",
                    "hair_front_midfro01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl04",
                    "forehead_standard",
                    "hair_back_shortcurl04",
                    "hair_front_shortcurl04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl09",
                    "forehead_standard",
                    "hair_back_shortcurl09",
                    "hair_front_shortcurl09",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortcurl10",
                    "forehead_standard",
                    "hair_back_shortcurl10",
                    "hair_front_shortcurl10",
                    "hairbottom_shortcurl10"
                ],
                [
                    "cranium_davek",
                    "forehead_standard",
                    "hair_back_davek",
                    "hair_front_davek",
                    "hairbottom_blank"
                ],
                [
                    "cranium_cornrows",
                    "forehead_standard",
                    "hair_back_cornrows",
                    "hair_front_cornrows",
                    "hairbottom_blank"
                ]
            ],
            "hair_medium_straight": [
                [
                    "cranium_midstraightfem",
                    "forehead_standard",
                    "hair_back_midstraightfem",
                    "hair_front_midstraightfem",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midpart01",
                    "forehead_standard",
                    "hair_back_midpart01",
                    "hair_front_midpart01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midstraight06",
                    "forehead_standard",
                    "hair_back_midstraight06",
                    "hair_front_midstraight06",
                    "hairbottom_midstraight06"
                ],
                [
                    "cranium_ayano",
                    "forehead_standard",
                    "hair_back_ayano",
                    "hair_front_ayano",
                    "hairbottom_ayano"
                ],
                [
                    "cranium_midstraight07",
                    "forehead_standard",
                    "hair_back_midstraight07",
                    "hair_front_midstraight07",
                    "hairbottom_midstraight07"
                ],
                [
                    "cranium_bob01",
                    "forehead_standard",
                    "hair_back_bob01",
                    "hair_front_bob01",
                    "hairbottom_bob01"
                ],
                [
                    "cranium_bob03",
                    "forehead_standard",
                    "hair_back_bob03",
                    "hair_front_bob03",
                    "hairbottom_bob03"
                ],
                [
                    "cranium_midstraight08",
                    "forehead_standard",
                    "hair_back_midstraight08",
                    "hair_front_midstraight08",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bangs02",
                    "forehead_standard",
                    "hair_back_bangs02",
                    "hair_front_bangs02",
                    "hairbottom_bangs02"
                ],
                [
                    "cranium_midstraight09",
                    "forehead_standard",
                    "hair_back_midstraight09",
                    "hair_front_midstraight09",
                    "hairbottom_midstraight09"
                ],
                [
                    "cranium_asymm",
                    "forehead_standard",
                    "hair_back_asymm",
                    "hair_front_asymm",
                    "hairbottom_asymm"
                ],
                [
                    "cranium_pigtails",
                    "forehead_standard",
                    "hair_back_pigtails",
                    "hair_front_pigtails",
                    "hairbottom_blank"
                ]
            ],
            "hair_medium_wavey": [
                [
                    "cranium_midwavyfem",
                    "forehead_standard",
                    "hair_back_midwavyfem",
                    "hair_front_midwavyfem",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midwavy01",
                    "forehead_standard",
                    "hair_back_midwavy01",
                    "hair_front_midwavy01",
                    "hairbottom_midwavy01"
                ],
                [
                    "cranium_midwavy03",
                    "forehead_standard",
                    "hair_back_midwavy03",
                    "hair_front_midwavy03",
                    "hairbottom_midwavy03"
                ],
                [
                    "cranium_midwavy14",
                    "forehead_standard",
                    "hair_back_midwavy14",
                    "hair_front_midwavy14",
                    "hairbottom_midwavy14"
                ],
                [
                    "cranium_midwavy09",
                    "forehead_standard",
                    "hair_back_midwavy09",
                    "hair_front_midwavy09",
                    "hairbottom_midwavy09"
                ],
                [
                    "cranium_midwavy10",
                    "forehead_standard",
                    "hair_back_midwavy10",
                    "hair_front_midwavy10",
                    "hairbottom_midwavy10"
                ],
                [
                    "cranium_midcurl01",
                    "forehead_standard",
                    "hair_back_midcurl01",
                    "hair_front_midcurl01",
                    "hairbottom_midcurl01"
                ],
                [
                    "cranium_midwavy11",
                    "forehead_standard",
                    "hair_back_midwavy11",
                    "hair_front_midwavy11",
                    "hairbottom_midwavy11"
                ],
                [
                    "cranium_midwavy12",
                    "forehead_standard",
                    "hair_back_midwavy12",
                    "hair_front_midwavy12",
                    "hairbottom_midwavy12"
                ],
                [
                    "cranium_midwavy13",
                    "forehead_standard",
                    "hair_back_midwavy13",
                    "hair_front_midwavy13",
                    "hairbottom_midwavy13"
                ]
            ],
            "hair_medium_curly": [
                [
                    "cranium_midcurl02",
                    "forehead_standard",
                    "hair_back_midcurl02",
                    "hair_front_midcurl02",
                    "hairbottom_midcurl02"
                ],
                [
                    "cranium_midcurl03",
                    "forehead_standard",
                    "hair_back_midcurl03",
                    "hair_front_midcurl03",
                    "hairbottom_midcurl03"
                ],
                [
                    "cranium_midcurl04",
                    "forehead_standard",
                    "hair_back_midcurl04",
                    "hair_front_midcurl04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_midcurl06",
                    "forehead_standard",
                    "hair_back_midcurl06",
                    "hair_front_midcurl06",
                    "hairbottom_midcurl06"
                ],
                [
                    "cranium_midcurl05",
                    "forehead_standard",
                    "hair_back_midcurl05",
                    "hair_front_midcurl05",
                    "hairbottom_midcurl05"
                ],
                [
                    "cranium_midcurl07",
                    "forehead_standard",
                    "hair_back_midcurl07",
                    "hair_front_midcurl07",
                    "hairbottom_midcurl07"
                ],
                [
                    "cranium_midcurl08",
                    "forehead_standard",
                    "hair_back_midcurl08",
                    "hair_front_midcurl08",
                    "hairbottom_midcurl08"
                ],
                [
                    "cranium_dreadsdown01",
                    "forehead_standard",
                    "hair_back_dreadsdown01",
                    "hair_front_dreadsdown01",
                    "hairbottom_dreadsdown01"
                ],
                [
                    "cranium_bigfro01",
                    "forehead_standard",
                    "hair_back_bigfro01",
                    "hair_front_bigfro01",
                    "hairbottom_blank"
                ]
            ],
            "hair_long_straight": [
                [
                    "cranium_roro",
                    "forehead_standard",
                    "hair_back_roro",
                    "hair_front_roro",
                    "hairbottom_roro"
                ],
                [
                    "cranium_longstraight02",
                    "forehead_standard",
                    "hair_back_longstraight02",
                    "hair_front_longstraight02",
                    "hairbottom_longstraight02"
                ],
                [
                    "cranium_longstraight04",
                    "forehead_standard",
                    "hair_back_longstraight04",
                    "hair_front_longstraight04",
                    "hairbottom_longstraight04"
                ],
                [
                    "cranium_longstraight05",
                    "forehead_standard",
                    "hair_back_longstraight05",
                    "hair_front_longstraight05",
                    "hairbottom_longstraight05"
                ],
                [
                    "cranium_longstraight06",
                    "forehead_standard",
                    "hair_back_longstraight06",
                    "hair_front_longstraight06",
                    "hairbottom_longstraight06"
                ],
                [
                    "cranium_longstraight07",
                    "forehead_standard",
                    "hair_back_longstraight07",
                    "hair_front_longstraight07",
                    "hairbottom_longstraight07"
                ],
                [
                    "cranium_bangspulled",
                    "forehead_standard",
                    "hair_back_bangspulled",
                    "hair_front_bangspulled",
                    "hairbottom_bangspulled"
                ],
                [
                    "cranium_longstraight03",
                    "forehead_standard",
                    "hair_back_longstraight03",
                    "hair_front_longstraight03",
                    "hairbottom_longstraight03"
                ],
                [
                    "cranium_bangs",
                    "forehead_standard",
                    "hair_back_bangs",
                    "hair_front_bangs",
                    "hairbottom_bangs"
                ],
                [
                    "cranium_ponytail01",
                    "forehead_standard",
                    "hair_back_ponytail01",
                    "hair_front_ponytail01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail03",
                    "forehead_standard",
                    "hair_back_ponytail03",
                    "hair_front_ponytail03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_hairbun",
                    "forehead_standard",
                    "hair_back_hairbun",
                    "hair_front_hairbun",
                    "hairbottom_blank"
                ]
            ],
            "hair_long_wavey": [
                [
                    "cranium_longwavy",
                    "forehead_standard",
                    "hair_back_longwavy",
                    "hair_front_longwavy",
                    "hairbottom_longwavy"
                ],
                [
                    "cranium_longwavy11",
                    "forehead_standard",
                    "hair_back_longwavy11",
                    "hair_front_longwavy11",
                    "hairbottom_longwavy11"
                ],
                [
                    "cranium_longwavy07",
                    "forehead_standard",
                    "hair_back_longwavy07",
                    "hair_front_longwavy07",
                    "hairbottom_longwavy07"
                ],
                [
                    "cranium_longwavy12",
                    "forehead_standard",
                    "hair_back_longwavy12",
                    "hair_front_longwavy12",
                    "hairbottom_longwavy12"
                ],
                [
                    "cranium_longwavy13",
                    "forehead_standard",
                    "hair_back_longwavy13",
                    "hair_front_longwavy13",
                    "hairbottom_longwavy13"
                ],
                [
                    "cranium_longwavy14",
                    "forehead_standard",
                    "hair_back_longwavy14",
                    "hair_front_longwavy14",
                    "hairbottom_longwavy14"
                ],
                [
                    "cranium_longerwavy",
                    "forehead_standard",
                    "hair_back_longerwavy",
                    "hair_front_longerwavy",
                    "hairbottom_longerwavy"
                ],
                [
                    "cranium_longpart",
                    "forehead_standard",
                    "hair_back_longpart",
                    "hair_front_longpart",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longwavy08",
                    "forehead_standard",
                    "hair_back_longwavy08",
                    "hair_front_longwavy08",
                    "hairbottom_longwavy08"
                ],
                [
                    "cranium_ponytail02",
                    "forehead_standard",
                    "hair_back_ponytail02",
                    "hair_front_ponytail02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail04",
                    "forehead_standard",
                    "hair_back_ponytail04",
                    "hair_front_ponytail04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longwavy02",
                    "forehead_standard",
                    "hair_back_longwavy02",
                    "hair_front_longwavy02",
                    "hairbottom_longwavy02"
                ]
            ],
            "hair_long_curly": [
                [
                    "cranium_longcurl02",
                    "forehead_standard",
                    "hair_back_longcurl02",
                    "hair_front_longcurl02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longcurl07",
                    "forehead_standard",
                    "hair_back_longcurl07",
                    "hair_front_longcurl07",
                    "hairbottom_longcurl07"
                ],
                [
                    "cranium_longcurl09",
                    "forehead_standard",
                    "hair_back_longcurl09",
                    "hair_front_longcurl09",
                    "hairbottom_longcurl09"
                ],
                [
                    "cranium_longcurl06",
                    "forehead_standard",
                    "hair_back_longcurl06",
                    "hair_front_longcurl06",
                    "hairbottom_blank"
                ],
                [
                    "cranium_beyonce",
                    "forehead_standard",
                    "hair_back_beyonce",
                    "hair_front_beyonce",
                    "hairbottom_beyonce"
                ],
                [
                    "cranium_longcurl08",
                    "forehead_standard",
                    "hair_back_longcurl08",
                    "hair_front_longcurl08",
                    "hairbottom_longcurl08"
                ],
                [
                    "cranium_longcurl03",
                    "forehead_standard",
                    "hair_back_longcurl03",
                    "hair_front_longcurl03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_dreadsup",
                    "forehead_standard",
                    "hair_back_dreadsup",
                    "hair_front_dreadsup",
                    "hairbottom_blank"
                ],
                [
                    "cranium_dreadspony",
                    "forehead_standard",
                    "hair_back_dreadspony",
                    "hair_front_dreadspony",
                    "hairbottom_blank"
                ],
                [
                    "cranium_dreadsdown02",
                    "forehead_standard",
                    "hair_back_dreadsdown02",
                    "hair_front_dreadsdown02",
                    "hairbottom_dreadsdown02"
                ],
                [
                    "cranium_cornrows02",
                    "forehead_standard",
                    "hair_back_cornrows02",
                    "hair_front_cornrows02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_longwavy03",
                    "forehead_standard",
                    "hair_back_longwavy03",
                    "hair_front_longwavy03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_elaine",
                    "forehead_standard",
                    "hair_back_elaine",
                    "hair_front_elaine",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail02",
                    "forehead_standard",
                    "hair_back_ponytail02",
                    "hair_front_ponytail02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ponytail04",
                    "forehead_standard",
                    "hair_back_ponytail04",
                    "hair_front_ponytail04",
                    "hairbottom_blank"
                ]
            ],
            "hair_bald": [
                [
                    "cranium_bald01",
                    "forehead_bald01",
                    "hair_back_bald01",
                    "hair_front_bald01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_buzz",
                    "forehead_buzz",
                    "hair_back_buzz",
                    "hair_front_blank",
                    "hairbottom_blank"
                ],
                [
                    "cranium_ian",
                    "forehead_standard",
                    "hair_back_ian",
                    "hair_front_ian",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortbald01",
                    "forehead_standard",
                    "hair_back_shortbald01",
                    "hair_front_shortbald01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_wavybald",
                    "forehead_standard",
                    "hair_back_wavybald",
                    "hair_front_wavybald",
                    "hairbottom_blank"
                ],
                [
                    "cranium_george",
                    "forehead_standard",
                    "hair_back_george",
                    "hair_front_george",
                    "hairbottom_blank"
                ],
                [
                    "cranium_buzzbald",
                    "forehead_standard",
                    "hair_back_buzzbald",
                    "hair_front_buzzbald",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortbald02",
                    "forehead_standard",
                    "hair_back_shortbald02",
                    "hair_front_shortbald02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_letterman",
                    "forehead_standard",
                    "hair_back_letterman",
                    "hair_front_letterman",
                    "hairbottom_blank"
                ],
                [
                    "cranium_combover01",
                    "forehead_standard",
                    "hair_back_combover01",
                    "hair_front_combover01",
                    "hairbottom_blank"
                ]
            ],
            "hair_special": [
                [
                    "cranium_frohawk",
                    "forehead_standard",
                    "hair_back_frohawk",
                    "hair_front_frohawk",
                    "hairbottom_blank"
                ],
                [
                    "cranium_mohawk01",
                    "forehead_standard",
                    "hair_back_mohawk01",
                    "hair_front_mohawk01",
                    "hairbottom_blank"
                ],
                [
                    "cranium_anime",
                    "forehead_standard",
                    "hair_back_anime",
                    "hair_front_anime",
                    "hairbottom_blank"
                ],
                [
                    "cranium_logan",
                    "forehead_standard",
                    "hair_back_logan",
                    "hair_front_logan",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bjork",
                    "forehead_standard",
                    "hair_back_bjork",
                    "hair_front_bjork",
                    "hairbottom_blank"
                ],
                [
                    "cranium_spikey",
                    "forehead_standard",
                    "hair_back_spikey",
                    "hair_front_spikey",
                    "hairbottom_blank"
                ],
                [
                    "cranium_einstein",
                    "forehead_standard",
                    "hair_back_einstein",
                    "hair_front_einstein",
                    "hairbottom_blank"
                ],
                [
                    "cranium_limphawk",
                    "forehead_standard",
                    "hair_back_limphawk",
                    "hair_front_limphawk",
                    "hairbottom_blank"
                ],
                [
                    "cranium_messhawk",
                    "forehead_messhawk",
                    "hair_back_messhawk",
                    "hair_front_messhawk",
                    "hairbottom_blank"
                ]
            ],
            "hairstyles": [
                [
                    "cranium_default",
                    "forehead_standard",
                    "hair_back_default",
                    "hair_front_default",
                    "hairbottom_blank"
                ],
                [
                    "cranium_smart02",
                    "forehead_standard",
                    "hair_back_smart02",
                    "hair_front_smart02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_fauxhawk",
                    "forehead_standard",
                    "hair_back_fauxhawk",
                    "hair_front_fauxhawk",
                    "hairbottom_blank"
                ],
                [
                    "cranium_casey",
                    "forehead_standard",
                    "hair_back_casey",
                    "hair_front_casey",
                    "hairbottom_blank"
                ],
                [
                    "cranium_sideswipe",
                    "forehead_standard",
                    "hair_back_sideswipe",
                    "hair_front_sideswipe",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight02",
                    "forehead_standard",
                    "hair_back_shortstraight02",
                    "hair_front_shortstraight02",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight03",
                    "forehead_standard",
                    "hair_back_shortstraight03",
                    "hair_front_shortstraight03",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight04",
                    "forehead_standard",
                    "hair_back_shortstraight04",
                    "hair_front_shortstraight04",
                    "hairbottom_blank"
                ],
                [
                    "cranium_shortstraight05",
                    "forehead_standard",
                    "hair_back_shortstraight05",
                    "hair_front_shortstraight05",
                    "hairbottom_blank"
                ]
            ],
            "brow": [
                [
                    "brow_n4"
                ],
                [
                    "brow_n2"
                ],
                [
                    "brow_n3"
                ],
                [
                    "brow_n1"
                ],
                [
                    "brow_n5"
                ],
                [
                    "brow_n6"
                ],
                [
                    "brow_n7"
                ],
                [
                    "brow_n8"
                ],
                [
                    "brow_n9"
                ],
                [
                    "brow_n10"
                ],
                [
                    "brow_n11"
                ],
                [
                    "brow_n12"
                ],
                [
                    "brow_n13"
                ],
                [
                    "brow_n14"
                ],
                [
                    "brow_n15"
                ],
                [
                    "brow_n17"
                ],
                [
                    "brow_n16"
                ],
                [
                    "brow_n18"
                ],
                [
                    "brow_n19"
                ],
                [
                    "brow_n20"
                ],
                [
                    "brow_n21"
                ],
                [
                    "brow_n22"
                ],
                [
                    "brow_n23"
                ],
                [
                    "brow_n24"
                ],
                [
                    "brow_n25"
                ],
                [
                    "brow_n26"
                ],
                [
                    "brow_n27"
                ],
                [
                    "brow_n28"
                ],
                [
                    "brow_n29"
                ],
                [
                    "brow_n30"
                ],
                [
                    "brow_n31"
                ],
                [
                    "brow_n32"
                ],
                [
                    "brow_n33"
                ],
                [
                    null
                ]
            ],
            "detail_L": [
                [
                    "detail_L_n11"
                ],
                [
                    "detail_L_n10"
                ],
                [
                    "detail_L_n9"
                ],
                [
                    "detail_L_n8"
                ],
                [
                    "detail_L_n7"
                ],
                [
                    "detail_L_n1"
                ],
                [
                    "detail_L_n2"
                ],
                [
                    "detail_L_n3"
                ],
                [
                    "detail_L_n4"
                ],
                [
                    "detail_L_n5"
                ],
                [
                    "detail_L_n6"
                ]
            ],
            "eye": [
                [
                    "eye_n1"
                ],
                [
                    "eye_n8"
                ],
                [
                    "eye_n9"
                ],
                [
                    "eye_n10"
                ],
                [
                    "eye_n16"
                ],
                [
                    "eye_n3"
                ],
                [
                    "eye_n2"
                ],
                [
                    "eye_n11"
                ],
                [
                    "eye_n7"
                ],
                [
                    "eye_n12"
                ],
                [
                    "eye_n18"
                ],
                [
                    "eye_n5"
                ],
                [
                    "eye_n6"
                ],
                [
                    "eye_n13"
                ],
                [
                    "eye_n14"
                ],
                [
                    "eye_n15"
                ],
                [
                    "eye_n17"
                ],
                [
                    "eye_n4"
                ]
            ],
            "hat": [
                [
                    "hat_blank"
                ],
                [
                    "hat_cap2"
                ],
                [
                    "hat_cap"
                ],
                [
                    "hat_knit1"
                ],
                [
                    "hat_knit2"
                ],
                [
                    "hat_floppy"
                ],
                [
                    "hat_golfback"
                ],
                [
                    "hat_art9"
                ],
                [
                    "hat_clochet"
                ],
                [
                    "hat_army"
                ],
                [
                    "hat_headwrap"
                ],
                [
                    "hat_hijab2"
                ],
                [
                    "hat_hairwrap"
                ],
                [
                    "hat_rasta"
                ],
                [
                    "hat_fargo"
                ],
                [
                    "hat_toque1"
                ],
                [
                    "hat_toque2"
                ],
                [
                    "hat_toque3"
                ],
                [
                    "hat_towel"
                ],
                [
                    "hat_sweatband"
                ],
                [
                    "hat_art1"
                ],
                [
                    "hat_snapback"
                ],
                [
                    "hat_backwards"
                ],
                [
                    "hat_visor"
                ],
                [
                    "hat_biker"
                ],
                [
                    "hat_poorboy"
                ],
                [
                    "hat_fedora2"
                ],
                [
                    "hat_straw"
                ],
                [
                    "hat_art5"
                ],
                [
                    "hat_art8"
                ],
                [
                    "hat_boater"
                ],
                [
                    "hat_artsylvain"
                ],
                [
                    "hat_art4"
                ],
                [
                    "hat_art10"
                ],
                [
                    "hat_yarmulke"
                ],
                [
                    "hat_kufi"
                ],
                [
                    "hat_turban2"
                ],
                [
                    "hat_turban3"
                ],
                [
                    "hat_art2"
                ],
                [
                    "hat_art7"
                ],
                [
                    "hat_art6"
                ],
                [
                    "hat_art11"
                ],
                [
                    "hat_helmet1"
                ],
                [
                    "hat_art12"
                ],
                [
                    "hat_crown1"
                ],
                [
                    "hat_crown2"
                ],
                [
                    "hat_chef"
                ],
                [
                    "hat_art3"
                ],
                [
                    "hat_visor2"
                ],
                [
                    "hat_art15"
                ],
                [
                    "hat_cop2"
                ],
                [
                    "hat_art13"
                ],
                [
                    "hat_pirate2"
                ],
                [
                    "hat_catinthehat"
                ],
                [
                    "hat_art14"
                ],
                [
                    "hat_art16"
                ],
                [
                    "hat_arrowed"
                ],
                [
                    "hat_bunny"
                ],
                [
                    "hat_clown"
                ],
                [
                    "hat_dillybopper"
                ],
                [
                    "hat_fez"
                ],
                [
                    "hat_madhatter"
                ],
                [
                    "hat_viking"
                ],
                [
                    "hat_egyptian"
                ],
                [
                    "hat_knight"
                ],
                [
                    "hat_pilgrim"
                ],
                [
                    "hat_robinhood"
                ],
                [
                    "hat_native"
                ],
                [
                    "hat_spacehelmet"
                ],
                [
                    "hat_sleep"
                ],
                [
                    "hat_elf"
                ],
                [
                    "hat_santa"
                ],
                [
                    "hat_halo"
                ],
                [
                    "hat_devil"
                ],
                [
                    "hat_reindeer"
                ],
                [
                    "hat_wizard"
                ],
                [
                    "hat_leprechaun"
                ],
                [
                    "hat_church"
                ],
                [
                    "hat_headphones"
                ],
                [
                    "hat_headset"
                ],
                [
                    "hat_lampshade"
                ],
                [
                    "hat_spartan"
                ],
                [
                    "hat_samurai"
                ],
                [
                    "hat_safari2"
                ],
                [
                    "hat_safari"
                ],
                [
                    "hat_pope"
                ],
                [
                    "hat_motorcycle"
                ],
                [
                    "hat_bike"
                ],
                [
                    "hat_dunce"
                ],
                [
                    "hat_foxy"
                ],
                [
                    "hat_football"
                ],
                [
                    "hat_grad"
                ],
                [
                    "hat_hobo"
                ],
                [
                    "hat_hockey"
                ],
                [
                    "hat_jockey"
                ],
                [
                    "hat_hockey2"
                ],
                [
                    "hat_bonnet"
                ],
                [
                    "hat_fruit"
                ],
                [
                    "hat_judge"
                ],
                [
                    "hat_fireman"
                ],
                [
                    "hat_napoleon"
                ],
                [
                    "hat_baseball"
                ],
                [
                    "hat_boxing"
                ],
                [
                    "hat_nuclear"
                ],
                [
                    "hat_mindcontrol"
                ]
            ],
            "acchair": [
                [
                    "hat_blank"
                ],
                [
                    "hat_flower01"
                ],
                [
                    "hat_hairclip01"
                ],
                [
                    "hat_hairclip02"
                ],
                [
                    "hat_hairclip03"
                ],
                [
                    "hat_bow"
                ],
                [
                    "hat_headband"
                ],
                [
                    "hat_string"
                ],
                [
                    "hat_headband2"
                ],
                [
                    "hat_headphones"
                ],
                [
                    "hat_earmuff"
                ],
                [
                    "hat_sweatband"
                ]
            ],
            "jaw": [
                [
                    "jaw_n21"
                ],
                [
                    "jaw_n13"
                ],
                [
                    "jaw_n18"
                ],
                [
                    "jaw_n14"
                ],
                [
                    "jaw_n15"
                ],
                [
                    "jaw_n19"
                ],
                [
                    "jaw_n12"
                ],
                [
                    "jaw_n20"
                ],
                [
                    "jaw_n17"
                ]
            ],
            "mouth": [
                [
                    "mouth_n1",
                    "tongue_n1_3"
                ],
                [
                    "mouth_n2",
                    "tongue_n1_3"
                ],
                [
                    "mouth_n6",
                    "tongue_n1_5"
                ],
                [
                    "mouth_n5",
                    "tongue_n1_5"
                ],
                [
                    "mouth_n3",
                    "tongue_n1_3"
                ],
                [
                    "mouth_n7",
                    "tongue_n1_5"
                ],
                [
                    "mouth_n9",
                    "tongue_n1_3"
                ],
                [
                    "mouth_n4",
                    "tongue_n1_3"
                ],
                [
                    "mouth_n8",
                    "tongue_n1_5"
                ]
            ],
            "nose": [
                [
                    "nose_n10"
                ],
                [
                    "nose_n11"
                ],
                [
                    "nose_n12"
                ],
                [
                    "nose_n13"
                ],
                [
                    "nose_n14"
                ],
                [
                    "nose_n15"
                ],
                [
                    "nose_n16"
                ],
                [
                    "nose_n17"
                ],
                [
                    "nose_n18"
                ],
                [
                    "nose_n1"
                ],
                [
                    "nose_n2"
                ],
                [
                    "nose_n3"
                ],
                [
                    "nose_n4"
                ],
                [
                    "nose_n5"
                ],
                [
                    "nose_n6"
                ],
                [
                    "nose_n7"
                ],
                [
                    "nose_n8"
                ],
                [
                    "nose_n9"
                ]
            ],
            "linecombos": [
                [
                    "detail_E_blank",
                    "detail_L_blank",
                    "detail_T_blank"
                ],
                [
                    "detail_E_n7",
                    "detail_L_blank",
                    "detail_T_blank"
                ],
                [
                    "detail_E_blank",
                    "detail_L_n10",
                    "detail_T_blank"
                ],
                [
                    "detail_E_blank",
                    "detail_L_n8",
                    "detail_T_blank"
                ],
                [
                    "detail_E_blank",
                    "detail_L_n9",
                    "detail_T_blank"
                ],
                [
                    "detail_E_blank",
                    "detail_L_n7",
                    "detail_T_blank"
                ],
                [
                    "detail_E_blank",
                    "detail_L_n11",
                    "detail_T_blank"
                ],
                [
                    "detail_E_n2",
                    "detail_L_blank",
                    "detail_T_blank"
                ],
                [
                    "detail_E_n4",
                    "detail_L_n6",
                    "detail_T_n8"
                ]
            ],
            "outfits": {
                "0": 618490,
                "1": 600552,
                "2": 600577,
                "3": 600561,
                "4": 600599,
                "5": 612945,
                "6": 601178,
                "7": 612933,
                "8": 600433,
                "9": 600434,
                "10": 612871,
                "11": 605406,
                "12": 605956,
                "13": 612943,
                "14": 612941,
                "15": 600586,
                "16": 76677,
                "17": 249680,
                "18": 246464,
                "19": 133394,
                "20": 23803,
                "21": 23784,
                "22": 168202,
                "23": 133396,
                "24": 76678,
                "25": 133244,
                "26": 133393,
                "27": 168052,
                "28": 168559,
                "29": 168561,
                "30": 253451,
                "31": 168533,
                "32": 245522,
                "33": 172492,
                "34": 172491,
                "35": 172493,
                "36": 76395,
                "37": 168528,
                "38": 168526,
                "39": 168504,
                "40": 172488,
                "41": 172489,
                "42": 51401,
                "43": 168494,
                "44": 23780,
                "45": 23797,
                "46": 168491,
                "47": 168490,
                "48": 51435,
                "49": 168493,
                "50": 168260,
                "51": 23782,
                "52": 168246,
                "53": 168248,
                "54": 168244,
                "55": 133247,
                "56": 76435,
                "57": 168250,
                "58": 168242,
                "59": 172395,
                "60": 168488,
                "61": 253447,
                "62": 245548,
                "63": 253464,
                "65": 253455,
                "66": 133252,
                "68": 194671,
                "69": 56,
                "70": 54,
                "71": 172441,
                "72": 51607,
                "73": 168232,
                "74": 51427,
                "75": 172443,
                "76": 172462,
                "77": 172411,
                "78": 58,
                "79": 172412,
                "80": 51433,
                "81": 168228,
                "82": 168211,
                "83": 168227,
                "84": 137926,
                "85": 168230,
                "86": 168060,
                "87": 76461,
                "88": 63,
                "89": 194639,
                "90": 168062,
                "91": 38,
                "92": 51422
            }
        }
    },
    "2": {
        "1": {
            "cheek": [
                [
                    null
                ],
                [
                    "cheek_art1"
                ],
                [
                    "cheek_art2"
                ],
                [
                    "cheek_art3"
                ],
                [
                    "cheek_art4"
                ],
                [
                    "cheek_art5"
                ]
            ],
            "chin": [
                [
                    null
                ],
                [
                    "chin_art1"
                ],
                [
                    "chin_art2"
                ],
                [
                    "chin_art3"
                ],
                [
                    "chin_art4"
                ],
                [
                    "chin_art5"
                ],
                [
                    "chin_art6"
                ],
                [
                    "chin_art7"
                ],
                [
                    "chin_art8"
                ],
                [
                    "chin_art9"
                ]
            ],
            "cranium": [
                [
                    "cranium_art1"
                ],
                [
                    "cranium_art4"
                ],
                [
                    "cranium_art3"
                ],
                [
                    "cranium_art6"
                ],
                [
                    "cranium_art2"
                ],
                [
                    "cranium_art7"
                ],
                [
                    "cranium_art10"
                ],
                [
                    "cranium_art5"
                ],
                [
                    "cranium_art9"
                ],
                [
                    "cranium_art8"
                ]
            ],
            "moustache": [
                [
                    null
                ],
                [
                    "moustache_art1"
                ],
                [
                    "moustache_art2"
                ],
                [
                    "moustache_art3"
                ],
                [
                    "moustache_art4"
                ],
                [
                    "moustache_art5"
                ],
                [
                    "moustache_art6"
                ],
                [
                    "moustache_art7"
                ],
                [
                    "moustache_art8"
                ],
                [
                    "moustache_art9"
                ],
                [
                    "moustache_art10"
                ],
                [
                    "moustache_art11"
                ]
            ]
        },
        "2": {
            "chin": [
                [
                    "chin_art1"
                ],
                [
                    "chin_art2"
                ],
                [
                    "chin_art3"
                ],
                [
                    "chin_art4"
                ],
                [
                    "chin_art5"
                ],
                [
                    "chin_art6"
                ],
                [
                    "chin_art7"
                ],
                [
                    "chin_art8"
                ],
                [
                    "chin_art9"
                ]
            ]
        }
    },
    "3": {
        "1": [

        ],
        "2": [

        ]
    },
    "4": {
        "1": {
            "hairstyles": [
                [
                    "cranium_bm1",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm1",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm7",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm7",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm13",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm13",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm23",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm23",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm25",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm25",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm27",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm27",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm19",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm19",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm35",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm35",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm29",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm29",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm3",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm3",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm9",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm9",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm15",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm15",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm5",
                    "forehead_bm1",
                    "hair_back_bm5",
                    "hair_front_bm5",
                    "hairbottom_bm5"
                ],
                [
                    "cranium_bm11",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm11",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm17",
                    "forehead_bm1",
                    "hair_back_bm17",
                    "hair_front_bm17",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm37",
                    "forehead_bm1",
                    "hair_back_bm37",
                    "hair_front_bm37",
                    "hairbottom_bm37"
                ],
                [
                    "cranium_bm39",
                    "forehead_bm1",
                    "hair_back_bm39",
                    "hair_front_bm39",
                    "hairbottom_bm39"
                ],
                [
                    "cranium_bm41",
                    "forehead_bm1",
                    "hair_back_bm41",
                    "hair_front_bm41",
                    "hairbottom_bm41"
                ],
                [
                    "cranium_bm33",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_blank",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm31",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm31",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm21",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm21",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm45",
                    "forehead_bm3",
                    "hair_back_blank",
                    "hair_front_bm45",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm43",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm43",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm47",
                    "forehead_bm1",
                    "hair_back_bm47",
                    "hair_front_bm47",
                    "hairbottom_bm47"
                ],
                [
                    "cranium_bm2",
                    "forehead_bm2",
                    "hair_back_blank",
                    "hair_front_bm2",
                    "hairbottom_bm2"
                ],
                [
                    "cranium_bm8",
                    "forehead_bm2",
                    "hair_back_blank",
                    "hair_front_bm8",
                    "hairbottom_bm8"
                ],
                [
                    "cranium_bm14",
                    "forehead_bm2",
                    "hair_back_blank",
                    "hair_front_bm14",
                    "hairbottom_bm14"
                ],
                [
                    "cranium_bm4",
                    "forehead_bm2",
                    "hair_back_bm4",
                    "hair_front_bm4",
                    "hairbottom_bm4"
                ],
                [
                    "cranium_bm10",
                    "forehead_bm2",
                    "hair_back_bm10",
                    "hair_front_bm10",
                    "hairbottom_bm10"
                ],
                [
                    "cranium_bm16",
                    "forehead_bm2",
                    "hair_back_bm16",
                    "hair_front_bm16",
                    "hairbottom_bm16"
                ],
                [
                    "cranium_bm46",
                    "forehead_bm2",
                    "hair_back_bm46",
                    "hair_front_bm46",
                    "hairbottom_bm46"
                ],
                [
                    "cranium_bm38",
                    "forehead_bm2",
                    "hair_back_bm38",
                    "hair_front_bm38",
                    "hairbottom_bm38"
                ],
                [
                    "cranium_bm18",
                    "forehead_bm2",
                    "hair_back_bm18",
                    "hair_front_bm18",
                    "hairbottom_bm18"
                ],
                [
                    "cranium_bm42",
                    "forehead_bm2",
                    "hair_back_bm42",
                    "hair_front_bm42",
                    "hairbottom_bm42"
                ],
                [
                    "cranium_bm6",
                    "forehead_bm2",
                    "hair_back_bm6",
                    "hair_front_bm6",
                    "hairbottom_bm6"
                ],
                [
                    "cranium_bm12",
                    "forehead_bm2",
                    "hair_back_bm12",
                    "hair_front_bm12",
                    "hairbottom_bm12"
                ],
                [
                    "cranium_bm30",
                    "forehead_bm2",
                    "hair_back_bm30",
                    "hair_front_bm30",
                    "hairbottom_bm30"
                ],
                [
                    "cranium_bm20",
                    "forehead_bm2",
                    "hair_back_bm20",
                    "hair_front_bm20",
                    "hairbottom_bm20"
                ],
                [
                    "cranium_bm32",
                    "forehead_bm2",
                    "hair_back_bm32",
                    "hair_front_bm32",
                    "hairbottom_bm32"
                ],
                [
                    "cranium_bm40",
                    "forehead_bm2",
                    "hair_back_bm40",
                    "hair_front_bm40",
                    "hairbottom_bm40"
                ],
                [
                    "cranium_bm28",
                    "forehead_bm2",
                    "hair_back_bm28",
                    "hair_front_bm28",
                    "hairbottom_bm28"
                ],
                [
                    "cranium_bm48",
                    "forehead_bm2",
                    "hair_back_bm48",
                    "hair_front_bm48",
                    "hairbottom_bm48"
                ],
                [
                    "cranium_bm22",
                    "forehead_bm2",
                    "hair_back_bm22",
                    "hair_front_bm22",
                    "hairbottom_bm22"
                ],
                [
                    "cranium_bm36",
                    "forehead_bm2",
                    "hair_back_bm36",
                    "hair_front_bm36",
                    "hairbottom_bm36"
                ],
                [
                    "cranium_bm26",
                    "forehead_bm2",
                    "hair_back_bm26",
                    "hair_front_bm26",
                    "hairbottom_bm26"
                ],
                [
                    "cranium_bm34",
                    "forehead_bm2",
                    "hair_back_bm34",
                    "hair_front_bm34",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm24",
                    "forehead_bm2",
                    "hair_back_bm24",
                    "hair_front_bm24",
                    "hairbottom_bm24"
                ],
                [
                    "cranium_bm44",
                    "forehead_bm2",
                    "hair_back_bm44",
                    "hair_front_bm44",
                    "hairbottom_bm44"
                ]
            ],
            "beard": [
                [
                    "beard_blank",
                    "stachin_blank",
                    "stachout_blank"
                ],
                [
                    "beard_bm4_1",
                    "stachin_blank",
                    "stachout_bm4_1"
                ],
                [
                    "beard_bm1_1",
                    "stachin_bm1_1",
                    "stachout_bm1_1"
                ],
                [
                    "beard_bm3_1",
                    "stachin_blank",
                    "stachout_bm5_1"
                ],
                [
                    "beard_bm3_1",
                    "stachin_bm1_1",
                    "stachout_bm1_1"
                ],
                [
                    "beard_bm2_1",
                    "stachin_bm1_1",
                    "stachout_bm1_1"
                ],
                [
                    "beard_bm3_1",
                    "stachin_blank",
                    "stachout_bm6_1"
                ],
                [
                    "beard_bm3_1",
                    "stachin_blank",
                    "stachout_bm7_1"
                ],
                [
                    "beard_bm4_1",
                    "stachin_bm1_1",
                    "stachout_bm1_1"
                ],
                [
                    "beard_bm4_1",
                    "stachin_blank",
                    "stachout_bm5b_1"
                ],
                [
                    "beard_bm4_1",
                    "stachin_blank",
                    "stachout_bm6b_1"
                ],
                [
                    "beard_bm4_1",
                    "stachin_blank",
                    "stachout_bm7b_1"
                ]
            ],
            "brow": [
                [
                    "brow_bm1"
                ],
                [
                    "brow_bm3"
                ],
                [
                    "brow_bm5"
                ],
                [
                    "brow_bm7"
                ]
            ],
            "detail_E": [
                [
                    "detail_E_blank"
                ],
                [
                    "detail_E_bm1"
                ],
                [
                    "detail_E_bm2"
                ],
                [
                    "detail_E_bm3"
                ],
                [
                    "detail_E_bm4"
                ],
                [
                    "detail_E_bm5"
                ],
                [
                    "detail_E_bm6"
                ],
                [
                    "detail_E_bm7"
                ]
            ],
            "detail_L": [
                [
                    "detail_L_blank"
                ],
                [
                    "detail_L_bm1"
                ],
                [
                    "detail_L_bm7"
                ],
                [
                    "detail_L_bm8"
                ],
                [
                    "detail_L_bm9"
                ],
                [
                    "detail_L_bm10"
                ],
                [
                    "detail_L_bm11"
                ]
            ],
            "detail_T": [
                [
                    "detail_T_blank"
                ],
                [
                    "detail_T_bm1"
                ],
                [
                    "detail_T_bm2"
                ],
                [
                    "detail_T_bm3"
                ],
                [
                    "detail_T_bm4"
                ],
                [
                    "detail_T_bm5"
                ],
                [
                    "detail_T_bm6"
                ],
                [
                    "detail_T_bm7"
                ],
                [
                    "detail_T_bm8"
                ],
                [
                    "detail_T_bm9"
                ],
                [
                    "detail_T_bm10"
                ],
                [
                    "detail_T_bm11"
                ],
                [
                    "detail_T_bm12"
                ],
                [
                    "detail_T_bm13"
                ],
                [
                    "detail_T_bm14"
                ]
            ],
            "ear": [
                [
                    "ear_bm1"
                ]
            ],
            "eye": [
                [
                    "eye_bm1"
                ]
            ],
            "glasses": [
                [
                    "glasses_blank"
                ],
                [
                    "glasses_bm1"
                ],
                [
                    "glasses_bm1d"
                ],
                [
                    "glasses_bm2"
                ],
                [
                    "glasses_bm2d"
                ],
                [
                    "glasses_bm3"
                ],
                [
                    "glasses_bm3d"
                ],
                [
                    "glasses_bm4"
                ],
                [
                    "glasses_bm4d"
                ],
                [
                    "glasses_bm5"
                ],
                [
                    "glasses_bm5d"
                ],
                [
                    "glasses_bm6"
                ],
                [
                    "glasses_bm6d"
                ],
                [
                    "glasses_bm7"
                ],
                [
                    "glasses_bm7d"
                ],
                [
                    "glasses_bm8"
                ],
                [
                    "glasses_bm8d"
                ],
                [
                    "glasses_bm9"
                ],
                [
                    "glasses_bm9d"
                ],
                [
                    "glasses_bm10"
                ],
                [
                    "glasses_bm10d"
                ],
                [
                    "glasses_bm11"
                ],
                [
                    "glasses_bm12"
                ],
                [
                    "glasses_bm13"
                ],
                [
                    "glasses_bm13d"
                ],
                [
                    "glasses_bm14"
                ],
                [
                    "glasses_bm15"
                ],
                [
                    "glasses_bm15d"
                ],
                [
                    "glasses_bm16"
                ],
                [
                    "glasses_bm16d"
                ],
                [
                    "glasses_bm17"
                ],
                [
                    "glasses_bm17d"
                ],
                [
                    "glasses_bm18"
                ],
                [
                    "glasses_bm19"
                ],
                [
                    "glasses_bm19d"
                ],
                [
                    "glasses_bm20"
                ],
                [
                    "glasses_bm21"
                ],
                [
                    "glasses_bm22"
                ],
                [
                    "glasses_bm23"
                ],
                [
                    "glasses_bm24"
                ]
            ],
            "hat": [
                [
                    "hat_blank"
                ],
                [
                    "hat_bmkufi"
                ],
                [
                    "hat_bmturban"
                ],
                [
                    "hat_bmyamulke"
                ],
                [
                    "hat_bmsanta"
                ],
                [
                    "hat_bmart1"
                ]
            ],
            "jaw": [
                [
                    "jaw_bm1"
                ]
            ],
            "mouth": [
                [
                    "mouth_bm1",
                    "tongue_bm1_1"
                ],
                [
                    "mouth_bm3",
                    "tongue_bm1_1"
                ],
                [
                    "mouth_bm5",
                    "tongue_bm1_1"
                ]
            ],
            "nose": [
                [
                    "nose_bm1"
                ],
                [
                    "nose_bm3"
                ],
                [
                    "nose_bm5"
                ],
                [
                    "nose_bm7"
                ],
                [
                    "nose_bm9"
                ],
                [
                    "nose_bm11"
                ],
                [
                    "nose_bm13"
                ],
                [
                    "nose_bm15"
                ],
                [
                    "nose_bm17"
                ]
            ],
            "pupil": [
                [
                    "pupil_bm1"
                ]
            ],
            "linecombos": [
                [
                    "detail_E_blank",
                    "detail_L_blank",
                    "detail_T_blank"
                ]
            ],
            "outfits": {
                "0": 615640,
                "1": 612948,
                "2": 615642,
                "3": 605877,
                "4": 605872,
                "5": 612961,
                "6": 600413,
                "7": 600561,
                "8": 601154,
                "9": 612955,
                "10": 612958,
                "11": 245805,
                "12": 600402,
                "13": 600400,
                "14": 387933,
                "15": 600353,
                "16": 76440,
                "17": 168255,
                "18": 385145,
                "19": 168257,
                "20": 61,
                "21": 168533,
                "22": 51434,
                "23": 168536,
                "24": 51610,
                "25": 51432,
                "26": 168167,
                "27": 168153,
                "28": 168180,
                "29": 387920,
                "30": 168493,
                "31": 258255,
                "32": 168490,
                "33": 51435,
                "34": 172492,
                "35": 168496,
                "36": 23797,
                "37": 172489,
                "38": 168494,
                "39": 168491,
                "40": 168504,
                "41": 23780,
                "42": 172488,
                "43": 172493,
                "44": 172491,
                "46": 168243,
                "47": 172395,
                "48": 387930,
                "49": 76435,
                "50": 245956,
                "51": 59,
                "52": 168242,
                "54": 387931,
                "56": 385141,
                "57": 387940,
                "59": 387943,
                "61": 246303,
                "63": 168061,
                "64": 194646,
                "65": 194639,
                "66": 194644
            }
        },
        "2": {
            "hairstyles": [
                [
                    "cranium_bm2",
                    "forehead_bm2",
                    "hair_back_blank",
                    "hair_front_bm2",
                    "hairbottom_bm2"
                ],
                [
                    "cranium_bm8",
                    "forehead_bm2",
                    "hair_back_blank",
                    "hair_front_bm8",
                    "hairbottom_bm8"
                ],
                [
                    "cranium_bm14",
                    "forehead_bm2",
                    "hair_back_blank",
                    "hair_front_bm14",
                    "hairbottom_bm14"
                ],
                [
                    "cranium_bm4",
                    "forehead_bm2",
                    "hair_back_bm4",
                    "hair_front_bm4",
                    "hairbottom_bm4"
                ],
                [
                    "cranium_bm10",
                    "forehead_bm2",
                    "hair_back_bm10",
                    "hair_front_bm10",
                    "hairbottom_bm10"
                ],
                [
                    "cranium_bm16",
                    "forehead_bm2",
                    "hair_back_bm16",
                    "hair_front_bm16",
                    "hairbottom_bm16"
                ],
                [
                    "cranium_bm46",
                    "forehead_bm2",
                    "hair_back_bm46",
                    "hair_front_bm46",
                    "hairbottom_bm46"
                ],
                [
                    "cranium_bm38",
                    "forehead_bm2",
                    "hair_back_bm38",
                    "hair_front_bm38",
                    "hairbottom_bm38"
                ],
                [
                    "cranium_bm18",
                    "forehead_bm2",
                    "hair_back_bm18",
                    "hair_front_bm18",
                    "hairbottom_bm18"
                ],
                [
                    "cranium_bm42",
                    "forehead_bm2",
                    "hair_back_bm42",
                    "hair_front_bm42",
                    "hairbottom_bm42"
                ],
                [
                    "cranium_bm6",
                    "forehead_bm2",
                    "hair_back_bm6",
                    "hair_front_bm6",
                    "hairbottom_bm6"
                ],
                [
                    "cranium_bm12",
                    "forehead_bm2",
                    "hair_back_bm12",
                    "hair_front_bm12",
                    "hairbottom_bm12"
                ],
                [
                    "cranium_bm30",
                    "forehead_bm2",
                    "hair_back_bm30",
                    "hair_front_bm30",
                    "hairbottom_bm30"
                ],
                [
                    "cranium_bm20",
                    "forehead_bm2",
                    "hair_back_bm20",
                    "hair_front_bm20",
                    "hairbottom_bm20"
                ],
                [
                    "cranium_bm32",
                    "forehead_bm2",
                    "hair_back_bm32",
                    "hair_front_bm32",
                    "hairbottom_bm32"
                ],
                [
                    "cranium_bm40",
                    "forehead_bm2",
                    "hair_back_bm40",
                    "hair_front_bm40",
                    "hairbottom_bm40"
                ],
                [
                    "cranium_bm28",
                    "forehead_bm2",
                    "hair_back_bm28",
                    "hair_front_bm28",
                    "hairbottom_bm28"
                ],
                [
                    "cranium_bm48",
                    "forehead_bm2",
                    "hair_back_bm48",
                    "hair_front_bm48",
                    "hairbottom_bm48"
                ],
                [
                    "cranium_bm22",
                    "forehead_bm2",
                    "hair_back_bm22",
                    "hair_front_bm22",
                    "hairbottom_bm22"
                ],
                [
                    "cranium_bm36",
                    "forehead_bm2",
                    "hair_back_bm36",
                    "hair_front_bm36",
                    "hairbottom_bm36"
                ],
                [
                    "cranium_bm26",
                    "forehead_bm2",
                    "hair_back_bm26",
                    "hair_front_bm26",
                    "hairbottom_bm26"
                ],
                [
                    "cranium_bm34",
                    "forehead_bm2",
                    "hair_back_bm34",
                    "hair_front_bm34",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm24",
                    "forehead_bm2",
                    "hair_back_bm24",
                    "hair_front_bm24",
                    "hairbottom_bm24"
                ],
                [
                    "cranium_bm44",
                    "forehead_bm2",
                    "hair_back_bm44",
                    "hair_front_bm44",
                    "hairbottom_bm44"
                ],
                [
                    "cranium_bm1",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm1",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm7",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm7",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm13",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm13",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm23",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm23",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm25",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm25",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm27",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm27",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm19",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm19",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm35",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm35",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm29",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm29",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm3",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm3",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm9",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm9",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm15",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm15",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm5",
                    "forehead_bm1",
                    "hair_back_bm5",
                    "hair_front_bm5",
                    "hairbottom_bm5"
                ],
                [
                    "cranium_bm11",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm11",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm17",
                    "forehead_bm1",
                    "hair_back_bm17",
                    "hair_front_bm17",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm37",
                    "forehead_bm1",
                    "hair_back_bm37",
                    "hair_front_bm37",
                    "hairbottom_bm37"
                ],
                [
                    "cranium_bm39",
                    "forehead_bm1",
                    "hair_back_bm39",
                    "hair_front_bm39",
                    "hairbottom_bm39"
                ],
                [
                    "cranium_bm41",
                    "forehead_bm1",
                    "hair_back_bm41",
                    "hair_front_bm41",
                    "hairbottom_bm41"
                ],
                [
                    "cranium_bm33",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_blank",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm31",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm31",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm21",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm21",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm45",
                    "forehead_bm3",
                    "hair_back_blank",
                    "hair_front_bm45",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm43",
                    "forehead_bm1",
                    "hair_back_blank",
                    "hair_front_bm43",
                    "hairbottom_blank"
                ],
                [
                    "cranium_bm47",
                    "forehead_bm1",
                    "hair_back_bm47",
                    "hair_front_bm47",
                    "hairbottom_bm47"
                ]
            ],
            "brow": [
                [
                    "brow_bm2"
                ],
                [
                    "brow_bm4"
                ],
                [
                    "brow_bm6"
                ],
                [
                    "brow_bm12"
                ],
                [
                    "brow_bm14"
                ]
            ],
            "detail_L": [
                [
                    "detail_L_blank"
                ],
                [
                    "detail_L_bm1"
                ],
                [
                    "detail_L_bm7"
                ],
                [
                    "detail_L_bm8"
                ],
                [
                    "detail_L_bm9"
                ],
                [
                    "detail_L_bm10"
                ],
                [
                    "detail_L_bm11"
                ]
            ],
            "ear": [
                [
                    "ear_bm2"
                ]
            ],
            "eye": [
                [
                    "eye_bm2"
                ]
            ],
            "eyelash": [
                [
                    "eyelash_bm1_2"
                ]
            ],
            "hat": [
                [
                    "hat_blank"
                ],
                [
                    "hat_bmhijab"
                ],
                [
                    "hat_bmsanta"
                ]
            ],
            "jaw": [
                [
                    "jaw_bm2"
                ]
            ],
            "mouth": [
                [
                    "mouth_bm2",
                    "tongue_bm1_2"
                ],
                [
                    "mouth_bm4",
                    "tongue_bm1_2"
                ],
                [
                    "mouth_bm6",
                    "tongue_bm1_2"
                ]
            ],
            "nose": [
                [
                    "nose_bm2"
                ],
                [
                    "nose_bm4"
                ],
                [
                    "nose_bm6"
                ],
                [
                    "nose_bm8"
                ],
                [
                    "nose_bm10"
                ],
                [
                    "nose_bm12"
                ],
                [
                    "nose_bm14"
                ],
                [
                    "nose_bm20"
                ],
                [
                    "nose_bm18"
                ]
            ],
            "pupil": [
                [
                    "pupil_bm1"
                ]
            ],
            "linecombos": [
                [
                    "detail_E_blank",
                    "detail_L_blank",
                    "detail_T_blank"
                ]
            ],
            "outfits": {
                "0": 618490,
                "1": 600552,
                "2": 600577,
                "3": 600561,
                "4": 600599,
                "5": 612945,
                "6": 601178,
                "7": 612933,
                "8": 600433,
                "9": 600434,
                "10": 612871,
                "11": 605406,
                "12": 605956,
                "13": 612943,
                "14": 612941,
                "15": 600586,
                "16": 76677,
                "17": 249680,
                "18": 246464,
                "19": 133394,
                "20": 23803,
                "21": 23784,
                "22": 168202,
                "23": 133396,
                "24": 76678,
                "25": 133244,
                "26": 133393,
                "27": 168052,
                "28": 168559,
                "29": 168561,
                "30": 253451,
                "31": 168533,
                "32": 245522,
                "33": 172492,
                "34": 172491,
                "35": 172493,
                "36": 168504,
                "37": 172488,
                "38": 172489,
                "39": 51401,
                "40": 168494,
                "41": 23780,
                "42": 23797,
                "43": 168491,
                "44": 168490,
                "45": 51435,
                "46": 168493,
                "47": 168260,
                "48": 23782,
                "49": 168246,
                "50": 168248,
                "51": 168244,
                "52": 133247,
                "53": 76435,
                "54": 168250,
                "55": 168242,
                "56": 172395,
                "57": 168488,
                "58": 253447,
                "59": 245548,
                "60": 253464,
                "62": 253455,
                "63": 133252,
                "65": 168060,
                "66": 76461,
                "67": 194639,
                "68": 168062,
                "69": 38,
                "70": 51422
            }
        }
    }
}
},{}],20:[function(require,module,exports){
var DEFAULT_BITSTRIPS = {
    colours: {
        "ffcc99": 0xffcc99, // pink skin
        "FF9866": 0xff9866, // matching lips
        "926715": 0x272b2a, // dark hair
        "4f453e": 0x181B1A, // matching eyebrows
        "6f4b4b": 0x181B1A, // matching facial hair
        "36a7e9": 0x894F29  // blue eyes
    },
    pd2: {
        'brow_L': "brow_n4",
        'brow_R': "brow_n4",
        'cranium': "cranium_midstraightfem",
        'ear_L': "ear_n1",
        'ear_R': "ear_n1",
        'eye_L': "eye_n1",
        'eye_R': "eye_n1",
        'eyelash_L': "eyelash_n1_1",
        'eyelash_R': "eyelash_n1_1",
        'eyelid_L': "eyelid_n1_1",
        'eyelid_R': "eyelid_n1_1",
        'forehead': "forehead_standard",
        'hair_back': "hair_back_midstraightfem",
        'hair_front': "hair_front_midstraightfem",
        'hairbottom': "hairbottom_blank",
        'jaw': "jaw_n13",
        'mouth': "mouth_n3",
        'nose': "nose_n10",
        'pupil_L': "pupil_n8",
        'pupil_R': "pupil_n8",
        'beard': "_blank",
        'goatee': "_blank",
        'stachin': "_blank",
        'stachout': "_blank",
        'hat': "_blank",
        'glasses': "_blank",
        'moustache': "_blank",
        'tongue': "tongue_n1_3",
        'detail_L': "_blank",
        'detail_R': "_blank",
        'detail_T': "_blank",
        'chin': "_blank",
        'cheek_L': "_blank",
        'cheek_R': "_blank",
        'earring_L': "_blank",
        'earring_R': "_blank",
        'detail_E_L': "_blank",
        'detail_E_R': "_blank",
        'detail_E2_L': "_blank",
        'detail_E2_R': "_blank",
        'detail_L2_L': "_blank",
        'detail_L2_R': "_blank"
    },
    body: {
        sex: 2,
        body_type: 7,
        body_height: 0,
        breast_type: 0
    }
};

var DEFAULT_BITMOJI = {
    colours: {
        "ffcc99": 0xffcc99, // pink skin
        "FF9866": 0xff9866, // matching lips
        "926715": 0x272b2a, // dark hair
        "4f453e": 0x181B1A, // matching eyebrows
        "6f4b4b": 0x181B1A, // matching facial hair
        "36a7e9": 0x894F29  // blue eyes
    },
    pd2: {
        'brow_L': "brow_bm4",
        'brow_R': "brow_bm4",
        'cranium': "cranium_bm4",
        'ear_L': "ear_bm2",
        'ear_R': "ear_bm2",
        'eye_L': "eye_bm2",
        'eye_R': "eye_bm2",
        'eyelash_L': "eyelash_bm1_2",
        'eyelash_R': "eyelash_bm1_2",
        'eyelid_L': "eyelid_bm1_2",
        'eyelid_R': "eyelid_bm1_2",
        'forehead': "forehead_bm2",
        'hair_back': "hair_back_bm4",
        'hair_front': "hair_front_bm4",
        'hairbottom': "hairbottom_bm4",
        'jaw': "jaw_bm2",
        'mouth': "mouth_bm4",
        'nose': "nose_bm2",
        'pupil_L': "pupil_bm1",
        'pupil_R': "pupil_bm1",
        'beard': "_blank",
        'goatee': "_blank",
        'stachin': "_blank",
        'stachout': "_blank",
        'hat': "_blank",
        'glasses': "_blank",
        'moustache': "_blank",
        'tongue': "tongue_bm1_2",
        'detail_L': "_blank",
        'detail_R': "_blank",
        'detail_T': "_blank",
        'chin': "_blank",
        'cheek_L': "_blank",
        'cheek_R': "_blank",
        'earring_L': "_blank",
        'earring_R': "_blank",
        'detail_E_L': "_blank",
        'detail_E_R': "_blank",
        'detail_E2_L': "_blank",
        'detail_E2_R': "_blank",
        'detail_L2_L': "_blank",
        'detail_L2_R': "_blank"
    },
    body: {
        sex: 2,
        body_type: 7,
        body_height: 0,
        breast_type: 0
    }
};


module.exports = {
    avatar_id: 108768741,
    avatar_version: 1,
    styled_char_data: {
        "1": DEFAULT_BITSTRIPS,
        "4": DEFAULT_BITMOJI
    }
};

},{}],21:[function(require,module,exports){
var DEFAULT_BITSTRIPS = {
    colours: {
        "ffcc99": 0xffcc99, // pink skin
        "ff9866": 0xff9866, // matching lips
        "926715": 0x272b2a, // dark hair
        "4f453e": 0x181B1A, // matching eyebrows
        "6f4b4b": 0x181B1A, // matching facial hair
        "36a7e9": 0x894F29  // blue eyes
    },
    pd2: {
        'brow_L': "brow_n19",
        'brow_R': "brow_n19",
        'cranium': "cranium_default",
        'ear_L': "ear_n1",
        'ear_R': "ear_n1",
        'eye_L': "eye_n1",
        'eye_R': "eye_n1",
        'eyelash_L': "_blank",
        'eyelash_R': "_blank",
        'eyelid_L': "eyelid_n1_1",
        'eyelid_R': "eyelid_n1_1",
        'forehead': "forehead_standard",
        'hair_back': "hair_back_default",
        'hair_front': "hair_front_default",
        'hairbottom': "_blank",
        'jaw': "jaw_n3",
        'mouth': "mouth_n1",
        'nose': "nose_n6",
        'pupil_L': "pupil_n8",
        'pupil_R': "pupil_n8",
        'beard': "_blank",
        'goatee': "_blank",
        'stachin': "_blank",
        'stachout': "_blank",
        'hat': "_blank",
        'glasses': "_blank",
        'moustache': "_blank",
        'tongue': "tongue_n1_3",
        'detail_L': "_blank",
        'detail_R': "_blank",
        'detail_T': "_blank",
        'chin': "_blank",
        'cheek_L': "_blank",
        'cheek_R': "_blank",
        'earring_L': "_blank",
        'earring_R': "_blank",
        'detail_E_L': "_blank",
        'detail_E_R': "_blank",
        'detail_E2_L': "_blank",
        'detail_E2_R': "_blank",
        'detail_L2_L': "_blank",
        'detail_L2_R': "_blank"
    },
    body: {
        sex: 1,
        body_type: 0,
        body_height: 0
    }
};

var DEFAULT_BITMOJI = {
    colours: {
        "ffcc99": 0xffcc99, // pink skin
        "ff9866": 0xff9866, // matching lips
        "926715": 0x272b2a, // dark hair
        "4f453e": 0x181B1A, // matching eyebrows
        "6f4b4b": 0x181B1A, // matching facial hair
        "36a7e9": 0x894F29  // blue eyes
    },
    pd2: {
        'brow_L': "brow_bm1",
        'brow_R': "brow_bm1",
        'cranium': "cranium_bm23",
        'ear_L': "ear_bm1",
        'ear_R': "ear_bm1",
        'eye_L': "eye_bm1",
        'eye_R': "eye_bm1",
        'eyelash_L': "_blank",
        'eyelash_R': "_blank",
        'eyelid_L': "eyelid_bm1_1",
        'eyelid_R': "eyelid_bm1_1",
        'forehead': "forehead_bm1",
        'hair_back': "_blank",
        'hair_front': "hair_front_bm23",
        'hairbottom': "_blank",
        'jaw': "jaw_bm1",
        'mouth': "mouth_bm1",
        'nose': "nose_bm11",
        'pupil_L': "pupil_bm1",
        'pupil_R': "pupil_bm1",
        'beard': "_blank",
        'goatee': "_blank",
        'stachin': "_blank",
        'stachout': "_blank",
        'hat': "_blank",
        'glasses': "_blank",
        'moustache': "_blank",
        'tongue': "tongue_bm1_1",
        'detail_L': "_blank",
        'detail_R': "_blank",
        'detail_T': "_blank",
        'chin': "_blank",
        'cheek_L': "_blank",
        'cheek_R': "_blank",
        'earring_L': "_blank",
        'earring_R': "_blank",
        'detail_E_L': "_blank",
        'detail_E_R': "_blank",
        'detail_E2_L': "_blank",
        'detail_E2_R': "_blank",
        'detail_L2_L': "_blank",
        'detail_L2_R': "_blank"
    },
    body: {
        sex: 1,
        body_type: 0,
        body_height: 0
    }
};


module.exports = {
    avatar_id: 108768715,
    avatar_version: 1,
    styled_char_data: {
        "1": DEFAULT_BITSTRIPS,
        "4": DEFAULT_BITMOJI
    }
};

},{}],22:[function(require,module,exports){
var AvatarStore  = require('../stores/avatar');

var PROPORTION = 'proportion';
var SEX = 'sex';

function getProportion() {
    var delta = AvatarStore.delta;
    return delta[PROPORTION];
}


function setProportion(optionValue) {
    var delta = AvatarStore.delta;
    delta[PROPORTION] = optionValue;
    delta[SEX] = AvatarStore.sex;
}

module.exports = {
    getFaceProportions: getProportion,
    setFaceProportions: setProportion
};

},{"../stores/avatar":48}],23:[function(require,module,exports){
var _ = require('lodash');

var AvatarStore = require('../stores/avatar');

var hairFeatures = ['cranium', 'forehead', 'hair_back', 'hair_front', 'hairbottom'];

// Hair mutable state
var lastHairLength = 'short';
var lastHairType = 'straight';
var hairStyles = {};
var assetsFunction = null;

var onChangeCallback = function() {};


function get(type) {
  return getDeltaValue(type) || getCurrentValue(type);
}


function getDeltaValue(type) {
  var delta = AvatarStore.delta;
  return delta.pd2[type];
}


function getCurrentValue(type) {
  var currentData = AvatarStore.currentData;

  if (currentData.pd2 && currentData.pd2[type]) {
    return currentData.pd2[type];
  }

  return null;
}


function set(type, value) {
  var delta = AvatarStore.delta;
  delta.pd2[type] = value;
}


function setHairAssets(assets, sex) {
  hairStyles = assets;

  if (sex === 1) {
    getNewHairStyleFromLength('short');
  } else {
    getNewHairStyleFromLength('medium');
  }
}


function getHairLength() {
    return lastHairLength;
}


function setHairLength(optionString) {
  var hairStyleArray = getNewHairStyleFromLength(optionString);
  setHairStyle(hairStyleArray);
}


function getHairType() {
    return lastHairType;
}


function setHairType(optionString) {
  var hairStyleArray = getNewHairStyleFromType(optionString);
  setHairStyle(hairStyleArray);
}


function getHairStyle(optionArray) {
    var value;
    var hairStyleArray = [];

    _.each(hairFeatures, function(feature) {
        value = get(feature);
        hairStyleArray.push(value || feature + '_blank');
    });

    return hairStyleArray;
}


function setHairStyle(optionArray) {
  _.each(optionArray, function(item) {
    _.each(hairFeatures, function(feature) {
      if (item.indexOf(feature) !== -1) {
        set(feature, item);
        return false;
      }
    });
  });
}


function getNewHairStyle(hairLength, hairType) {
  var newStyles;

  lastHairLength = hairLength;
  lastHairType = hairType;

  if (hairLength === 'bald' || hairLength === 'special') {
    newStyles = hairStyles[hairLength];
  } else {
    newStyles = hairStyles[hairLength][hairType];
  }

  onChangeCallback(newStyles);

  return newStyles[0];
}


function getNewHairStyleFromLength(hairLength) {
  return getNewHairStyle(hairLength, lastHairType);
}


function getNewHairStyleFromType(hairType) {
  return getNewHairStyle(lastHairLength, hairType);
}


function setChangeCallback(fn) {
  onChangeCallback = fn;
}

module.exports = {
  HAIR_BALD: 'bald',
  HAIR_SPECIAL: 'special',
  setHairAssets: setHairAssets,
  getHairLength: getHairLength,
  setHairLength: setHairLength,
  getHairType: getHairType,
  setHairType: setHairType,
  getHairStyle: getHairStyle,
  setHairStyle: setHairStyle,
  getNewHairStyleFromLength: getNewHairStyleFromLength,
  getNewHairStyleFromType: getNewHairStyleFromType,
  setChangeCallback: setChangeCallback
};

},{"../stores/avatar":48,"lodash":52}],24:[function(require,module,exports){
var _                   = require('lodash');

var AvatarStore         = require('../stores/avatar');

var NOSE_TYPE           = "nose";
var JAW_TYPE            = "jaw";
var HAT                 = "hat";
var HAIR_ACCESSORY      = "hat";
var GLASSES             = "glasses";
var MOUTH               = "mouth";
var TONGUE              = "tongue";
var EYE_LEFT            = "eye_L";
var EYE_RIGHT           = "eye_R";
var EYEBROW_LEFT        = "brow_L";
var EYEBROW_RIGHT       = "brow_R";
var EYELID_LEFT         = "eyelid_L";
var EYELID_RIGHT        = "eyelid_R";
var EYELINE_LEFT        = "eyelines_L";
var EYELINE_RIGHT       = "eyelines_R";
var EAR_LEFT            = "ear_L";
var EAR_RIGHT           = "ear_R";
var EARRING_LEFT        = "earring_L";
var EARRING_RIGHT       = "earring_R";
var EYELASH_LEFT        = "eyelash_L";
var EYELASH_RIGHT       = "eyelash_R";
var PUPIL_LEFT          = "pupil_L";
var PUPIL_RIGHT         = "pupil_R";
var EYE_DETAIL_LEFT     = "detail_E_L";
var EYE_DETAIL_RIGHT    = "detail_E_R";
var CHEEK_DETAIL_LEFT   = "detail_L";
var CHEEK_DETAIL_RIGHT  = "detail_R";
var FACE_LINES          = "detail_T";
var BLUSH_LEFT          = "detail_L2_L";
var BLUSH_RIGHT         = "detail_L2_R";
var EYESHADOW_LEFT      = "detail_E2_L";
var EYESHADOW_RIGHT     = "detail_E2_R";
var BEARD_TYPE          = "beard";
var BEARD_STACHIN       = "stachin";
var BEARD_STACHOUT      = "stachout";


function set(type, value) {
  var delta = AvatarStore.delta;

  // One element arrays are converted to a string value
  if (_.isArray(value) && value.length === 1) {
    value = value[0];
  }

  if (_.isString(value) && value.match(/\w+_blank/)) {
    value = '_blank';
  }

  delta.pd2[type] = value;
}


function get(type) {
  return getDeltaValue(type) || getCurrentValue(type);
}


function getDeltaValue(type) {
  var delta = AvatarStore.delta;
  return delta.pd2[type];
}


function getCurrentValue(type) {
  var currentData = AvatarStore.currentData;

  if (currentData.pd2 && currentData.pd2[type]) {
    return currentData.pd2[type];
  }

  return null;
}


function getNoseType() {
    return get(NOSE_TYPE);
}


function setNoseType(optionString) {
  set(NOSE_TYPE, optionString);
}


function getJawType() {
    return get(JAW_TYPE);
}


function setJawType(optionString) {
  set(JAW_TYPE, optionString);
  setBeardType(getBeardType());
}


function getHat() {
    return get(HAT);
}


function setHat(optionString) {
  set(HAT, optionString);
}


function getHairAccessories() {
    return get(HAIR_ACCESSORY);
}


function setHairAccessories(optionString) {
  set(HAIR_ACCESSORY, optionString);
}


function getGlasses() {
    return get(GLASSES);
}


function setGlasses(optionString) {
  set(GLASSES, optionString);
}


function getMouthType() {
    return [
        get(MOUTH),
        get(TONGUE)
    ];
}


function setMouthType(optionArray) {
  set(MOUTH, optionArray[0]);
  set(TONGUE, optionArray[1]);
  setBeardType(getBeardType());
}


function getEyeType() {
    return get(EYE_LEFT);
}


function setEyeType(optionArray) {
  var optionString = optionArray[0];

  set(EYE_LEFT, optionString);
  set(EYE_RIGHT, optionString);
  set(EYELINE_LEFT, optionString);
  set(EYELINE_RIGHT, optionString);

  var eyelidOption = optionString.replace("eye_n", "eyelid_n1_");
  setEyeLid(eyelidOption);
  fixEyeArt();
}


function getEyeLid() {
    return get(EYELID_LEFT);
}


function setEyeLid(optionString) {
  set(EYELID_LEFT, optionString);
  set(EYELID_RIGHT, optionString);
}


function getEyeShadow() {
    return get(EYESHADOW_LEFT);
}


function setEyeShadow(optionString) {
  set(EYESHADOW_LEFT, optionString);
  set(EYESHADOW_RIGHT, optionString);
}


function getEyeBrowType() {
    return get(EYEBROW_LEFT);
}


function setEyeBrowType(optionString) {
  set(EYEBROW_LEFT, optionString);
  set(EYEBROW_RIGHT, optionString);
}


function getEarType() {
    return get(EAR_LEFT);
}


function setEarType(optionString) {
  set(EAR_LEFT, optionString);
  set(EAR_RIGHT, optionString);
}


function getBlushType() {
    return get(BLUSH_LEFT);
}


function setBlushType(optionString) {
  set(BLUSH_LEFT, optionString);
  set(BLUSH_RIGHT, optionString);
}


function getEarringType() {
    return get(EARRING_LEFT);
}


function setEarringType(optionString) {
  set(EARRING_LEFT, optionString);
  set(EARRING_RIGHT, optionString);
}


function getPupilType() {
  return get(PUPIL_LEFT);
}


function setPupilType(optionString) {
  set(PUPIL_LEFT, optionString);
  set(PUPIL_RIGHT, optionString);
}


function getLineCombos() {
    return [
        get(EYE_DETAIL_LEFT),
        get(CHEEK_DETAIL_LEFT),
        get(FACE_LINES)
    ];
}


function setLineCombos(optionArray) {
  set(EYE_DETAIL_LEFT, optionArray[0]);
  set(EYE_DETAIL_RIGHT, optionArray[0]);
  set(CHEEK_DETAIL_LEFT, optionArray[1]);
  set(CHEEK_DETAIL_RIGHT, optionArray[1]);
  set(FACE_LINES, optionArray[2]);
}


function getCheekDetails() {
    return get(CHEEK_DETAIL_LEFT);
}


function setCheekDetails(optionString) {
  set(CHEEK_DETAIL_LEFT, optionString);
  set(CHEEK_DETAIL_RIGHT, optionString);
}


function getEyeDetails() {
    return get(EYE_DETAIL_LEFT);
}


function setEyeDetails(optionString) {
  set(EYE_DETAIL_LEFT, optionString);
  set(EYE_DETAIL_RIGHT, optionString);
}


function getEyelashType() {
    return get(EYELASH_LEFT);
}


function setEyelashType(option) {
  var eyeType, eyeEnding;

  if (_.isArray(option)) { option = option[0]; }

  eyeType = get(EYE_LEFT);

  if (eyeType && option.match(/_1$/)) {
    eyeEnding = '_' + eyeType.split('eye_n')[1];
    option = option.replace(/_1$/, eyeEnding);
  }

  set(EYELASH_LEFT, option);
  set(EYELASH_RIGHT, option);
}


function getFaceLines() {
    return get(FACE_LINES);
}


function setFaceLines(optionString) {
  set(FACE_LINES, optionString);
}


function getBeardType() {
    return [
        get(BEARD_TYPE)     || 'beard_blank',
        get(BEARD_STACHIN)  || 'stachin_blank',
        get(BEARD_STACHOUT) || 'stachout_blank'
    ];
}


function setBeardType(optionArray) {
  var jawType, jawEnding, mouthType, mouthEnding;
  // If reseting beard exit early
  if (optionArray[0] === "_blank") {
    set(BEARD_TYPE, "_blank");
    set(BEARD_STACHIN, "_blank");
    set(BEARD_STACHOUT, "_blank");
    return;
  }

  // Get current jaw type
  jawType = get(JAW_TYPE);

  if (jawType) {
    jawEnding = getJawEnding(jawType);
  }

  // Get current mouth type
  mouthType = get(MOUTH);

  if (mouthType) {
    mouthEnding = getMouthEnding(mouthType);
  }

  // Replace the _1 ending with the appropiate jaw ending
  set(BEARD_TYPE, optionArray[0].replace(/_\d+$/, jawEnding));
  set(BEARD_STACHIN, optionArray[1].replace(/_\d+$/, mouthEnding));
  set(BEARD_STACHOUT, optionArray[2].replace(/_\d+$/, mouthEnding));
}


function getJawEnding(jawType) {
    if (!!jawType.match(/jaw_bm/)) {
        return '_' + jawType.split('jaw_bm')[1];
    } else {
        return '_' + jawType.split('jaw_n')[1];
    }
}


function getMouthEnding(mouthType) {
    if (!!mouthType.match(/mouth_bm/)) {
        return '_' + mouthType.split('mouth_bm')[1];
    } else {
        return '_' + mouthType.split('mouth_n')[1];
    }
}


function isBeardValue(value) {
    return Array.isArray(value) && value.length === 3 &&
        !!(value[0].toString().match(/^beard/)) &&
        !!(value[1].toString().match(/^stachin/)) &&
        !!(value[2].toString().match(/^stachout/));
}


function adjustMouthForLipstick() {
  var mouthType = get(MOUTH);
  // TODO: Move this control flow to ArtCMS export
  // mouths with no lips get mouths with thin lips when lipstick is applied
  switch (mouthType) {

    // bitstrips style cases
    case 'mouth_n1':
    case 'mouth_n9':
      setMouthType(["mouth_n2", "tongue_n1_3"]);
      break;

    case 'mouth_n5':
      setMouthType(["mouth_n6", "tongue_n1_5"]);
      break;


    // bitmoji style cases
    case 'mouth_bm1':
      setMouthType(["mouth_bm3", "tongue_bm1_1"]);
      break;

    case 'mouth_bm2':
      setMouthType(["mouth_bm4", "tongue_bm1_2"]);
      break;
  }
}


function fixEyeArt() {
  var currentEyelash = get(EYELASH_LEFT);

  if (currentEyelash == "_blank") {
    setEyelashType(currentEyelash);
  } else if (currentEyelash) {
    currentEyelash = currentEyelash.split('_');
    currentEyelash[2] = 1;
    currentEyelash = currentEyelash.join('_');
    setEyelashType(currentEyelash);
  }
}


function getFrontHairType() {
  return get('hair_front');
}


module.exports = {
  JAW_TYPE: JAW_TYPE,
  EYEBROW_TYPE: EYEBROW_LEFT,
  EYE_TYPE: EYE_LEFT,
  EYELASH_TYPE: EYELASH_LEFT,
  PUPIL_TYPE: PUPIL_LEFT,
  NOSE_TYPE: NOSE_TYPE,
  MOUTH_TYPE: MOUTH,
  EAR_TYPE: EAR_LEFT,
  EARRING_TYPE: EARRING_LEFT,
  BEARD_TYPE: BEARD_TYPE,
  EYE_DETAILS: EYE_DETAIL_LEFT,
  CHEEK_DETAILS: CHEEK_DETAIL_LEFT,
  FACE_LINES: FACE_LINES,
  GLASSES: GLASSES,
  HAT: HAT,
  HAIR_ACCESSORY: HAIR_ACCESSORY,
  set: set,
  get: get,
  getNoseType: getNoseType,
  setNoseType: setNoseType,
  getJawType: getJawType,
  setJawType: setJawType,
  getHat: getHat,
  setHat: setHat,
  getHairAccessories: getHairAccessories,
  setHairAccessories: setHairAccessories,
  getGlasses: getGlasses,
  setGlasses: setGlasses,
  getMouthType: getMouthType,
  setMouthType: setMouthType,
  getEyeType: getEyeType,
  setEyeType: setEyeType,
  getEyeBrowType: getEyeBrowType,
  setEyeBrowType: setEyeBrowType,
  getEyeLid: getEyeLid,
  setEyeLid: setEyeLid,
  getEyeShadow: getEyeShadow,
  setEyeShadow: setEyeShadow,
  getEyelashType: getEyelashType,
  setEyelashType: setEyelashType,
  getEarType: getEarType,
  setEarType: setEarType,
  getEarringType: getEarringType,
  setEarringType: setEarringType,
  getBlushType: getBlushType,
  setBlushType: setBlushType,
  getPupilType: getPupilType,
  setPupilType: setPupilType,
  getLineCombos: getLineCombos,
  setLineCombos: setLineCombos,
  getCheekDetails: getCheekDetails,
  setCheekDetails: setCheekDetails,
  getEyeDetails: getEyeDetails,
  setEyeDetails: setEyeDetails,
  getFaceLines: getFaceLines,
  setFaceLines: setFaceLines,
  getBeardType: getBeardType,
  setBeardType: setBeardType,
  isBeardValue: isBeardValue,

  adjustMouthForLipstick: adjustMouthForLipstick,
  getFrontHairType: getFrontHairType
};

},{"../stores/avatar":48,"lodash":52}],25:[function(require,module,exports){
var _                   = require('lodash');
var sprintf             = require('sprintf');

var DATA                = require('./loader');
var AvatarCategoryLists = require('./category-lists');
var AvatarArtHair       = require('./hair');
var AvatarStore  = require('../stores/avatar');
var localize  = require('../lib/localize');


var features = [];
var blackList = [];
var hairStyles = {};
var sex = 'man';
var imagesPath = 'images/';

var featuresHash = {
  hairStyles: AvatarStore.hairStyles
};

var genderOnlyAssets = {
  'short': {
    'man': 'short_man',
    'woman': 'short_woman'
  },
  'medium': {
    'man': 'medium_man',
    'woman': 'medium_woman'
  },
  'long': {
    'man': 'long_man',
    'woman': 'long_woman'
  }
};

function register(feature, key) {
  if (feature === null) return;

  featuresHash[key] = feature;
  features.push(feature);
}

function reset() {
  featuresHash = {};
  features = [];
}

function getImagesPath() {
  return imagesPath;
}

function setImagesPath(path) {
  imagesPath = path;
}

function getIndex(feature, value) {
  return featuresHash[feature].data.indexOf(value);
}

function getValue(feature, index) {
  return featuresHash[feature].data[index];
}

function setSex(_sex) {
  sex = _sex;
}

function getSex() {
  return sex;
}

function getHeadArtAssetUrl(option) {
  var isMouth = function(option) {
    return (Array.isArray(option) && option[0].substr(0, 5) === 'mouth');
  };

  var isHairStyle = function(option) {
    return (Array.isArray(option) && option[0].substr(0, 7) === 'cranium');
  };

  var isFaceDetail = function(option) {
    return (Array.isArray(option) && option[0].substr(0, 8) === 'detail_E');
  };

  var isBeardType = function(option) {
    return (Array.isArray(option) && option[0].substr(0, 5) === 'beard');
  };

  var allItemsAreBlank = function(optionArray) {
    if (!_.isArray(optionArray)) { return false; }

    return _.every(optionArray, function(item) {
        return _.isString(item) && !!item.match(/_blank/);
    });
  };

  if (!option || _.contains(['_blank', 'detail_E_n0', 'detail_L_n0', 'detail_T_n0'], option)) {
    return sprintf('%sheadart/_blank.png', imagesPath);
  }

  if (allItemsAreBlank(option)) {
    return sprintf('%sheadart/_blank.png', imagesPath);
  }

  if (!!genderOnlyAssets[option]) {
    option = genderOnlyAssets[option][sex];
  } else if (isMouth(option)) {
    option = option[0];
  } else if (isHairStyle(option)) {
    option = sprintf('hairstyle_%s', option[0]);
  } else if (isFaceDetail(option) || (isBeardType(option))) {
    option = option.join('_');
  }


  return sprintf('%sheadart/%s/%s.png', imagesPath, AvatarStore.avatarStyle, option);
}

function all() {
  return _.map(AvatarCategoryLists.categoriesMenu[sex], function(categoryName) {
    return featuresHash[categoryName];
  });
}

function loadTones(data, sex, avatarStyle) {
  var obj;

  var toneTypes = [
    {key: 'skinTones', name: 'SkinTone', title: localize('Skin Tone')},
    {key: 'lipTones', name: 'LipTone', title: localize('Lip Tone')},
    {key: 'hairTones', name: 'HairTone', title: localize('Hair Color')},
    {key: 'browTones', name: 'BrowTone', title: localize('Eyebrow Tone')},
    {key: 'beardTones', name: 'BeardTone', title: localize('Beard Tone')},
    {key: 'pupilTones', name: 'PupilTone', title: localize('Pupil Color')},
    {key: 'blushTones', name: 'BlushTone', title: localize('Blush')},
    {key: 'eyeshadowTones', name: 'EyeshadowTone', title: localize('Eyeshadow')},
    {key: 'lipstickTones', name: 'LipstickTone', title: localize('Lipstick')},
  ];

  _.each(toneTypes, function(tone) {
    obj = {
      name: tone.name,
      title: tone.title,
      data: data[tone.key],
      options: _.map(_.uniq(data[tone.key]), function(option) {
        if (option === "_blank") {
          return {value: option, image: sprintf('%sheadart/_blank.png', getImagesPath())};
        }

        return {value: option, backgroundColor: option};
      })
    };

    // <hack removes the eyeshadow menu option for male Bitmoji characters>
    if (sex == 1 && avatarStyle === 'bitmoji' && tone.name === 'EyeshadowTone') {
      obj.data = []; obj.options = [];
    }
    // </hack>

    register(obj, tone.key);
  });
}

function initializeHairStylesForBitstrips(data, sex) {
  register({
    name: 'HairStyle',
    title: localize('Hair Style'),
    data: [],
    options: []
  }, 'hairStyles');

  AvatarArtHair.setChangeCallback(function(newStyles) {
    featuresHash.hairStyles.data = newStyles;
    featuresHash.hairStyles.options = _.map(newStyles, function(option, index) {
      return {value: option, image: getHeadArtAssetUrl(option)};
    });
  });

  var hairKey = (sex ==1) ? 'hairStylesMan' : 'hairStylesWoman';

  AvatarArtHair.setHairAssets(data[hairKey], sex);
}


function initializeHairStylesForBitmoji(data, sex) {

  var key = (sex === 1) ? 'hairStylesMan' : 'hairStylesWoman';

  register({
    name: 'HairStyle',
    title: localize('Hair Style'),
    data: data[key],
    options: _.map(_.uniq(data[key]), function(option, index) {
        return {value: option, image: getHeadArtAssetUrl(option)};
    })
  }, 'hairStyles');
}


function loadHeadArt(data, sex, avatarStyle) {
  var obj;

  var hairLengthOptions = data.hairLengthOptionsFunction && data.hairLengthOptionsFunction();
  var hairTypeOptions = data.hairTypeOptionsFunction && data.hairTypeOptionsFunction();

  var headArtTypes = [
    {key: 'noseTypes', name: 'NoseType', title: localize('Nose'), sexData: ['noseMan', 'noseWoman']},
    {key: 'jawTypes', name: 'JawType', title: localize('Jaw'), sexData: ['jawMan', 'jawWoman']},
    {key: 'hats', name: 'Hat', title: localize('Headwear'), sexData: ['hatMan', 'hatWoman']},
    {key: 'hairAccessories', name: 'HairAccessories', title: localize('Hair Accessories'), sexData: ['hairAccessoryMan', 'hairAccessoryWoman']},
    {key: 'glasses', name: 'Glasses', title: localize('Glasses'), sexData: ['glasses', 'glasses']},
    {key: 'mouthTypes', name: 'MouthType', title: localize('Mouth'), sexData: ['mouthMan', 'mouthWoman']},
    {key: 'eyeTypes', name: 'EyeType', title: localize('Eyes'), sexData: ['eyeMan', 'eyeWoman']},
    {key: 'earTypes', name: 'EarType', title: localize('Ears'), sexData: ['ears', 'ears']},
    {key: 'earringTypes', name: 'EarringType', title: localize('Earrings'), sexData: ['earrings', 'earrings']},
    {key: 'eyeBrowTypes', name: 'EyeBrowType', title: localize('Eyebrows'), sexData: ['eyeBrowMan', 'eyeBrowWoman']},
    {key: 'pupilTypes', name: 'PupilType', title: localize('Pupils'), sexData: ['pupilType', 'pupilType']},
    {key: 'eyeDetails', name: 'EyeDetails', title: localize('Eye Details'), sexData: ['eyeDetails', 'eyeDetails']},
    {key: 'cheekDetails', name: 'CheekDetails', title: localize('Cheek Details'), sexData: ['cheekDetailMan', 'cheekDetailWoman']},
    {key: 'faceLines', name: 'FaceLines', title: localize('Face Lines'), sexData: ['faceLines', 'faceLines']},
    {key: 'lineCombos', name: 'LineCombos', title: localize('Face Details'), sexData: ['lineComboMan', 'lineComboWoman']},
    {key: 'beardTypes', name: 'BeardType', title: localize('Facial Hair'), sexData: ['beardTypes', 'beardTypes']},
    {key: 'eyelashTypes', name: 'EyelashType', title: localize('Eyelashes'), sexData: ['eyelashTypes', 'eyelashTypes']},
  ];

  var hairLengthObj = {
    name: 'HairLength',
    title: localize('Hair Length'),
    data: _.pluck(hairLengthOptions, 'value'),
    options: hairLengthOptions
  };

  var hairTypeObj = {
    name: 'HairType',
    title: localize('Hair Type'),
    data: _.pluck(hairTypeOptions, 'value'),
    options: hairTypeOptions
  };

  _.each(headArtTypes, function(headArtType) {
    var sexKey = headArtType.sexData[sex-1];
    obj = {
      name: headArtType.name,
      title: headArtType.title,
      data: data[sexKey],
      options: _.map(_.uniq(data[sexKey]), function(option, index) {
        return {value: option, image: getHeadArtAssetUrl(option)};
      })
    };

    register(obj, headArtType.key);
  });


  register(hairLengthObj, 'hairLengths');
  register(hairTypeObj, 'hairTypes');

  // Hair styles logic is style dependent
  if (avatarStyle === 'bitstrips') {
    initializeHairStylesForBitstrips(data, sex);
  } else {
    initializeHairStylesForBitmoji(data, sex);
  }
}


function loadBodyArt (data, sex) {
  var bodyTypeObj, breastTypeObj, bodyHeightObj;
  var sexKey = sex === 1 ? 'bodyTypeMan' : 'bodyTypeWoman';
  var bodyTypeOptions = data[sex === 1 ? 'bodyTypeOptionsManFunction' : 'bodyTypeOptionsWomanFunction']();
  var bodyHeightOptions = data.bodyHeightOptionsFunction();
  var breastTypeOptions = data.breastTypeOptionsFunction();

  bodyTypeObj = {
    name: 'BodyType',
    title: localize('Build'),
    data: _.pluck(bodyTypeOptions, 'value'),
    options: bodyTypeOptions
  };

  breastTypeObj = {
    name: 'BreastType',
    title: localize('Chest Size'),
    data: _.pluck(breastTypeOptions, 'value'),
    options: breastTypeOptions
  };

  bodyHeightObj = {
    name: 'BodyHeight',
    title: localize('Height'),
    data: _.pluck(bodyHeightOptions, 'value'),
    options: bodyHeightOptions
  };

  register(breastTypeObj, 'breastType');
  register(bodyTypeObj, 'bodyType');
  register(bodyHeightObj, 'bodyHeight');
}


function loadFaceProportions(sex, avatarStyle) {
  var options = [];
  var optionsPerStyle = {'bitstrips':9, 'bitmoji':9};
  for (var i = 0;i<optionsPerStyle[avatarStyle];i++) {
    options.push({
      value:i,
      image: sprintf('%shead/%s/proportion_head_%02d_%s.png', getImagesPath(), avatarStyle, i, sex)
    })
  }

  register(
    {
      name:'FaceProportions',
      title: localize('Face Shape'),
      options: options
    }
    , 'faceProportions');
}

function loadOutfitArt(data, sex, avatarStyle) {

  var key = (sex === 1) ? 'outfitMan' : 'outfitWoman';

  var obj = {
      name: 'Outfit',
      title: localize('Outfit'),
      data: data[key],
      options: _.map(data[key], function(outfitId) {
          return { value: outfitId, image: sprintf('%soutfits/%s_%s.png', getImagesPath(), sex, outfitId) };
      })
  };

  register(obj, 'outfit');
}


function init(sex, avatarStyle) {
  var sexString;
  var styleData;

  if (sex === 1) {
    sexString = 'man';
  } else if (sex === 2) {
    sexString = 'woman';
  } else {
    throw new Error('Invalid sex selection: ' + sex);
  }

  setSex(sexString);
  styleData = DATA[avatarStyle];

  reset();

  loadFaceProportions(sexString, avatarStyle);
  loadTones(styleData, sex, avatarStyle);
  loadHeadArt(styleData, sex, avatarStyle);
  loadBodyArt(styleData, sex);
  loadOutfitArt(styleData, sex, avatarStyle);

  // Finish page
  register({
      name: 'finish',
      title: localize('Finish'),
      template: 'finish'
  }, 'finish');


}


function getStyleId(styleString) {
    return DATA[styleString].id;
}


module.exports = {
  init: init,
  all: all,
  register: register,
  getIndex: getIndex,
  getValue: getValue,
  getHeadArtAssetUrl: getHeadArtAssetUrl,
  setSex: setSex,
  getSex: getSex,
  setImagesPath: setImagesPath,
  getImagesPath: getImagesPath,
  reset: reset,
  getStyleId: getStyleId
};

},{"../lib/localize":45,"../stores/avatar":48,"./category-lists":2,"./hair":23,"./loader":26,"lodash":52,"sprintf":53}],26:[function(require,module,exports){
var localize  = require('../lib/localize');
var DATA = require('./data/content.json');


var BITSTRIPS_KEY = "1";
var BITMOJI_KEY = "4";
var MAN_KEY = "1";
var WOMAN_KEY = "2";


var BEARD_KEY           = 'beard';
var BROW_KEY            = 'brow';
var CHEEK_DETAIL_KEY    = 'detail_L';
var EAR_KEY             = 'ear';
var EARRING_KEY         = 'earring';
var EYE_KEY             = 'eye';
var EYE_DETAIL_KEY      = 'detail_E';
var EYELASH_KEY         = 'eyelash';
var FACELINES_KEY       = 'detail_T';
var GLASSES_KEY         = 'glasses';
var HAIR_KEY            = 'hairstyles';
var HAIR_ACCESSORY_KEY  = 'acchair';
var HAT_KEY             = 'hat';
var JAW_KEY             = 'jaw';
var LINE_COMBO_KEY      = 'linecombos';
var MOUTH_KEY           = 'mouth';
var NOSE_KEY            = 'nose';
var PUPIL_KEY           = 'pupil';
var OUTFIT_KEY          = 'outfits';


// Original Bitstrips Style
var SKIN_TONES_BITSTRIPS            = require('./data/bitstrips/skin_tones');
var LIP_TONES_BITSTRIPS             = require('./data/bitstrips/lip_tones');
var HAIR_TONES_BITSTRIPS            = require('./data/bitstrips/hair_tones');
var BROW_TONES_BITSTRIPS            = require('./data/bitstrips/brow_tones');
var BEARD_TONES_BITSTRIPS           = require('./data/bitstrips/beard_tones');
var PUPIL_TONES_BITSTRIPS           = require('./data/bitstrips/pupil_tones');
var BLUSH_TONES_BITSTRIPS           = require('./data/bitstrips/blush_tones');
var EYESHADOW_TONES_BITSTRIPS       = require('./data/bitstrips/eyeshadow_tones');
var LIPSTICK_TONES_BITSTRIPS        = require('./data/bitstrips/lipstick_tones');
var HAIR_STYLES_BITSTRIPS           = require('./data/bitstrips/hair_styles');

// Option functions
var HAIR_LENGTH_FUNCTION_BITSTRIPS  = require('./data/bitstrips/hair_length_function');
var HAIR_TYPE_FUNCTION_BITSTRIPS    = require('./data/bitstrips/hair_type_function');
var BODY_TYPE_FUNCTION_MAN          = require('./data/bitstrips/body_type_function_man');
var BODY_TYPE_FUNCTION_WOMAN        = require('./data/bitstrips/body_type_function_woman');
var BODY_HEIGHT_FUNCTION            = require('./data/bitstrips/body_height_function');
var BREAST_TYPE_FUNCTION            = require('./data/bitstrips/breast_type_function');


// TODO This function shouldn't be necessary. The server shouldn't return [null] values
function sanitize(optionsArray) {
    return optionsArray.map(function(optionArray) {
        return optionArray.map(function(value) {
            if (value === null) {
                return "_blank";
            }
            return value;
        });
    });
}


module.exports = {
    'bitstrips': {
        'id': BITSTRIPS_KEY,
        'skinTones': SKIN_TONES_BITSTRIPS,
        'lipTones': LIP_TONES_BITSTRIPS,
        'hairTones': HAIR_TONES_BITSTRIPS,
        'browTones': BROW_TONES_BITSTRIPS,
        'beardTones': BEARD_TONES_BITSTRIPS,
        'pupilTones': PUPIL_TONES_BITSTRIPS,
        'blushTones': BLUSH_TONES_BITSTRIPS,
        'eyeshadowTones': EYESHADOW_TONES_BITSTRIPS,
        'lipstickTones': LIPSTICK_TONES_BITSTRIPS,
        'noseMan': DATA[BITSTRIPS_KEY][MAN_KEY][NOSE_KEY],
        'noseWoman': DATA[BITSTRIPS_KEY][WOMAN_KEY][NOSE_KEY],
        'jawMan': DATA[BITSTRIPS_KEY][MAN_KEY][JAW_KEY],
        'jawWoman': DATA[BITSTRIPS_KEY][WOMAN_KEY][JAW_KEY],
        'hatMan': sanitize(DATA[BITSTRIPS_KEY][MAN_KEY][HAT_KEY]),
        'hatWoman': sanitize(DATA[BITSTRIPS_KEY][WOMAN_KEY][HAT_KEY]),
        'hairAccessoryMan': DATA[BITSTRIPS_KEY][MAN_KEY][HAIR_ACCESSORY_KEY],
        'hairAccessoryWoman': DATA[BITSTRIPS_KEY][WOMAN_KEY][HAIR_ACCESSORY_KEY],
        'glasses': sanitize(DATA[BITSTRIPS_KEY][MAN_KEY][GLASSES_KEY]),
        'mouthMan': DATA[BITSTRIPS_KEY][MAN_KEY][MOUTH_KEY],
        'mouthWoman': DATA[BITSTRIPS_KEY][WOMAN_KEY][MOUTH_KEY],
        'eyeMan': DATA[BITSTRIPS_KEY][MAN_KEY][EYE_KEY],
        'eyeWoman': DATA[BITSTRIPS_KEY][WOMAN_KEY][EYE_KEY],
        'ears': DATA[BITSTRIPS_KEY][MAN_KEY][EAR_KEY],
        'earrings': sanitize(DATA[BITSTRIPS_KEY][MAN_KEY][EARRING_KEY]),
        'eyeBrowMan': DATA[BITSTRIPS_KEY][MAN_KEY][BROW_KEY],
        'eyeBrowWoman': sanitize(DATA[BITSTRIPS_KEY][WOMAN_KEY][BROW_KEY]),
        'pupilType': DATA[BITSTRIPS_KEY][MAN_KEY][PUPIL_KEY],
        'lineComboMan': DATA[BITSTRIPS_KEY][MAN_KEY][LINE_COMBO_KEY],
        'lineComboWoman': DATA[BITSTRIPS_KEY][WOMAN_KEY][LINE_COMBO_KEY],
        'eyeDetails': DATA[BITSTRIPS_KEY][MAN_KEY][EYE_DETAIL_KEY],
        'cheekDetailMan': DATA[BITSTRIPS_KEY][MAN_KEY][CHEEK_DETAIL_KEY],
        'cheekDetailWoman': DATA[BITSTRIPS_KEY][WOMAN_KEY][CHEEK_DETAIL_KEY],
        'faceLines': DATA[BITSTRIPS_KEY][MAN_KEY][FACELINES_KEY],
        'eyelashTypes': DATA[BITSTRIPS_KEY][MAN_KEY][EYELASH_KEY],
        'beardTypes': DATA[BITSTRIPS_KEY][MAN_KEY][BEARD_KEY],
        'hairLengthOptionsFunction': HAIR_LENGTH_FUNCTION_BITSTRIPS,
        'hairTypeOptionsFunction': HAIR_TYPE_FUNCTION_BITSTRIPS,
        'hairStylesMan': HAIR_STYLES_BITSTRIPS[MAN_KEY],
        'hairStylesWoman': HAIR_STYLES_BITSTRIPS[WOMAN_KEY],
        'bodyTypeOptionsManFunction': BODY_TYPE_FUNCTION_MAN,
        'bodyTypeOptionsWomanFunction': BODY_TYPE_FUNCTION_WOMAN,
        'bodyHeightOptionsFunction': BODY_HEIGHT_FUNCTION,
        'breastTypeOptionsFunction': BREAST_TYPE_FUNCTION,
        'outfitMan': DATA[BITSTRIPS_KEY][MAN_KEY][OUTFIT_KEY],
        'outfitWoman': DATA[BITSTRIPS_KEY][WOMAN_KEY][OUTFIT_KEY]

    },
    'bitmoji': {
        'id': BITMOJI_KEY,
        'skinTones': SKIN_TONES_BITSTRIPS,
        'lipTones': LIP_TONES_BITSTRIPS,
        'hairTones': HAIR_TONES_BITSTRIPS,
        'browTones': BROW_TONES_BITSTRIPS,
        'beardTones': BEARD_TONES_BITSTRIPS,
        'pupilTones': PUPIL_TONES_BITSTRIPS,
        'blushTones': BLUSH_TONES_BITSTRIPS,
        'eyeshadowTones': EYESHADOW_TONES_BITSTRIPS,
        'lipstickTones': LIPSTICK_TONES_BITSTRIPS,
        'noseMan': DATA[BITMOJI_KEY][MAN_KEY][NOSE_KEY],
        'noseWoman': DATA[BITMOJI_KEY][WOMAN_KEY][NOSE_KEY],
        'jawMan': DATA[BITMOJI_KEY][MAN_KEY][JAW_KEY],
        'jawWoman': DATA[BITMOJI_KEY][WOMAN_KEY][JAW_KEY],
        'hatMan': DATA[BITMOJI_KEY][MAN_KEY][HAT_KEY],
        'hatWoman': DATA[BITMOJI_KEY][WOMAN_KEY][HAT_KEY],
        'hairAccessoryMan': [],//DATA[BITMOJI_KEY][MAN_KEY][HAIR_ACCESSORY_KEY],
        'hairAccessoryWoman': [],//DATA[BITMOJI_KEY][WOMAN_KEY][HAIR_ACCESSORY_KEY],
        'glasses': sanitize(DATA[BITMOJI_KEY][MAN_KEY][GLASSES_KEY]),
        'mouthMan': DATA[BITMOJI_KEY][MAN_KEY][MOUTH_KEY],
        'mouthWoman': DATA[BITMOJI_KEY][WOMAN_KEY][MOUTH_KEY],
        'eyeMan': DATA[BITMOJI_KEY][MAN_KEY][EYE_KEY],
        'eyeWoman': DATA[BITMOJI_KEY][WOMAN_KEY][EYE_KEY],
        'ears': DATA[BITMOJI_KEY][MAN_KEY][EAR_KEY],
        'earrings': [],//sanitize(DATA[BITMOJI_KEY][MAN_KEY][EARRING_KEY]),
        'eyeBrowMan': DATA[BITMOJI_KEY][MAN_KEY][BROW_KEY],
        'eyeBrowWoman': sanitize(DATA[BITMOJI_KEY][WOMAN_KEY][BROW_KEY]),
        'pupilType': DATA[BITMOJI_KEY][MAN_KEY][PUPIL_KEY],
        'lineComboMan': DATA[BITMOJI_KEY][MAN_KEY][LINE_COMBO_KEY],
        'lineComboWoman': DATA[BITMOJI_KEY][WOMAN_KEY][LINE_COMBO_KEY],
        'eyeDetails': DATA[BITMOJI_KEY][MAN_KEY][EYE_DETAIL_KEY],
        'cheekDetailMan': DATA[BITMOJI_KEY][MAN_KEY][CHEEK_DETAIL_KEY],
        'cheekDetailWoman': DATA[BITMOJI_KEY][WOMAN_KEY][CHEEK_DETAIL_KEY],
        'faceLines': DATA[BITMOJI_KEY][MAN_KEY][FACELINES_KEY],
        'eyelashTypes': [],//DATA[BITMOJI_KEY][MAN_KEY][EYELASH_KEY],
        'beardTypes': DATA[BITMOJI_KEY][MAN_KEY][BEARD_KEY],
        'hairLengthOptionsFunction': null,
        'hairTypeOptionsFunction': null,
        'hairStylesMan': DATA[BITMOJI_KEY][MAN_KEY][HAIR_KEY],
        'hairStylesWoman': DATA[BITMOJI_KEY][WOMAN_KEY][HAIR_KEY],
        'bodyTypeOptionsManFunction': BODY_TYPE_FUNCTION_MAN,
        'bodyTypeOptionsWomanFunction': BODY_TYPE_FUNCTION_WOMAN,
        'bodyHeightOptionsFunction': BODY_HEIGHT_FUNCTION,
        'breastTypeOptionsFunction': BREAST_TYPE_FUNCTION,
        'outfitMan': DATA[BITMOJI_KEY][MAN_KEY][OUTFIT_KEY],
        'outfitWoman': DATA[BITMOJI_KEY][WOMAN_KEY][OUTFIT_KEY],
    }
};

},{"../lib/localize":45,"./data/bitstrips/beard_tones":3,"./data/bitstrips/blush_tones":4,"./data/bitstrips/body_height_function":5,"./data/bitstrips/body_type_function_man":6,"./data/bitstrips/body_type_function_woman":7,"./data/bitstrips/breast_type_function":8,"./data/bitstrips/brow_tones":9,"./data/bitstrips/eyeshadow_tones":10,"./data/bitstrips/hair_length_function":11,"./data/bitstrips/hair_styles":12,"./data/bitstrips/hair_tones":13,"./data/bitstrips/hair_type_function":14,"./data/bitstrips/lip_tones":15,"./data/bitstrips/lipstick_tones":16,"./data/bitstrips/pupil_tones":17,"./data/bitstrips/skin_tones":18,"./data/content.json":19}],27:[function(require,module,exports){
var AvatarArtTones = require('./tones');
var AvatarArtHead = require('./head');
var AvatarArtHair = require('./hair');
var AvatarArtBody = require('./body');
var AvatarArtOutfit = require('./outfit');
var AvatarArtFaceShape = require('./faceshape');


var avatarMethods = {};
var avatarModules = [AvatarArtTones, AvatarArtHead, AvatarArtHair, AvatarArtBody, AvatarArtOutfit, AvatarArtFaceShape];

for (var i=0 ; i<avatarModules.length ; i++) {
    for(var methodName in avatarModules[i]) {
        avatarMethods[methodName] = avatarModules[i][methodName];
    }
}

module.exports = avatarMethods;

},{"./body":1,"./faceshape":22,"./hair":23,"./head":24,"./outfit":28,"./tones":29}],28:[function(require,module,exports){
var AvatarStore = require('../stores/avatar');


var OUTFIT = 'outfit';


function getOutfit() {
    var delta = AvatarStore.delta;
    return delta[OUTFIT];
}


function setOutfit(outfit_id) {
  var delta = AvatarStore.delta;
  delta[OUTFIT] = outfit_id;
}


module.exports = {
    getOutfit: getOutfit,
    setOutfit: setOutfit
};

},{"../stores/avatar":48}],29:[function(require,module,exports){
var AvatarArt           = require('./index');
var AvatarHeadArt       = require('./head');
var AvatarStore  = require('../stores/avatar');


var SKIN_TONE       = "ffcc99";
var HAIR_TONE       = "926715";
var BROW_TONE       = "4f453e";
var BEARD_TONE      = "6f4b4b";
var PUPIL_TONE      = "36a7e9";
var LIP_TONE        = "ff9866";
var BLUSH_TONE      = "ff9999";
var EYESHADOW_TONE  = "b88eb6";

var DEFAULT_ART = {
  'bitstrips':{
    'BLUSH_TYPE':'detail_L2_n1',
    'EYESHADOW_TYPE':'detail_E2_n1',
    'EYELID_TYPE':'eyelid_n2_1'
  },
  'bitmoji':{
    'BLUSH_TYPE':'detail_L2_bm1',
    'EYESHADOW_TYPE':'detail_E2_bm1',
    'EYELID_TYPE':'eyelid_bm2_2'
  }
};


function getToneIndex(type, value) {
  var index = AvatarArt.getIndex(type, value);

  if (index === -1) {
    throw new Error(type + ' Error: Unrecognized value ' + value);
  }

  return index;
}


function getColour(type) {
  var value = AvatarStore.delta.colours[type] ||
              AvatarStore.currentData.colours[type];

  if (typeof value === "undefined" || value === null) {
    return null;
  }

  value = value.toString(16);

  // Fix missing leading zeroes
  while (value.length < 6) {
    value = '0' + value;
  }

  return value;
}


function setColour(type, value) {
  var delta = AvatarStore.delta;
  delta.colours[type] = parseInt(value, 16);
}


function resetColour(type) {
  var delta = AvatarStore.delta;
  delete delta.colours[type];
}


function getSkinTone() {
  return getColour(SKIN_TONE);
}


function setSkinTone(optionString) {

  var skinIndex,
      lipIndex = null,
      lipValue;

  skinIndex = getToneIndex('skinTones', optionString);

  // TODO We should have the JSON for the charater avatar and not replace customizations
  // lipIndex = current lip...

  lipValue = AvatarArt.getValue('lipTones', lipIndex || skinIndex);

  setColour(SKIN_TONE, optionString);

  setLipTone(lipValue);
}


function getLipTone() {
    return getColour(LIP_TONE);
}


function setLipTone(optionString) {
  setColour(LIP_TONE, optionString);
}


function getHairTone() {
    return getColour(HAIR_TONE);
}


function setHairTone(optionString) {
  var hairIndex,
      browIndex = null,
      beardIndex = null,
      browValue,
      beardValue;

  hairIndex = getToneIndex('hairTones', optionString);
  // TODO We should have the JSON for the charater avatar and not replace customizations
  // browIndex = current brow...
  // beardIndex = current beard...

  browValue = AvatarArt.getValue('browTones', browIndex || hairIndex);
  beardValue = AvatarArt.getValue('beardTones', beardIndex || hairIndex);

  setColour(HAIR_TONE, optionString);

  setBrowTone(browValue);
  setBeardTone(beardValue);
}


function getBrowTone() {
    return getColour(BROW_TONE);
}


function setBrowTone(optionString) {
  setColour(BROW_TONE, optionString);
}


function getBeardTone() {
    return getColour(BEARD_TONE);
}


function setBeardTone(optionString) {
  setColour(BEARD_TONE, optionString);
}


function getPupilTone() {
    return getColour(PUPIL_TONE);
}


function setPupilTone(optionString) {
  setColour(PUPIL_TONE, optionString);
}


function getBlushTone() {
    return getColour(BLUSH_TONE);
}


function setBlushTone(optionString) {
  if(optionString === "_blank") {
    AvatarHeadArt.setBlushType("_blank");
    resetColour(BLUSH_TONE);
  } else {
    setColour(BLUSH_TONE, optionString);
    AvatarHeadArt.setBlushType(DEFAULT_ART[AvatarStore.avatarStyle].BLUSH_TYPE);
  }
}


function getEyeshadowTone() {
    return getColour(EYESHADOW_TONE);
}


function setEyeshadowTone(optionString) {
  if(optionString === "_blank") {
    AvatarHeadArt.setEyeShadow("_blank");
    // set eyelids back to skin colour
    setColour(EYESHADOW_TONE, getSkinTone());
  } else {
    setColour(EYESHADOW_TONE, optionString);
    AvatarHeadArt.setEyeShadow(DEFAULT_ART[AvatarStore.avatarStyle].EYESHADOW_TYPE);
    AvatarHeadArt.setEyeLid(DEFAULT_ART[AvatarStore.avatarStyle].EYELID_TYPE);
  }
}


function getLipstickTone() {
    return getColour(LIP_TONE);
}


function setLipstickTone(optionString) {
  setColour(LIP_TONE, optionString);
  AvatarHeadArt.adjustMouthForLipstick();
}


var SKIN_TONE       = "ffcc99";
var HAIR_TONE       = "926715";
var BROW_TONE       = "4f453e";
var BEARD_TONE      = "6f4b4b";
var PUPIL_TONE      = "36a7e9";
var LIP_TONE        = "ff9866";
var BLUSH_TONE      = "ff9999";
var EYESHADOW_TONE  = "b88eb6";


module.exports = {
  SKIN_TONE: SKIN_TONE,
  HAIR_TONE: HAIR_TONE,
  BROW_TONE: BROW_TONE,
  BEARD_TONE: BEARD_TONE,
  PUPIL_TONE: PUPIL_TONE,
  LIP_TONE: LIP_TONE,
  BLUSH_TONE: BLUSH_TONE,
  EYESHADOW_TONE: EYESHADOW_TONE,
  getSkinTone: getSkinTone,
  setSkinTone: setSkinTone,
  getHairTone: getHairTone,
  setHairTone: setHairTone,
  getLipTone: getLipTone,
  setLipTone: setLipTone,
  getBrowTone: getBrowTone,
  setBrowTone: setBrowTone,
  getBeardTone: getBeardTone,
  setBeardTone: setBeardTone,
  getPupilTone: getPupilTone,
  setPupilTone: setPupilTone,
  getBlushTone: getBlushTone,
  setBlushTone: setBlushTone,
  getEyeshadowTone: getEyeshadowTone,
  setEyeshadowTone: setEyeshadowTone,
  getLipstickTone: getLipTone,
  setLipstickTone: setLipstickTone
};

},{"../stores/avatar":48,"./head":24,"./index":25}],30:[function(require,module,exports){
(function (global){
var _ = require('lodash');
var sprintf = require('sprintf');

var AvatarArt = require('./art');
var AvatarMethods = require('./art/methods');
var AvatarCategoryLists = require('./art/category-lists');
var AvatarStore = require('./stores/avatar');
var BuilderAnalytics = require('./lib/analytics');
var StyleUtils = require('./utils/style');


function init(avatarData) {
    // Make sure locale uses underscores for variants (iOS sends dashes)
    if (typeof avatarData.locale === "string") {
        avatarData.locale = avatarData.locale.replace('-', '_');
    }

    // Locales configuration
    if (avatarData.locale && global.i18n) {
        global.i18n.current = global.i18n[avatarData.locale] || global.i18n[avatarData.locale.slice(0, 2)] || global.i18n.en || {};
    }

    AvatarStore.avatarId = avatarData.avatar_id;
    AvatarStore.avatarVersion = avatarData.avatar_version;
    AvatarStore.isNew = avatarData.is_new || false;

    if (avatarData.styled_char_data) {
        AvatarStore.currentData = avatarData.styled_char_data[StyleUtils.getStyleId(AvatarStore.avatarStyle)];
        AvatarStore.sex = AvatarStore.currentData.body.sex;
        AvatarStore.translated = AvatarStore.currentData.translated || false;
    }

    // Load data
    AvatarArt.init(AvatarStore.sex, AvatarStore.avatarStyle);


    resetDelta(avatarData.initialDelta);


    if (!!avatarData.renderingHost) {
        AvatarStore.renderingHost = avatarData.renderingHost;
    }

    // Analytics configuration
    if (!!avatarData.analyticsCallback) {
        BuilderAnalytics.setCallback(avatarData.analyticsCallback);
    }
}

var cachedDisplaySize;

function getDisplaySize() {
    if (cachedDisplaySize) {
        return cachedDisplaySize;
    }

    // Default + minimum width & height
    var size = {width: 200, height:200};
    if (typeof document === "undefined" || typeof window === "undefined") {
        return size;
    }

    var dpp = 1;
    if (window.devicePixelRatio) {
        dpp = window.devicePixelRatio;
    }

    if (typeof window !== "undefined") {
        var heightRatio = 0.4; // Currently avatarDisplay takes 40% of the screen
        size.width = window.innerWidth * dpp;
        size.height = window.innerHeight * heightRatio * dpp;
    }

    var avatarDisplay = document.getElementsByClassName('avatar-display');
    if (!avatarDisplay || avatarDisplay.length === 0) {
        return size;
    }

    var rect = avatarDisplay[0].getBoundingClientRect();

    size.width = Math.max(size.width, Math.ceil(rect.width*dpp));
    size.height = Math.max(size.height, Math.ceil(rect.height*dpp));

    // don't cache size unless we have a valid rect
    if (rect.width > 0) {
        cachedDisplaySize = size;
    }
    return size;
}


function characterUrl() {
    //var templateId = 6555440; // neutral expression
    var templateId = 6688424; // smiling expression
    var avatarId = AvatarStore.avatarId;
    var avatarVersion = AvatarStore.avatarVersion;
    var renderingHost = AvatarStore.renderingHost;
    var delta = AvatarStore.delta;
    var isBodyPreview = AvatarCategoryLists.isBodyCategory(AvatarStore.currentCategory);
    var headRotation = AvatarCategoryLists.getHeadRotation(AvatarStore.currentCategory, AvatarStore.avatarStyle);
    var isFinalPreview = AvatarCategoryLists.isFinalPreview(AvatarStore.currentCategory);

    // Limit Rotations for Bitmoji Style
    if (AvatarStore.avatarStyle === 'bitmoji') {
        if (AvatarStore.custom_rotation === 6) { AvatarStore.custom_rotation = 7; }
        if (AvatarStore.custom_rotation === 2) { AvatarStore.custom_rotation = 1; }
    }

    delta.cropped = isBodyPreview ? 'body' : 'head';
    delta.head_rotation = AvatarStore.custom_rotation || headRotation || 0;

    if (isBodyPreview) {
        delta.body_rotation = AvatarStore.custom_rotation || headRotation || 0;
    } else if (isFinalPreview) {
        delete delta.body_rotation;
        delete delta.head_rotation;
        delta.cropped = 'body';
        templateId = 6972731;
    } else {
        delete delta.body_rotation;
    }

    var skipStringify = ['outfit', 'proportion', 'sex'];

    var queryParams = _.map(Object.keys(delta), function (modification) {
        if (skipStringify.indexOf(modification) !== -1) {
            return sprintf('%s=%s', modification, delta[modification]);
        }
        return sprintf('%s=%s', modification, JSON.stringify(delta[modification]));
    });


    var size = getDisplaySize();
    queryParams.push("crop_width=" + size.width);
    queryParams.push("crop_height=" + size.height);
    queryParams.push("style=" + AvatarArt.getStyleId(AvatarStore.avatarStyle));

    var styleId = StyleUtils.getStyleId(AvatarStore.avatarStyle);
    var url = sprintf('%s/render/%s/%s_%s_s%s-v1.png', renderingHost, templateId, avatarId, avatarVersion, styleId);

    if (queryParams.length > 0) {
        url = sprintf('%s?%s', url, encodeURI(queryParams.join('&')));
    }

    return  url;
}


function callCategorySetter(category, optionValue) {
    var methodName = sprintf('set%s', category);
    AvatarMethods[methodName](optionValue);
    BuilderAnalytics.emitOptionSelected(category, optionValue);
}


function callCategoryGetter(category) {
    var methodName = sprintf('get%s', category);
    return AvatarMethods[methodName]();
}


function setOption(category, optionValue) {
    AvatarStore.userSelectionHash[category] = optionValue;
    callCategorySetter(category, optionValue);
    AvatarStore.characterDataChangeCallback();
}


function getOption(category) {
    return callCategoryGetter(category);
}

function selectedValue(category) {
    return AvatarStore.userSelectionHash[category];
}


function getDelta() {
    return AvatarStore.delta || {};
}


function getDeltaPayload() {
    var char_data = getDelta();
    char_data.style = StyleUtils.getStyleId(AvatarStore.avatarStyle);
    return {
        avatar_id: AvatarStore.avatarId,
        char_data: char_data
    };
}


function getCurrentData() {
    return AvatarStore.currentData || {};
}


function hasChanged() {
    var delta = AvatarStore.delta;

    return  !_.isEmpty(delta.colours) || !_.isEmpty(delta.pd2) || !_.isEmpty(delta.body) ||
            !_.isUndefined(delta.outfit) || !_.isUndefined(delta.proportion);
}


function isNew() {
    return AvatarStore.isNew;
}

function isTranslation() {
    return AvatarStore.translated;
}


function allOptions() {
    // Finish screen is only shown to new users
    return _.filter(AvatarArt.all(), function(category) {

        // Filter if the data (selectable options) is either 1 or 0
        if (!!category.data && category.data.length < 2) {
            return false;
        }

        return AvatarStore.isNew || category.name !== 'finish';
    });
}


function setOnChangeCallback(onChangeCallback) {
    AvatarStore.characterDataChangeCallback = onChangeCallback;
}


function isWizardCategory(category) {
    var sex = AvatarArt.getSex();
    return AvatarCategoryLists.isWizardCategory(category, sex);
}


function addCategoryToWizard(category, position) {
    var sex = AvatarArt.getSex();
    AvatarCategoryLists.addCategoryToWizard(category.name, position, sex);
}


function resetDelta(initialDelta) {
    var colours = {};
    var pd2 = {};
    var body = {};

    if (!!initialDelta) {
        colours = initialDelta.colours || colours;
        pd2 = initialDelta.pd2 || colours;
        body = initialDelta.body || body;
    }

    AvatarStore.delta = {
        colours: colours,
        pd2: pd2,
        body: body
    };
}


function setCurrentCategory(categoryName) {
    AvatarStore.currentCategory = categoryName;
    // Reset user changes
    AvatarStore.custom_rotation = 0;

    // Do not attemp to redraw the character if we are resetting
    // the avatar builder. In that case the `categoryName` is null
    if (categoryName) {
        AvatarStore.characterDataChangeCallback();
    }
}


function getCurrentCategory() {
    return AvatarStore.currentCategory;
}


function rotateAvatarLeft() {
    AvatarStore.custom_rotation = AvatarStore.custom_rotation - 1;
    if (AvatarStore.custom_rotation < 0) {
        AvatarStore.custom_rotation = 7;
    }
    AvatarStore.characterDataChangeCallback();
    BuilderAnalytics.emitRotateAvatarLeft(getCurrentCategory());
}


function rotateAvatarRight() {
    AvatarStore.custom_rotation = (AvatarStore.custom_rotation + 1) % 8;
    AvatarStore.characterDataChangeCallback();
    BuilderAnalytics.emitRotateAvatarRight(getCurrentCategory());
}


function isSameOption(optionA, optionB) {
    var i;

    // Transform one item arrays to plain string
    if (_.isArray(optionA) && _.isString(optionB) && optionA.length === 1) {
        optionA = optionA[0];
    }

    if (AvatarMethods.isBeardValue(optionA) && AvatarMethods.isBeardValue(optionB)) {

        for (i=0 ; i<optionA.length ; i++) {
            if (optionA[i].slice(0, optionA[i].lastIndexOf('_')) !== optionB[i].slice(0, optionB[i].lastIndexOf('_'))) {
                return false;
            }
        }

        return true;

    } else if (Array.isArray(optionA)) {

        if (!optionB || !optionB.length || optionA.length !== optionB.length) {
            return false;
        }

        for (i=0 ; i<optionA.length ; i++) {
            if (optionA[i] != optionB[i]) {
                return false;
            }
        }

        return true;

    } else if (_.isString(optionA) && optionA.match(/eyelash_n/)) {
        optionA = optionA.replace(/_(\d+)$/, '_1');
        return optionA == optionB;
    } else {
        return optionA == optionB;
    }
}

function setAvatarStyle(avatarStyle) {
    AvatarStore.avatarStyle = avatarStyle;
}


function setAvatarId(avatarId, avatarVersion) {
    AvatarStore.setAvatarId(avatarId, avatarVersion);
}


function getBitstripsAvatar() {
    return this.characterUrl().replace(/_s\d/, '_s' + StyleUtils.getStyleId('bitstrips'));
}


function getBitmojiAvatar() {
    return this.characterUrl().replace(/_s\d/, '_s' + StyleUtils.getStyleId('bitmoji'));
}


module.exports = {
    init: init,
    setImagesPath: AvatarArt.setImagesPath,
    allOptions: allOptions,
    setOption: setOption,
    getOption: getOption,
    isSameOption: isSameOption,
    getDelta: getDelta,
    getDeltaPayload: getDeltaPayload,
    getCurrentData: getCurrentData,
    setOnChangeCallback: setOnChangeCallback,
    characterUrl: characterUrl,
    selectedValue: selectedValue,
    hasChanged: hasChanged,
    isNew: isNew,
    getImagesPath: AvatarArt.getImagesPath,
    resetDelta: resetDelta,
    isWizardCategory: isWizardCategory,
    addCategoryToWizard: addCategoryToWizard,
    setCurrentCategory: setCurrentCategory,
    getCurrentCategory: getCurrentCategory,
    rotateAvatarLeft: rotateAvatarLeft,
    rotateAvatarRight: rotateAvatarRight,
    setAvatarStyle: setAvatarStyle,
    setAvatarId: setAvatarId,
    getBitstripsAvatar: getBitstripsAvatar,
    getBitmojiAvatar: getBitmojiAvatar,
    isTranslation: isTranslation
};


}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"./art":25,"./art/category-lists":2,"./art/methods":27,"./lib/analytics":44,"./stores/avatar":48,"./utils/style":51,"lodash":52,"sprintf":53}],31:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */
var React         = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var AvatarService = require('../avatar_service');

module.exports = React.createClass({
    displayName: 'AsyncImage',

    getInitialState: function() {
        var defaultSpinner = AvatarService.getImagesPath() + 'loading-bitmoji.gif';

        return {
            imageSrc: this.props.spinner || defaultSpinner,
            loaded: false
        };
    },

    componentWillMount: function() {
        this.loadImage();
    },

    loadImage: function() {
        var img = new Image();

        img.onload = function() {
            this.setState({
                imageSrc: img.src,
                loaded: true
            });
        }.bind(this);

        img.onerror = function() {
            this.setState({
                imageSrc: AvatarService.getImagesPath() + 'avatar-retry.png'
            });
        }.bind(this);

        img.src = this.props.imageSrc;
    },

    retryImage: function(e) {
        if (this.state.loaded) { return; }

        this.loadImage();
        e.stopPropagation();
    },

    render: function() {
        /*jshint ignore:start */
        return React.DOM.img( {src:this.state.imageSrc, onClick:this.retryImage});
        /*jshint ignore:end */
    }
});



}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../avatar_service":30}],32:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */
var React           = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var AvatarDisplay   = require('./avatar_display');
var FeatureSelector = require('./feature_selector');
var deviceDetection = require('./../deviceDetection');
var AvatarService   = require('../avatar_service');

module.exports = React.createClass({
  displayName: 'AvatarBuilderView',

  getInitialState: function() {
      return {
          visible: false
      };
  },

  componentDidMount: function () {

    deviceDetection.addDeviceNameAsHtmlClass();

    // To avoid possible initial animation flickering in low end devices,
    // we hide all the content until React has resolved the virtual DOM
    setTimeout(function() {
        this.state.visible = true;
        this.setState(this.state);
    }.bind(this));
  },

  render: function () {
    var initialCategory = AvatarService.isNew() || AvatarService.isTranslation() ? 'FaceProportions' : 'Outfit';

    var styleObj = this.state.visible ? {} : { display: 'none' };

    /*jshint ignore:start */
    return (
      React.DOM.div( {className:"avatar-builder", style:styleObj}, 
        React.DOM.div( {className:"load-screen"}),
        AvatarDisplay(null),
        FeatureSelector( {initialCategory:initialCategory})
      )
      );
    /*jshint ignore:end */
  }
});

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../avatar_service":30,"./../deviceDetection":42,"./avatar_display":33,"./feature_selector":36}],33:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */
var React = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);

var AvatarService = require('../avatar_service');
var TouchableArea = require('../touch/jsxs/touchable_area');
var BuilderAnalytics = require('../lib/analytics');
var strings = require('./localizable_strings');

module.exports = React.createClass({
    displayName: 'AvatarDisplay',
    retryCounter: 0,
    previousLoaded: '',
    opacityTimeout: null,

    getInitialState: function () {
        AvatarService.setOnChangeCallback(this.characterDataChanged);

        return {
            avatarUrl: AvatarService.characterUrl(),
            offset: 0,
            locale: window.i18n.locale
        };
    },

    characterDataChanged: function () {
        this.state.avatarUrl = AvatarService.characterUrl();
        this.setState(this.state);
    },

    componentWillUpdate: function () {
        this.retryCounter = 0;
    },

    componentDidUpdate: function () {
        this.loadAvatarImage();
    },

    loadAvatarImage: function() {
        var self = this;
        var avatarLayer = this.refs.avatarLayer.getDOMNode();
        var retryLayer = this.refs.retryLayer.getDOMNode();
        var img = this.refs.avatarPreview.getDOMNode();
        var retryText = this.refs.retryText.getDOMNode();
        var retryImage = this.refs.retryImage.getDOMNode();

        // Clear img.src - this ensures we trigger an onload every time componentDidUpdate is called
        // even if the image is cached (or it's not a new img dom element)
        img.src = this.state.avatarUrl;
        retryLayer.style.display = 'none';
        retryImage.src = AvatarService.getImagesPath() + 'avatar-retry.png';


        var hideLoading = function () {
            clearTimeout(self.opacityTimeout);
            img.style.opacity = 1;
            img.className = "avatar loaded";
        };

        var showLoading = function () {
            img.className = "avatar";
            img.style.opacity = 0.5;
        };

        if (self.previousLoaded != this.state.avatarUrl) {
            clearTimeout(self.opacityTimeout);
            self.opacityTimeout = setTimeout(showLoading, 500);
        }

        img.onload = function () {
            hideLoading();
            self.retryCounter = 0;
            self.previousLoaded = img.src;
            avatarLayer.style.display = 'block';
        };

        img.onerror = function () {
            avatarLayer.style.display = 'none';
            hideLoading();

            self.retryCounter += 1;
            self.previousLoaded = '';

            if (self.retryCounter > 5) {
                avatarLayer.style.display = 'none';
                retryLayer.style.display = 'table';
                BuilderAnalytics.emitFailedAvatarDisplay(img.src);
                self.retryCounter = 0;
                return;
            }

            setTimeout(function () {
                img.src = self.state.avatarUrl;
            }, 100);
        };

        img.src = this.state.avatarUrl;
    },

    manualAvatarImageRetry: function(event) {
        if (this.previousLoaded != this.state.avatarUrl) {
            this.loadAvatarImage();
        }
    },

    render: function () {
        var tapToRetry = strings.getStringForLocale(strings.TapToRetry, this.state.locale);

        /*jshint ignore:start */
        return (
            TouchableArea( {className:"avatar-display",
            onSwipeRight:AvatarService.rotateAvatarRight,
            onSwipeLeft:AvatarService.rotateAvatarLeft,
            onTap:this.manualAvatarImageRetry}, 
                React.DOM.div( {ref:"avatarContainer", className:"avatar-container"}, 
                    React.DOM.div( {ref:"avatarLayer", className:"avatar-layer"}, 
                        React.DOM.img( {ref:"avatarPreview", className:"avatar"})
                    ),
                    React.DOM.div( {ref:"retryLayer", className:"retry-layer"}, 
                        React.DOM.div( {ref:"retryContainer", className:"retry-container"}, 
                            React.DOM.img( {ref:"retryImage", className:"retry-image"}),
                            React.DOM.div( {ref:"retryText", className:"retry-text"}, 
                                tapToRetry
                            )
                        )
                    )
                )
            )
            );
        /*jshint ignore:end */
    }
});

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../avatar_service":30,"../lib/analytics":44,"../touch/jsxs/touchable_area":49,"./localizable_strings":38}],34:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */
var React         = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var _             = require('lodash');
var AvatarStore   = require('../stores/avatar');
var AvatarService = require('../avatar_service');
var AsyncImage    = require('./async_image');


module.exports = React.createClass({
  displayName: 'AvatarStyleSelector',

  theme: 'bitmoji',

  applyStyle: function(avatarType) {
      var options = this.props.avatarData;
      AvatarStore.avatarStyle = avatarType;
      delete options.request_avatar_style;
      AvatarBuilder.start(options, this.props.domElement);
  },

  applyStyleOne: function() {
    this.applyStyle('bitstrips');
  },

  applyStyleTwo: function() {
    this.applyStyle('bitmoji');
  },

  componentWillMount: function() {
      var self = this;

      Array.prototype.slice.call(document.getElementsByTagName('link')).forEach(function(link) {
          if (link.href.match(/b4m-theme/)) {
              self.theme = 'B4M';
          }
      });
  },

  getBitmojiStyleLoader: function() {
      var loaderFile = 'loading-bitmoji-blue.gif';

      if (this.theme === 'B4M') {
          loaderFile = 'loading-b4m-blue.gif';
      }

      return AvatarService.getImagesPath() + loaderFile;
  },

  getBitstripsStyleLoader: function() {
      var loaderFile = 'loading-bitmoji-grey.gif';

      if (this.theme === 'B4M') {
          loaderFile = 'loading-b4m-grey.gif';
      }

      return AvatarService.getImagesPath() + loaderFile;
  },



  render: function() {
      if (!!this.props.avatarData.renderingHost) {
          AvatarStore.renderingHost = this.props.avatarData.renderingHost;
      }
    /*jshint ignore:start */
    return (
        React.DOM.div( {className:"avatar-style-selector"}, 
            React.DOM.div( {className:"bitclippy"}, 
                React.DOM.div( {className:"begin"}),
                React.DOM.div( {className:"end"}),
                React.DOM.div( {className:"main"}, React.DOM.span(null, "Pick your favorite avatar style."+' '+
"You can easily switch later on."))
            ),
            React.DOM.div( {className:"select-style"}, 
                React.DOM.div( {className:"cute", onClick:this.applyStyleTwo}, 
                    React.DOM.div( {className:"corner-ribbon"}, "NEW!"),
                    React.DOM.div( {className:"wrap"}, 
                        AsyncImage( {imageSrc:AvatarService.getBitmojiAvatar(), spinner:this.getBitmojiStyleLoader()} ),
                        "Bitmoji Style"
                    )
                ),
                React.DOM.div( {className:"classic", onClick:this.applyStyleOne}, 
                    React.DOM.div( {className:"wrap"}, 
                        AsyncImage( {imageSrc:AvatarService.getBitstripsAvatar(), spinner:this.getBitstripsStyleLoader()} ),
                        "Bitstrips Style"
                    )
                )
            )
        )
    );
    /*jshint ignore:end */
  }
});

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../avatar_service":30,"../stores/avatar":48,"./async_image":31,"lodash":52}],35:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */

var React = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var localize = require('../lib/localize');
var strings = require('./localizable_strings');

module.exports = React.createClass({
    displayName: 'CategoryWithTemplate',

    getInitialState: function () {
        return {
            locale: window.i18n.locale
        };
    },

    render: function() {
        var finishMessageBold = strings.getStringForLocale(strings.Finish1, this.state.locale);
        var finishMessage = strings.getStringForLocale(strings.Finish2, this.state.locale);
        var finishMessageSmall = strings.getStringForLocale(strings.Finish3, this.state.locale);

        switch(this.props.category.template) {
            /*jshint ignore:start */
            case 'finish': return (
                               React.DOM.div( {className:"finished"}, 
                               React.DOM.div( {className:"wrap"}, React.DOM.p(null, React.DOM.strong(null, finishMessageBold)),React.DOM.p(null, finishMessage),React.DOM.p( {className:"small-msg"}, finishMessageSmall)))
                           );

            default: return (React.DOM.div(null, "Template error."));
            /*jshint ignore:end */
        }
    }
});

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../lib/localize":45,"./localizable_strings":38}],36:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */
var React         = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var _             = require('lodash');
var OptionsPanel  = require('./options_panel');
var AvatarService = require('../avatar_service');
var AvatarArt     = require('../art');
var TouchableArea = require('../touch/jsxs/touchable_area');
var BuilderAnalytics = require('../lib/analytics');


var noop = function() {};


module.exports = React.createClass({
  displayName: 'FeatureSelector',

  getInitialState: function () {
    var categories = AvatarService.allOptions();
    var initialCategory = this.props.initialCategory;

    var selectedCategory = _.findIndex(categories, function(category) {
        return category.name === initialCategory;
    });

    return {
      categories: categories,
      selectedCategory: selectedCategory
    };
  },

  componentDidMount: function() {
    this.notifyCategoryChange();
  },

  currentCategory: function () {
    return this.state.categories[this.state.selectedCategory];
  },

  notifyCategoryChange: function() {
    AvatarService.setCurrentCategory(this.currentCategory().name);
    this.setState(this.state);
  },

  goToPreviousCategory: function (event) {
    var category;
    var categoryCount = this.state.categories.length-1;

    this.state.selectedCategory = Math.max(this.state.selectedCategory-1, 0);

    category = this.state.categories[this.state.selectedCategory];

    if (!AvatarService.isWizardCategory(category.name)) {
      this.goToPreviousCategory(event);
    }

    this.notifyCategoryChange();
  },

  goToNextCategory: function (event) {
    var category;
    var categoryCount = this.state.categories.length;

    this.state.selectedCategory = Math.min((this.state.selectedCategory+1), categoryCount-1);

    category = this.state.categories[this.state.selectedCategory];

    if (!AvatarService.isWizardCategory(category.name)) {
      this.goToNextCategory(event);
    }

    this.notifyCategoryChange();
  },

  categoryChanged: function (event) {
    this.state.selectedCategory = +event.target.value;
    this.notifyCategoryChange();
    BuilderAnalytics.emitSelectBoxSelection(this.state.categories[this.state.selectedCategory].name);
  },

  renderCategories: function () {
    return this.state.categories.map(function (category, idx) {
      /*jshint ignore:start */
      return  React.DOM.option( {key:idx, value:idx}, category.title);
      /*jshint ignore:end */
    });
  },

  hasntPreviousCategory: function() {
      return this.state.selectedCategory === 0;
  },

  hasntNextCategory: function() {
      return this.state.selectedCategory === this.state.categories.length-1;
  },

  handlePreviousCategory: function(analyticsEvent) {
      if (this.hasntPreviousCategory()) { return; }

      (analyticsEvent || noop)();
      this.goToPreviousCategory();
  },

  handleNextCategory: function(analyticsEvent) {
      if (this.hasntNextCategory()) { return; }

      (analyticsEvent || noop)();
      this.goToNextCategory();
  },

  handlePreviousCategoryClick: function() {
      this.handlePreviousCategory(function() { BuilderAnalytics.emitButtonNavigation('Previous'); });
  },

  handleNextCategoryClick: function() {
      this.handleNextCategory(function() { BuilderAnalytics.emitButtonNavigation('Next'); });
  },

  handlePreviousCategorySwipe: function() {
      this.handlePreviousCategory(function() { BuilderAnalytics.emitSwipeNavigation('Previous'); });
  },

  handleNextCategorySwipe: function() {
      this.handleNextCategory(function() { BuilderAnalytics.emitSwipeNavigation('Next'); });
  },

  render: function() {
    var category = this.currentCategory().title;
    var cx = React.addons.classSet;
    var prevClasses = cx({
        'prev': true,
        'disabled':  this.hasntPreviousCategory()
    });
    var nextClasses = cx({
        'next': true,
        'disabled': this.hasntNextCategory()
    });

    /*jshint ignore:start */
    return (
      React.DOM.div( {className:"options-carousel"}, 

        React.DOM.div( {className:"option-select"}, 
          React.DOM.div( {className:prevClasses, onClick:this.handlePreviousCategoryClick}, 
            React.DOM.div( {className:"arrow"})
          ),
          React.DOM.select( {onChange:this.categoryChanged, value:this.state.selectedCategory}, 
            this.renderCategories()
          ),
          React.DOM.span( {className:"option-select-overlay"}, category),
          React.DOM.div( {className:nextClasses, onClick:this.handleNextCategoryClick}, 
            React.DOM.div( {className:"arrow"})
          )
        ),


        TouchableArea(
                        {onSwipeRight:this.handlePreviousCategorySwipe,
                        onSwipeLeft:this.handleNextCategorySwipe}, 
          OptionsPanel( {category:this.currentCategory()})
        )
      )
    );
    /*jshint ignore:end */
  }
});

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../art":25,"../avatar_service":30,"../lib/analytics":44,"../touch/jsxs/touchable_area":49,"./options_panel":41,"lodash":52}],37:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */
var React                 = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var _                     = require('lodash');
var AvatarService         = require('../avatar_service');
var InitialMaleCharData   = require('../art/data/defaults/default-male');
var InitialFemaleCharData = require('../art/data/defaults/default-female');
var BuilderAnalytics      = require('../lib/analytics');
var strings               = require('./localizable_strings');

module.exports = React.createClass({
  displayName: 'GenderSelector',

  // TODO This shouldn't be in the avatar builder JS but in the imoji webview
  showBackButton: function() {
    if (window.NativeBridge) {
      window.NativeBridge.showBackButton();
    }
  },

  getInitialState: function () {
    return {
        locale: window.i18n.locale
    };
  },

  bootWithDefault: function(initialData) {
    initialData.is_new = true;
    initialData = _.extend(_.clone(this.props.avatarData), initialData);
    this.showBackButton();
    delete initialData.mode;
    AvatarBuilder.start(initialData, this.props.domElement);
  },

  setSexToMale: function () {
    var defaultMan = InitialMaleCharData;
    BuilderAnalytics.emitGenderSelected("Male");
    this.bootWithDefault(defaultMan);
  },

  setSexToFemale: function () {
    var defaultWoman = InitialFemaleCharData;
    BuilderAnalytics.emitGenderSelected("Female");
    this.bootWithDefault(defaultWoman);
  },

  render: function() {
    var maleIcon = AvatarService.getImagesPath() + 'male-icon.png';
    var maleString = strings.getStringForLocale('Male', this.state.locale);
    var femaleIcon = AvatarService.getImagesPath() + 'female-icon.png';
    var femaleString = strings.getStringForLocale('Female', this.state.locale);

    /*jshint ignore:start */
    return (
        React.DOM.div( {className:"gender-selector"}, 
          React.DOM.a( {onClick:this.setSexToFemale, className:"female"}, 
            React.DOM.span(null, femaleString),
            React.DOM.img( {src:femaleIcon})
          ),
          React.DOM.a( {onClick:this.setSexToMale, className:"male"}, 
            React.DOM.span(null, maleString),
            React.DOM.img( {src:maleIcon})
          )
        )
    );
    /*jshint ignore:end */
  }
});

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../art/data/defaults/default-female":20,"../art/data/defaults/default-male":21,"../avatar_service":30,"../lib/analytics":44,"./localizable_strings":38,"lodash":52}],38:[function(require,module,exports){
(function (global){
var localize = require('../lib/localize');

module.exports = {
    // JSX strings to localize
    // Must take `localize('x')` format to be picked up by grunt-locales
    female: localize('Female'),
    male: localize('Male'),
    Finish1: localize('Wow, looking great!'),
    Finish2: localize('Save your avatar by tapping the checkmark in the top right.'),
    Finish3: localize('(you can change your avatar and outfit at any time)'),
    TapToRetry: localize('Tap to Retry'),

    // Returns translated JSX string
    getStringForLocale: function (string, locale) {
        if (locale && global.i18n) {
            global.i18n.current = global.i18n[locale] || global.i18n.en || {};
        }
        return localize(string);
    }
};

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../lib/localize":45}],39:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */
var React         = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var TouchableArea = require('../touch/jsxs/touchable_area');


module.exports = React.createClass({
  displayName: 'Option',

  getInitialState: function() {
    return {};
  },

  optionSelected: function(event) {
    this.props.optionSelected(this.props.optionValue);
  },

  render: function() {
    var cx = React.addons.classSet;
    var classes = cx({
      'option': true,
      'option-list': this.props.title,
      'option-selected': this.props.isSelected
    });

    /*jshint ignore:start */
    return (
      React.DOM.div( {className:classes, onClick:this.optionSelected}, 
        TouchableArea( {onTap:this.optionSelected}, 
        
          !!this.props.displayUrl ?
          React.DOM.div( {className:'option-image-wrapper ' + this.props.category}, 
            React.DOM.span( {className:"selected-overlay"}),
            React.DOM.div( {className:'option-image ' + this.props.key, style:{backgroundImage: 'url(' + this.props.displayUrl + ')'}})
          ) :
          !!this.props.title ?
          React.DOM.div( {className:"option-list-item"}, 
            this.props.title
          ) :
          React.DOM.div( {className:"option-color", style:{backgroundColor: '#' + this.props.backgroundColor}}, 
            React.DOM.span( {className:"selected-overlay"})
          )
        
        )
      )
      );
    /*jshint ignore:end */
  }
});

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../touch/jsxs/touchable_area":49}],40:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */
var React         = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var OptionItem    = require('./option');
var AvatarService = require('../avatar_service');
var CategoryWithTemplate = require('./category-with-template');


module.exports = React.createClass({
  displayName: 'OptionsGrid',

  componentWillMount: function() {
    this.placeholderStyle = {
        width: '500px',
        height: '100px',
        display: 'block'
    };
  },

  optionSelected: function (selectedOption) {
    var optionName = this.props.category.name;
    AvatarService.setOption(optionName, selectedOption);
    this.forceUpdate();
  },


  render: function () {
    var self = this;
    var category = this.props.category.name;
    var template;

    /*jshint ignore:start */

    if (this.props.category.template) {
      template = CategoryWithTemplate( {category:this.props.category})
    } else {

      template = this.props.category.options.map(function (option) {
        var selectedOption = AvatarService.getOption(self.props.category.name);

        return OptionItem(  {key:option.value,
                      displayUrl:option.image,
                      optionValue:option.value,
                      optionSelected:self.optionSelected,
                      backgroundColor:option.backgroundColor,
                      category:category,
                      title:option.title,
                      isSelected:AvatarService.isSameOption(option.value, selectedOption)});
      });

      if (!template.length) {
        template = React.DOM.div( {style:this.placeholderStyle})
      }
    }

    return (
        React.DOM.div( {className:"options-grid-wrapper-scrollable"}, 
            React.DOM.div( {className:"options-grid"}, template)
        )
    );
    /*jshint ignore:end */
  }
});

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../avatar_service":30,"./category-with-template":35,"./option":39}],41:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */
var React               = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var OptionsGrid         = require('./options_grid');
var AvatarService       = require('../avatar_service');
var CategorySliderMixin = require('../mixins/category-slider-mixin');


module.exports = React.createClass({
  displayName: 'OptionsPanel',

  mixins: [CategorySliderMixin],

  componentDidUpdate: function() {
    if (this.newCategoriesWereAdded) {
      this.newCategoriesWereAdded = false;
      this.adjustWidths();
    }
  },

  render: function() {
    var self = this;
    var slideAnimation = this.getSlideAnimation(this.props.category);
    var emptyCategory = {options: []};

    var grids = this.categories.map(function(category, index) {
        category = (Math.abs(self.currentCategoryIndex-index) < 2) ? category: emptyCategory;
        /*jshint ignore:start */
        return OptionsGrid( {key:index, category:category})
        /*jshint ignore:end */
    });

    /*jshint ignore:start */
    return (
      React.DOM.div( {className:"options-container", style:slideAnimation}, 
        grids
      )
    );
    /*jshint ignore:end */
  }
});

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../avatar_service":30,"../mixins/category-slider-mixin":47,"./options_grid":40}],42:[function(require,module,exports){
var addDeviceNameAsHtmlClass = function () {
    var html = document.querySelector('html');
    var isAndroid = /Android/.test(navigator.userAgent);
    var isIos = /iPhone/.test(navigator.userAgent) || /iPad/.test(navigator.userAgent);
    var isAndroidGingerbread = /Android 2.3/.test(navigator.userAgent);

    if (isAndroid) {
        addClass('android');
    }

    if (isIos) {
        addClass('ios');
    }

    if (isAndroidGingerbread) {
        addClass('android-gingerbread');
    }

    function addClass(className) {
        html.className += ' ' + className;
    }
};

module.exports = {
    addDeviceNameAsHtmlClass: addDeviceNameAsHtmlClass
};

},{}],43:[function(require,module,exports){
(function (global){
var React             = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var _                 = require('lodash');

var AvatarService     = require('./avatar_service');
var BuilderAnalytics  = require('./lib/analytics');

var GenderSelector    = require('./components/gender_selector');
var AvatarBuilderView = require('./components/avatar_builder');
var AvatarStyleSelector = require('./components/avatar_style_selector');

// Version and other info for debugging
var meta = require('./meta');


function hideSplash() {
    _.each(document.getElementsByClassName('load-screen'), function(loadScreen) {
        loadScreen.style.display = 'none';
    });
}

module.exports = {
    start: function(options, domElement) {
        React.initializeTouchEvents(true);

        // Put current locale on the window so it's accessible to JSX templates
        global.i18n.locale = options.locale || 'en';

        if (options.mode === 'reset') {
            this.loadGenderSelector(options, domElement);
            return;
        }

        if (!options.avatar_id) {
            this.loadGenderSelector(options, domElement);
        } else if (options.request_avatar_style) {
            this.renderAvatarStyleSelection(options, domElement);
        } else {
            this.loadEditor(options, domElement);
        }
    },


    loadEditor: function(options, domElement) {
      var element = document.getElementById(domElement);
      React.unmountComponentAtNode(element);

      // Initialize avatarBuilderService Service
      AvatarService.init(options);

      React.renderComponent(AvatarBuilderView({
          avatarData: options
      }), element, hideSplash);
    },

    loadGenderSelector: function(options, domElement) {
      var element = document.getElementById(domElement);
      React.unmountComponentAtNode(element);
      AvatarService.setCurrentCategory(null);
      React.renderComponent(GenderSelector({
        avatarData:options,
        domElement:domElement
      }), element, hideSplash);
    },

    renderAvatarStyleSelection: function(options, domElement) {
        var element = document.getElementById(domElement);
        React.unmountComponentAtNode(element);

        AvatarService.setAvatarId(options.avatar_id, options.avatar_version);
        AvatarService.setCurrentCategory(null);
        React.renderComponent(AvatarStyleSelector({
            avatarData: options,
            domElement: domElement
        }), element, hideSplash);
    },

    sendDeltaAnalytics: BuilderAnalytics.emitDeltaSelections,

    saveAvatar: function() {
      throw new Error('You need to implement a saveAvatar method');
    },

    service: AvatarService,
    _meta: meta
};


}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"./avatar_service":30,"./components/avatar_builder":32,"./components/avatar_style_selector":34,"./components/gender_selector":37,"./lib/analytics":44,"./meta":46,"lodash":52}],44:[function(require,module,exports){
var _       = require('lodash');
var sprintf = require('sprintf');

var AvatarStore = require('../stores/avatar');
var AvatarArtTones = require('../art/tones');
var AvatarArtHead = require('../art/head');
var AvatarArtBody = require('../art/body');


var callback = function(action, label) {
    console.log(sprintf('Action: %s, Label: %s', action, label));
};


function setCallback(cb) {
    callback = cb;
}


function sendEvent(action, label) {
    callback(action, label);
}


function emitOptionSelected(optionName, value) {
    switch(optionName) {
        case 'HairStyle':
            value = sprintf('hairstyle_%s', value[0]);
            break;
        case 'BeardType':
        case 'LineCombos':
            value = value.join('_');
            break;
        case 'MouthType':
            value = value[0];
            break;
    }

    sendEvent(optionName + '_Selected', value);
}


function emitButtonNavigation(value) {
    sendEvent('Button_Navigation', value);
}


function emitSwipeNavigation(value) {
    sendEvent('Swipe_Navigation', value);
}


function emitSelectBoxSelection(value) {
    sendEvent('SelectBox_Selection', value);
}


function emitGenderSelected(value) {
    sendEvent('Gender_Selected', value);
}


function isSet(value) {
    return (typeof value !== "undefined");
}


function emitRotateAvatarLeft(category) {
    sendEvent('RotateAvatar_Left', category);
}


function emitRotateAvatarRight(category) {
    sendEvent('RotateAvatar_Right', category);
}


function emitDeltaSelections() {
    var delta = AvatarStore.delta;

    var deltaColours = {
        'SkinTone': AvatarArtTones.SKIN_TONE,
        'HairTone': AvatarArtTones.HAIR_TONE,
        'PupilTone': AvatarArtTones.PUPIL_TONE,
        'BlushTone': AvatarArtTones.BLUSH_TONE,
        'EyeshadowTone': AvatarArtTones.EYESHADOW_TONE,
        'LipstickTone': AvatarArtTones.LIP_TONE
    };

    var deltaHead = {
        'JawType': AvatarArtHead.JAW_TYPE,
        'EyeBrowType': AvatarArtHead.EYEBROW_TYPE,
        'EyeType': AvatarArtHead.EYE_TYPE,
        'EyelashType': AvatarArtHead.EYELASH_TYPE,
        'PupilType': AvatarArtHead.PUPIL_TYPE,
        'NoseType': AvatarArtHead.NOSE_TYPE,
        'MouthType': AvatarArtHead.MOUTH_TYPE,
        'EarType': AvatarArtHead.EAR_TYPE,
        'EarringType': AvatarArtHead.EARRING_TYPE,
        'BeardType': AvatarArtHead.BEARD_TYPE,
        'EyeDetails': AvatarArtHead.EYE_DETAILS,
        'CheekDetails': AvatarArtHead.CHEEK_DETAILS,
        'FaceLines': AvatarArtHead.FACE_LINES,
        'Glasses': AvatarArtHead.GLASSES,
        'Hat': AvatarArtHead.HAT
    };

    var deltaBody = {
        'BodyHeight': AvatarArtBody.BODY_HEIGHT,
        'BodyType': AvatarArtBody.BODY_TYPE,
        'BreastType': AvatarArtBody.BREAST_TYPE
    };

    _.each(deltaColours, function(deltaKey, actionKey) {
        var getter = 'get' + actionKey;
        if (isSet(delta.colours[deltaKey]) && !!getter) {
            sendEvent(actionKey + '_Saved', AvatarArtTones[getter]());
        }
    });

    _.each(deltaHead, function(deltaKey, actionKey) {
        var getter = 'get' + actionKey;
        if (isSet(delta.pd2[deltaKey]) && !!getter) {
            sendEvent(actionKey + '_Saved', AvatarArtHead[getter]());
        }
    });

    _.each(deltaBody, function(deltaKey, actionKey) {
        var getter = 'get' + actionKey;
        if (isSet(delta.body[deltaKey]) && !!getter) {
            sendEvent(actionKey + '_Saved', AvatarArtBody[getter]());
        }
    });

    if (isSet(delta.outfit)) {
        sendEvent('Outfit_Saved', delta.outfit);
    }

    if (isSet(delta.proportion)) {
        sendEvent('FaceProportions_Saved', delta.proportion);
    }

    if (isSet(delta.pd2.cranium)) {
        sendEvent('HairStyle_Saved', delta.proportion);
    }


    // Special events for new users only
    if (AvatarStore.isNew) {
        if (AvatarStore.sex === 1) {
            manageSpecialEventsForNewMale(delta);
        } else if (AvatarStore.sex === 2) {
            manageSpecialEventsForNewFemale(delta);
        }
    }
}


function emitNewUserSkips(category) {
    sendEvent('NewUser_Skips', category);
}

function emitFailedAvatarDisplay (url) {
    sendEvent('avatar_display_failed', url);
}

function checkUserSkipsCategory(category, delta) {
    var userSetTheCategory = false;

    if (category === 'FaceProportions') { userSetTheCategory = isSet(delta.proportion); }
    else if (category === 'SkinTone') { userSetTheCategory = isSet(delta.colours[AvatarArtTones.SKIN_TONE]); }
    else if (category === 'HairStyle') { userSetTheCategory = isSet(delta.pd2.cranium); }
    else if (category === 'HairTone') { userSetTheCategory = isSet(delta.colours[AvatarArtTones.HAIR_TONE]); }
    else if (category === 'JawType') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.JAW_TYPE]); }
    else if (category === 'EyeBrowType') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.EYEBROW_TYPE]); }
    else if (category === 'EyeType') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.EYE_TYPE]); }
    else if (category === 'EyelashType') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.EYELASH_TYPE]); }
    else if (category === 'PupilType') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.PUPIL_TYPE]); }
    else if (category === 'PupilTone') { userSetTheCategory = isSet(delta.colours[AvatarArtTones.PUPIL_TONE]); }
    else if (category === 'NoseType') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.NOSE_TYPE]); }
    else if (category === 'MouthType') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.MOUTH_TYPE]); }
    else if (category === 'EarType') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.EAR_TYPE]); }
    else if (category === 'EarringType') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.EARRING_TYPE]); }
    else if (category === 'LineCombos') {
        userSetTheCategory = isSet(delta.pd2[AvatarArtHead.EYE_DETAILS]) ||
                             isSet(delta.pd2[AvatarArtHead.CHEEK_DETAILS]) ||
                             isSet(delta.pd2[AvatarArtHead.FACE_LINES]);
    }
    else if (category === 'BeardType') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.BEARD_TYPE]); }
    else if (category === 'Glasses') { userSetTheCategory = isSet(delta.pd2[AvatarArtHead.GLASSES]); }
    else if (category === 'BodyHeight') { userSetTheCategory = isSet(delta.body[AvatarArtBody.BODY_HEIGHT]); }
    else if (category === 'BodyType') { userSetTheCategory = isSet(delta.body[AvatarArtBody.BODY_TYPE]); }
    else if (category === 'BreastType') { userSetTheCategory = isSet(delta.body[AvatarArtBody.BREAST_TYPE]); }
    else if (category === 'BlushTone') { userSetTheCategory = isSet(delta.colours[AvatarArtTones.BLUSH_TONE]); }
    else if (category === 'EyeshadowTone') { userSetTheCategory = isSet(delta.colours[AvatarArtTones.EYESHADOW_TONE]); }
    else if (category === 'LipstickTone') { userSetTheCategory = isSet(delta.colours[AvatarArtTones.LIP_TONE]); }
    else if (category === 'Outfit') { userSetTheCategory = isSet(delta.outfit); }

    if (!userSetTheCategory) {
        emitNewUserSkips(category);
    }
}


function manageSpecialEventsForNewMale(delta) {
    sendEvent('Gender_Saved', 'Male');

    checkUserSkipsCategory('FaceProportions', delta);
    checkUserSkipsCategory('SkinTone', delta);
    checkUserSkipsCategory('HairTone', delta);
    checkUserSkipsCategory('HairStyle', delta);
    checkUserSkipsCategory('JawType', delta);
    checkUserSkipsCategory('EyeBrowType', delta);
    checkUserSkipsCategory('EyeType', delta);
    checkUserSkipsCategory('PupilType', delta);
    checkUserSkipsCategory('PupilTone', delta);
    checkUserSkipsCategory('NoseType', delta);
    checkUserSkipsCategory('MouthType', delta);
    checkUserSkipsCategory('EarType', delta);
    checkUserSkipsCategory('LineCombos', delta);
    checkUserSkipsCategory('BeardType', delta);
    checkUserSkipsCategory('Glasses', delta);
    checkUserSkipsCategory('BodyHeight', delta);
    checkUserSkipsCategory('BodyType', delta);
    checkUserSkipsCategory('Outfit', delta);
}


function manageSpecialEventsForNewFemale(delta) {
    sendEvent('Gender_Saved', 'Female');

    checkUserSkipsCategory('FaceProportions', delta);
    checkUserSkipsCategory('SkinTone', delta);
    checkUserSkipsCategory('HairTone', delta);
    checkUserSkipsCategory('HairStyle', delta);
    checkUserSkipsCategory('JawType', delta);
    checkUserSkipsCategory('EyeBrowType', delta);
    checkUserSkipsCategory('EyeType', delta);
    checkUserSkipsCategory('EyelashType', delta);
    checkUserSkipsCategory('PupilType', delta);
    checkUserSkipsCategory('PupilTone', delta);
    checkUserSkipsCategory('NoseType', delta);
    checkUserSkipsCategory('MouthType', delta);
    checkUserSkipsCategory('EarType', delta);
    checkUserSkipsCategory('EarringType', delta);
    checkUserSkipsCategory('LineCombos', delta);
    checkUserSkipsCategory('BlushTone', delta);
    checkUserSkipsCategory('EyeshadowTone', delta);
    checkUserSkipsCategory('LipstickTone', delta);
    checkUserSkipsCategory('Glasses', delta);
    checkUserSkipsCategory('BodyHeight', delta);
    checkUserSkipsCategory('BodyType', delta);
    checkUserSkipsCategory('BreastType', delta);
    checkUserSkipsCategory('Outfit', delta);

}

module.exports = {
    emitOptionSelected: emitOptionSelected,
    emitButtonNavigation: emitButtonNavigation,
    emitSwipeNavigation: emitSwipeNavigation,
    emitSelectBoxSelection: emitSelectBoxSelection,
    emitDeltaSelections: emitDeltaSelections,
    emitGenderSelected: emitGenderSelected,
    emitRotateAvatarLeft: emitRotateAvatarLeft,
    emitRotateAvatarRight: emitRotateAvatarRight,
    emitFailedAvatarDisplay: emitFailedAvatarDisplay,
    setCallback: setCallback
};

},{"../art/body":1,"../art/head":24,"../art/tones":29,"../stores/avatar":48,"lodash":52,"sprintf":53}],45:[function(require,module,exports){
(function (global){
module.exports = function localize(key, data) {
	var w = global || window || {};
	w.i18n = w.i18n || {};
	w.i18n.current = w.i18n.current || {};
	
  var func = w.i18n.current[key];
  if (func) {
      return func(data);
  }
  return key;
};
}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{}],46:[function(require,module,exports){
module.exports = {
    version: "Unknown"
};

},{}],47:[function(require,module,exports){
var _             = require('lodash');

var AvatarArt     = require('../art');
var AvatarService = require('../avatar_service');


module.exports = {

    /* An array storing the categories that are part of the wizard */
    categories: [],

    /* An array storing all the categories available in the builder */
    allCategories: [],

    widthPerCategory: 360,

    currentCategoryIndex: null,

    newCategoriesWereAdded: false,

    lastCategory: {},

    componentWillMount: function() {
        var currentCategory = AvatarService.getCurrentCategory();
        this.allCategories = AvatarService.allOptions();

        this.categories = this.getWizardCategories();

        this.currentCategoryIndex = _.findIndex(this.categories, function(category) {
            return category.name === currentCategory;
        });
    },

    adjustWidths: function() {
        var node = this.getDOMNode();

        this.widthPerCategory = window.innerWidth;

        // Set the width of each category to the width of the device
        for(var i=0, length=node.childNodes.length ; i<length ; i++) {
            node.childNodes[i].style.width = this.widthPerCategory + 'px';
        }

        // Set the size of the container to the device width times the number of categories
        node.style.width = this.categories.length * this.widthPerCategory + 'px';
    },

    componentDidMount: function() {
        this.adjustWidths();
    },

    getWizardCategories: function() {
        var lastCategory = this.lastCategory;

        return this.allCategories.filter(function(category) {
            return AvatarService.isWizardCategory(category) || lastCategory.title === category.title;
        });
    },

    getSlideAnimation: function(category) {
        var currentWizardSize;

        // Do not animate if the category didn't change
        if (!category) {
            return;
        }

        // Recalculate the wizard categories
        // If the number of categories changed we need to schedule a layout widths recalculation
        currentWizardSize = this.categories.length;
        this.categories = this.getWizardCategories();
        if (currentWizardSize != this.categories.length) {
            this.newCategoriesWereAdded = true;
        }

        this.currentCategoryIndex = null;

        for (var i=0 ; i<this.categories.length ; i++) {
            if (this.categories[i].title === category.title) {
                this.currentCategoryIndex = i;
                break;
            }
        }

        // A category not included in the wizard has been selected
        if (this.currentCategoryIndex === null) {
            this.currentCategoryIndex = this.insertNewCategory(category);
        }

        this.lastCategory = category;

        return {
            WebkitTransform: 'translate3d(' + this.currentCategoryIndex * (-this.widthPerCategory) + 'px, 0, 0)'
        };
    },

    insertNewCategory: function(category) {
        var previousCategory;
        var previousCategoryIndex = -1;

        // Find the category in the whole list
         var categoryIndex = _.findIndex(this.allCategories, function(cat) {
            return cat.title === category.title;
        });


         var getCategoryIndex = function(categories, category) {
            if (!categories) { return -1; }
            return _.findIndex(categories, function(cat) {
                return cat.title === category.title;
            });
        };

        // Get the previous category belonging to the wizard so
        // we know where to insert the new one
        do {
            categoryIndex--;
            previousCategory = this.allCategories[categoryIndex];
            previousCategoryIndex = getCategoryIndex(this.categories, previousCategory);
        } while(!!previousCategory && previousCategoryIndex === -1);

        previousCategoryIndex++;

        this.insertCategoryAtPosition(category, previousCategoryIndex);

        return previousCategoryIndex;
    },

    insertCategoryAtPosition: function(newCategory, referenceIndex) {
        this.categories.splice(referenceIndex, 0, newCategory);

        // TODO: Once we have the stores and the dispatcher we should have a single
        // source of truth (right now here and avatarCategoryList)
        AvatarService.addCategoryToWizard(newCategory, referenceIndex);

        this.newCategoriesWereAdded = true;
    }
};

},{"../art":25,"../avatar_service":30,"lodash":52}],48:[function(require,module,exports){

function MutableState() {
    this.avatarId = null;
    this.avatarVersion = null;
    this.sex = null;
    this.currentData = {
        colours: {},
        pd2: {},
        body: {},
        outfit: {}
    };


    // Staging
    this.renderingHost = 'http://render.staging.bs.ht';
    this.characterServiceHost = 'http://devbox:82/character';

    // Production
    // this.renderingHost = 'http://d2ska10063f6mg.cloudfront.net';

    this.delta = {};

    this.isNew = false;

    this.customCategory = null;
    this.customRotation = 0;

    this.userSelectionHash = {};

    this.characterDataChangeCallback = function() {};

    this.hairStyles = {
        data: [],
        options: []
    };

    this.avatarStyle = 'bitstrips';

    // This field is set to true by the character_service response
    // If an avatar has been translated and not saved by the user,
    // the builder will show the whole wizard
    this.translated = false;
}


/**
 * Sets the avatar Id in the mutable state and, optionally, the version
 */
MutableState.prototype.setAvatarId = function(id, version) {
    this.avatarId = id;

    if (!!version) { this.avatarVersion = version; }
};


module.exports = new MutableState();

},{}],49:[function(require,module,exports){
(function (global){
/** @jsx React.DOM */
var React     = (typeof window !== "undefined" ? window.React : typeof global !== "undefined" ? global.React : null);
var TouchMixin = require('../touch_mixin');


module.exports = React.createClass({
    displayName: 'TouchableArea',

	mixins: [TouchMixin],

    componentDidMount: function() {
        if (this.props.onDragLeft || this.props.onDragRight) {
            this.dragRecognizer = true;
        }

        if (this.props.onSwipeLeft || this.props.onSwipeRight) {
            this.swipeRecognizer = true;
        }
    },

	emitTap: function(event) {
		if (this.props.onTap) {
			this.props.onTap(event);
		}
	},

    emitSwipeLeft: function(event) {
        if (this.props.onSwipeLeft) {
            this.props.onSwipeLeft(event);
        }
    },

    emitSwipeRight: function(event) {
        if (this.props.onSwipeRight) {
            this.props.onSwipeRight(event);
        }
    },

    emitDragLeft: function(event) {
        if (this.props.onDragLeft) {
            this.props.onDragLeft(event);
        }
    },

    emitDragRight: function(event) {
        if (this.props.onDragRight) {
            this.props.onDragRight(event);
        }
    },

    emitDragStart: function(event) {
        if (this.props.onDragStart) {
            this.props.onDragStart(event);
        }
    },

    emitDragEnd: function(event) {
        if (this.props.onDragEnd) {
            this.props.onDragEnd(event);
        }
    },

	render: function() {
        /*jshint ignore:start */
		return (
			React.DOM.div( {className:this.props.className, onTouchStart:this.onStart, onTouchMove:this.onMove, onTouchEnd:this.onEnd, onTouchCancel:this.onCancel}, 
				this.props.children
			)
		);
        /*jshint ignore:end */
	}
});

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{"../touch_mixin":50}],50:[function(require,module,exports){
module.exports = {

    // Enables disabled horizontal swipe recogonition
    horizontalSwipeThreshold: 10,
    verticalSwipeThreshold: 10,
    swipeRecognizer: false,


    // Enables/disabled horizontal drag recognition
    horizontalDragThreshold: 5,
    verticalDragThreshold: 20,
    dragRecognizer: false,

    isTap: function(touches) {
        var initialX;
        var initialY;
        var THRESHOLD = 5;

        if (!touches.length) { return true; }

        initialX = touches[0].x;
        initialY = touches[0].y;

        for (var i=0;  i < touches.length; i++) {
            if (Math.abs(initialX - touches[i].x) > THRESHOLD) { return false; }
            if (Math.abs(initialY - touches[i].y) > THRESHOLD) { return false; }
        }

        return true;
    },

    getTouchableAreaPosition: function() {
        var node = this.getDOMNode();
        return node.getBoundingClientRect().top;
    },

    onStart: function(event) {
        this.touchableAreaStartPosition = this.getTouchableAreaPosition();
        this.touches = [];
        this.startX = event.changedTouches[0].clientX;
        this.startY = event.changedTouches[0].clientY;

        if (this.dragRecognizer) {
            this.emitDragStart({ x: this.startX, y: this.startY });
        }
    },

    onMove: function(event) {
        this.touches.push({
            x: event.changedTouches[0].screenX,
            y: event.changedTouches[0].screenY
        });


        // Drag/Swipe detection
        if (!this.startX) { return; }

        var posX = event.changedTouches[0].clientX;
        var posY = event.changedTouches[0].clientY;

        if (this.dragRecognizer) {
            // it's not a horizontal drag because the vertical threshold was reached
            if (Math.abs(posY - this.startY) > this.verticalDragThreshold) {
                return;
            }


            if (posX - this.startX > this.horizontalDragThreshold) {
                this.startX = posX;
                this.emitDragRight({ x: posX, y: posY });
                event.preventDefault();
            } else if (posX - this.startX < -this.horizontalDragThreshold) {
                this.startX = posX;
                this.emitDragLeft({ x: posX, y: posY });
                event.preventDefault();
            }
        }

        if (this.swipeRecognizer) {
            // it's not a swipe because the vertical threshold was reached
            if (Math.abs(posY - this.startY) > this.verticalSwipeThreshold) {
                return;
            }

            if (posX - this.startX > this.horizontalSwipeThreshold) {
                this.startX = null;
                this.emitSwipeRight(event);
                event.preventDefault();
            } else if (posX - this.startX < -this.horizontalSwipeThreshold) {
                this.startX = null;
                this.emitSwipeLeft(event);
                event.preventDefault();
            }
        }

    },

    onEnd: function(event) {
        var touchableAreaMoved = this.getTouchableAreaPosition() !== this.touchableAreaStartPosition;

        if (!touchableAreaMoved && this.isTap(this.touches)) {
            this.emitTap(event);
        }

        if (this.dragRecognizer) {
            this.emitDragEnd({
                x: event.changedTouches[0].clientX,
                y: event.changedTouches[0].clientY
            });
        }

    },

    onCancel: function(event) {
    }
};

},{}],51:[function(require,module,exports){
function getStyleId(avatarStyleString) {
    if (avatarStyleString === 'bitstrips') { return 1; }
    if (avatarStyleString === 'bitmoji') { return 4; }

    throw new Error('Invalid avatar style: ' + avatarStyleString);
}

module.exports = {
    getStyleId: getStyleId
};

},{}],52:[function(require,module,exports){
(function (global){
/**
 * @license
 * Lo-Dash 2.4.1 (Custom Build) <http://lodash.com/>
 * Build: `lodash modern -o ./dist/lodash.js`
 * Copyright 2012-2013 The Dojo Foundation <http://dojofoundation.org/>
 * Based on Underscore.js 1.5.2 <http://underscorejs.org/LICENSE>
 * Copyright 2009-2013 Jeremy Ashkenas, DocumentCloud and Investigative Reporters & Editors
 * Available under MIT license <http://lodash.com/license>
 */
;(function() {

  /** Used as a safe reference for `undefined` in pre ES5 environments */
  var undefined;

  /** Used to pool arrays and objects used internally */
  var arrayPool = [],
      objectPool = [];

  /** Used to generate unique IDs */
  var idCounter = 0;

  /** Used to prefix keys to avoid issues with `__proto__` and properties on `Object.prototype` */
  var keyPrefix = +new Date + '';

  /** Used as the size when optimizations are enabled for large arrays */
  var largeArraySize = 75;

  /** Used as the max size of the `arrayPool` and `objectPool` */
  var maxPoolSize = 40;

  /** Used to detect and test whitespace */
  var whitespace = (
    // whitespace
    ' \t\x0B\f\xA0\ufeff' +

    // line terminators
    '\n\r\u2028\u2029' +

    // unicode category "Zs" space separators
    '\u1680\u180e\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000'
  );

  /** Used to match empty string literals in compiled template source */
  var reEmptyStringLeading = /\b__p \+= '';/g,
      reEmptyStringMiddle = /\b(__p \+=) '' \+/g,
      reEmptyStringTrailing = /(__e\(.*?\)|\b__t\)) \+\n'';/g;

  /**
   * Used to match ES6 template delimiters
   * http://people.mozilla.org/~jorendorff/es6-draft.html#sec-literals-string-literals
   */
  var reEsTemplate = /\$\{([^\\}]*(?:\\.[^\\}]*)*)\}/g;

  /** Used to match regexp flags from their coerced string values */
  var reFlags = /\w*$/;

  /** Used to detected named functions */
  var reFuncName = /^\s*function[ \n\r\t]+\w/;

  /** Used to match "interpolate" template delimiters */
  var reInterpolate = /<%=([\s\S]+?)%>/g;

  /** Used to match leading whitespace and zeros to be removed */
  var reLeadingSpacesAndZeros = RegExp('^[' + whitespace + ']*0+(?=.$)');

  /** Used to ensure capturing order of template delimiters */
  var reNoMatch = /($^)/;

  /** Used to detect functions containing a `this` reference */
  var reThis = /\bthis\b/;

  /** Used to match unescaped characters in compiled string literals */
  var reUnescapedString = /['\n\r\t\u2028\u2029\\]/g;

  /** Used to assign default `context` object properties */
  var contextProps = [
    'Array', 'Boolean', 'Date', 'Function', 'Math', 'Number', 'Object',
    'RegExp', 'String', '_', 'attachEvent', 'clearTimeout', 'isFinite', 'isNaN',
    'parseInt', 'setTimeout'
  ];

  /** Used to make template sourceURLs easier to identify */
  var templateCounter = 0;

  /** `Object#toString` result shortcuts */
  var argsClass = '[object Arguments]',
      arrayClass = '[object Array]',
      boolClass = '[object Boolean]',
      dateClass = '[object Date]',
      funcClass = '[object Function]',
      numberClass = '[object Number]',
      objectClass = '[object Object]',
      regexpClass = '[object RegExp]',
      stringClass = '[object String]';

  /** Used to identify object classifications that `_.clone` supports */
  var cloneableClasses = {};
  cloneableClasses[funcClass] = false;
  cloneableClasses[argsClass] = cloneableClasses[arrayClass] =
  cloneableClasses[boolClass] = cloneableClasses[dateClass] =
  cloneableClasses[numberClass] = cloneableClasses[objectClass] =
  cloneableClasses[regexpClass] = cloneableClasses[stringClass] = true;

  /** Used as an internal `_.debounce` options object */
  var debounceOptions = {
    'leading': false,
    'maxWait': 0,
    'trailing': false
  };

  /** Used as the property descriptor for `__bindData__` */
  var descriptor = {
    'configurable': false,
    'enumerable': false,
    'value': null,
    'writable': false
  };

  /** Used to determine if values are of the language type Object */
  var objectTypes = {
    'boolean': false,
    'function': true,
    'object': true,
    'number': false,
    'string': false,
    'undefined': false
  };

  /** Used to escape characters for inclusion in compiled string literals */
  var stringEscapes = {
    '\\': '\\',
    "'": "'",
    '\n': 'n',
    '\r': 'r',
    '\t': 't',
    '\u2028': 'u2028',
    '\u2029': 'u2029'
  };

  /** Used as a reference to the global object */
  var root = (objectTypes[typeof window] && window) || this;

  /** Detect free variable `exports` */
  var freeExports = objectTypes[typeof exports] && exports && !exports.nodeType && exports;

  /** Detect free variable `module` */
  var freeModule = objectTypes[typeof module] && module && !module.nodeType && module;

  /** Detect the popular CommonJS extension `module.exports` */
  var moduleExports = freeModule && freeModule.exports === freeExports && freeExports;

  /** Detect free variable `global` from Node.js or Browserified code and use it as `root` */
  var freeGlobal = objectTypes[typeof global] && global;
  if (freeGlobal && (freeGlobal.global === freeGlobal || freeGlobal.window === freeGlobal)) {
    root = freeGlobal;
  }

  /*--------------------------------------------------------------------------*/

  /**
   * The base implementation of `_.indexOf` without support for binary searches
   * or `fromIndex` constraints.
   *
   * @private
   * @param {Array} array The array to search.
   * @param {*} value The value to search for.
   * @param {number} [fromIndex=0] The index to search from.
   * @returns {number} Returns the index of the matched value or `-1`.
   */
  function baseIndexOf(array, value, fromIndex) {
    var index = (fromIndex || 0) - 1,
        length = array ? array.length : 0;

    while (++index < length) {
      if (array[index] === value) {
        return index;
      }
    }
    return -1;
  }

  /**
   * An implementation of `_.contains` for cache objects that mimics the return
   * signature of `_.indexOf` by returning `0` if the value is found, else `-1`.
   *
   * @private
   * @param {Object} cache The cache object to inspect.
   * @param {*} value The value to search for.
   * @returns {number} Returns `0` if `value` is found, else `-1`.
   */
  function cacheIndexOf(cache, value) {
    var type = typeof value;
    cache = cache.cache;

    if (type == 'boolean' || value == null) {
      return cache[value] ? 0 : -1;
    }
    if (type != 'number' && type != 'string') {
      type = 'object';
    }
    var key = type == 'number' ? value : keyPrefix + value;
    cache = (cache = cache[type]) && cache[key];

    return type == 'object'
      ? (cache && baseIndexOf(cache, value) > -1 ? 0 : -1)
      : (cache ? 0 : -1);
  }

  /**
   * Adds a given value to the corresponding cache object.
   *
   * @private
   * @param {*} value The value to add to the cache.
   */
  function cachePush(value) {
    var cache = this.cache,
        type = typeof value;

    if (type == 'boolean' || value == null) {
      cache[value] = true;
    } else {
      if (type != 'number' && type != 'string') {
        type = 'object';
      }
      var key = type == 'number' ? value : keyPrefix + value,
          typeCache = cache[type] || (cache[type] = {});

      if (type == 'object') {
        (typeCache[key] || (typeCache[key] = [])).push(value);
      } else {
        typeCache[key] = true;
      }
    }
  }

  /**
   * Used by `_.max` and `_.min` as the default callback when a given
   * collection is a string value.
   *
   * @private
   * @param {string} value The character to inspect.
   * @returns {number} Returns the code unit of given character.
   */
  function charAtCallback(value) {
    return value.charCodeAt(0);
  }

  /**
   * Used by `sortBy` to compare transformed `collection` elements, stable sorting
   * them in ascending order.
   *
   * @private
   * @param {Object} a The object to compare to `b`.
   * @param {Object} b The object to compare to `a`.
   * @returns {number} Returns the sort order indicator of `1` or `-1`.
   */
  function compareAscending(a, b) {
    var ac = a.criteria,
        bc = b.criteria,
        index = -1,
        length = ac.length;

    while (++index < length) {
      var value = ac[index],
          other = bc[index];

      if (value !== other) {
        if (value > other || typeof value == 'undefined') {
          return 1;
        }
        if (value < other || typeof other == 'undefined') {
          return -1;
        }
      }
    }
    // Fixes an `Array#sort` bug in the JS engine embedded in Adobe applications
    // that causes it, under certain circumstances, to return the same value for
    // `a` and `b`. See https://github.com/jashkenas/underscore/pull/1247
    //
    // This also ensures a stable sort in V8 and other engines.
    // See http://code.google.com/p/v8/issues/detail?id=90
    return a.index - b.index;
  }

  /**
   * Creates a cache object to optimize linear searches of large arrays.
   *
   * @private
   * @param {Array} [array=[]] The array to search.
   * @returns {null|Object} Returns the cache object or `null` if caching should not be used.
   */
  function createCache(array) {
    var index = -1,
        length = array.length,
        first = array[0],
        mid = array[(length / 2) | 0],
        last = array[length - 1];

    if (first && typeof first == 'object' &&
        mid && typeof mid == 'object' && last && typeof last == 'object') {
      return false;
    }
    var cache = getObject();
    cache['false'] = cache['null'] = cache['true'] = cache['undefined'] = false;

    var result = getObject();
    result.array = array;
    result.cache = cache;
    result.push = cachePush;

    while (++index < length) {
      result.push(array[index]);
    }
    return result;
  }

  /**
   * Used by `template` to escape characters for inclusion in compiled
   * string literals.
   *
   * @private
   * @param {string} match The matched character to escape.
   * @returns {string} Returns the escaped character.
   */
  function escapeStringChar(match) {
    return '\\' + stringEscapes[match];
  }

  /**
   * Gets an array from the array pool or creates a new one if the pool is empty.
   *
   * @private
   * @returns {Array} The array from the pool.
   */
  function getArray() {
    return arrayPool.pop() || [];
  }

  /**
   * Gets an object from the object pool or creates a new one if the pool is empty.
   *
   * @private
   * @returns {Object} The object from the pool.
   */
  function getObject() {
    return objectPool.pop() || {
      'array': null,
      'cache': null,
      'criteria': null,
      'false': false,
      'index': 0,
      'null': false,
      'number': null,
      'object': null,
      'push': null,
      'string': null,
      'true': false,
      'undefined': false,
      'value': null
    };
  }

  /**
   * Releases the given array back to the array pool.
   *
   * @private
   * @param {Array} [array] The array to release.
   */
  function releaseArray(array) {
    array.length = 0;
    if (arrayPool.length < maxPoolSize) {
      arrayPool.push(array);
    }
  }

  /**
   * Releases the given object back to the object pool.
   *
   * @private
   * @param {Object} [object] The object to release.
   */
  function releaseObject(object) {
    var cache = object.cache;
    if (cache) {
      releaseObject(cache);
    }
    object.array = object.cache = object.criteria = object.object = object.number = object.string = object.value = null;
    if (objectPool.length < maxPoolSize) {
      objectPool.push(object);
    }
  }

  /**
   * Slices the `collection` from the `start` index up to, but not including,
   * the `end` index.
   *
   * Note: This function is used instead of `Array#slice` to support node lists
   * in IE < 9 and to ensure dense arrays are returned.
   *
   * @private
   * @param {Array|Object|string} collection The collection to slice.
   * @param {number} start The start index.
   * @param {number} end The end index.
   * @returns {Array} Returns the new array.
   */
  function slice(array, start, end) {
    start || (start = 0);
    if (typeof end == 'undefined') {
      end = array ? array.length : 0;
    }
    var index = -1,
        length = end - start || 0,
        result = Array(length < 0 ? 0 : length);

    while (++index < length) {
      result[index] = array[start + index];
    }
    return result;
  }

  /*--------------------------------------------------------------------------*/

  /**
   * Create a new `lodash` function using the given context object.
   *
   * @static
   * @memberOf _
   * @category Utilities
   * @param {Object} [context=root] The context object.
   * @returns {Function} Returns the `lodash` function.
   */
  function runInContext(context) {
    // Avoid issues with some ES3 environments that attempt to use values, named
    // after built-in constructors like `Object`, for the creation of literals.
    // ES5 clears this up by stating that literals must use built-in constructors.
    // See http://es5.github.io/#x11.1.5.
    context = context ? _.defaults(root.Object(), context, _.pick(root, contextProps)) : root;

    /** Native constructor references */
    var Array = context.Array,
        Boolean = context.Boolean,
        Date = context.Date,
        Function = context.Function,
        Math = context.Math,
        Number = context.Number,
        Object = context.Object,
        RegExp = context.RegExp,
        String = context.String,
        TypeError = context.TypeError;

    /**
     * Used for `Array` method references.
     *
     * Normally `Array.prototype` would suffice, however, using an array literal
     * avoids issues in Narwhal.
     */
    var arrayRef = [];

    /** Used for native method references */
    var objectProto = Object.prototype;

    /** Used to restore the original `_` reference in `noConflict` */
    var oldDash = context._;

    /** Used to resolve the internal [[Class]] of values */
    var toString = objectProto.toString;

    /** Used to detect if a method is native */
    var reNative = RegExp('^' +
      String(toString)
        .replace(/[.*+?^${}()|[\]\\]/g, '\\$&')
        .replace(/toString| for [^\]]+/g, '.*?') + '$'
    );

    /** Native method shortcuts */
    var ceil = Math.ceil,
        clearTimeout = context.clearTimeout,
        floor = Math.floor,
        fnToString = Function.prototype.toString,
        getPrototypeOf = isNative(getPrototypeOf = Object.getPrototypeOf) && getPrototypeOf,
        hasOwnProperty = objectProto.hasOwnProperty,
        push = arrayRef.push,
        setTimeout = context.setTimeout,
        splice = arrayRef.splice,
        unshift = arrayRef.unshift;

    /** Used to set meta data on functions */
    var defineProperty = (function() {
      // IE 8 only accepts DOM elements
      try {
        var o = {},
            func = isNative(func = Object.defineProperty) && func,
            result = func(o, o, o) && func;
      } catch(e) { }
      return result;
    }());

    /* Native method shortcuts for methods with the same name as other `lodash` methods */
    var nativeCreate = isNative(nativeCreate = Object.create) && nativeCreate,
        nativeIsArray = isNative(nativeIsArray = Array.isArray) && nativeIsArray,
        nativeIsFinite = context.isFinite,
        nativeIsNaN = context.isNaN,
        nativeKeys = isNative(nativeKeys = Object.keys) && nativeKeys,
        nativeMax = Math.max,
        nativeMin = Math.min,
        nativeParseInt = context.parseInt,
        nativeRandom = Math.random;

    /** Used to lookup a built-in constructor by [[Class]] */
    var ctorByClass = {};
    ctorByClass[arrayClass] = Array;
    ctorByClass[boolClass] = Boolean;
    ctorByClass[dateClass] = Date;
    ctorByClass[funcClass] = Function;
    ctorByClass[objectClass] = Object;
    ctorByClass[numberClass] = Number;
    ctorByClass[regexpClass] = RegExp;
    ctorByClass[stringClass] = String;

    /*--------------------------------------------------------------------------*/

    /**
     * Creates a `lodash` object which wraps the given value to enable intuitive
     * method chaining.
     *
     * In addition to Lo-Dash methods, wrappers also have the following `Array` methods:
     * `concat`, `join`, `pop`, `push`, `reverse`, `shift`, `slice`, `sort`, `splice`,
     * and `unshift`
     *
     * Chaining is supported in custom builds as long as the `value` method is
     * implicitly or explicitly included in the build.
     *
     * The chainable wrapper functions are:
     * `after`, `assign`, `bind`, `bindAll`, `bindKey`, `chain`, `compact`,
     * `compose`, `concat`, `countBy`, `create`, `createCallback`, `curry`,
     * `debounce`, `defaults`, `defer`, `delay`, `difference`, `filter`, `flatten`,
     * `forEach`, `forEachRight`, `forIn`, `forInRight`, `forOwn`, `forOwnRight`,
     * `functions`, `groupBy`, `indexBy`, `initial`, `intersection`, `invert`,
     * `invoke`, `keys`, `map`, `max`, `memoize`, `merge`, `min`, `object`, `omit`,
     * `once`, `pairs`, `partial`, `partialRight`, `pick`, `pluck`, `pull`, `push`,
     * `range`, `reject`, `remove`, `rest`, `reverse`, `shuffle`, `slice`, `sort`,
     * `sortBy`, `splice`, `tap`, `throttle`, `times`, `toArray`, `transform`,
     * `union`, `uniq`, `unshift`, `unzip`, `values`, `where`, `without`, `wrap`,
     * and `zip`
     *
     * The non-chainable wrapper functions are:
     * `clone`, `cloneDeep`, `contains`, `escape`, `every`, `find`, `findIndex`,
     * `findKey`, `findLast`, `findLastIndex`, `findLastKey`, `has`, `identity`,
     * `indexOf`, `isArguments`, `isArray`, `isBoolean`, `isDate`, `isElement`,
     * `isEmpty`, `isEqual`, `isFinite`, `isFunction`, `isNaN`, `isNull`, `isNumber`,
     * `isObject`, `isPlainObject`, `isRegExp`, `isString`, `isUndefined`, `join`,
     * `lastIndexOf`, `mixin`, `noConflict`, `parseInt`, `pop`, `random`, `reduce`,
     * `reduceRight`, `result`, `shift`, `size`, `some`, `sortedIndex`, `runInContext`,
     * `template`, `unescape`, `uniqueId`, and `value`
     *
     * The wrapper functions `first` and `last` return wrapped values when `n` is
     * provided, otherwise they return unwrapped values.
     *
     * Explicit chaining can be enabled by using the `_.chain` method.
     *
     * @name _
     * @constructor
     * @category Chaining
     * @param {*} value The value to wrap in a `lodash` instance.
     * @returns {Object} Returns a `lodash` instance.
     * @example
     *
     * var wrapped = _([1, 2, 3]);
     *
     * // returns an unwrapped value
     * wrapped.reduce(function(sum, num) {
     *   return sum + num;
     * });
     * // => 6
     *
     * // returns a wrapped value
     * var squares = wrapped.map(function(num) {
     *   return num * num;
     * });
     *
     * _.isArray(squares);
     * // => false
     *
     * _.isArray(squares.value());
     * // => true
     */
    function lodash(value) {
      // don't wrap if already wrapped, even if wrapped by a different `lodash` constructor
      return (value && typeof value == 'object' && !isArray(value) && hasOwnProperty.call(value, '__wrapped__'))
       ? value
       : new lodashWrapper(value);
    }

    /**
     * A fast path for creating `lodash` wrapper objects.
     *
     * @private
     * @param {*} value The value to wrap in a `lodash` instance.
     * @param {boolean} chainAll A flag to enable chaining for all methods
     * @returns {Object} Returns a `lodash` instance.
     */
    function lodashWrapper(value, chainAll) {
      this.__chain__ = !!chainAll;
      this.__wrapped__ = value;
    }
    // ensure `new lodashWrapper` is an instance of `lodash`
    lodashWrapper.prototype = lodash.prototype;

    /**
     * An object used to flag environments features.
     *
     * @static
     * @memberOf _
     * @type Object
     */
    var support = lodash.support = {};

    /**
     * Detect if functions can be decompiled by `Function#toString`
     * (all but PS3 and older Opera mobile browsers & avoided in Windows 8 apps).
     *
     * @memberOf _.support
     * @type boolean
     */
    support.funcDecomp = !isNative(context.WinRTError) && reThis.test(runInContext);

    /**
     * Detect if `Function#name` is supported (all but IE).
     *
     * @memberOf _.support
     * @type boolean
     */
    support.funcNames = typeof Function.name == 'string';

    /**
     * By default, the template delimiters used by Lo-Dash are similar to those in
     * embedded Ruby (ERB). Change the following template settings to use alternative
     * delimiters.
     *
     * @static
     * @memberOf _
     * @type Object
     */
    lodash.templateSettings = {

      /**
       * Used to detect `data` property values to be HTML-escaped.
       *
       * @memberOf _.templateSettings
       * @type RegExp
       */
      'escape': /<%-([\s\S]+?)%>/g,

      /**
       * Used to detect code to be evaluated.
       *
       * @memberOf _.templateSettings
       * @type RegExp
       */
      'evaluate': /<%([\s\S]+?)%>/g,

      /**
       * Used to detect `data` property values to inject.
       *
       * @memberOf _.templateSettings
       * @type RegExp
       */
      'interpolate': reInterpolate,

      /**
       * Used to reference the data object in the template text.
       *
       * @memberOf _.templateSettings
       * @type string
       */
      'variable': '',

      /**
       * Used to import variables into the compiled template.
       *
       * @memberOf _.templateSettings
       * @type Object
       */
      'imports': {

        /**
         * A reference to the `lodash` function.
         *
         * @memberOf _.templateSettings.imports
         * @type Function
         */
        '_': lodash
      }
    };

    /*--------------------------------------------------------------------------*/

    /**
     * The base implementation of `_.bind` that creates the bound function and
     * sets its meta data.
     *
     * @private
     * @param {Array} bindData The bind data array.
     * @returns {Function} Returns the new bound function.
     */
    function baseBind(bindData) {
      var func = bindData[0],
          partialArgs = bindData[2],
          thisArg = bindData[4];

      function bound() {
        // `Function#bind` spec
        // http://es5.github.io/#x15.3.4.5
        if (partialArgs) {
          // avoid `arguments` object deoptimizations by using `slice` instead
          // of `Array.prototype.slice.call` and not assigning `arguments` to a
          // variable as a ternary expression
          var args = slice(partialArgs);
          push.apply(args, arguments);
        }
        // mimic the constructor's `return` behavior
        // http://es5.github.io/#x13.2.2
        if (this instanceof bound) {
          // ensure `new bound` is an instance of `func`
          var thisBinding = baseCreate(func.prototype),
              result = func.apply(thisBinding, args || arguments);
          return isObject(result) ? result : thisBinding;
        }
        return func.apply(thisArg, args || arguments);
      }
      setBindData(bound, bindData);
      return bound;
    }

    /**
     * The base implementation of `_.clone` without argument juggling or support
     * for `thisArg` binding.
     *
     * @private
     * @param {*} value The value to clone.
     * @param {boolean} [isDeep=false] Specify a deep clone.
     * @param {Function} [callback] The function to customize cloning values.
     * @param {Array} [stackA=[]] Tracks traversed source objects.
     * @param {Array} [stackB=[]] Associates clones with source counterparts.
     * @returns {*} Returns the cloned value.
     */
    function baseClone(value, isDeep, callback, stackA, stackB) {
      if (callback) {
        var result = callback(value);
        if (typeof result != 'undefined') {
          return result;
        }
      }
      // inspect [[Class]]
      var isObj = isObject(value);
      if (isObj) {
        var className = toString.call(value);
        if (!cloneableClasses[className]) {
          return value;
        }
        var ctor = ctorByClass[className];
        switch (className) {
          case boolClass:
          case dateClass:
            return new ctor(+value);

          case numberClass:
          case stringClass:
            return new ctor(value);

          case regexpClass:
            result = ctor(value.source, reFlags.exec(value));
            result.lastIndex = value.lastIndex;
            return result;
        }
      } else {
        return value;
      }
      var isArr = isArray(value);
      if (isDeep) {
        // check for circular references and return corresponding clone
        var initedStack = !stackA;
        stackA || (stackA = getArray());
        stackB || (stackB = getArray());

        var length = stackA.length;
        while (length--) {
          if (stackA[length] == value) {
            return stackB[length];
          }
        }
        result = isArr ? ctor(value.length) : {};
      }
      else {
        result = isArr ? slice(value) : assign({}, value);
      }
      // add array properties assigned by `RegExp#exec`
      if (isArr) {
        if (hasOwnProperty.call(value, 'index')) {
          result.index = value.index;
        }
        if (hasOwnProperty.call(value, 'input')) {
          result.input = value.input;
        }
      }
      // exit for shallow clone
      if (!isDeep) {
        return result;
      }
      // add the source value to the stack of traversed objects
      // and associate it with its clone
      stackA.push(value);
      stackB.push(result);

      // recursively populate clone (susceptible to call stack limits)
      (isArr ? forEach : forOwn)(value, function(objValue, key) {
        result[key] = baseClone(objValue, isDeep, callback, stackA, stackB);
      });

      if (initedStack) {
        releaseArray(stackA);
        releaseArray(stackB);
      }
      return result;
    }

    /**
     * The base implementation of `_.create` without support for assigning
     * properties to the created object.
     *
     * @private
     * @param {Object} prototype The object to inherit from.
     * @returns {Object} Returns the new object.
     */
    function baseCreate(prototype, properties) {
      return isObject(prototype) ? nativeCreate(prototype) : {};
    }
    // fallback for browsers without `Object.create`
    if (!nativeCreate) {
      baseCreate = (function() {
        function Object() {}
        return function(prototype) {
          if (isObject(prototype)) {
            Object.prototype = prototype;
            var result = new Object;
            Object.prototype = null;
          }
          return result || context.Object();
        };
      }());
    }

    /**
     * The base implementation of `_.createCallback` without support for creating
     * "_.pluck" or "_.where" style callbacks.
     *
     * @private
     * @param {*} [func=identity] The value to convert to a callback.
     * @param {*} [thisArg] The `this` binding of the created callback.
     * @param {number} [argCount] The number of arguments the callback accepts.
     * @returns {Function} Returns a callback function.
     */
    function baseCreateCallback(func, thisArg, argCount) {
      if (typeof func != 'function') {
        return identity;
      }
      // exit early for no `thisArg` or already bound by `Function#bind`
      if (typeof thisArg == 'undefined' || !('prototype' in func)) {
        return func;
      }
      var bindData = func.__bindData__;
      if (typeof bindData == 'undefined') {
        if (support.funcNames) {
          bindData = !func.name;
        }
        bindData = bindData || !support.funcDecomp;
        if (!bindData) {
          var source = fnToString.call(func);
          if (!support.funcNames) {
            bindData = !reFuncName.test(source);
          }
          if (!bindData) {
            // checks if `func` references the `this` keyword and stores the result
            bindData = reThis.test(source);
            setBindData(func, bindData);
          }
        }
      }
      // exit early if there are no `this` references or `func` is bound
      if (bindData === false || (bindData !== true && bindData[1] & 1)) {
        return func;
      }
      switch (argCount) {
        case 1: return function(value) {
          return func.call(thisArg, value);
        };
        case 2: return function(a, b) {
          return func.call(thisArg, a, b);
        };
        case 3: return function(value, index, collection) {
          return func.call(thisArg, value, index, collection);
        };
        case 4: return function(accumulator, value, index, collection) {
          return func.call(thisArg, accumulator, value, index, collection);
        };
      }
      return bind(func, thisArg);
    }

    /**
     * The base implementation of `createWrapper` that creates the wrapper and
     * sets its meta data.
     *
     * @private
     * @param {Array} bindData The bind data array.
     * @returns {Function} Returns the new function.
     */
    function baseCreateWrapper(bindData) {
      var func = bindData[0],
          bitmask = bindData[1],
          partialArgs = bindData[2],
          partialRightArgs = bindData[3],
          thisArg = bindData[4],
          arity = bindData[5];

      var isBind = bitmask & 1,
          isBindKey = bitmask & 2,
          isCurry = bitmask & 4,
          isCurryBound = bitmask & 8,
          key = func;

      function bound() {
        var thisBinding = isBind ? thisArg : this;
        if (partialArgs) {
          var args = slice(partialArgs);
          push.apply(args, arguments);
        }
        if (partialRightArgs || isCurry) {
          args || (args = slice(arguments));
          if (partialRightArgs) {
            push.apply(args, partialRightArgs);
          }
          if (isCurry && args.length < arity) {
            bitmask |= 16 & ~32;
            return baseCreateWrapper([func, (isCurryBound ? bitmask : bitmask & ~3), args, null, thisArg, arity]);
          }
        }
        args || (args = arguments);
        if (isBindKey) {
          func = thisBinding[key];
        }
        if (this instanceof bound) {
          thisBinding = baseCreate(func.prototype);
          var result = func.apply(thisBinding, args);
          return isObject(result) ? result : thisBinding;
        }
        return func.apply(thisBinding, args);
      }
      setBindData(bound, bindData);
      return bound;
    }

    /**
     * The base implementation of `_.difference` that accepts a single array
     * of values to exclude.
     *
     * @private
     * @param {Array} array The array to process.
     * @param {Array} [values] The array of values to exclude.
     * @returns {Array} Returns a new array of filtered values.
     */
    function baseDifference(array, values) {
      var index = -1,
          indexOf = getIndexOf(),
          length = array ? array.length : 0,
          isLarge = length >= largeArraySize && indexOf === baseIndexOf,
          result = [];

      if (isLarge) {
        var cache = createCache(values);
        if (cache) {
          indexOf = cacheIndexOf;
          values = cache;
        } else {
          isLarge = false;
        }
      }
      while (++index < length) {
        var value = array[index];
        if (indexOf(values, value) < 0) {
          result.push(value);
        }
      }
      if (isLarge) {
        releaseObject(values);
      }
      return result;
    }

    /**
     * The base implementation of `_.flatten` without support for callback
     * shorthands or `thisArg` binding.
     *
     * @private
     * @param {Array} array The array to flatten.
     * @param {boolean} [isShallow=false] A flag to restrict flattening to a single level.
     * @param {boolean} [isStrict=false] A flag to restrict flattening to arrays and `arguments` objects.
     * @param {number} [fromIndex=0] The index to start from.
     * @returns {Array} Returns a new flattened array.
     */
    function baseFlatten(array, isShallow, isStrict, fromIndex) {
      var index = (fromIndex || 0) - 1,
          length = array ? array.length : 0,
          result = [];

      while (++index < length) {
        var value = array[index];

        if (value && typeof value == 'object' && typeof value.length == 'number'
            && (isArray(value) || isArguments(value))) {
          // recursively flatten arrays (susceptible to call stack limits)
          if (!isShallow) {
            value = baseFlatten(value, isShallow, isStrict);
          }
          var valIndex = -1,
              valLength = value.length,
              resIndex = result.length;

          result.length += valLength;
          while (++valIndex < valLength) {
            result[resIndex++] = value[valIndex];
          }
        } else if (!isStrict) {
          result.push(value);
        }
      }
      return result;
    }

    /**
     * The base implementation of `_.isEqual`, without support for `thisArg` binding,
     * that allows partial "_.where" style comparisons.
     *
     * @private
     * @param {*} a The value to compare.
     * @param {*} b The other value to compare.
     * @param {Function} [callback] The function to customize comparing values.
     * @param {Function} [isWhere=false] A flag to indicate performing partial comparisons.
     * @param {Array} [stackA=[]] Tracks traversed `a` objects.
     * @param {Array} [stackB=[]] Tracks traversed `b` objects.
     * @returns {boolean} Returns `true` if the values are equivalent, else `false`.
     */
    function baseIsEqual(a, b, callback, isWhere, stackA, stackB) {
      // used to indicate that when comparing objects, `a` has at least the properties of `b`
      if (callback) {
        var result = callback(a, b);
        if (typeof result != 'undefined') {
          return !!result;
        }
      }
      // exit early for identical values
      if (a === b) {
        // treat `+0` vs. `-0` as not equal
        return a !== 0 || (1 / a == 1 / b);
      }
      var type = typeof a,
          otherType = typeof b;

      // exit early for unlike primitive values
      if (a === a &&
          !(a && objectTypes[type]) &&
          !(b && objectTypes[otherType])) {
        return false;
      }
      // exit early for `null` and `undefined` avoiding ES3's Function#call behavior
      // http://es5.github.io/#x15.3.4.4
      if (a == null || b == null) {
        return a === b;
      }
      // compare [[Class]] names
      var className = toString.call(a),
          otherClass = toString.call(b);

      if (className == argsClass) {
        className = objectClass;
      }
      if (otherClass == argsClass) {
        otherClass = objectClass;
      }
      if (className != otherClass) {
        return false;
      }
      switch (className) {
        case boolClass:
        case dateClass:
          // coerce dates and booleans to numbers, dates to milliseconds and booleans
          // to `1` or `0` treating invalid dates coerced to `NaN` as not equal
          return +a == +b;

        case numberClass:
          // treat `NaN` vs. `NaN` as equal
          return (a != +a)
            ? b != +b
            // but treat `+0` vs. `-0` as not equal
            : (a == 0 ? (1 / a == 1 / b) : a == +b);

        case regexpClass:
        case stringClass:
          // coerce regexes to strings (http://es5.github.io/#x15.10.6.4)
          // treat string primitives and their corresponding object instances as equal
          return a == String(b);
      }
      var isArr = className == arrayClass;
      if (!isArr) {
        // unwrap any `lodash` wrapped values
        var aWrapped = hasOwnProperty.call(a, '__wrapped__'),
            bWrapped = hasOwnProperty.call(b, '__wrapped__');

        if (aWrapped || bWrapped) {
          return baseIsEqual(aWrapped ? a.__wrapped__ : a, bWrapped ? b.__wrapped__ : b, callback, isWhere, stackA, stackB);
        }
        // exit for functions and DOM nodes
        if (className != objectClass) {
          return false;
        }
        // in older versions of Opera, `arguments` objects have `Array` constructors
        var ctorA = a.constructor,
            ctorB = b.constructor;

        // non `Object` object instances with different constructors are not equal
        if (ctorA != ctorB &&
              !(isFunction(ctorA) && ctorA instanceof ctorA && isFunction(ctorB) && ctorB instanceof ctorB) &&
              ('constructor' in a && 'constructor' in b)
            ) {
          return false;
        }
      }
      // assume cyclic structures are equal
      // the algorithm for detecting cyclic structures is adapted from ES 5.1
      // section 15.12.3, abstract operation `JO` (http://es5.github.io/#x15.12.3)
      var initedStack = !stackA;
      stackA || (stackA = getArray());
      stackB || (stackB = getArray());

      var length = stackA.length;
      while (length--) {
        if (stackA[length] == a) {
          return stackB[length] == b;
        }
      }
      var size = 0;
      result = true;

      // add `a` and `b` to the stack of traversed objects
      stackA.push(a);
      stackB.push(b);

      // recursively compare objects and arrays (susceptible to call stack limits)
      if (isArr) {
        // compare lengths to determine if a deep comparison is necessary
        length = a.length;
        size = b.length;
        result = size == length;

        if (result || isWhere) {
          // deep compare the contents, ignoring non-numeric properties
          while (size--) {
            var index = length,
                value = b[size];

            if (isWhere) {
              while (index--) {
                if ((result = baseIsEqual(a[index], value, callback, isWhere, stackA, stackB))) {
                  break;
                }
              }
            } else if (!(result = baseIsEqual(a[size], value, callback, isWhere, stackA, stackB))) {
              break;
            }
          }
        }
      }
      else {
        // deep compare objects using `forIn`, instead of `forOwn`, to avoid `Object.keys`
        // which, in this case, is more costly
        forIn(b, function(value, key, b) {
          if (hasOwnProperty.call(b, key)) {
            // count the number of properties.
            size++;
            // deep compare each property value.
            return (result = hasOwnProperty.call(a, key) && baseIsEqual(a[key], value, callback, isWhere, stackA, stackB));
          }
        });

        if (result && !isWhere) {
          // ensure both objects have the same number of properties
          forIn(a, function(value, key, a) {
            if (hasOwnProperty.call(a, key)) {
              // `size` will be `-1` if `a` has more properties than `b`
              return (result = --size > -1);
            }
          });
        }
      }
      stackA.pop();
      stackB.pop();

      if (initedStack) {
        releaseArray(stackA);
        releaseArray(stackB);
      }
      return result;
    }

    /**
     * The base implementation of `_.merge` without argument juggling or support
     * for `thisArg` binding.
     *
     * @private
     * @param {Object} object The destination object.
     * @param {Object} source The source object.
     * @param {Function} [callback] The function to customize merging properties.
     * @param {Array} [stackA=[]] Tracks traversed source objects.
     * @param {Array} [stackB=[]] Associates values with source counterparts.
     */
    function baseMerge(object, source, callback, stackA, stackB) {
      (isArray(source) ? forEach : forOwn)(source, function(source, key) {
        var found,
            isArr,
            result = source,
            value = object[key];

        if (source && ((isArr = isArray(source)) || isPlainObject(source))) {
          // avoid merging previously merged cyclic sources
          var stackLength = stackA.length;
          while (stackLength--) {
            if ((found = stackA[stackLength] == source)) {
              value = stackB[stackLength];
              break;
            }
          }
          if (!found) {
            var isShallow;
            if (callback) {
              result = callback(value, source);
              if ((isShallow = typeof result != 'undefined')) {
                value = result;
              }
            }
            if (!isShallow) {
              value = isArr
                ? (isArray(value) ? value : [])
                : (isPlainObject(value) ? value : {});
            }
            // add `source` and associated `value` to the stack of traversed objects
            stackA.push(source);
            stackB.push(value);

            // recursively merge objects and arrays (susceptible to call stack limits)
            if (!isShallow) {
              baseMerge(value, source, callback, stackA, stackB);
            }
          }
        }
        else {
          if (callback) {
            result = callback(value, source);
            if (typeof result == 'undefined') {
              result = source;
            }
          }
          if (typeof result != 'undefined') {
            value = result;
          }
        }
        object[key] = value;
      });
    }

    /**
     * The base implementation of `_.random` without argument juggling or support
     * for returning floating-point numbers.
     *
     * @private
     * @param {number} min The minimum possible value.
     * @param {number} max The maximum possible value.
     * @returns {number} Returns a random number.
     */
    function baseRandom(min, max) {
      return min + floor(nativeRandom() * (max - min + 1));
    }

    /**
     * The base implementation of `_.uniq` without support for callback shorthands
     * or `thisArg` binding.
     *
     * @private
     * @param {Array} array The array to process.
     * @param {boolean} [isSorted=false] A flag to indicate that `array` is sorted.
     * @param {Function} [callback] The function called per iteration.
     * @returns {Array} Returns a duplicate-value-free array.
     */
    function baseUniq(array, isSorted, callback) {
      var index = -1,
          indexOf = getIndexOf(),
          length = array ? array.length : 0,
          result = [];

      var isLarge = !isSorted && length >= largeArraySize && indexOf === baseIndexOf,
          seen = (callback || isLarge) ? getArray() : result;

      if (isLarge) {
        var cache = createCache(seen);
        indexOf = cacheIndexOf;
        seen = cache;
      }
      while (++index < length) {
        var value = array[index],
            computed = callback ? callback(value, index, array) : value;

        if (isSorted
              ? !index || seen[seen.length - 1] !== computed
              : indexOf(seen, computed) < 0
            ) {
          if (callback || isLarge) {
            seen.push(computed);
          }
          result.push(value);
        }
      }
      if (isLarge) {
        releaseArray(seen.array);
        releaseObject(seen);
      } else if (callback) {
        releaseArray(seen);
      }
      return result;
    }

    /**
     * Creates a function that aggregates a collection, creating an object composed
     * of keys generated from the results of running each element of the collection
     * through a callback. The given `setter` function sets the keys and values
     * of the composed object.
     *
     * @private
     * @param {Function} setter The setter function.
     * @returns {Function} Returns the new aggregator function.
     */
    function createAggregator(setter) {
      return function(collection, callback, thisArg) {
        var result = {};
        callback = lodash.createCallback(callback, thisArg, 3);

        var index = -1,
            length = collection ? collection.length : 0;

        if (typeof length == 'number') {
          while (++index < length) {
            var value = collection[index];
            setter(result, value, callback(value, index, collection), collection);
          }
        } else {
          forOwn(collection, function(value, key, collection) {
            setter(result, value, callback(value, key, collection), collection);
          });
        }
        return result;
      };
    }

    /**
     * Creates a function that, when called, either curries or invokes `func`
     * with an optional `this` binding and partially applied arguments.
     *
     * @private
     * @param {Function|string} func The function or method name to reference.
     * @param {number} bitmask The bitmask of method flags to compose.
     *  The bitmask may be composed of the following flags:
     *  1 - `_.bind`
     *  2 - `_.bindKey`
     *  4 - `_.curry`
     *  8 - `_.curry` (bound)
     *  16 - `_.partial`
     *  32 - `_.partialRight`
     * @param {Array} [partialArgs] An array of arguments to prepend to those
     *  provided to the new function.
     * @param {Array} [partialRightArgs] An array of arguments to append to those
     *  provided to the new function.
     * @param {*} [thisArg] The `this` binding of `func`.
     * @param {number} [arity] The arity of `func`.
     * @returns {Function} Returns the new function.
     */
    function createWrapper(func, bitmask, partialArgs, partialRightArgs, thisArg, arity) {
      var isBind = bitmask & 1,
          isBindKey = bitmask & 2,
          isCurry = bitmask & 4,
          isCurryBound = bitmask & 8,
          isPartial = bitmask & 16,
          isPartialRight = bitmask & 32;

      if (!isBindKey && !isFunction(func)) {
        throw new TypeError;
      }
      if (isPartial && !partialArgs.length) {
        bitmask &= ~16;
        isPartial = partialArgs = false;
      }
      if (isPartialRight && !partialRightArgs.length) {
        bitmask &= ~32;
        isPartialRight = partialRightArgs = false;
      }
      var bindData = func && func.__bindData__;
      if (bindData && bindData !== true) {
        // clone `bindData`
        bindData = slice(bindData);
        if (bindData[2]) {
          bindData[2] = slice(bindData[2]);
        }
        if (bindData[3]) {
          bindData[3] = slice(bindData[3]);
        }
        // set `thisBinding` is not previously bound
        if (isBind && !(bindData[1] & 1)) {
          bindData[4] = thisArg;
        }
        // set if previously bound but not currently (subsequent curried functions)
        if (!isBind && bindData[1] & 1) {
          bitmask |= 8;
        }
        // set curried arity if not yet set
        if (isCurry && !(bindData[1] & 4)) {
          bindData[5] = arity;
        }
        // append partial left arguments
        if (isPartial) {
          push.apply(bindData[2] || (bindData[2] = []), partialArgs);
        }
        // append partial right arguments
        if (isPartialRight) {
          unshift.apply(bindData[3] || (bindData[3] = []), partialRightArgs);
        }
        // merge flags
        bindData[1] |= bitmask;
        return createWrapper.apply(null, bindData);
      }
      // fast path for `_.bind`
      var creater = (bitmask == 1 || bitmask === 17) ? baseBind : baseCreateWrapper;
      return creater([func, bitmask, partialArgs, partialRightArgs, thisArg, arity]);
    }

    /**
     * Used by `escape` to convert characters to HTML entities.
     *
     * @private
     * @param {string} match The matched character to escape.
     * @returns {string} Returns the escaped character.
     */
    function escapeHtmlChar(match) {
      return htmlEscapes[match];
    }

    /**
     * Gets the appropriate "indexOf" function. If the `_.indexOf` method is
     * customized, this method returns the custom method, otherwise it returns
     * the `baseIndexOf` function.
     *
     * @private
     * @returns {Function} Returns the "indexOf" function.
     */
    function getIndexOf() {
      var result = (result = lodash.indexOf) === indexOf ? baseIndexOf : result;
      return result;
    }

    /**
     * Checks if `value` is a native function.
     *
     * @private
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is a native function, else `false`.
     */
    function isNative(value) {
      return typeof value == 'function' && reNative.test(value);
    }

    /**
     * Sets `this` binding data on a given function.
     *
     * @private
     * @param {Function} func The function to set data on.
     * @param {Array} value The data array to set.
     */
    var setBindData = !defineProperty ? noop : function(func, value) {
      descriptor.value = value;
      defineProperty(func, '__bindData__', descriptor);
    };

    /**
     * A fallback implementation of `isPlainObject` which checks if a given value
     * is an object created by the `Object` constructor, assuming objects created
     * by the `Object` constructor have no inherited enumerable properties and that
     * there are no `Object.prototype` extensions.
     *
     * @private
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is a plain object, else `false`.
     */
    function shimIsPlainObject(value) {
      var ctor,
          result;

      // avoid non Object objects, `arguments` objects, and DOM elements
      if (!(value && toString.call(value) == objectClass) ||
          (ctor = value.constructor, isFunction(ctor) && !(ctor instanceof ctor))) {
        return false;
      }
      // In most environments an object's own properties are iterated before
      // its inherited properties. If the last iterated property is an object's
      // own property then there are no inherited enumerable properties.
      forIn(value, function(value, key) {
        result = key;
      });
      return typeof result == 'undefined' || hasOwnProperty.call(value, result);
    }

    /**
     * Used by `unescape` to convert HTML entities to characters.
     *
     * @private
     * @param {string} match The matched character to unescape.
     * @returns {string} Returns the unescaped character.
     */
    function unescapeHtmlChar(match) {
      return htmlUnescapes[match];
    }

    /*--------------------------------------------------------------------------*/

    /**
     * Checks if `value` is an `arguments` object.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is an `arguments` object, else `false`.
     * @example
     *
     * (function() { return _.isArguments(arguments); })(1, 2, 3);
     * // => true
     *
     * _.isArguments([1, 2, 3]);
     * // => false
     */
    function isArguments(value) {
      return value && typeof value == 'object' && typeof value.length == 'number' &&
        toString.call(value) == argsClass || false;
    }

    /**
     * Checks if `value` is an array.
     *
     * @static
     * @memberOf _
     * @type Function
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is an array, else `false`.
     * @example
     *
     * (function() { return _.isArray(arguments); })();
     * // => false
     *
     * _.isArray([1, 2, 3]);
     * // => true
     */
    var isArray = nativeIsArray || function(value) {
      return value && typeof value == 'object' && typeof value.length == 'number' &&
        toString.call(value) == arrayClass || false;
    };

    /**
     * A fallback implementation of `Object.keys` which produces an array of the
     * given object's own enumerable property names.
     *
     * @private
     * @type Function
     * @param {Object} object The object to inspect.
     * @returns {Array} Returns an array of property names.
     */
    var shimKeys = function(object) {
      var index, iterable = object, result = [];
      if (!iterable) return result;
      if (!(objectTypes[typeof object])) return result;
        for (index in iterable) {
          if (hasOwnProperty.call(iterable, index)) {
            result.push(index);
          }
        }
      return result
    };

    /**
     * Creates an array composed of the own enumerable property names of an object.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The object to inspect.
     * @returns {Array} Returns an array of property names.
     * @example
     *
     * _.keys({ 'one': 1, 'two': 2, 'three': 3 });
     * // => ['one', 'two', 'three'] (property order is not guaranteed across environments)
     */
    var keys = !nativeKeys ? shimKeys : function(object) {
      if (!isObject(object)) {
        return [];
      }
      return nativeKeys(object);
    };

    /**
     * Used to convert characters to HTML entities:
     *
     * Though the `>` character is escaped for symmetry, characters like `>` and `/`
     * don't require escaping in HTML and have no special meaning unless they're part
     * of a tag or an unquoted attribute value.
     * http://mathiasbynens.be/notes/ambiguous-ampersands (under "semi-related fun fact")
     */
    var htmlEscapes = {
      '&': '&amp;',
      '<': '&lt;',
      '>': '&gt;',
      '"': '&quot;',
      "'": '&#39;'
    };

    /** Used to convert HTML entities to characters */
    var htmlUnescapes = invert(htmlEscapes);

    /** Used to match HTML entities and HTML characters */
    var reEscapedHtml = RegExp('(' + keys(htmlUnescapes).join('|') + ')', 'g'),
        reUnescapedHtml = RegExp('[' + keys(htmlEscapes).join('') + ']', 'g');

    /*--------------------------------------------------------------------------*/

    /**
     * Assigns own enumerable properties of source object(s) to the destination
     * object. Subsequent sources will overwrite property assignments of previous
     * sources. If a callback is provided it will be executed to produce the
     * assigned values. The callback is bound to `thisArg` and invoked with two
     * arguments; (objectValue, sourceValue).
     *
     * @static
     * @memberOf _
     * @type Function
     * @alias extend
     * @category Objects
     * @param {Object} object The destination object.
     * @param {...Object} [source] The source objects.
     * @param {Function} [callback] The function to customize assigning values.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns the destination object.
     * @example
     *
     * _.assign({ 'name': 'fred' }, { 'employer': 'slate' });
     * // => { 'name': 'fred', 'employer': 'slate' }
     *
     * var defaults = _.partialRight(_.assign, function(a, b) {
     *   return typeof a == 'undefined' ? b : a;
     * });
     *
     * var object = { 'name': 'barney' };
     * defaults(object, { 'name': 'fred', 'employer': 'slate' });
     * // => { 'name': 'barney', 'employer': 'slate' }
     */
    var assign = function(object, source, guard) {
      var index, iterable = object, result = iterable;
      if (!iterable) return result;
      var args = arguments,
          argsIndex = 0,
          argsLength = typeof guard == 'number' ? 2 : args.length;
      if (argsLength > 3 && typeof args[argsLength - 2] == 'function') {
        var callback = baseCreateCallback(args[--argsLength - 1], args[argsLength--], 2);
      } else if (argsLength > 2 && typeof args[argsLength - 1] == 'function') {
        callback = args[--argsLength];
      }
      while (++argsIndex < argsLength) {
        iterable = args[argsIndex];
        if (iterable && objectTypes[typeof iterable]) {
        var ownIndex = -1,
            ownProps = objectTypes[typeof iterable] && keys(iterable),
            length = ownProps ? ownProps.length : 0;

        while (++ownIndex < length) {
          index = ownProps[ownIndex];
          result[index] = callback ? callback(result[index], iterable[index]) : iterable[index];
        }
        }
      }
      return result
    };

    /**
     * Creates a clone of `value`. If `isDeep` is `true` nested objects will also
     * be cloned, otherwise they will be assigned by reference. If a callback
     * is provided it will be executed to produce the cloned values. If the
     * callback returns `undefined` cloning will be handled by the method instead.
     * The callback is bound to `thisArg` and invoked with one argument; (value).
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to clone.
     * @param {boolean} [isDeep=false] Specify a deep clone.
     * @param {Function} [callback] The function to customize cloning values.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the cloned value.
     * @example
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36 },
     *   { 'name': 'fred',   'age': 40 }
     * ];
     *
     * var shallow = _.clone(characters);
     * shallow[0] === characters[0];
     * // => true
     *
     * var deep = _.clone(characters, true);
     * deep[0] === characters[0];
     * // => false
     *
     * _.mixin({
     *   'clone': _.partialRight(_.clone, function(value) {
     *     return _.isElement(value) ? value.cloneNode(false) : undefined;
     *   })
     * });
     *
     * var clone = _.clone(document.body);
     * clone.childNodes.length;
     * // => 0
     */
    function clone(value, isDeep, callback, thisArg) {
      // allows working with "Collections" methods without using their `index`
      // and `collection` arguments for `isDeep` and `callback`
      if (typeof isDeep != 'boolean' && isDeep != null) {
        thisArg = callback;
        callback = isDeep;
        isDeep = false;
      }
      return baseClone(value, isDeep, typeof callback == 'function' && baseCreateCallback(callback, thisArg, 1));
    }

    /**
     * Creates a deep clone of `value`. If a callback is provided it will be
     * executed to produce the cloned values. If the callback returns `undefined`
     * cloning will be handled by the method instead. The callback is bound to
     * `thisArg` and invoked with one argument; (value).
     *
     * Note: This method is loosely based on the structured clone algorithm. Functions
     * and DOM nodes are **not** cloned. The enumerable properties of `arguments` objects and
     * objects created by constructors other than `Object` are cloned to plain `Object` objects.
     * See http://www.w3.org/TR/html5/infrastructure.html#internal-structured-cloning-algorithm.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to deep clone.
     * @param {Function} [callback] The function to customize cloning values.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the deep cloned value.
     * @example
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36 },
     *   { 'name': 'fred',   'age': 40 }
     * ];
     *
     * var deep = _.cloneDeep(characters);
     * deep[0] === characters[0];
     * // => false
     *
     * var view = {
     *   'label': 'docs',
     *   'node': element
     * };
     *
     * var clone = _.cloneDeep(view, function(value) {
     *   return _.isElement(value) ? value.cloneNode(true) : undefined;
     * });
     *
     * clone.node == view.node;
     * // => false
     */
    function cloneDeep(value, callback, thisArg) {
      return baseClone(value, true, typeof callback == 'function' && baseCreateCallback(callback, thisArg, 1));
    }

    /**
     * Creates an object that inherits from the given `prototype` object. If a
     * `properties` object is provided its own enumerable properties are assigned
     * to the created object.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} prototype The object to inherit from.
     * @param {Object} [properties] The properties to assign to the object.
     * @returns {Object} Returns the new object.
     * @example
     *
     * function Shape() {
     *   this.x = 0;
     *   this.y = 0;
     * }
     *
     * function Circle() {
     *   Shape.call(this);
     * }
     *
     * Circle.prototype = _.create(Shape.prototype, { 'constructor': Circle });
     *
     * var circle = new Circle;
     * circle instanceof Circle;
     * // => true
     *
     * circle instanceof Shape;
     * // => true
     */
    function create(prototype, properties) {
      var result = baseCreate(prototype);
      return properties ? assign(result, properties) : result;
    }

    /**
     * Assigns own enumerable properties of source object(s) to the destination
     * object for all destination properties that resolve to `undefined`. Once a
     * property is set, additional defaults of the same property will be ignored.
     *
     * @static
     * @memberOf _
     * @type Function
     * @category Objects
     * @param {Object} object The destination object.
     * @param {...Object} [source] The source objects.
     * @param- {Object} [guard] Allows working with `_.reduce` without using its
     *  `key` and `object` arguments as sources.
     * @returns {Object} Returns the destination object.
     * @example
     *
     * var object = { 'name': 'barney' };
     * _.defaults(object, { 'name': 'fred', 'employer': 'slate' });
     * // => { 'name': 'barney', 'employer': 'slate' }
     */
    var defaults = function(object, source, guard) {
      var index, iterable = object, result = iterable;
      if (!iterable) return result;
      var args = arguments,
          argsIndex = 0,
          argsLength = typeof guard == 'number' ? 2 : args.length;
      while (++argsIndex < argsLength) {
        iterable = args[argsIndex];
        if (iterable && objectTypes[typeof iterable]) {
        var ownIndex = -1,
            ownProps = objectTypes[typeof iterable] && keys(iterable),
            length = ownProps ? ownProps.length : 0;

        while (++ownIndex < length) {
          index = ownProps[ownIndex];
          if (typeof result[index] == 'undefined') result[index] = iterable[index];
        }
        }
      }
      return result
    };

    /**
     * This method is like `_.findIndex` except that it returns the key of the
     * first element that passes the callback check, instead of the element itself.
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The object to search.
     * @param {Function|Object|string} [callback=identity] The function called per
     *  iteration. If a property name or object is provided it will be used to
     *  create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {string|undefined} Returns the key of the found element, else `undefined`.
     * @example
     *
     * var characters = {
     *   'barney': {  'age': 36, 'blocked': false },
     *   'fred': {    'age': 40, 'blocked': true },
     *   'pebbles': { 'age': 1,  'blocked': false }
     * };
     *
     * _.findKey(characters, function(chr) {
     *   return chr.age < 40;
     * });
     * // => 'barney' (property order is not guaranteed across environments)
     *
     * // using "_.where" callback shorthand
     * _.findKey(characters, { 'age': 1 });
     * // => 'pebbles'
     *
     * // using "_.pluck" callback shorthand
     * _.findKey(characters, 'blocked');
     * // => 'fred'
     */
    function findKey(object, callback, thisArg) {
      var result;
      callback = lodash.createCallback(callback, thisArg, 3);
      forOwn(object, function(value, key, object) {
        if (callback(value, key, object)) {
          result = key;
          return false;
        }
      });
      return result;
    }

    /**
     * This method is like `_.findKey` except that it iterates over elements
     * of a `collection` in the opposite order.
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The object to search.
     * @param {Function|Object|string} [callback=identity] The function called per
     *  iteration. If a property name or object is provided it will be used to
     *  create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {string|undefined} Returns the key of the found element, else `undefined`.
     * @example
     *
     * var characters = {
     *   'barney': {  'age': 36, 'blocked': true },
     *   'fred': {    'age': 40, 'blocked': false },
     *   'pebbles': { 'age': 1,  'blocked': true }
     * };
     *
     * _.findLastKey(characters, function(chr) {
     *   return chr.age < 40;
     * });
     * // => returns `pebbles`, assuming `_.findKey` returns `barney`
     *
     * // using "_.where" callback shorthand
     * _.findLastKey(characters, { 'age': 40 });
     * // => 'fred'
     *
     * // using "_.pluck" callback shorthand
     * _.findLastKey(characters, 'blocked');
     * // => 'pebbles'
     */
    function findLastKey(object, callback, thisArg) {
      var result;
      callback = lodash.createCallback(callback, thisArg, 3);
      forOwnRight(object, function(value, key, object) {
        if (callback(value, key, object)) {
          result = key;
          return false;
        }
      });
      return result;
    }

    /**
     * Iterates over own and inherited enumerable properties of an object,
     * executing the callback for each property. The callback is bound to `thisArg`
     * and invoked with three arguments; (value, key, object). Callbacks may exit
     * iteration early by explicitly returning `false`.
     *
     * @static
     * @memberOf _
     * @type Function
     * @category Objects
     * @param {Object} object The object to iterate over.
     * @param {Function} [callback=identity] The function called per iteration.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns `object`.
     * @example
     *
     * function Shape() {
     *   this.x = 0;
     *   this.y = 0;
     * }
     *
     * Shape.prototype.move = function(x, y) {
     *   this.x += x;
     *   this.y += y;
     * };
     *
     * _.forIn(new Shape, function(value, key) {
     *   console.log(key);
     * });
     * // => logs 'x', 'y', and 'move' (property order is not guaranteed across environments)
     */
    var forIn = function(collection, callback, thisArg) {
      var index, iterable = collection, result = iterable;
      if (!iterable) return result;
      if (!objectTypes[typeof iterable]) return result;
      callback = callback && typeof thisArg == 'undefined' ? callback : baseCreateCallback(callback, thisArg, 3);
        for (index in iterable) {
          if (callback(iterable[index], index, collection) === false) return result;
        }
      return result
    };

    /**
     * This method is like `_.forIn` except that it iterates over elements
     * of a `collection` in the opposite order.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The object to iterate over.
     * @param {Function} [callback=identity] The function called per iteration.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns `object`.
     * @example
     *
     * function Shape() {
     *   this.x = 0;
     *   this.y = 0;
     * }
     *
     * Shape.prototype.move = function(x, y) {
     *   this.x += x;
     *   this.y += y;
     * };
     *
     * _.forInRight(new Shape, function(value, key) {
     *   console.log(key);
     * });
     * // => logs 'move', 'y', and 'x' assuming `_.forIn ` logs 'x', 'y', and 'move'
     */
    function forInRight(object, callback, thisArg) {
      var pairs = [];

      forIn(object, function(value, key) {
        pairs.push(key, value);
      });

      var length = pairs.length;
      callback = baseCreateCallback(callback, thisArg, 3);
      while (length--) {
        if (callback(pairs[length--], pairs[length], object) === false) {
          break;
        }
      }
      return object;
    }

    /**
     * Iterates over own enumerable properties of an object, executing the callback
     * for each property. The callback is bound to `thisArg` and invoked with three
     * arguments; (value, key, object). Callbacks may exit iteration early by
     * explicitly returning `false`.
     *
     * @static
     * @memberOf _
     * @type Function
     * @category Objects
     * @param {Object} object The object to iterate over.
     * @param {Function} [callback=identity] The function called per iteration.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns `object`.
     * @example
     *
     * _.forOwn({ '0': 'zero', '1': 'one', 'length': 2 }, function(num, key) {
     *   console.log(key);
     * });
     * // => logs '0', '1', and 'length' (property order is not guaranteed across environments)
     */
    var forOwn = function(collection, callback, thisArg) {
      var index, iterable = collection, result = iterable;
      if (!iterable) return result;
      if (!objectTypes[typeof iterable]) return result;
      callback = callback && typeof thisArg == 'undefined' ? callback : baseCreateCallback(callback, thisArg, 3);
        var ownIndex = -1,
            ownProps = objectTypes[typeof iterable] && keys(iterable),
            length = ownProps ? ownProps.length : 0;

        while (++ownIndex < length) {
          index = ownProps[ownIndex];
          if (callback(iterable[index], index, collection) === false) return result;
        }
      return result
    };

    /**
     * This method is like `_.forOwn` except that it iterates over elements
     * of a `collection` in the opposite order.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The object to iterate over.
     * @param {Function} [callback=identity] The function called per iteration.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns `object`.
     * @example
     *
     * _.forOwnRight({ '0': 'zero', '1': 'one', 'length': 2 }, function(num, key) {
     *   console.log(key);
     * });
     * // => logs 'length', '1', and '0' assuming `_.forOwn` logs '0', '1', and 'length'
     */
    function forOwnRight(object, callback, thisArg) {
      var props = keys(object),
          length = props.length;

      callback = baseCreateCallback(callback, thisArg, 3);
      while (length--) {
        var key = props[length];
        if (callback(object[key], key, object) === false) {
          break;
        }
      }
      return object;
    }

    /**
     * Creates a sorted array of property names of all enumerable properties,
     * own and inherited, of `object` that have function values.
     *
     * @static
     * @memberOf _
     * @alias methods
     * @category Objects
     * @param {Object} object The object to inspect.
     * @returns {Array} Returns an array of property names that have function values.
     * @example
     *
     * _.functions(_);
     * // => ['all', 'any', 'bind', 'bindAll', 'clone', 'compact', 'compose', ...]
     */
    function functions(object) {
      var result = [];
      forIn(object, function(value, key) {
        if (isFunction(value)) {
          result.push(key);
        }
      });
      return result.sort();
    }

    /**
     * Checks if the specified property name exists as a direct property of `object`,
     * instead of an inherited property.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The object to inspect.
     * @param {string} key The name of the property to check.
     * @returns {boolean} Returns `true` if key is a direct property, else `false`.
     * @example
     *
     * _.has({ 'a': 1, 'b': 2, 'c': 3 }, 'b');
     * // => true
     */
    function has(object, key) {
      return object ? hasOwnProperty.call(object, key) : false;
    }

    /**
     * Creates an object composed of the inverted keys and values of the given object.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The object to invert.
     * @returns {Object} Returns the created inverted object.
     * @example
     *
     * _.invert({ 'first': 'fred', 'second': 'barney' });
     * // => { 'fred': 'first', 'barney': 'second' }
     */
    function invert(object) {
      var index = -1,
          props = keys(object),
          length = props.length,
          result = {};

      while (++index < length) {
        var key = props[index];
        result[object[key]] = key;
      }
      return result;
    }

    /**
     * Checks if `value` is a boolean value.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is a boolean value, else `false`.
     * @example
     *
     * _.isBoolean(null);
     * // => false
     */
    function isBoolean(value) {
      return value === true || value === false ||
        value && typeof value == 'object' && toString.call(value) == boolClass || false;
    }

    /**
     * Checks if `value` is a date.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is a date, else `false`.
     * @example
     *
     * _.isDate(new Date);
     * // => true
     */
    function isDate(value) {
      return value && typeof value == 'object' && toString.call(value) == dateClass || false;
    }

    /**
     * Checks if `value` is a DOM element.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is a DOM element, else `false`.
     * @example
     *
     * _.isElement(document.body);
     * // => true
     */
    function isElement(value) {
      return value && value.nodeType === 1 || false;
    }

    /**
     * Checks if `value` is empty. Arrays, strings, or `arguments` objects with a
     * length of `0` and objects with no own enumerable properties are considered
     * "empty".
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Array|Object|string} value The value to inspect.
     * @returns {boolean} Returns `true` if the `value` is empty, else `false`.
     * @example
     *
     * _.isEmpty([1, 2, 3]);
     * // => false
     *
     * _.isEmpty({});
     * // => true
     *
     * _.isEmpty('');
     * // => true
     */
    function isEmpty(value) {
      var result = true;
      if (!value) {
        return result;
      }
      var className = toString.call(value),
          length = value.length;

      if ((className == arrayClass || className == stringClass || className == argsClass ) ||
          (className == objectClass && typeof length == 'number' && isFunction(value.splice))) {
        return !length;
      }
      forOwn(value, function() {
        return (result = false);
      });
      return result;
    }

    /**
     * Performs a deep comparison between two values to determine if they are
     * equivalent to each other. If a callback is provided it will be executed
     * to compare values. If the callback returns `undefined` comparisons will
     * be handled by the method instead. The callback is bound to `thisArg` and
     * invoked with two arguments; (a, b).
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} a The value to compare.
     * @param {*} b The other value to compare.
     * @param {Function} [callback] The function to customize comparing values.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {boolean} Returns `true` if the values are equivalent, else `false`.
     * @example
     *
     * var object = { 'name': 'fred' };
     * var copy = { 'name': 'fred' };
     *
     * object == copy;
     * // => false
     *
     * _.isEqual(object, copy);
     * // => true
     *
     * var words = ['hello', 'goodbye'];
     * var otherWords = ['hi', 'goodbye'];
     *
     * _.isEqual(words, otherWords, function(a, b) {
     *   var reGreet = /^(?:hello|hi)$/i,
     *       aGreet = _.isString(a) && reGreet.test(a),
     *       bGreet = _.isString(b) && reGreet.test(b);
     *
     *   return (aGreet || bGreet) ? (aGreet == bGreet) : undefined;
     * });
     * // => true
     */
    function isEqual(a, b, callback, thisArg) {
      return baseIsEqual(a, b, typeof callback == 'function' && baseCreateCallback(callback, thisArg, 2));
    }

    /**
     * Checks if `value` is, or can be coerced to, a finite number.
     *
     * Note: This is not the same as native `isFinite` which will return true for
     * booleans and empty strings. See http://es5.github.io/#x15.1.2.5.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is finite, else `false`.
     * @example
     *
     * _.isFinite(-101);
     * // => true
     *
     * _.isFinite('10');
     * // => true
     *
     * _.isFinite(true);
     * // => false
     *
     * _.isFinite('');
     * // => false
     *
     * _.isFinite(Infinity);
     * // => false
     */
    function isFinite(value) {
      return nativeIsFinite(value) && !nativeIsNaN(parseFloat(value));
    }

    /**
     * Checks if `value` is a function.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is a function, else `false`.
     * @example
     *
     * _.isFunction(_);
     * // => true
     */
    function isFunction(value) {
      return typeof value == 'function';
    }

    /**
     * Checks if `value` is the language type of Object.
     * (e.g. arrays, functions, objects, regexes, `new Number(0)`, and `new String('')`)
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is an object, else `false`.
     * @example
     *
     * _.isObject({});
     * // => true
     *
     * _.isObject([1, 2, 3]);
     * // => true
     *
     * _.isObject(1);
     * // => false
     */
    function isObject(value) {
      // check if the value is the ECMAScript language type of Object
      // http://es5.github.io/#x8
      // and avoid a V8 bug
      // http://code.google.com/p/v8/issues/detail?id=2291
      return !!(value && objectTypes[typeof value]);
    }

    /**
     * Checks if `value` is `NaN`.
     *
     * Note: This is not the same as native `isNaN` which will return `true` for
     * `undefined` and other non-numeric values. See http://es5.github.io/#x15.1.2.4.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is `NaN`, else `false`.
     * @example
     *
     * _.isNaN(NaN);
     * // => true
     *
     * _.isNaN(new Number(NaN));
     * // => true
     *
     * isNaN(undefined);
     * // => true
     *
     * _.isNaN(undefined);
     * // => false
     */
    function isNaN(value) {
      // `NaN` as a primitive is the only value that is not equal to itself
      // (perform the [[Class]] check first to avoid errors with some host objects in IE)
      return isNumber(value) && value != +value;
    }

    /**
     * Checks if `value` is `null`.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is `null`, else `false`.
     * @example
     *
     * _.isNull(null);
     * // => true
     *
     * _.isNull(undefined);
     * // => false
     */
    function isNull(value) {
      return value === null;
    }

    /**
     * Checks if `value` is a number.
     *
     * Note: `NaN` is considered a number. See http://es5.github.io/#x8.5.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is a number, else `false`.
     * @example
     *
     * _.isNumber(8.4 * 5);
     * // => true
     */
    function isNumber(value) {
      return typeof value == 'number' ||
        value && typeof value == 'object' && toString.call(value) == numberClass || false;
    }

    /**
     * Checks if `value` is an object created by the `Object` constructor.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is a plain object, else `false`.
     * @example
     *
     * function Shape() {
     *   this.x = 0;
     *   this.y = 0;
     * }
     *
     * _.isPlainObject(new Shape);
     * // => false
     *
     * _.isPlainObject([1, 2, 3]);
     * // => false
     *
     * _.isPlainObject({ 'x': 0, 'y': 0 });
     * // => true
     */
    var isPlainObject = !getPrototypeOf ? shimIsPlainObject : function(value) {
      if (!(value && toString.call(value) == objectClass)) {
        return false;
      }
      var valueOf = value.valueOf,
          objProto = isNative(valueOf) && (objProto = getPrototypeOf(valueOf)) && getPrototypeOf(objProto);

      return objProto
        ? (value == objProto || getPrototypeOf(value) == objProto)
        : shimIsPlainObject(value);
    };

    /**
     * Checks if `value` is a regular expression.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is a regular expression, else `false`.
     * @example
     *
     * _.isRegExp(/fred/);
     * // => true
     */
    function isRegExp(value) {
      return value && typeof value == 'object' && toString.call(value) == regexpClass || false;
    }

    /**
     * Checks if `value` is a string.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is a string, else `false`.
     * @example
     *
     * _.isString('fred');
     * // => true
     */
    function isString(value) {
      return typeof value == 'string' ||
        value && typeof value == 'object' && toString.call(value) == stringClass || false;
    }

    /**
     * Checks if `value` is `undefined`.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if the `value` is `undefined`, else `false`.
     * @example
     *
     * _.isUndefined(void 0);
     * // => true
     */
    function isUndefined(value) {
      return typeof value == 'undefined';
    }

    /**
     * Creates an object with the same keys as `object` and values generated by
     * running each own enumerable property of `object` through the callback.
     * The callback is bound to `thisArg` and invoked with three arguments;
     * (value, key, object).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The object to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns a new object with values of the results of each `callback` execution.
     * @example
     *
     * _.mapValues({ 'a': 1, 'b': 2, 'c': 3} , function(num) { return num * 3; });
     * // => { 'a': 3, 'b': 6, 'c': 9 }
     *
     * var characters = {
     *   'fred': { 'name': 'fred', 'age': 40 },
     *   'pebbles': { 'name': 'pebbles', 'age': 1 }
     * };
     *
     * // using "_.pluck" callback shorthand
     * _.mapValues(characters, 'age');
     * // => { 'fred': 40, 'pebbles': 1 }
     */
    function mapValues(object, callback, thisArg) {
      var result = {};
      callback = lodash.createCallback(callback, thisArg, 3);

      forOwn(object, function(value, key, object) {
        result[key] = callback(value, key, object);
      });
      return result;
    }

    /**
     * Recursively merges own enumerable properties of the source object(s), that
     * don't resolve to `undefined` into the destination object. Subsequent sources
     * will overwrite property assignments of previous sources. If a callback is
     * provided it will be executed to produce the merged values of the destination
     * and source properties. If the callback returns `undefined` merging will
     * be handled by the method instead. The callback is bound to `thisArg` and
     * invoked with two arguments; (objectValue, sourceValue).
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The destination object.
     * @param {...Object} [source] The source objects.
     * @param {Function} [callback] The function to customize merging properties.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns the destination object.
     * @example
     *
     * var names = {
     *   'characters': [
     *     { 'name': 'barney' },
     *     { 'name': 'fred' }
     *   ]
     * };
     *
     * var ages = {
     *   'characters': [
     *     { 'age': 36 },
     *     { 'age': 40 }
     *   ]
     * };
     *
     * _.merge(names, ages);
     * // => { 'characters': [{ 'name': 'barney', 'age': 36 }, { 'name': 'fred', 'age': 40 }] }
     *
     * var food = {
     *   'fruits': ['apple'],
     *   'vegetables': ['beet']
     * };
     *
     * var otherFood = {
     *   'fruits': ['banana'],
     *   'vegetables': ['carrot']
     * };
     *
     * _.merge(food, otherFood, function(a, b) {
     *   return _.isArray(a) ? a.concat(b) : undefined;
     * });
     * // => { 'fruits': ['apple', 'banana'], 'vegetables': ['beet', 'carrot] }
     */
    function merge(object) {
      var args = arguments,
          length = 2;

      if (!isObject(object)) {
        return object;
      }
      // allows working with `_.reduce` and `_.reduceRight` without using
      // their `index` and `collection` arguments
      if (typeof args[2] != 'number') {
        length = args.length;
      }
      if (length > 3 && typeof args[length - 2] == 'function') {
        var callback = baseCreateCallback(args[--length - 1], args[length--], 2);
      } else if (length > 2 && typeof args[length - 1] == 'function') {
        callback = args[--length];
      }
      var sources = slice(arguments, 1, length),
          index = -1,
          stackA = getArray(),
          stackB = getArray();

      while (++index < length) {
        baseMerge(object, sources[index], callback, stackA, stackB);
      }
      releaseArray(stackA);
      releaseArray(stackB);
      return object;
    }

    /**
     * Creates a shallow clone of `object` excluding the specified properties.
     * Property names may be specified as individual arguments or as arrays of
     * property names. If a callback is provided it will be executed for each
     * property of `object` omitting the properties the callback returns truey
     * for. The callback is bound to `thisArg` and invoked with three arguments;
     * (value, key, object).
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The source object.
     * @param {Function|...string|string[]} [callback] The properties to omit or the
     *  function called per iteration.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns an object without the omitted properties.
     * @example
     *
     * _.omit({ 'name': 'fred', 'age': 40 }, 'age');
     * // => { 'name': 'fred' }
     *
     * _.omit({ 'name': 'fred', 'age': 40 }, function(value) {
     *   return typeof value == 'number';
     * });
     * // => { 'name': 'fred' }
     */
    function omit(object, callback, thisArg) {
      var result = {};
      if (typeof callback != 'function') {
        var props = [];
        forIn(object, function(value, key) {
          props.push(key);
        });
        props = baseDifference(props, baseFlatten(arguments, true, false, 1));

        var index = -1,
            length = props.length;

        while (++index < length) {
          var key = props[index];
          result[key] = object[key];
        }
      } else {
        callback = lodash.createCallback(callback, thisArg, 3);
        forIn(object, function(value, key, object) {
          if (!callback(value, key, object)) {
            result[key] = value;
          }
        });
      }
      return result;
    }

    /**
     * Creates a two dimensional array of an object's key-value pairs,
     * i.e. `[[key1, value1], [key2, value2]]`.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The object to inspect.
     * @returns {Array} Returns new array of key-value pairs.
     * @example
     *
     * _.pairs({ 'barney': 36, 'fred': 40 });
     * // => [['barney', 36], ['fred', 40]] (property order is not guaranteed across environments)
     */
    function pairs(object) {
      var index = -1,
          props = keys(object),
          length = props.length,
          result = Array(length);

      while (++index < length) {
        var key = props[index];
        result[index] = [key, object[key]];
      }
      return result;
    }

    /**
     * Creates a shallow clone of `object` composed of the specified properties.
     * Property names may be specified as individual arguments or as arrays of
     * property names. If a callback is provided it will be executed for each
     * property of `object` picking the properties the callback returns truey
     * for. The callback is bound to `thisArg` and invoked with three arguments;
     * (value, key, object).
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The source object.
     * @param {Function|...string|string[]} [callback] The function called per
     *  iteration or property names to pick, specified as individual property
     *  names or arrays of property names.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns an object composed of the picked properties.
     * @example
     *
     * _.pick({ 'name': 'fred', '_userid': 'fred1' }, 'name');
     * // => { 'name': 'fred' }
     *
     * _.pick({ 'name': 'fred', '_userid': 'fred1' }, function(value, key) {
     *   return key.charAt(0) != '_';
     * });
     * // => { 'name': 'fred' }
     */
    function pick(object, callback, thisArg) {
      var result = {};
      if (typeof callback != 'function') {
        var index = -1,
            props = baseFlatten(arguments, true, false, 1),
            length = isObject(object) ? props.length : 0;

        while (++index < length) {
          var key = props[index];
          if (key in object) {
            result[key] = object[key];
          }
        }
      } else {
        callback = lodash.createCallback(callback, thisArg, 3);
        forIn(object, function(value, key, object) {
          if (callback(value, key, object)) {
            result[key] = value;
          }
        });
      }
      return result;
    }

    /**
     * An alternative to `_.reduce` this method transforms `object` to a new
     * `accumulator` object which is the result of running each of its own
     * enumerable properties through a callback, with each callback execution
     * potentially mutating the `accumulator` object. The callback is bound to
     * `thisArg` and invoked with four arguments; (accumulator, value, key, object).
     * Callbacks may exit iteration early by explicitly returning `false`.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Array|Object} object The object to iterate over.
     * @param {Function} [callback=identity] The function called per iteration.
     * @param {*} [accumulator] The custom accumulator value.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the accumulated value.
     * @example
     *
     * var squares = _.transform([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], function(result, num) {
     *   num *= num;
     *   if (num % 2) {
     *     return result.push(num) < 3;
     *   }
     * });
     * // => [1, 9, 25]
     *
     * var mapped = _.transform({ 'a': 1, 'b': 2, 'c': 3 }, function(result, num, key) {
     *   result[key] = num * 3;
     * });
     * // => { 'a': 3, 'b': 6, 'c': 9 }
     */
    function transform(object, callback, accumulator, thisArg) {
      var isArr = isArray(object);
      if (accumulator == null) {
        if (isArr) {
          accumulator = [];
        } else {
          var ctor = object && object.constructor,
              proto = ctor && ctor.prototype;

          accumulator = baseCreate(proto);
        }
      }
      if (callback) {
        callback = lodash.createCallback(callback, thisArg, 4);
        (isArr ? forEach : forOwn)(object, function(value, index, object) {
          return callback(accumulator, value, index, object);
        });
      }
      return accumulator;
    }

    /**
     * Creates an array composed of the own enumerable property values of `object`.
     *
     * @static
     * @memberOf _
     * @category Objects
     * @param {Object} object The object to inspect.
     * @returns {Array} Returns an array of property values.
     * @example
     *
     * _.values({ 'one': 1, 'two': 2, 'three': 3 });
     * // => [1, 2, 3] (property order is not guaranteed across environments)
     */
    function values(object) {
      var index = -1,
          props = keys(object),
          length = props.length,
          result = Array(length);

      while (++index < length) {
        result[index] = object[props[index]];
      }
      return result;
    }

    /*--------------------------------------------------------------------------*/

    /**
     * Creates an array of elements from the specified indexes, or keys, of the
     * `collection`. Indexes may be specified as individual arguments or as arrays
     * of indexes.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {...(number|number[]|string|string[])} [index] The indexes of `collection`
     *   to retrieve, specified as individual indexes or arrays of indexes.
     * @returns {Array} Returns a new array of elements corresponding to the
     *  provided indexes.
     * @example
     *
     * _.at(['a', 'b', 'c', 'd', 'e'], [0, 2, 4]);
     * // => ['a', 'c', 'e']
     *
     * _.at(['fred', 'barney', 'pebbles'], 0, 2);
     * // => ['fred', 'pebbles']
     */
    function at(collection) {
      var args = arguments,
          index = -1,
          props = baseFlatten(args, true, false, 1),
          length = (args[2] && args[2][args[1]] === collection) ? 1 : props.length,
          result = Array(length);

      while(++index < length) {
        result[index] = collection[props[index]];
      }
      return result;
    }

    /**
     * Checks if a given value is present in a collection using strict equality
     * for comparisons, i.e. `===`. If `fromIndex` is negative, it is used as the
     * offset from the end of the collection.
     *
     * @static
     * @memberOf _
     * @alias include
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {*} target The value to check for.
     * @param {number} [fromIndex=0] The index to search from.
     * @returns {boolean} Returns `true` if the `target` element is found, else `false`.
     * @example
     *
     * _.contains([1, 2, 3], 1);
     * // => true
     *
     * _.contains([1, 2, 3], 1, 2);
     * // => false
     *
     * _.contains({ 'name': 'fred', 'age': 40 }, 'fred');
     * // => true
     *
     * _.contains('pebbles', 'eb');
     * // => true
     */
    function contains(collection, target, fromIndex) {
      var index = -1,
          indexOf = getIndexOf(),
          length = collection ? collection.length : 0,
          result = false;

      fromIndex = (fromIndex < 0 ? nativeMax(0, length + fromIndex) : fromIndex) || 0;
      if (isArray(collection)) {
        result = indexOf(collection, target, fromIndex) > -1;
      } else if (typeof length == 'number') {
        result = (isString(collection) ? collection.indexOf(target, fromIndex) : indexOf(collection, target, fromIndex)) > -1;
      } else {
        forOwn(collection, function(value) {
          if (++index >= fromIndex) {
            return !(result = value === target);
          }
        });
      }
      return result;
    }

    /**
     * Creates an object composed of keys generated from the results of running
     * each element of `collection` through the callback. The corresponding value
     * of each key is the number of times the key was returned by the callback.
     * The callback is bound to `thisArg` and invoked with three arguments;
     * (value, index|key, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns the composed aggregate object.
     * @example
     *
     * _.countBy([4.3, 6.1, 6.4], function(num) { return Math.floor(num); });
     * // => { '4': 1, '6': 2 }
     *
     * _.countBy([4.3, 6.1, 6.4], function(num) { return this.floor(num); }, Math);
     * // => { '4': 1, '6': 2 }
     *
     * _.countBy(['one', 'two', 'three'], 'length');
     * // => { '3': 2, '5': 1 }
     */
    var countBy = createAggregator(function(result, value, key) {
      (hasOwnProperty.call(result, key) ? result[key]++ : result[key] = 1);
    });

    /**
     * Checks if the given callback returns truey value for **all** elements of
     * a collection. The callback is bound to `thisArg` and invoked with three
     * arguments; (value, index|key, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @alias all
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {boolean} Returns `true` if all elements passed the callback check,
     *  else `false`.
     * @example
     *
     * _.every([true, 1, null, 'yes']);
     * // => false
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36 },
     *   { 'name': 'fred',   'age': 40 }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.every(characters, 'age');
     * // => true
     *
     * // using "_.where" callback shorthand
     * _.every(characters, { 'age': 36 });
     * // => false
     */
    function every(collection, callback, thisArg) {
      var result = true;
      callback = lodash.createCallback(callback, thisArg, 3);

      var index = -1,
          length = collection ? collection.length : 0;

      if (typeof length == 'number') {
        while (++index < length) {
          if (!(result = !!callback(collection[index], index, collection))) {
            break;
          }
        }
      } else {
        forOwn(collection, function(value, index, collection) {
          return (result = !!callback(value, index, collection));
        });
      }
      return result;
    }

    /**
     * Iterates over elements of a collection, returning an array of all elements
     * the callback returns truey for. The callback is bound to `thisArg` and
     * invoked with three arguments; (value, index|key, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @alias select
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns a new array of elements that passed the callback check.
     * @example
     *
     * var evens = _.filter([1, 2, 3, 4, 5, 6], function(num) { return num % 2 == 0; });
     * // => [2, 4, 6]
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36, 'blocked': false },
     *   { 'name': 'fred',   'age': 40, 'blocked': true }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.filter(characters, 'blocked');
     * // => [{ 'name': 'fred', 'age': 40, 'blocked': true }]
     *
     * // using "_.where" callback shorthand
     * _.filter(characters, { 'age': 36 });
     * // => [{ 'name': 'barney', 'age': 36, 'blocked': false }]
     */
    function filter(collection, callback, thisArg) {
      var result = [];
      callback = lodash.createCallback(callback, thisArg, 3);

      var index = -1,
          length = collection ? collection.length : 0;

      if (typeof length == 'number') {
        while (++index < length) {
          var value = collection[index];
          if (callback(value, index, collection)) {
            result.push(value);
          }
        }
      } else {
        forOwn(collection, function(value, index, collection) {
          if (callback(value, index, collection)) {
            result.push(value);
          }
        });
      }
      return result;
    }

    /**
     * Iterates over elements of a collection, returning the first element that
     * the callback returns truey for. The callback is bound to `thisArg` and
     * invoked with three arguments; (value, index|key, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @alias detect, findWhere
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the found element, else `undefined`.
     * @example
     *
     * var characters = [
     *   { 'name': 'barney',  'age': 36, 'blocked': false },
     *   { 'name': 'fred',    'age': 40, 'blocked': true },
     *   { 'name': 'pebbles', 'age': 1,  'blocked': false }
     * ];
     *
     * _.find(characters, function(chr) {
     *   return chr.age < 40;
     * });
     * // => { 'name': 'barney', 'age': 36, 'blocked': false }
     *
     * // using "_.where" callback shorthand
     * _.find(characters, { 'age': 1 });
     * // =>  { 'name': 'pebbles', 'age': 1, 'blocked': false }
     *
     * // using "_.pluck" callback shorthand
     * _.find(characters, 'blocked');
     * // => { 'name': 'fred', 'age': 40, 'blocked': true }
     */
    function find(collection, callback, thisArg) {
      callback = lodash.createCallback(callback, thisArg, 3);

      var index = -1,
          length = collection ? collection.length : 0;

      if (typeof length == 'number') {
        while (++index < length) {
          var value = collection[index];
          if (callback(value, index, collection)) {
            return value;
          }
        }
      } else {
        var result;
        forOwn(collection, function(value, index, collection) {
          if (callback(value, index, collection)) {
            result = value;
            return false;
          }
        });
        return result;
      }
    }

    /**
     * This method is like `_.find` except that it iterates over elements
     * of a `collection` from right to left.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the found element, else `undefined`.
     * @example
     *
     * _.findLast([1, 2, 3, 4], function(num) {
     *   return num % 2 == 1;
     * });
     * // => 3
     */
    function findLast(collection, callback, thisArg) {
      var result;
      callback = lodash.createCallback(callback, thisArg, 3);
      forEachRight(collection, function(value, index, collection) {
        if (callback(value, index, collection)) {
          result = value;
          return false;
        }
      });
      return result;
    }

    /**
     * Iterates over elements of a collection, executing the callback for each
     * element. The callback is bound to `thisArg` and invoked with three arguments;
     * (value, index|key, collection). Callbacks may exit iteration early by
     * explicitly returning `false`.
     *
     * Note: As with other "Collections" methods, objects with a `length` property
     * are iterated like arrays. To avoid this behavior `_.forIn` or `_.forOwn`
     * may be used for object iteration.
     *
     * @static
     * @memberOf _
     * @alias each
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function} [callback=identity] The function called per iteration.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array|Object|string} Returns `collection`.
     * @example
     *
     * _([1, 2, 3]).forEach(function(num) { console.log(num); }).join(',');
     * // => logs each number and returns '1,2,3'
     *
     * _.forEach({ 'one': 1, 'two': 2, 'three': 3 }, function(num) { console.log(num); });
     * // => logs each number and returns the object (property order is not guaranteed across environments)
     */
    function forEach(collection, callback, thisArg) {
      var index = -1,
          length = collection ? collection.length : 0;

      callback = callback && typeof thisArg == 'undefined' ? callback : baseCreateCallback(callback, thisArg, 3);
      if (typeof length == 'number') {
        while (++index < length) {
          if (callback(collection[index], index, collection) === false) {
            break;
          }
        }
      } else {
        forOwn(collection, callback);
      }
      return collection;
    }

    /**
     * This method is like `_.forEach` except that it iterates over elements
     * of a `collection` from right to left.
     *
     * @static
     * @memberOf _
     * @alias eachRight
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function} [callback=identity] The function called per iteration.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array|Object|string} Returns `collection`.
     * @example
     *
     * _([1, 2, 3]).forEachRight(function(num) { console.log(num); }).join(',');
     * // => logs each number from right to left and returns '3,2,1'
     */
    function forEachRight(collection, callback, thisArg) {
      var length = collection ? collection.length : 0;
      callback = callback && typeof thisArg == 'undefined' ? callback : baseCreateCallback(callback, thisArg, 3);
      if (typeof length == 'number') {
        while (length--) {
          if (callback(collection[length], length, collection) === false) {
            break;
          }
        }
      } else {
        var props = keys(collection);
        length = props.length;
        forOwn(collection, function(value, key, collection) {
          key = props ? props[--length] : --length;
          return callback(collection[key], key, collection);
        });
      }
      return collection;
    }

    /**
     * Creates an object composed of keys generated from the results of running
     * each element of a collection through the callback. The corresponding value
     * of each key is an array of the elements responsible for generating the key.
     * The callback is bound to `thisArg` and invoked with three arguments;
     * (value, index|key, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns the composed aggregate object.
     * @example
     *
     * _.groupBy([4.2, 6.1, 6.4], function(num) { return Math.floor(num); });
     * // => { '4': [4.2], '6': [6.1, 6.4] }
     *
     * _.groupBy([4.2, 6.1, 6.4], function(num) { return this.floor(num); }, Math);
     * // => { '4': [4.2], '6': [6.1, 6.4] }
     *
     * // using "_.pluck" callback shorthand
     * _.groupBy(['one', 'two', 'three'], 'length');
     * // => { '3': ['one', 'two'], '5': ['three'] }
     */
    var groupBy = createAggregator(function(result, value, key) {
      (hasOwnProperty.call(result, key) ? result[key] : result[key] = []).push(value);
    });

    /**
     * Creates an object composed of keys generated from the results of running
     * each element of the collection through the given callback. The corresponding
     * value of each key is the last element responsible for generating the key.
     * The callback is bound to `thisArg` and invoked with three arguments;
     * (value, index|key, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Object} Returns the composed aggregate object.
     * @example
     *
     * var keys = [
     *   { 'dir': 'left', 'code': 97 },
     *   { 'dir': 'right', 'code': 100 }
     * ];
     *
     * _.indexBy(keys, 'dir');
     * // => { 'left': { 'dir': 'left', 'code': 97 }, 'right': { 'dir': 'right', 'code': 100 } }
     *
     * _.indexBy(keys, function(key) { return String.fromCharCode(key.code); });
     * // => { 'a': { 'dir': 'left', 'code': 97 }, 'd': { 'dir': 'right', 'code': 100 } }
     *
     * _.indexBy(characters, function(key) { this.fromCharCode(key.code); }, String);
     * // => { 'a': { 'dir': 'left', 'code': 97 }, 'd': { 'dir': 'right', 'code': 100 } }
     */
    var indexBy = createAggregator(function(result, value, key) {
      result[key] = value;
    });

    /**
     * Invokes the method named by `methodName` on each element in the `collection`
     * returning an array of the results of each invoked method. Additional arguments
     * will be provided to each invoked method. If `methodName` is a function it
     * will be invoked for, and `this` bound to, each element in the `collection`.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|string} methodName The name of the method to invoke or
     *  the function invoked per iteration.
     * @param {...*} [arg] Arguments to invoke the method with.
     * @returns {Array} Returns a new array of the results of each invoked method.
     * @example
     *
     * _.invoke([[5, 1, 7], [3, 2, 1]], 'sort');
     * // => [[1, 5, 7], [1, 2, 3]]
     *
     * _.invoke([123, 456], String.prototype.split, '');
     * // => [['1', '2', '3'], ['4', '5', '6']]
     */
    function invoke(collection, methodName) {
      var args = slice(arguments, 2),
          index = -1,
          isFunc = typeof methodName == 'function',
          length = collection ? collection.length : 0,
          result = Array(typeof length == 'number' ? length : 0);

      forEach(collection, function(value) {
        result[++index] = (isFunc ? methodName : value[methodName]).apply(value, args);
      });
      return result;
    }

    /**
     * Creates an array of values by running each element in the collection
     * through the callback. The callback is bound to `thisArg` and invoked with
     * three arguments; (value, index|key, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @alias collect
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns a new array of the results of each `callback` execution.
     * @example
     *
     * _.map([1, 2, 3], function(num) { return num * 3; });
     * // => [3, 6, 9]
     *
     * _.map({ 'one': 1, 'two': 2, 'three': 3 }, function(num) { return num * 3; });
     * // => [3, 6, 9] (property order is not guaranteed across environments)
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36 },
     *   { 'name': 'fred',   'age': 40 }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.map(characters, 'name');
     * // => ['barney', 'fred']
     */
    function map(collection, callback, thisArg) {
      var index = -1,
          length = collection ? collection.length : 0;

      callback = lodash.createCallback(callback, thisArg, 3);
      if (typeof length == 'number') {
        var result = Array(length);
        while (++index < length) {
          result[index] = callback(collection[index], index, collection);
        }
      } else {
        result = [];
        forOwn(collection, function(value, key, collection) {
          result[++index] = callback(value, key, collection);
        });
      }
      return result;
    }

    /**
     * Retrieves the maximum value of a collection. If the collection is empty or
     * falsey `-Infinity` is returned. If a callback is provided it will be executed
     * for each value in the collection to generate the criterion by which the value
     * is ranked. The callback is bound to `thisArg` and invoked with three
     * arguments; (value, index, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the maximum value.
     * @example
     *
     * _.max([4, 2, 8, 6]);
     * // => 8
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36 },
     *   { 'name': 'fred',   'age': 40 }
     * ];
     *
     * _.max(characters, function(chr) { return chr.age; });
     * // => { 'name': 'fred', 'age': 40 };
     *
     * // using "_.pluck" callback shorthand
     * _.max(characters, 'age');
     * // => { 'name': 'fred', 'age': 40 };
     */
    function max(collection, callback, thisArg) {
      var computed = -Infinity,
          result = computed;

      // allows working with functions like `_.map` without using
      // their `index` argument as a callback
      if (typeof callback != 'function' && thisArg && thisArg[callback] === collection) {
        callback = null;
      }
      if (callback == null && isArray(collection)) {
        var index = -1,
            length = collection.length;

        while (++index < length) {
          var value = collection[index];
          if (value > result) {
            result = value;
          }
        }
      } else {
        callback = (callback == null && isString(collection))
          ? charAtCallback
          : lodash.createCallback(callback, thisArg, 3);

        forEach(collection, function(value, index, collection) {
          var current = callback(value, index, collection);
          if (current > computed) {
            computed = current;
            result = value;
          }
        });
      }
      return result;
    }

    /**
     * Retrieves the minimum value of a collection. If the collection is empty or
     * falsey `Infinity` is returned. If a callback is provided it will be executed
     * for each value in the collection to generate the criterion by which the value
     * is ranked. The callback is bound to `thisArg` and invoked with three
     * arguments; (value, index, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the minimum value.
     * @example
     *
     * _.min([4, 2, 8, 6]);
     * // => 2
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36 },
     *   { 'name': 'fred',   'age': 40 }
     * ];
     *
     * _.min(characters, function(chr) { return chr.age; });
     * // => { 'name': 'barney', 'age': 36 };
     *
     * // using "_.pluck" callback shorthand
     * _.min(characters, 'age');
     * // => { 'name': 'barney', 'age': 36 };
     */
    function min(collection, callback, thisArg) {
      var computed = Infinity,
          result = computed;

      // allows working with functions like `_.map` without using
      // their `index` argument as a callback
      if (typeof callback != 'function' && thisArg && thisArg[callback] === collection) {
        callback = null;
      }
      if (callback == null && isArray(collection)) {
        var index = -1,
            length = collection.length;

        while (++index < length) {
          var value = collection[index];
          if (value < result) {
            result = value;
          }
        }
      } else {
        callback = (callback == null && isString(collection))
          ? charAtCallback
          : lodash.createCallback(callback, thisArg, 3);

        forEach(collection, function(value, index, collection) {
          var current = callback(value, index, collection);
          if (current < computed) {
            computed = current;
            result = value;
          }
        });
      }
      return result;
    }

    /**
     * Retrieves the value of a specified property from all elements in the collection.
     *
     * @static
     * @memberOf _
     * @type Function
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {string} property The name of the property to pluck.
     * @returns {Array} Returns a new array of property values.
     * @example
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36 },
     *   { 'name': 'fred',   'age': 40 }
     * ];
     *
     * _.pluck(characters, 'name');
     * // => ['barney', 'fred']
     */
    var pluck = map;

    /**
     * Reduces a collection to a value which is the accumulated result of running
     * each element in the collection through the callback, where each successive
     * callback execution consumes the return value of the previous execution. If
     * `accumulator` is not provided the first element of the collection will be
     * used as the initial `accumulator` value. The callback is bound to `thisArg`
     * and invoked with four arguments; (accumulator, value, index|key, collection).
     *
     * @static
     * @memberOf _
     * @alias foldl, inject
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function} [callback=identity] The function called per iteration.
     * @param {*} [accumulator] Initial value of the accumulator.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the accumulated value.
     * @example
     *
     * var sum = _.reduce([1, 2, 3], function(sum, num) {
     *   return sum + num;
     * });
     * // => 6
     *
     * var mapped = _.reduce({ 'a': 1, 'b': 2, 'c': 3 }, function(result, num, key) {
     *   result[key] = num * 3;
     *   return result;
     * }, {});
     * // => { 'a': 3, 'b': 6, 'c': 9 }
     */
    function reduce(collection, callback, accumulator, thisArg) {
      if (!collection) return accumulator;
      var noaccum = arguments.length < 3;
      callback = lodash.createCallback(callback, thisArg, 4);

      var index = -1,
          length = collection.length;

      if (typeof length == 'number') {
        if (noaccum) {
          accumulator = collection[++index];
        }
        while (++index < length) {
          accumulator = callback(accumulator, collection[index], index, collection);
        }
      } else {
        forOwn(collection, function(value, index, collection) {
          accumulator = noaccum
            ? (noaccum = false, value)
            : callback(accumulator, value, index, collection)
        });
      }
      return accumulator;
    }

    /**
     * This method is like `_.reduce` except that it iterates over elements
     * of a `collection` from right to left.
     *
     * @static
     * @memberOf _
     * @alias foldr
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function} [callback=identity] The function called per iteration.
     * @param {*} [accumulator] Initial value of the accumulator.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the accumulated value.
     * @example
     *
     * var list = [[0, 1], [2, 3], [4, 5]];
     * var flat = _.reduceRight(list, function(a, b) { return a.concat(b); }, []);
     * // => [4, 5, 2, 3, 0, 1]
     */
    function reduceRight(collection, callback, accumulator, thisArg) {
      var noaccum = arguments.length < 3;
      callback = lodash.createCallback(callback, thisArg, 4);
      forEachRight(collection, function(value, index, collection) {
        accumulator = noaccum
          ? (noaccum = false, value)
          : callback(accumulator, value, index, collection);
      });
      return accumulator;
    }

    /**
     * The opposite of `_.filter` this method returns the elements of a
     * collection that the callback does **not** return truey for.
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns a new array of elements that failed the callback check.
     * @example
     *
     * var odds = _.reject([1, 2, 3, 4, 5, 6], function(num) { return num % 2 == 0; });
     * // => [1, 3, 5]
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36, 'blocked': false },
     *   { 'name': 'fred',   'age': 40, 'blocked': true }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.reject(characters, 'blocked');
     * // => [{ 'name': 'barney', 'age': 36, 'blocked': false }]
     *
     * // using "_.where" callback shorthand
     * _.reject(characters, { 'age': 36 });
     * // => [{ 'name': 'fred', 'age': 40, 'blocked': true }]
     */
    function reject(collection, callback, thisArg) {
      callback = lodash.createCallback(callback, thisArg, 3);
      return filter(collection, function(value, index, collection) {
        return !callback(value, index, collection);
      });
    }

    /**
     * Retrieves a random element or `n` random elements from a collection.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to sample.
     * @param {number} [n] The number of elements to sample.
     * @param- {Object} [guard] Allows working with functions like `_.map`
     *  without using their `index` arguments as `n`.
     * @returns {Array} Returns the random sample(s) of `collection`.
     * @example
     *
     * _.sample([1, 2, 3, 4]);
     * // => 2
     *
     * _.sample([1, 2, 3, 4], 2);
     * // => [3, 1]
     */
    function sample(collection, n, guard) {
      if (collection && typeof collection.length != 'number') {
        collection = values(collection);
      }
      if (n == null || guard) {
        return collection ? collection[baseRandom(0, collection.length - 1)] : undefined;
      }
      var result = shuffle(collection);
      result.length = nativeMin(nativeMax(0, n), result.length);
      return result;
    }

    /**
     * Creates an array of shuffled values, using a version of the Fisher-Yates
     * shuffle. See http://en.wikipedia.org/wiki/Fisher-Yates_shuffle.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to shuffle.
     * @returns {Array} Returns a new shuffled collection.
     * @example
     *
     * _.shuffle([1, 2, 3, 4, 5, 6]);
     * // => [4, 1, 6, 3, 5, 2]
     */
    function shuffle(collection) {
      var index = -1,
          length = collection ? collection.length : 0,
          result = Array(typeof length == 'number' ? length : 0);

      forEach(collection, function(value) {
        var rand = baseRandom(0, ++index);
        result[index] = result[rand];
        result[rand] = value;
      });
      return result;
    }

    /**
     * Gets the size of the `collection` by returning `collection.length` for arrays
     * and array-like objects or the number of own enumerable properties for objects.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to inspect.
     * @returns {number} Returns `collection.length` or number of own enumerable properties.
     * @example
     *
     * _.size([1, 2]);
     * // => 2
     *
     * _.size({ 'one': 1, 'two': 2, 'three': 3 });
     * // => 3
     *
     * _.size('pebbles');
     * // => 7
     */
    function size(collection) {
      var length = collection ? collection.length : 0;
      return typeof length == 'number' ? length : keys(collection).length;
    }

    /**
     * Checks if the callback returns a truey value for **any** element of a
     * collection. The function returns as soon as it finds a passing value and
     * does not iterate over the entire collection. The callback is bound to
     * `thisArg` and invoked with three arguments; (value, index|key, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @alias any
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {boolean} Returns `true` if any element passed the callback check,
     *  else `false`.
     * @example
     *
     * _.some([null, 0, 'yes', false], Boolean);
     * // => true
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36, 'blocked': false },
     *   { 'name': 'fred',   'age': 40, 'blocked': true }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.some(characters, 'blocked');
     * // => true
     *
     * // using "_.where" callback shorthand
     * _.some(characters, { 'age': 1 });
     * // => false
     */
    function some(collection, callback, thisArg) {
      var result;
      callback = lodash.createCallback(callback, thisArg, 3);

      var index = -1,
          length = collection ? collection.length : 0;

      if (typeof length == 'number') {
        while (++index < length) {
          if ((result = callback(collection[index], index, collection))) {
            break;
          }
        }
      } else {
        forOwn(collection, function(value, index, collection) {
          return !(result = callback(value, index, collection));
        });
      }
      return !!result;
    }

    /**
     * Creates an array of elements, sorted in ascending order by the results of
     * running each element in a collection through the callback. This method
     * performs a stable sort, that is, it will preserve the original sort order
     * of equal elements. The callback is bound to `thisArg` and invoked with
     * three arguments; (value, index|key, collection).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an array of property names is provided for `callback` the collection
     * will be sorted by each property value.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Array|Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns a new array of sorted elements.
     * @example
     *
     * _.sortBy([1, 2, 3], function(num) { return Math.sin(num); });
     * // => [3, 1, 2]
     *
     * _.sortBy([1, 2, 3], function(num) { return this.sin(num); }, Math);
     * // => [3, 1, 2]
     *
     * var characters = [
     *   { 'name': 'barney',  'age': 36 },
     *   { 'name': 'fred',    'age': 40 },
     *   { 'name': 'barney',  'age': 26 },
     *   { 'name': 'fred',    'age': 30 }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.map(_.sortBy(characters, 'age'), _.values);
     * // => [['barney', 26], ['fred', 30], ['barney', 36], ['fred', 40]]
     *
     * // sorting by multiple properties
     * _.map(_.sortBy(characters, ['name', 'age']), _.values);
     * // = > [['barney', 26], ['barney', 36], ['fred', 30], ['fred', 40]]
     */
    function sortBy(collection, callback, thisArg) {
      var index = -1,
          isArr = isArray(callback),
          length = collection ? collection.length : 0,
          result = Array(typeof length == 'number' ? length : 0);

      if (!isArr) {
        callback = lodash.createCallback(callback, thisArg, 3);
      }
      forEach(collection, function(value, key, collection) {
        var object = result[++index] = getObject();
        if (isArr) {
          object.criteria = map(callback, function(key) { return value[key]; });
        } else {
          (object.criteria = getArray())[0] = callback(value, key, collection);
        }
        object.index = index;
        object.value = value;
      });

      length = result.length;
      result.sort(compareAscending);
      while (length--) {
        var object = result[length];
        result[length] = object.value;
        if (!isArr) {
          releaseArray(object.criteria);
        }
        releaseObject(object);
      }
      return result;
    }

    /**
     * Converts the `collection` to an array.
     *
     * @static
     * @memberOf _
     * @category Collections
     * @param {Array|Object|string} collection The collection to convert.
     * @returns {Array} Returns the new converted array.
     * @example
     *
     * (function() { return _.toArray(arguments).slice(1); })(1, 2, 3, 4);
     * // => [2, 3, 4]
     */
    function toArray(collection) {
      if (collection && typeof collection.length == 'number') {
        return slice(collection);
      }
      return values(collection);
    }

    /**
     * Performs a deep comparison of each element in a `collection` to the given
     * `properties` object, returning an array of all elements that have equivalent
     * property values.
     *
     * @static
     * @memberOf _
     * @type Function
     * @category Collections
     * @param {Array|Object|string} collection The collection to iterate over.
     * @param {Object} props The object of property values to filter by.
     * @returns {Array} Returns a new array of elements that have the given properties.
     * @example
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36, 'pets': ['hoppy'] },
     *   { 'name': 'fred',   'age': 40, 'pets': ['baby puss', 'dino'] }
     * ];
     *
     * _.where(characters, { 'age': 36 });
     * // => [{ 'name': 'barney', 'age': 36, 'pets': ['hoppy'] }]
     *
     * _.where(characters, { 'pets': ['dino'] });
     * // => [{ 'name': 'fred', 'age': 40, 'pets': ['baby puss', 'dino'] }]
     */
    var where = filter;

    /*--------------------------------------------------------------------------*/

    /**
     * Creates an array with all falsey values removed. The values `false`, `null`,
     * `0`, `""`, `undefined`, and `NaN` are all falsey.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to compact.
     * @returns {Array} Returns a new array of filtered values.
     * @example
     *
     * _.compact([0, 1, false, 2, '', 3]);
     * // => [1, 2, 3]
     */
    function compact(array) {
      var index = -1,
          length = array ? array.length : 0,
          result = [];

      while (++index < length) {
        var value = array[index];
        if (value) {
          result.push(value);
        }
      }
      return result;
    }

    /**
     * Creates an array excluding all values of the provided arrays using strict
     * equality for comparisons, i.e. `===`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to process.
     * @param {...Array} [values] The arrays of values to exclude.
     * @returns {Array} Returns a new array of filtered values.
     * @example
     *
     * _.difference([1, 2, 3, 4, 5], [5, 2, 10]);
     * // => [1, 3, 4]
     */
    function difference(array) {
      return baseDifference(array, baseFlatten(arguments, true, true, 1));
    }

    /**
     * This method is like `_.find` except that it returns the index of the first
     * element that passes the callback check, instead of the element itself.
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to search.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {number} Returns the index of the found element, else `-1`.
     * @example
     *
     * var characters = [
     *   { 'name': 'barney',  'age': 36, 'blocked': false },
     *   { 'name': 'fred',    'age': 40, 'blocked': true },
     *   { 'name': 'pebbles', 'age': 1,  'blocked': false }
     * ];
     *
     * _.findIndex(characters, function(chr) {
     *   return chr.age < 20;
     * });
     * // => 2
     *
     * // using "_.where" callback shorthand
     * _.findIndex(characters, { 'age': 36 });
     * // => 0
     *
     * // using "_.pluck" callback shorthand
     * _.findIndex(characters, 'blocked');
     * // => 1
     */
    function findIndex(array, callback, thisArg) {
      var index = -1,
          length = array ? array.length : 0;

      callback = lodash.createCallback(callback, thisArg, 3);
      while (++index < length) {
        if (callback(array[index], index, array)) {
          return index;
        }
      }
      return -1;
    }

    /**
     * This method is like `_.findIndex` except that it iterates over elements
     * of a `collection` from right to left.
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to search.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {number} Returns the index of the found element, else `-1`.
     * @example
     *
     * var characters = [
     *   { 'name': 'barney',  'age': 36, 'blocked': true },
     *   { 'name': 'fred',    'age': 40, 'blocked': false },
     *   { 'name': 'pebbles', 'age': 1,  'blocked': true }
     * ];
     *
     * _.findLastIndex(characters, function(chr) {
     *   return chr.age > 30;
     * });
     * // => 1
     *
     * // using "_.where" callback shorthand
     * _.findLastIndex(characters, { 'age': 36 });
     * // => 0
     *
     * // using "_.pluck" callback shorthand
     * _.findLastIndex(characters, 'blocked');
     * // => 2
     */
    function findLastIndex(array, callback, thisArg) {
      var length = array ? array.length : 0;
      callback = lodash.createCallback(callback, thisArg, 3);
      while (length--) {
        if (callback(array[length], length, array)) {
          return length;
        }
      }
      return -1;
    }

    /**
     * Gets the first element or first `n` elements of an array. If a callback
     * is provided elements at the beginning of the array are returned as long
     * as the callback returns truey. The callback is bound to `thisArg` and
     * invoked with three arguments; (value, index, array).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @alias head, take
     * @category Arrays
     * @param {Array} array The array to query.
     * @param {Function|Object|number|string} [callback] The function called
     *  per element or the number of elements to return. If a property name or
     *  object is provided it will be used to create a "_.pluck" or "_.where"
     *  style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the first element(s) of `array`.
     * @example
     *
     * _.first([1, 2, 3]);
     * // => 1
     *
     * _.first([1, 2, 3], 2);
     * // => [1, 2]
     *
     * _.first([1, 2, 3], function(num) {
     *   return num < 3;
     * });
     * // => [1, 2]
     *
     * var characters = [
     *   { 'name': 'barney',  'blocked': true,  'employer': 'slate' },
     *   { 'name': 'fred',    'blocked': false, 'employer': 'slate' },
     *   { 'name': 'pebbles', 'blocked': true,  'employer': 'na' }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.first(characters, 'blocked');
     * // => [{ 'name': 'barney', 'blocked': true, 'employer': 'slate' }]
     *
     * // using "_.where" callback shorthand
     * _.pluck(_.first(characters, { 'employer': 'slate' }), 'name');
     * // => ['barney', 'fred']
     */
    function first(array, callback, thisArg) {
      var n = 0,
          length = array ? array.length : 0;

      if (typeof callback != 'number' && callback != null) {
        var index = -1;
        callback = lodash.createCallback(callback, thisArg, 3);
        while (++index < length && callback(array[index], index, array)) {
          n++;
        }
      } else {
        n = callback;
        if (n == null || thisArg) {
          return array ? array[0] : undefined;
        }
      }
      return slice(array, 0, nativeMin(nativeMax(0, n), length));
    }

    /**
     * Flattens a nested array (the nesting can be to any depth). If `isShallow`
     * is truey, the array will only be flattened a single level. If a callback
     * is provided each element of the array is passed through the callback before
     * flattening. The callback is bound to `thisArg` and invoked with three
     * arguments; (value, index, array).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to flatten.
     * @param {boolean} [isShallow=false] A flag to restrict flattening to a single level.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns a new flattened array.
     * @example
     *
     * _.flatten([1, [2], [3, [[4]]]]);
     * // => [1, 2, 3, 4];
     *
     * _.flatten([1, [2], [3, [[4]]]], true);
     * // => [1, 2, 3, [[4]]];
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 30, 'pets': ['hoppy'] },
     *   { 'name': 'fred',   'age': 40, 'pets': ['baby puss', 'dino'] }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.flatten(characters, 'pets');
     * // => ['hoppy', 'baby puss', 'dino']
     */
    function flatten(array, isShallow, callback, thisArg) {
      // juggle arguments
      if (typeof isShallow != 'boolean' && isShallow != null) {
        thisArg = callback;
        callback = (typeof isShallow != 'function' && thisArg && thisArg[isShallow] === array) ? null : isShallow;
        isShallow = false;
      }
      if (callback != null) {
        array = map(array, callback, thisArg);
      }
      return baseFlatten(array, isShallow);
    }

    /**
     * Gets the index at which the first occurrence of `value` is found using
     * strict equality for comparisons, i.e. `===`. If the array is already sorted
     * providing `true` for `fromIndex` will run a faster binary search.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to search.
     * @param {*} value The value to search for.
     * @param {boolean|number} [fromIndex=0] The index to search from or `true`
     *  to perform a binary search on a sorted array.
     * @returns {number} Returns the index of the matched value or `-1`.
     * @example
     *
     * _.indexOf([1, 2, 3, 1, 2, 3], 2);
     * // => 1
     *
     * _.indexOf([1, 2, 3, 1, 2, 3], 2, 3);
     * // => 4
     *
     * _.indexOf([1, 1, 2, 2, 3, 3], 2, true);
     * // => 2
     */
    function indexOf(array, value, fromIndex) {
      if (typeof fromIndex == 'number') {
        var length = array ? array.length : 0;
        fromIndex = (fromIndex < 0 ? nativeMax(0, length + fromIndex) : fromIndex || 0);
      } else if (fromIndex) {
        var index = sortedIndex(array, value);
        return array[index] === value ? index : -1;
      }
      return baseIndexOf(array, value, fromIndex);
    }

    /**
     * Gets all but the last element or last `n` elements of an array. If a
     * callback is provided elements at the end of the array are excluded from
     * the result as long as the callback returns truey. The callback is bound
     * to `thisArg` and invoked with three arguments; (value, index, array).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to query.
     * @param {Function|Object|number|string} [callback=1] The function called
     *  per element or the number of elements to exclude. If a property name or
     *  object is provided it will be used to create a "_.pluck" or "_.where"
     *  style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns a slice of `array`.
     * @example
     *
     * _.initial([1, 2, 3]);
     * // => [1, 2]
     *
     * _.initial([1, 2, 3], 2);
     * // => [1]
     *
     * _.initial([1, 2, 3], function(num) {
     *   return num > 1;
     * });
     * // => [1]
     *
     * var characters = [
     *   { 'name': 'barney',  'blocked': false, 'employer': 'slate' },
     *   { 'name': 'fred',    'blocked': true,  'employer': 'slate' },
     *   { 'name': 'pebbles', 'blocked': true,  'employer': 'na' }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.initial(characters, 'blocked');
     * // => [{ 'name': 'barney',  'blocked': false, 'employer': 'slate' }]
     *
     * // using "_.where" callback shorthand
     * _.pluck(_.initial(characters, { 'employer': 'na' }), 'name');
     * // => ['barney', 'fred']
     */
    function initial(array, callback, thisArg) {
      var n = 0,
          length = array ? array.length : 0;

      if (typeof callback != 'number' && callback != null) {
        var index = length;
        callback = lodash.createCallback(callback, thisArg, 3);
        while (index-- && callback(array[index], index, array)) {
          n++;
        }
      } else {
        n = (callback == null || thisArg) ? 1 : callback || n;
      }
      return slice(array, 0, nativeMin(nativeMax(0, length - n), length));
    }

    /**
     * Creates an array of unique values present in all provided arrays using
     * strict equality for comparisons, i.e. `===`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {...Array} [array] The arrays to inspect.
     * @returns {Array} Returns an array of shared values.
     * @example
     *
     * _.intersection([1, 2, 3], [5, 2, 1, 4], [2, 1]);
     * // => [1, 2]
     */
    function intersection() {
      var args = [],
          argsIndex = -1,
          argsLength = arguments.length,
          caches = getArray(),
          indexOf = getIndexOf(),
          trustIndexOf = indexOf === baseIndexOf,
          seen = getArray();

      while (++argsIndex < argsLength) {
        var value = arguments[argsIndex];
        if (isArray(value) || isArguments(value)) {
          args.push(value);
          caches.push(trustIndexOf && value.length >= largeArraySize &&
            createCache(argsIndex ? args[argsIndex] : seen));
        }
      }
      var array = args[0],
          index = -1,
          length = array ? array.length : 0,
          result = [];

      outer:
      while (++index < length) {
        var cache = caches[0];
        value = array[index];

        if ((cache ? cacheIndexOf(cache, value) : indexOf(seen, value)) < 0) {
          argsIndex = argsLength;
          (cache || seen).push(value);
          while (--argsIndex) {
            cache = caches[argsIndex];
            if ((cache ? cacheIndexOf(cache, value) : indexOf(args[argsIndex], value)) < 0) {
              continue outer;
            }
          }
          result.push(value);
        }
      }
      while (argsLength--) {
        cache = caches[argsLength];
        if (cache) {
          releaseObject(cache);
        }
      }
      releaseArray(caches);
      releaseArray(seen);
      return result;
    }

    /**
     * Gets the last element or last `n` elements of an array. If a callback is
     * provided elements at the end of the array are returned as long as the
     * callback returns truey. The callback is bound to `thisArg` and invoked
     * with three arguments; (value, index, array).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to query.
     * @param {Function|Object|number|string} [callback] The function called
     *  per element or the number of elements to return. If a property name or
     *  object is provided it will be used to create a "_.pluck" or "_.where"
     *  style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {*} Returns the last element(s) of `array`.
     * @example
     *
     * _.last([1, 2, 3]);
     * // => 3
     *
     * _.last([1, 2, 3], 2);
     * // => [2, 3]
     *
     * _.last([1, 2, 3], function(num) {
     *   return num > 1;
     * });
     * // => [2, 3]
     *
     * var characters = [
     *   { 'name': 'barney',  'blocked': false, 'employer': 'slate' },
     *   { 'name': 'fred',    'blocked': true,  'employer': 'slate' },
     *   { 'name': 'pebbles', 'blocked': true,  'employer': 'na' }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.pluck(_.last(characters, 'blocked'), 'name');
     * // => ['fred', 'pebbles']
     *
     * // using "_.where" callback shorthand
     * _.last(characters, { 'employer': 'na' });
     * // => [{ 'name': 'pebbles', 'blocked': true, 'employer': 'na' }]
     */
    function last(array, callback, thisArg) {
      var n = 0,
          length = array ? array.length : 0;

      if (typeof callback != 'number' && callback != null) {
        var index = length;
        callback = lodash.createCallback(callback, thisArg, 3);
        while (index-- && callback(array[index], index, array)) {
          n++;
        }
      } else {
        n = callback;
        if (n == null || thisArg) {
          return array ? array[length - 1] : undefined;
        }
      }
      return slice(array, nativeMax(0, length - n));
    }

    /**
     * Gets the index at which the last occurrence of `value` is found using strict
     * equality for comparisons, i.e. `===`. If `fromIndex` is negative, it is used
     * as the offset from the end of the collection.
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to search.
     * @param {*} value The value to search for.
     * @param {number} [fromIndex=array.length-1] The index to search from.
     * @returns {number} Returns the index of the matched value or `-1`.
     * @example
     *
     * _.lastIndexOf([1, 2, 3, 1, 2, 3], 2);
     * // => 4
     *
     * _.lastIndexOf([1, 2, 3, 1, 2, 3], 2, 3);
     * // => 1
     */
    function lastIndexOf(array, value, fromIndex) {
      var index = array ? array.length : 0;
      if (typeof fromIndex == 'number') {
        index = (fromIndex < 0 ? nativeMax(0, index + fromIndex) : nativeMin(fromIndex, index - 1)) + 1;
      }
      while (index--) {
        if (array[index] === value) {
          return index;
        }
      }
      return -1;
    }

    /**
     * Removes all provided values from the given array using strict equality for
     * comparisons, i.e. `===`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to modify.
     * @param {...*} [value] The values to remove.
     * @returns {Array} Returns `array`.
     * @example
     *
     * var array = [1, 2, 3, 1, 2, 3];
     * _.pull(array, 2, 3);
     * console.log(array);
     * // => [1, 1]
     */
    function pull(array) {
      var args = arguments,
          argsIndex = 0,
          argsLength = args.length,
          length = array ? array.length : 0;

      while (++argsIndex < argsLength) {
        var index = -1,
            value = args[argsIndex];
        while (++index < length) {
          if (array[index] === value) {
            splice.call(array, index--, 1);
            length--;
          }
        }
      }
      return array;
    }

    /**
     * Creates an array of numbers (positive and/or negative) progressing from
     * `start` up to but not including `end`. If `start` is less than `stop` a
     * zero-length range is created unless a negative `step` is specified.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {number} [start=0] The start of the range.
     * @param {number} end The end of the range.
     * @param {number} [step=1] The value to increment or decrement by.
     * @returns {Array} Returns a new range array.
     * @example
     *
     * _.range(4);
     * // => [0, 1, 2, 3]
     *
     * _.range(1, 5);
     * // => [1, 2, 3, 4]
     *
     * _.range(0, 20, 5);
     * // => [0, 5, 10, 15]
     *
     * _.range(0, -4, -1);
     * // => [0, -1, -2, -3]
     *
     * _.range(1, 4, 0);
     * // => [1, 1, 1]
     *
     * _.range(0);
     * // => []
     */
    function range(start, end, step) {
      start = +start || 0;
      step = typeof step == 'number' ? step : (+step || 1);

      if (end == null) {
        end = start;
        start = 0;
      }
      // use `Array(length)` so engines like Chakra and V8 avoid slower modes
      // http://youtu.be/XAqIpGU8ZZk#t=17m25s
      var index = -1,
          length = nativeMax(0, ceil((end - start) / (step || 1))),
          result = Array(length);

      while (++index < length) {
        result[index] = start;
        start += step;
      }
      return result;
    }

    /**
     * Removes all elements from an array that the callback returns truey for
     * and returns an array of removed elements. The callback is bound to `thisArg`
     * and invoked with three arguments; (value, index, array).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to modify.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns a new array of removed elements.
     * @example
     *
     * var array = [1, 2, 3, 4, 5, 6];
     * var evens = _.remove(array, function(num) { return num % 2 == 0; });
     *
     * console.log(array);
     * // => [1, 3, 5]
     *
     * console.log(evens);
     * // => [2, 4, 6]
     */
    function remove(array, callback, thisArg) {
      var index = -1,
          length = array ? array.length : 0,
          result = [];

      callback = lodash.createCallback(callback, thisArg, 3);
      while (++index < length) {
        var value = array[index];
        if (callback(value, index, array)) {
          result.push(value);
          splice.call(array, index--, 1);
          length--;
        }
      }
      return result;
    }

    /**
     * The opposite of `_.initial` this method gets all but the first element or
     * first `n` elements of an array. If a callback function is provided elements
     * at the beginning of the array are excluded from the result as long as the
     * callback returns truey. The callback is bound to `thisArg` and invoked
     * with three arguments; (value, index, array).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @alias drop, tail
     * @category Arrays
     * @param {Array} array The array to query.
     * @param {Function|Object|number|string} [callback=1] The function called
     *  per element or the number of elements to exclude. If a property name or
     *  object is provided it will be used to create a "_.pluck" or "_.where"
     *  style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns a slice of `array`.
     * @example
     *
     * _.rest([1, 2, 3]);
     * // => [2, 3]
     *
     * _.rest([1, 2, 3], 2);
     * // => [3]
     *
     * _.rest([1, 2, 3], function(num) {
     *   return num < 3;
     * });
     * // => [3]
     *
     * var characters = [
     *   { 'name': 'barney',  'blocked': true,  'employer': 'slate' },
     *   { 'name': 'fred',    'blocked': false,  'employer': 'slate' },
     *   { 'name': 'pebbles', 'blocked': true, 'employer': 'na' }
     * ];
     *
     * // using "_.pluck" callback shorthand
     * _.pluck(_.rest(characters, 'blocked'), 'name');
     * // => ['fred', 'pebbles']
     *
     * // using "_.where" callback shorthand
     * _.rest(characters, { 'employer': 'slate' });
     * // => [{ 'name': 'pebbles', 'blocked': true, 'employer': 'na' }]
     */
    function rest(array, callback, thisArg) {
      if (typeof callback != 'number' && callback != null) {
        var n = 0,
            index = -1,
            length = array ? array.length : 0;

        callback = lodash.createCallback(callback, thisArg, 3);
        while (++index < length && callback(array[index], index, array)) {
          n++;
        }
      } else {
        n = (callback == null || thisArg) ? 1 : nativeMax(0, callback);
      }
      return slice(array, n);
    }

    /**
     * Uses a binary search to determine the smallest index at which a value
     * should be inserted into a given sorted array in order to maintain the sort
     * order of the array. If a callback is provided it will be executed for
     * `value` and each element of `array` to compute their sort ranking. The
     * callback is bound to `thisArg` and invoked with one argument; (value).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to inspect.
     * @param {*} value The value to evaluate.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {number} Returns the index at which `value` should be inserted
     *  into `array`.
     * @example
     *
     * _.sortedIndex([20, 30, 50], 40);
     * // => 2
     *
     * // using "_.pluck" callback shorthand
     * _.sortedIndex([{ 'x': 20 }, { 'x': 30 }, { 'x': 50 }], { 'x': 40 }, 'x');
     * // => 2
     *
     * var dict = {
     *   'wordToNumber': { 'twenty': 20, 'thirty': 30, 'fourty': 40, 'fifty': 50 }
     * };
     *
     * _.sortedIndex(['twenty', 'thirty', 'fifty'], 'fourty', function(word) {
     *   return dict.wordToNumber[word];
     * });
     * // => 2
     *
     * _.sortedIndex(['twenty', 'thirty', 'fifty'], 'fourty', function(word) {
     *   return this.wordToNumber[word];
     * }, dict);
     * // => 2
     */
    function sortedIndex(array, value, callback, thisArg) {
      var low = 0,
          high = array ? array.length : low;

      // explicitly reference `identity` for better inlining in Firefox
      callback = callback ? lodash.createCallback(callback, thisArg, 1) : identity;
      value = callback(value);

      while (low < high) {
        var mid = (low + high) >>> 1;
        (callback(array[mid]) < value)
          ? low = mid + 1
          : high = mid;
      }
      return low;
    }

    /**
     * Creates an array of unique values, in order, of the provided arrays using
     * strict equality for comparisons, i.e. `===`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {...Array} [array] The arrays to inspect.
     * @returns {Array} Returns an array of combined values.
     * @example
     *
     * _.union([1, 2, 3], [5, 2, 1, 4], [2, 1]);
     * // => [1, 2, 3, 5, 4]
     */
    function union() {
      return baseUniq(baseFlatten(arguments, true, true));
    }

    /**
     * Creates a duplicate-value-free version of an array using strict equality
     * for comparisons, i.e. `===`. If the array is sorted, providing
     * `true` for `isSorted` will use a faster algorithm. If a callback is provided
     * each element of `array` is passed through the callback before uniqueness
     * is computed. The callback is bound to `thisArg` and invoked with three
     * arguments; (value, index, array).
     *
     * If a property name is provided for `callback` the created "_.pluck" style
     * callback will return the property value of the given element.
     *
     * If an object is provided for `callback` the created "_.where" style callback
     * will return `true` for elements that have the properties of the given object,
     * else `false`.
     *
     * @static
     * @memberOf _
     * @alias unique
     * @category Arrays
     * @param {Array} array The array to process.
     * @param {boolean} [isSorted=false] A flag to indicate that `array` is sorted.
     * @param {Function|Object|string} [callback=identity] The function called
     *  per iteration. If a property name or object is provided it will be used
     *  to create a "_.pluck" or "_.where" style callback, respectively.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns a duplicate-value-free array.
     * @example
     *
     * _.uniq([1, 2, 1, 3, 1]);
     * // => [1, 2, 3]
     *
     * _.uniq([1, 1, 2, 2, 3], true);
     * // => [1, 2, 3]
     *
     * _.uniq(['A', 'b', 'C', 'a', 'B', 'c'], function(letter) { return letter.toLowerCase(); });
     * // => ['A', 'b', 'C']
     *
     * _.uniq([1, 2.5, 3, 1.5, 2, 3.5], function(num) { return this.floor(num); }, Math);
     * // => [1, 2.5, 3]
     *
     * // using "_.pluck" callback shorthand
     * _.uniq([{ 'x': 1 }, { 'x': 2 }, { 'x': 1 }], 'x');
     * // => [{ 'x': 1 }, { 'x': 2 }]
     */
    function uniq(array, isSorted, callback, thisArg) {
      // juggle arguments
      if (typeof isSorted != 'boolean' && isSorted != null) {
        thisArg = callback;
        callback = (typeof isSorted != 'function' && thisArg && thisArg[isSorted] === array) ? null : isSorted;
        isSorted = false;
      }
      if (callback != null) {
        callback = lodash.createCallback(callback, thisArg, 3);
      }
      return baseUniq(array, isSorted, callback);
    }

    /**
     * Creates an array excluding all provided values using strict equality for
     * comparisons, i.e. `===`.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {Array} array The array to filter.
     * @param {...*} [value] The values to exclude.
     * @returns {Array} Returns a new array of filtered values.
     * @example
     *
     * _.without([1, 2, 1, 0, 3, 1, 4], 0, 1);
     * // => [2, 3, 4]
     */
    function without(array) {
      return baseDifference(array, slice(arguments, 1));
    }

    /**
     * Creates an array that is the symmetric difference of the provided arrays.
     * See http://en.wikipedia.org/wiki/Symmetric_difference.
     *
     * @static
     * @memberOf _
     * @category Arrays
     * @param {...Array} [array] The arrays to inspect.
     * @returns {Array} Returns an array of values.
     * @example
     *
     * _.xor([1, 2, 3], [5, 2, 1, 4]);
     * // => [3, 5, 4]
     *
     * _.xor([1, 2, 5], [2, 3, 5], [3, 4, 5]);
     * // => [1, 4, 5]
     */
    function xor() {
      var index = -1,
          length = arguments.length;

      while (++index < length) {
        var array = arguments[index];
        if (isArray(array) || isArguments(array)) {
          var result = result
            ? baseUniq(baseDifference(result, array).concat(baseDifference(array, result)))
            : array;
        }
      }
      return result || [];
    }

    /**
     * Creates an array of grouped elements, the first of which contains the first
     * elements of the given arrays, the second of which contains the second
     * elements of the given arrays, and so on.
     *
     * @static
     * @memberOf _
     * @alias unzip
     * @category Arrays
     * @param {...Array} [array] Arrays to process.
     * @returns {Array} Returns a new array of grouped elements.
     * @example
     *
     * _.zip(['fred', 'barney'], [30, 40], [true, false]);
     * // => [['fred', 30, true], ['barney', 40, false]]
     */
    function zip() {
      var array = arguments.length > 1 ? arguments : arguments[0],
          index = -1,
          length = array ? max(pluck(array, 'length')) : 0,
          result = Array(length < 0 ? 0 : length);

      while (++index < length) {
        result[index] = pluck(array, index);
      }
      return result;
    }

    /**
     * Creates an object composed from arrays of `keys` and `values`. Provide
     * either a single two dimensional array, i.e. `[[key1, value1], [key2, value2]]`
     * or two arrays, one of `keys` and one of corresponding `values`.
     *
     * @static
     * @memberOf _
     * @alias object
     * @category Arrays
     * @param {Array} keys The array of keys.
     * @param {Array} [values=[]] The array of values.
     * @returns {Object} Returns an object composed of the given keys and
     *  corresponding values.
     * @example
     *
     * _.zipObject(['fred', 'barney'], [30, 40]);
     * // => { 'fred': 30, 'barney': 40 }
     */
    function zipObject(keys, values) {
      var index = -1,
          length = keys ? keys.length : 0,
          result = {};

      if (!values && length && !isArray(keys[0])) {
        values = [];
      }
      while (++index < length) {
        var key = keys[index];
        if (values) {
          result[key] = values[index];
        } else if (key) {
          result[key[0]] = key[1];
        }
      }
      return result;
    }

    /*--------------------------------------------------------------------------*/

    /**
     * Creates a function that executes `func`, with  the `this` binding and
     * arguments of the created function, only after being called `n` times.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {number} n The number of times the function must be called before
     *  `func` is executed.
     * @param {Function} func The function to restrict.
     * @returns {Function} Returns the new restricted function.
     * @example
     *
     * var saves = ['profile', 'settings'];
     *
     * var done = _.after(saves.length, function() {
     *   console.log('Done saving!');
     * });
     *
     * _.forEach(saves, function(type) {
     *   asyncSave({ 'type': type, 'complete': done });
     * });
     * // => logs 'Done saving!', after all saves have completed
     */
    function after(n, func) {
      if (!isFunction(func)) {
        throw new TypeError;
      }
      return function() {
        if (--n < 1) {
          return func.apply(this, arguments);
        }
      };
    }

    /**
     * Creates a function that, when called, invokes `func` with the `this`
     * binding of `thisArg` and prepends any additional `bind` arguments to those
     * provided to the bound function.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Function} func The function to bind.
     * @param {*} [thisArg] The `this` binding of `func`.
     * @param {...*} [arg] Arguments to be partially applied.
     * @returns {Function} Returns the new bound function.
     * @example
     *
     * var func = function(greeting) {
     *   return greeting + ' ' + this.name;
     * };
     *
     * func = _.bind(func, { 'name': 'fred' }, 'hi');
     * func();
     * // => 'hi fred'
     */
    function bind(func, thisArg) {
      return arguments.length > 2
        ? createWrapper(func, 17, slice(arguments, 2), null, thisArg)
        : createWrapper(func, 1, null, null, thisArg);
    }

    /**
     * Binds methods of an object to the object itself, overwriting the existing
     * method. Method names may be specified as individual arguments or as arrays
     * of method names. If no method names are provided all the function properties
     * of `object` will be bound.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Object} object The object to bind and assign the bound methods to.
     * @param {...string} [methodName] The object method names to
     *  bind, specified as individual method names or arrays of method names.
     * @returns {Object} Returns `object`.
     * @example
     *
     * var view = {
     *   'label': 'docs',
     *   'onClick': function() { console.log('clicked ' + this.label); }
     * };
     *
     * _.bindAll(view);
     * jQuery('#docs').on('click', view.onClick);
     * // => logs 'clicked docs', when the button is clicked
     */
    function bindAll(object) {
      var funcs = arguments.length > 1 ? baseFlatten(arguments, true, false, 1) : functions(object),
          index = -1,
          length = funcs.length;

      while (++index < length) {
        var key = funcs[index];
        object[key] = createWrapper(object[key], 1, null, null, object);
      }
      return object;
    }

    /**
     * Creates a function that, when called, invokes the method at `object[key]`
     * and prepends any additional `bindKey` arguments to those provided to the bound
     * function. This method differs from `_.bind` by allowing bound functions to
     * reference methods that will be redefined or don't yet exist.
     * See http://michaux.ca/articles/lazy-function-definition-pattern.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Object} object The object the method belongs to.
     * @param {string} key The key of the method.
     * @param {...*} [arg] Arguments to be partially applied.
     * @returns {Function} Returns the new bound function.
     * @example
     *
     * var object = {
     *   'name': 'fred',
     *   'greet': function(greeting) {
     *     return greeting + ' ' + this.name;
     *   }
     * };
     *
     * var func = _.bindKey(object, 'greet', 'hi');
     * func();
     * // => 'hi fred'
     *
     * object.greet = function(greeting) {
     *   return greeting + 'ya ' + this.name + '!';
     * };
     *
     * func();
     * // => 'hiya fred!'
     */
    function bindKey(object, key) {
      return arguments.length > 2
        ? createWrapper(key, 19, slice(arguments, 2), null, object)
        : createWrapper(key, 3, null, null, object);
    }

    /**
     * Creates a function that is the composition of the provided functions,
     * where each function consumes the return value of the function that follows.
     * For example, composing the functions `f()`, `g()`, and `h()` produces `f(g(h()))`.
     * Each function is executed with the `this` binding of the composed function.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {...Function} [func] Functions to compose.
     * @returns {Function} Returns the new composed function.
     * @example
     *
     * var realNameMap = {
     *   'pebbles': 'penelope'
     * };
     *
     * var format = function(name) {
     *   name = realNameMap[name.toLowerCase()] || name;
     *   return name.charAt(0).toUpperCase() + name.slice(1).toLowerCase();
     * };
     *
     * var greet = function(formatted) {
     *   return 'Hiya ' + formatted + '!';
     * };
     *
     * var welcome = _.compose(greet, format);
     * welcome('pebbles');
     * // => 'Hiya Penelope!'
     */
    function compose() {
      var funcs = arguments,
          length = funcs.length;

      while (length--) {
        if (!isFunction(funcs[length])) {
          throw new TypeError;
        }
      }
      return function() {
        var args = arguments,
            length = funcs.length;

        while (length--) {
          args = [funcs[length].apply(this, args)];
        }
        return args[0];
      };
    }

    /**
     * Creates a function which accepts one or more arguments of `func` that when
     * invoked either executes `func` returning its result, if all `func` arguments
     * have been provided, or returns a function that accepts one or more of the
     * remaining `func` arguments, and so on. The arity of `func` can be specified
     * if `func.length` is not sufficient.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Function} func The function to curry.
     * @param {number} [arity=func.length] The arity of `func`.
     * @returns {Function} Returns the new curried function.
     * @example
     *
     * var curried = _.curry(function(a, b, c) {
     *   console.log(a + b + c);
     * });
     *
     * curried(1)(2)(3);
     * // => 6
     *
     * curried(1, 2)(3);
     * // => 6
     *
     * curried(1, 2, 3);
     * // => 6
     */
    function curry(func, arity) {
      arity = typeof arity == 'number' ? arity : (+arity || func.length);
      return createWrapper(func, 4, null, null, null, arity);
    }

    /**
     * Creates a function that will delay the execution of `func` until after
     * `wait` milliseconds have elapsed since the last time it was invoked.
     * Provide an options object to indicate that `func` should be invoked on
     * the leading and/or trailing edge of the `wait` timeout. Subsequent calls
     * to the debounced function will return the result of the last `func` call.
     *
     * Note: If `leading` and `trailing` options are `true` `func` will be called
     * on the trailing edge of the timeout only if the the debounced function is
     * invoked more than once during the `wait` timeout.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Function} func The function to debounce.
     * @param {number} wait The number of milliseconds to delay.
     * @param {Object} [options] The options object.
     * @param {boolean} [options.leading=false] Specify execution on the leading edge of the timeout.
     * @param {number} [options.maxWait] The maximum time `func` is allowed to be delayed before it's called.
     * @param {boolean} [options.trailing=true] Specify execution on the trailing edge of the timeout.
     * @returns {Function} Returns the new debounced function.
     * @example
     *
     * // avoid costly calculations while the window size is in flux
     * var lazyLayout = _.debounce(calculateLayout, 150);
     * jQuery(window).on('resize', lazyLayout);
     *
     * // execute `sendMail` when the click event is fired, debouncing subsequent calls
     * jQuery('#postbox').on('click', _.debounce(sendMail, 300, {
     *   'leading': true,
     *   'trailing': false
     * });
     *
     * // ensure `batchLog` is executed once after 1 second of debounced calls
     * var source = new EventSource('/stream');
     * source.addEventListener('message', _.debounce(batchLog, 250, {
     *   'maxWait': 1000
     * }, false);
     */
    function debounce(func, wait, options) {
      var args,
          maxTimeoutId,
          result,
          stamp,
          thisArg,
          timeoutId,
          trailingCall,
          lastCalled = 0,
          maxWait = false,
          trailing = true;

      if (!isFunction(func)) {
        throw new TypeError;
      }
      wait = nativeMax(0, wait) || 0;
      if (options === true) {
        var leading = true;
        trailing = false;
      } else if (isObject(options)) {
        leading = options.leading;
        maxWait = 'maxWait' in options && (nativeMax(wait, options.maxWait) || 0);
        trailing = 'trailing' in options ? options.trailing : trailing;
      }
      var delayed = function() {
        var remaining = wait - (now() - stamp);
        if (remaining <= 0) {
          if (maxTimeoutId) {
            clearTimeout(maxTimeoutId);
          }
          var isCalled = trailingCall;
          maxTimeoutId = timeoutId = trailingCall = undefined;
          if (isCalled) {
            lastCalled = now();
            result = func.apply(thisArg, args);
            if (!timeoutId && !maxTimeoutId) {
              args = thisArg = null;
            }
          }
        } else {
          timeoutId = setTimeout(delayed, remaining);
        }
      };

      var maxDelayed = function() {
        if (timeoutId) {
          clearTimeout(timeoutId);
        }
        maxTimeoutId = timeoutId = trailingCall = undefined;
        if (trailing || (maxWait !== wait)) {
          lastCalled = now();
          result = func.apply(thisArg, args);
          if (!timeoutId && !maxTimeoutId) {
            args = thisArg = null;
          }
        }
      };

      return function() {
        args = arguments;
        stamp = now();
        thisArg = this;
        trailingCall = trailing && (timeoutId || !leading);

        if (maxWait === false) {
          var leadingCall = leading && !timeoutId;
        } else {
          if (!maxTimeoutId && !leading) {
            lastCalled = stamp;
          }
          var remaining = maxWait - (stamp - lastCalled),
              isCalled = remaining <= 0;

          if (isCalled) {
            if (maxTimeoutId) {
              maxTimeoutId = clearTimeout(maxTimeoutId);
            }
            lastCalled = stamp;
            result = func.apply(thisArg, args);
          }
          else if (!maxTimeoutId) {
            maxTimeoutId = setTimeout(maxDelayed, remaining);
          }
        }
        if (isCalled && timeoutId) {
          timeoutId = clearTimeout(timeoutId);
        }
        else if (!timeoutId && wait !== maxWait) {
          timeoutId = setTimeout(delayed, wait);
        }
        if (leadingCall) {
          isCalled = true;
          result = func.apply(thisArg, args);
        }
        if (isCalled && !timeoutId && !maxTimeoutId) {
          args = thisArg = null;
        }
        return result;
      };
    }

    /**
     * Defers executing the `func` function until the current call stack has cleared.
     * Additional arguments will be provided to `func` when it is invoked.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Function} func The function to defer.
     * @param {...*} [arg] Arguments to invoke the function with.
     * @returns {number} Returns the timer id.
     * @example
     *
     * _.defer(function(text) { console.log(text); }, 'deferred');
     * // logs 'deferred' after one or more milliseconds
     */
    function defer(func) {
      if (!isFunction(func)) {
        throw new TypeError;
      }
      var args = slice(arguments, 1);
      return setTimeout(function() { func.apply(undefined, args); }, 1);
    }

    /**
     * Executes the `func` function after `wait` milliseconds. Additional arguments
     * will be provided to `func` when it is invoked.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Function} func The function to delay.
     * @param {number} wait The number of milliseconds to delay execution.
     * @param {...*} [arg] Arguments to invoke the function with.
     * @returns {number} Returns the timer id.
     * @example
     *
     * _.delay(function(text) { console.log(text); }, 1000, 'later');
     * // => logs 'later' after one second
     */
    function delay(func, wait) {
      if (!isFunction(func)) {
        throw new TypeError;
      }
      var args = slice(arguments, 2);
      return setTimeout(function() { func.apply(undefined, args); }, wait);
    }

    /**
     * Creates a function that memoizes the result of `func`. If `resolver` is
     * provided it will be used to determine the cache key for storing the result
     * based on the arguments provided to the memoized function. By default, the
     * first argument provided to the memoized function is used as the cache key.
     * The `func` is executed with the `this` binding of the memoized function.
     * The result cache is exposed as the `cache` property on the memoized function.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Function} func The function to have its output memoized.
     * @param {Function} [resolver] A function used to resolve the cache key.
     * @returns {Function} Returns the new memoizing function.
     * @example
     *
     * var fibonacci = _.memoize(function(n) {
     *   return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
     * });
     *
     * fibonacci(9)
     * // => 34
     *
     * var data = {
     *   'fred': { 'name': 'fred', 'age': 40 },
     *   'pebbles': { 'name': 'pebbles', 'age': 1 }
     * };
     *
     * // modifying the result cache
     * var get = _.memoize(function(name) { return data[name]; }, _.identity);
     * get('pebbles');
     * // => { 'name': 'pebbles', 'age': 1 }
     *
     * get.cache.pebbles.name = 'penelope';
     * get('pebbles');
     * // => { 'name': 'penelope', 'age': 1 }
     */
    function memoize(func, resolver) {
      if (!isFunction(func)) {
        throw new TypeError;
      }
      var memoized = function() {
        var cache = memoized.cache,
            key = resolver ? resolver.apply(this, arguments) : keyPrefix + arguments[0];

        return hasOwnProperty.call(cache, key)
          ? cache[key]
          : (cache[key] = func.apply(this, arguments));
      }
      memoized.cache = {};
      return memoized;
    }

    /**
     * Creates a function that is restricted to execute `func` once. Repeat calls to
     * the function will return the value of the first call. The `func` is executed
     * with the `this` binding of the created function.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Function} func The function to restrict.
     * @returns {Function} Returns the new restricted function.
     * @example
     *
     * var initialize = _.once(createApplication);
     * initialize();
     * initialize();
     * // `initialize` executes `createApplication` once
     */
    function once(func) {
      var ran,
          result;

      if (!isFunction(func)) {
        throw new TypeError;
      }
      return function() {
        if (ran) {
          return result;
        }
        ran = true;
        result = func.apply(this, arguments);

        // clear the `func` variable so the function may be garbage collected
        func = null;
        return result;
      };
    }

    /**
     * Creates a function that, when called, invokes `func` with any additional
     * `partial` arguments prepended to those provided to the new function. This
     * method is similar to `_.bind` except it does **not** alter the `this` binding.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Function} func The function to partially apply arguments to.
     * @param {...*} [arg] Arguments to be partially applied.
     * @returns {Function} Returns the new partially applied function.
     * @example
     *
     * var greet = function(greeting, name) { return greeting + ' ' + name; };
     * var hi = _.partial(greet, 'hi');
     * hi('fred');
     * // => 'hi fred'
     */
    function partial(func) {
      return createWrapper(func, 16, slice(arguments, 1));
    }

    /**
     * This method is like `_.partial` except that `partial` arguments are
     * appended to those provided to the new function.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Function} func The function to partially apply arguments to.
     * @param {...*} [arg] Arguments to be partially applied.
     * @returns {Function} Returns the new partially applied function.
     * @example
     *
     * var defaultsDeep = _.partialRight(_.merge, _.defaults);
     *
     * var options = {
     *   'variable': 'data',
     *   'imports': { 'jq': $ }
     * };
     *
     * defaultsDeep(options, _.templateSettings);
     *
     * options.variable
     * // => 'data'
     *
     * options.imports
     * // => { '_': _, 'jq': $ }
     */
    function partialRight(func) {
      return createWrapper(func, 32, null, slice(arguments, 1));
    }

    /**
     * Creates a function that, when executed, will only call the `func` function
     * at most once per every `wait` milliseconds. Provide an options object to
     * indicate that `func` should be invoked on the leading and/or trailing edge
     * of the `wait` timeout. Subsequent calls to the throttled function will
     * return the result of the last `func` call.
     *
     * Note: If `leading` and `trailing` options are `true` `func` will be called
     * on the trailing edge of the timeout only if the the throttled function is
     * invoked more than once during the `wait` timeout.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {Function} func The function to throttle.
     * @param {number} wait The number of milliseconds to throttle executions to.
     * @param {Object} [options] The options object.
     * @param {boolean} [options.leading=true] Specify execution on the leading edge of the timeout.
     * @param {boolean} [options.trailing=true] Specify execution on the trailing edge of the timeout.
     * @returns {Function} Returns the new throttled function.
     * @example
     *
     * // avoid excessively updating the position while scrolling
     * var throttled = _.throttle(updatePosition, 100);
     * jQuery(window).on('scroll', throttled);
     *
     * // execute `renewToken` when the click event is fired, but not more than once every 5 minutes
     * jQuery('.interactive').on('click', _.throttle(renewToken, 300000, {
     *   'trailing': false
     * }));
     */
    function throttle(func, wait, options) {
      var leading = true,
          trailing = true;

      if (!isFunction(func)) {
        throw new TypeError;
      }
      if (options === false) {
        leading = false;
      } else if (isObject(options)) {
        leading = 'leading' in options ? options.leading : leading;
        trailing = 'trailing' in options ? options.trailing : trailing;
      }
      debounceOptions.leading = leading;
      debounceOptions.maxWait = wait;
      debounceOptions.trailing = trailing;

      return debounce(func, wait, debounceOptions);
    }

    /**
     * Creates a function that provides `value` to the wrapper function as its
     * first argument. Additional arguments provided to the function are appended
     * to those provided to the wrapper function. The wrapper is executed with
     * the `this` binding of the created function.
     *
     * @static
     * @memberOf _
     * @category Functions
     * @param {*} value The value to wrap.
     * @param {Function} wrapper The wrapper function.
     * @returns {Function} Returns the new function.
     * @example
     *
     * var p = _.wrap(_.escape, function(func, text) {
     *   return '<p>' + func(text) + '</p>';
     * });
     *
     * p('Fred, Wilma, & Pebbles');
     * // => '<p>Fred, Wilma, &amp; Pebbles</p>'
     */
    function wrap(value, wrapper) {
      return createWrapper(wrapper, 16, [value]);
    }

    /*--------------------------------------------------------------------------*/

    /**
     * Creates a function that returns `value`.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {*} value The value to return from the new function.
     * @returns {Function} Returns the new function.
     * @example
     *
     * var object = { 'name': 'fred' };
     * var getter = _.constant(object);
     * getter() === object;
     * // => true
     */
    function constant(value) {
      return function() {
        return value;
      };
    }

    /**
     * Produces a callback bound to an optional `thisArg`. If `func` is a property
     * name the created callback will return the property value for a given element.
     * If `func` is an object the created callback will return `true` for elements
     * that contain the equivalent object properties, otherwise it will return `false`.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {*} [func=identity] The value to convert to a callback.
     * @param {*} [thisArg] The `this` binding of the created callback.
     * @param {number} [argCount] The number of arguments the callback accepts.
     * @returns {Function} Returns a callback function.
     * @example
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36 },
     *   { 'name': 'fred',   'age': 40 }
     * ];
     *
     * // wrap to create custom callback shorthands
     * _.createCallback = _.wrap(_.createCallback, function(func, callback, thisArg) {
     *   var match = /^(.+?)__([gl]t)(.+)$/.exec(callback);
     *   return !match ? func(callback, thisArg) : function(object) {
     *     return match[2] == 'gt' ? object[match[1]] > match[3] : object[match[1]] < match[3];
     *   };
     * });
     *
     * _.filter(characters, 'age__gt38');
     * // => [{ 'name': 'fred', 'age': 40 }]
     */
    function createCallback(func, thisArg, argCount) {
      var type = typeof func;
      if (func == null || type == 'function') {
        return baseCreateCallback(func, thisArg, argCount);
      }
      // handle "_.pluck" style callback shorthands
      if (type != 'object') {
        return property(func);
      }
      var props = keys(func),
          key = props[0],
          a = func[key];

      // handle "_.where" style callback shorthands
      if (props.length == 1 && a === a && !isObject(a)) {
        // fast path the common case of providing an object with a single
        // property containing a primitive value
        return function(object) {
          var b = object[key];
          return a === b && (a !== 0 || (1 / a == 1 / b));
        };
      }
      return function(object) {
        var length = props.length,
            result = false;

        while (length--) {
          if (!(result = baseIsEqual(object[props[length]], func[props[length]], null, true))) {
            break;
          }
        }
        return result;
      };
    }

    /**
     * Converts the characters `&`, `<`, `>`, `"`, and `'` in `string` to their
     * corresponding HTML entities.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {string} string The string to escape.
     * @returns {string} Returns the escaped string.
     * @example
     *
     * _.escape('Fred, Wilma, & Pebbles');
     * // => 'Fred, Wilma, &amp; Pebbles'
     */
    function escape(string) {
      return string == null ? '' : String(string).replace(reUnescapedHtml, escapeHtmlChar);
    }

    /**
     * This method returns the first argument provided to it.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {*} value Any value.
     * @returns {*} Returns `value`.
     * @example
     *
     * var object = { 'name': 'fred' };
     * _.identity(object) === object;
     * // => true
     */
    function identity(value) {
      return value;
    }

    /**
     * Adds function properties of a source object to the destination object.
     * If `object` is a function methods will be added to its prototype as well.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {Function|Object} [object=lodash] object The destination object.
     * @param {Object} source The object of functions to add.
     * @param {Object} [options] The options object.
     * @param {boolean} [options.chain=true] Specify whether the functions added are chainable.
     * @example
     *
     * function capitalize(string) {
     *   return string.charAt(0).toUpperCase() + string.slice(1).toLowerCase();
     * }
     *
     * _.mixin({ 'capitalize': capitalize });
     * _.capitalize('fred');
     * // => 'Fred'
     *
     * _('fred').capitalize().value();
     * // => 'Fred'
     *
     * _.mixin({ 'capitalize': capitalize }, { 'chain': false });
     * _('fred').capitalize();
     * // => 'Fred'
     */
    function mixin(object, source, options) {
      var chain = true,
          methodNames = source && functions(source);

      if (!source || (!options && !methodNames.length)) {
        if (options == null) {
          options = source;
        }
        ctor = lodashWrapper;
        source = object;
        object = lodash;
        methodNames = functions(source);
      }
      if (options === false) {
        chain = false;
      } else if (isObject(options) && 'chain' in options) {
        chain = options.chain;
      }
      var ctor = object,
          isFunc = isFunction(ctor);

      forEach(methodNames, function(methodName) {
        var func = object[methodName] = source[methodName];
        if (isFunc) {
          ctor.prototype[methodName] = function() {
            var chainAll = this.__chain__,
                value = this.__wrapped__,
                args = [value];

            push.apply(args, arguments);
            var result = func.apply(object, args);
            if (chain || chainAll) {
              if (value === result && isObject(result)) {
                return this;
              }
              result = new ctor(result);
              result.__chain__ = chainAll;
            }
            return result;
          };
        }
      });
    }

    /**
     * Reverts the '_' variable to its previous value and returns a reference to
     * the `lodash` function.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @returns {Function} Returns the `lodash` function.
     * @example
     *
     * var lodash = _.noConflict();
     */
    function noConflict() {
      context._ = oldDash;
      return this;
    }

    /**
     * A no-operation function.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @example
     *
     * var object = { 'name': 'fred' };
     * _.noop(object) === undefined;
     * // => true
     */
    function noop() {
      // no operation performed
    }

    /**
     * Gets the number of milliseconds that have elapsed since the Unix epoch
     * (1 January 1970 00:00:00 UTC).
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @example
     *
     * var stamp = _.now();
     * _.defer(function() { console.log(_.now() - stamp); });
     * // => logs the number of milliseconds it took for the deferred function to be called
     */
    var now = isNative(now = Date.now) && now || function() {
      return new Date().getTime();
    };

    /**
     * Converts the given value into an integer of the specified radix.
     * If `radix` is `undefined` or `0` a `radix` of `10` is used unless the
     * `value` is a hexadecimal, in which case a `radix` of `16` is used.
     *
     * Note: This method avoids differences in native ES3 and ES5 `parseInt`
     * implementations. See http://es5.github.io/#E.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {string} value The value to parse.
     * @param {number} [radix] The radix used to interpret the value to parse.
     * @returns {number} Returns the new integer value.
     * @example
     *
     * _.parseInt('08');
     * // => 8
     */
    var parseInt = nativeParseInt(whitespace + '08') == 8 ? nativeParseInt : function(value, radix) {
      // Firefox < 21 and Opera < 15 follow the ES3 specified implementation of `parseInt`
      return nativeParseInt(isString(value) ? value.replace(reLeadingSpacesAndZeros, '') : value, radix || 0);
    };

    /**
     * Creates a "_.pluck" style function, which returns the `key` value of a
     * given object.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {string} key The name of the property to retrieve.
     * @returns {Function} Returns the new function.
     * @example
     *
     * var characters = [
     *   { 'name': 'fred',   'age': 40 },
     *   { 'name': 'barney', 'age': 36 }
     * ];
     *
     * var getName = _.property('name');
     *
     * _.map(characters, getName);
     * // => ['barney', 'fred']
     *
     * _.sortBy(characters, getName);
     * // => [{ 'name': 'barney', 'age': 36 }, { 'name': 'fred',   'age': 40 }]
     */
    function property(key) {
      return function(object) {
        return object[key];
      };
    }

    /**
     * Produces a random number between `min` and `max` (inclusive). If only one
     * argument is provided a number between `0` and the given number will be
     * returned. If `floating` is truey or either `min` or `max` are floats a
     * floating-point number will be returned instead of an integer.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {number} [min=0] The minimum possible value.
     * @param {number} [max=1] The maximum possible value.
     * @param {boolean} [floating=false] Specify returning a floating-point number.
     * @returns {number} Returns a random number.
     * @example
     *
     * _.random(0, 5);
     * // => an integer between 0 and 5
     *
     * _.random(5);
     * // => also an integer between 0 and 5
     *
     * _.random(5, true);
     * // => a floating-point number between 0 and 5
     *
     * _.random(1.2, 5.2);
     * // => a floating-point number between 1.2 and 5.2
     */
    function random(min, max, floating) {
      var noMin = min == null,
          noMax = max == null;

      if (floating == null) {
        if (typeof min == 'boolean' && noMax) {
          floating = min;
          min = 1;
        }
        else if (!noMax && typeof max == 'boolean') {
          floating = max;
          noMax = true;
        }
      }
      if (noMin && noMax) {
        max = 1;
      }
      min = +min || 0;
      if (noMax) {
        max = min;
        min = 0;
      } else {
        max = +max || 0;
      }
      if (floating || min % 1 || max % 1) {
        var rand = nativeRandom();
        return nativeMin(min + (rand * (max - min + parseFloat('1e-' + ((rand +'').length - 1)))), max);
      }
      return baseRandom(min, max);
    }

    /**
     * Resolves the value of property `key` on `object`. If `key` is a function
     * it will be invoked with the `this` binding of `object` and its result returned,
     * else the property value is returned. If `object` is falsey then `undefined`
     * is returned.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {Object} object The object to inspect.
     * @param {string} key The name of the property to resolve.
     * @returns {*} Returns the resolved value.
     * @example
     *
     * var object = {
     *   'cheese': 'crumpets',
     *   'stuff': function() {
     *     return 'nonsense';
     *   }
     * };
     *
     * _.result(object, 'cheese');
     * // => 'crumpets'
     *
     * _.result(object, 'stuff');
     * // => 'nonsense'
     */
    function result(object, key) {
      if (object) {
        var value = object[key];
        return isFunction(value) ? object[key]() : value;
      }
    }

    /**
     * A micro-templating method that handles arbitrary delimiters, preserves
     * whitespace, and correctly escapes quotes within interpolated code.
     *
     * Note: In the development build, `_.template` utilizes sourceURLs for easier
     * debugging. See http://www.html5rocks.com/en/tutorials/developertools/sourcemaps/#toc-sourceurl
     *
     * For more information on precompiling templates see:
     * http://lodash.com/custom-builds
     *
     * For more information on Chrome extension sandboxes see:
     * http://developer.chrome.com/stable/extensions/sandboxingEval.html
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {string} text The template text.
     * @param {Object} data The data object used to populate the text.
     * @param {Object} [options] The options object.
     * @param {RegExp} [options.escape] The "escape" delimiter.
     * @param {RegExp} [options.evaluate] The "evaluate" delimiter.
     * @param {Object} [options.imports] An object to import into the template as local variables.
     * @param {RegExp} [options.interpolate] The "interpolate" delimiter.
     * @param {string} [sourceURL] The sourceURL of the template's compiled source.
     * @param {string} [variable] The data object variable name.
     * @returns {Function|string} Returns a compiled function when no `data` object
     *  is given, else it returns the interpolated text.
     * @example
     *
     * // using the "interpolate" delimiter to create a compiled template
     * var compiled = _.template('hello <%= name %>');
     * compiled({ 'name': 'fred' });
     * // => 'hello fred'
     *
     * // using the "escape" delimiter to escape HTML in data property values
     * _.template('<b><%- value %></b>', { 'value': '<script>' });
     * // => '<b>&lt;script&gt;</b>'
     *
     * // using the "evaluate" delimiter to generate HTML
     * var list = '<% _.forEach(people, function(name) { %><li><%- name %></li><% }); %>';
     * _.template(list, { 'people': ['fred', 'barney'] });
     * // => '<li>fred</li><li>barney</li>'
     *
     * // using the ES6 delimiter as an alternative to the default "interpolate" delimiter
     * _.template('hello ${ name }', { 'name': 'pebbles' });
     * // => 'hello pebbles'
     *
     * // using the internal `print` function in "evaluate" delimiters
     * _.template('<% print("hello " + name); %>!', { 'name': 'barney' });
     * // => 'hello barney!'
     *
     * // using a custom template delimiters
     * _.templateSettings = {
     *   'interpolate': /{{([\s\S]+?)}}/g
     * };
     *
     * _.template('hello {{ name }}!', { 'name': 'mustache' });
     * // => 'hello mustache!'
     *
     * // using the `imports` option to import jQuery
     * var list = '<% jq.each(people, function(name) { %><li><%- name %></li><% }); %>';
     * _.template(list, { 'people': ['fred', 'barney'] }, { 'imports': { 'jq': jQuery } });
     * // => '<li>fred</li><li>barney</li>'
     *
     * // using the `sourceURL` option to specify a custom sourceURL for the template
     * var compiled = _.template('hello <%= name %>', null, { 'sourceURL': '/basic/greeting.jst' });
     * compiled(data);
     * // => find the source of "greeting.jst" under the Sources tab or Resources panel of the web inspector
     *
     * // using the `variable` option to ensure a with-statement isn't used in the compiled template
     * var compiled = _.template('hi <%= data.name %>!', null, { 'variable': 'data' });
     * compiled.source;
     * // => function(data) {
     *   var __t, __p = '', __e = _.escape;
     *   __p += 'hi ' + ((__t = ( data.name )) == null ? '' : __t) + '!';
     *   return __p;
     * }
     *
     * // using the `source` property to inline compiled templates for meaningful
     * // line numbers in error messages and a stack trace
     * fs.writeFileSync(path.join(cwd, 'jst.js'), '\
     *   var JST = {\
     *     "main": ' + _.template(mainText).source + '\
     *   };\
     * ');
     */
    function template(text, data, options) {
      // based on John Resig's `tmpl` implementation
      // http://ejohn.org/blog/javascript-micro-templating/
      // and Laura Doktorova's doT.js
      // https://github.com/olado/doT
      var settings = lodash.templateSettings;
      text = String(text || '');

      // avoid missing dependencies when `iteratorTemplate` is not defined
      options = defaults({}, options, settings);

      var imports = defaults({}, options.imports, settings.imports),
          importsKeys = keys(imports),
          importsValues = values(imports);

      var isEvaluating,
          index = 0,
          interpolate = options.interpolate || reNoMatch,
          source = "__p += '";

      // compile the regexp to match each delimiter
      var reDelimiters = RegExp(
        (options.escape || reNoMatch).source + '|' +
        interpolate.source + '|' +
        (interpolate === reInterpolate ? reEsTemplate : reNoMatch).source + '|' +
        (options.evaluate || reNoMatch).source + '|$'
      , 'g');

      text.replace(reDelimiters, function(match, escapeValue, interpolateValue, esTemplateValue, evaluateValue, offset) {
        interpolateValue || (interpolateValue = esTemplateValue);

        // escape characters that cannot be included in string literals
        source += text.slice(index, offset).replace(reUnescapedString, escapeStringChar);

        // replace delimiters with snippets
        if (escapeValue) {
          source += "' +\n__e(" + escapeValue + ") +\n'";
        }
        if (evaluateValue) {
          isEvaluating = true;
          source += "';\n" + evaluateValue + ";\n__p += '";
        }
        if (interpolateValue) {
          source += "' +\n((__t = (" + interpolateValue + ")) == null ? '' : __t) +\n'";
        }
        index = offset + match.length;

        // the JS engine embedded in Adobe products requires returning the `match`
        // string in order to produce the correct `offset` value
        return match;
      });

      source += "';\n";

      // if `variable` is not specified, wrap a with-statement around the generated
      // code to add the data object to the top of the scope chain
      var variable = options.variable,
          hasVariable = variable;

      if (!hasVariable) {
        variable = 'obj';
        source = 'with (' + variable + ') {\n' + source + '\n}\n';
      }
      // cleanup code by stripping empty strings
      source = (isEvaluating ? source.replace(reEmptyStringLeading, '') : source)
        .replace(reEmptyStringMiddle, '$1')
        .replace(reEmptyStringTrailing, '$1;');

      // frame code as the function body
      source = 'function(' + variable + ') {\n' +
        (hasVariable ? '' : variable + ' || (' + variable + ' = {});\n') +
        "var __t, __p = '', __e = _.escape" +
        (isEvaluating
          ? ', __j = Array.prototype.join;\n' +
            "function print() { __p += __j.call(arguments, '') }\n"
          : ';\n'
        ) +
        source +
        'return __p\n}';

      // Use a sourceURL for easier debugging.
      // http://www.html5rocks.com/en/tutorials/developertools/sourcemaps/#toc-sourceurl
      var sourceURL = '\n/*\n//# sourceURL=' + (options.sourceURL || '/lodash/template/source[' + (templateCounter++) + ']') + '\n*/';

      try {
        var result = Function(importsKeys, 'return ' + source + sourceURL).apply(undefined, importsValues);
      } catch(e) {
        e.source = source;
        throw e;
      }
      if (data) {
        return result(data);
      }
      // provide the compiled function's source by its `toString` method, in
      // supported environments, or the `source` property as a convenience for
      // inlining compiled templates during the build process
      result.source = source;
      return result;
    }

    /**
     * Executes the callback `n` times, returning an array of the results
     * of each callback execution. The callback is bound to `thisArg` and invoked
     * with one argument; (index).
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {number} n The number of times to execute the callback.
     * @param {Function} callback The function called per iteration.
     * @param {*} [thisArg] The `this` binding of `callback`.
     * @returns {Array} Returns an array of the results of each `callback` execution.
     * @example
     *
     * var diceRolls = _.times(3, _.partial(_.random, 1, 6));
     * // => [3, 6, 4]
     *
     * _.times(3, function(n) { mage.castSpell(n); });
     * // => calls `mage.castSpell(n)` three times, passing `n` of `0`, `1`, and `2` respectively
     *
     * _.times(3, function(n) { this.cast(n); }, mage);
     * // => also calls `mage.castSpell(n)` three times
     */
    function times(n, callback, thisArg) {
      n = (n = +n) > -1 ? n : 0;
      var index = -1,
          result = Array(n);

      callback = baseCreateCallback(callback, thisArg, 1);
      while (++index < n) {
        result[index] = callback(index);
      }
      return result;
    }

    /**
     * The inverse of `_.escape` this method converts the HTML entities
     * `&amp;`, `&lt;`, `&gt;`, `&quot;`, and `&#39;` in `string` to their
     * corresponding characters.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {string} string The string to unescape.
     * @returns {string} Returns the unescaped string.
     * @example
     *
     * _.unescape('Fred, Barney &amp; Pebbles');
     * // => 'Fred, Barney & Pebbles'
     */
    function unescape(string) {
      return string == null ? '' : String(string).replace(reEscapedHtml, unescapeHtmlChar);
    }

    /**
     * Generates a unique ID. If `prefix` is provided the ID will be appended to it.
     *
     * @static
     * @memberOf _
     * @category Utilities
     * @param {string} [prefix] The value to prefix the ID with.
     * @returns {string} Returns the unique ID.
     * @example
     *
     * _.uniqueId('contact_');
     * // => 'contact_104'
     *
     * _.uniqueId();
     * // => '105'
     */
    function uniqueId(prefix) {
      var id = ++idCounter;
      return String(prefix == null ? '' : prefix) + id;
    }

    /*--------------------------------------------------------------------------*/

    /**
     * Creates a `lodash` object that wraps the given value with explicit
     * method chaining enabled.
     *
     * @static
     * @memberOf _
     * @category Chaining
     * @param {*} value The value to wrap.
     * @returns {Object} Returns the wrapper object.
     * @example
     *
     * var characters = [
     *   { 'name': 'barney',  'age': 36 },
     *   { 'name': 'fred',    'age': 40 },
     *   { 'name': 'pebbles', 'age': 1 }
     * ];
     *
     * var youngest = _.chain(characters)
     *     .sortBy('age')
     *     .map(function(chr) { return chr.name + ' is ' + chr.age; })
     *     .first()
     *     .value();
     * // => 'pebbles is 1'
     */
    function chain(value) {
      value = new lodashWrapper(value);
      value.__chain__ = true;
      return value;
    }

    /**
     * Invokes `interceptor` with the `value` as the first argument and then
     * returns `value`. The purpose of this method is to "tap into" a method
     * chain in order to perform operations on intermediate results within
     * the chain.
     *
     * @static
     * @memberOf _
     * @category Chaining
     * @param {*} value The value to provide to `interceptor`.
     * @param {Function} interceptor The function to invoke.
     * @returns {*} Returns `value`.
     * @example
     *
     * _([1, 2, 3, 4])
     *  .tap(function(array) { array.pop(); })
     *  .reverse()
     *  .value();
     * // => [3, 2, 1]
     */
    function tap(value, interceptor) {
      interceptor(value);
      return value;
    }

    /**
     * Enables explicit method chaining on the wrapper object.
     *
     * @name chain
     * @memberOf _
     * @category Chaining
     * @returns {*} Returns the wrapper object.
     * @example
     *
     * var characters = [
     *   { 'name': 'barney', 'age': 36 },
     *   { 'name': 'fred',   'age': 40 }
     * ];
     *
     * // without explicit chaining
     * _(characters).first();
     * // => { 'name': 'barney', 'age': 36 }
     *
     * // with explicit chaining
     * _(characters).chain()
     *   .first()
     *   .pick('age')
     *   .value();
     * // => { 'age': 36 }
     */
    function wrapperChain() {
      this.__chain__ = true;
      return this;
    }

    /**
     * Produces the `toString` result of the wrapped value.
     *
     * @name toString
     * @memberOf _
     * @category Chaining
     * @returns {string} Returns the string result.
     * @example
     *
     * _([1, 2, 3]).toString();
     * // => '1,2,3'
     */
    function wrapperToString() {
      return String(this.__wrapped__);
    }

    /**
     * Extracts the wrapped value.
     *
     * @name valueOf
     * @memberOf _
     * @alias value
     * @category Chaining
     * @returns {*} Returns the wrapped value.
     * @example
     *
     * _([1, 2, 3]).valueOf();
     * // => [1, 2, 3]
     */
    function wrapperValueOf() {
      return this.__wrapped__;
    }

    /*--------------------------------------------------------------------------*/

    // add functions that return wrapped values when chaining
    lodash.after = after;
    lodash.assign = assign;
    lodash.at = at;
    lodash.bind = bind;
    lodash.bindAll = bindAll;
    lodash.bindKey = bindKey;
    lodash.chain = chain;
    lodash.compact = compact;
    lodash.compose = compose;
    lodash.constant = constant;
    lodash.countBy = countBy;
    lodash.create = create;
    lodash.createCallback = createCallback;
    lodash.curry = curry;
    lodash.debounce = debounce;
    lodash.defaults = defaults;
    lodash.defer = defer;
    lodash.delay = delay;
    lodash.difference = difference;
    lodash.filter = filter;
    lodash.flatten = flatten;
    lodash.forEach = forEach;
    lodash.forEachRight = forEachRight;
    lodash.forIn = forIn;
    lodash.forInRight = forInRight;
    lodash.forOwn = forOwn;
    lodash.forOwnRight = forOwnRight;
    lodash.functions = functions;
    lodash.groupBy = groupBy;
    lodash.indexBy = indexBy;
    lodash.initial = initial;
    lodash.intersection = intersection;
    lodash.invert = invert;
    lodash.invoke = invoke;
    lodash.keys = keys;
    lodash.map = map;
    lodash.mapValues = mapValues;
    lodash.max = max;
    lodash.memoize = memoize;
    lodash.merge = merge;
    lodash.min = min;
    lodash.omit = omit;
    lodash.once = once;
    lodash.pairs = pairs;
    lodash.partial = partial;
    lodash.partialRight = partialRight;
    lodash.pick = pick;
    lodash.pluck = pluck;
    lodash.property = property;
    lodash.pull = pull;
    lodash.range = range;
    lodash.reject = reject;
    lodash.remove = remove;
    lodash.rest = rest;
    lodash.shuffle = shuffle;
    lodash.sortBy = sortBy;
    lodash.tap = tap;
    lodash.throttle = throttle;
    lodash.times = times;
    lodash.toArray = toArray;
    lodash.transform = transform;
    lodash.union = union;
    lodash.uniq = uniq;
    lodash.values = values;
    lodash.where = where;
    lodash.without = without;
    lodash.wrap = wrap;
    lodash.xor = xor;
    lodash.zip = zip;
    lodash.zipObject = zipObject;

    // add aliases
    lodash.collect = map;
    lodash.drop = rest;
    lodash.each = forEach;
    lodash.eachRight = forEachRight;
    lodash.extend = assign;
    lodash.methods = functions;
    lodash.object = zipObject;
    lodash.select = filter;
    lodash.tail = rest;
    lodash.unique = uniq;
    lodash.unzip = zip;

    // add functions to `lodash.prototype`
    mixin(lodash);

    /*--------------------------------------------------------------------------*/

    // add functions that return unwrapped values when chaining
    lodash.clone = clone;
    lodash.cloneDeep = cloneDeep;
    lodash.contains = contains;
    lodash.escape = escape;
    lodash.every = every;
    lodash.find = find;
    lodash.findIndex = findIndex;
    lodash.findKey = findKey;
    lodash.findLast = findLast;
    lodash.findLastIndex = findLastIndex;
    lodash.findLastKey = findLastKey;
    lodash.has = has;
    lodash.identity = identity;
    lodash.indexOf = indexOf;
    lodash.isArguments = isArguments;
    lodash.isArray = isArray;
    lodash.isBoolean = isBoolean;
    lodash.isDate = isDate;
    lodash.isElement = isElement;
    lodash.isEmpty = isEmpty;
    lodash.isEqual = isEqual;
    lodash.isFinite = isFinite;
    lodash.isFunction = isFunction;
    lodash.isNaN = isNaN;
    lodash.isNull = isNull;
    lodash.isNumber = isNumber;
    lodash.isObject = isObject;
    lodash.isPlainObject = isPlainObject;
    lodash.isRegExp = isRegExp;
    lodash.isString = isString;
    lodash.isUndefined = isUndefined;
    lodash.lastIndexOf = lastIndexOf;
    lodash.mixin = mixin;
    lodash.noConflict = noConflict;
    lodash.noop = noop;
    lodash.now = now;
    lodash.parseInt = parseInt;
    lodash.random = random;
    lodash.reduce = reduce;
    lodash.reduceRight = reduceRight;
    lodash.result = result;
    lodash.runInContext = runInContext;
    lodash.size = size;
    lodash.some = some;
    lodash.sortedIndex = sortedIndex;
    lodash.template = template;
    lodash.unescape = unescape;
    lodash.uniqueId = uniqueId;

    // add aliases
    lodash.all = every;
    lodash.any = some;
    lodash.detect = find;
    lodash.findWhere = find;
    lodash.foldl = reduce;
    lodash.foldr = reduceRight;
    lodash.include = contains;
    lodash.inject = reduce;

    mixin(function() {
      var source = {}
      forOwn(lodash, function(func, methodName) {
        if (!lodash.prototype[methodName]) {
          source[methodName] = func;
        }
      });
      return source;
    }(), false);

    /*--------------------------------------------------------------------------*/

    // add functions capable of returning wrapped and unwrapped values when chaining
    lodash.first = first;
    lodash.last = last;
    lodash.sample = sample;

    // add aliases
    lodash.take = first;
    lodash.head = first;

    forOwn(lodash, function(func, methodName) {
      var callbackable = methodName !== 'sample';
      if (!lodash.prototype[methodName]) {
        lodash.prototype[methodName]= function(n, guard) {
          var chainAll = this.__chain__,
              result = func(this.__wrapped__, n, guard);

          return !chainAll && (n == null || (guard && !(callbackable && typeof n == 'function')))
            ? result
            : new lodashWrapper(result, chainAll);
        };
      }
    });

    /*--------------------------------------------------------------------------*/

    /**
     * The semantic version number.
     *
     * @static
     * @memberOf _
     * @type string
     */
    lodash.VERSION = '2.4.1';

    // add "Chaining" functions to the wrapper
    lodash.prototype.chain = wrapperChain;
    lodash.prototype.toString = wrapperToString;
    lodash.prototype.value = wrapperValueOf;
    lodash.prototype.valueOf = wrapperValueOf;

    // add `Array` functions that return unwrapped values
    forEach(['join', 'pop', 'shift'], function(methodName) {
      var func = arrayRef[methodName];
      lodash.prototype[methodName] = function() {
        var chainAll = this.__chain__,
            result = func.apply(this.__wrapped__, arguments);

        return chainAll
          ? new lodashWrapper(result, chainAll)
          : result;
      };
    });

    // add `Array` functions that return the existing wrapped value
    forEach(['push', 'reverse', 'sort', 'unshift'], function(methodName) {
      var func = arrayRef[methodName];
      lodash.prototype[methodName] = function() {
        func.apply(this.__wrapped__, arguments);
        return this;
      };
    });

    // add `Array` functions that return new wrapped values
    forEach(['concat', 'slice', 'splice'], function(methodName) {
      var func = arrayRef[methodName];
      lodash.prototype[methodName] = function() {
        return new lodashWrapper(func.apply(this.__wrapped__, arguments), this.__chain__);
      };
    });

    return lodash;
  }

  /*--------------------------------------------------------------------------*/

  // expose Lo-Dash
  var _ = runInContext();

  // some AMD build optimizers like r.js check for condition patterns like the following:
  if (typeof define == 'function' && typeof define.amd == 'object' && define.amd) {
    // Expose Lo-Dash to the global object even when an AMD loader is present in
    // case Lo-Dash is loaded with a RequireJS shim config.
    // See http://requirejs.org/docs/api.html#config-shim
    root._ = _;

    // define as an anonymous module so, through path mapping, it can be
    // referenced as the "underscore" module
    define(function() {
      return _;
    });
  }
  // check for `exports` after `define` in case a build optimizer adds an `exports` object
  else if (freeExports && freeModule) {
    // in Node.js or RingoJS
    if (moduleExports) {
      (freeModule.exports = _)._ = _;
    }
    // in Narwhal or Rhino -require
    else {
      freeExports._ = _;
    }
  }
  else {
    // in a browser or Rhino
    root._ = _;
  }
}.call(this));

}).call(this,typeof global !== "undefined" ? global : typeof self !== "undefined" ? self : typeof window !== "undefined" ? window : {})
},{}],53:[function(require,module,exports){
/**
sprintf() for JavaScript 0.7-beta1
http://www.diveintojavascript.com/projects/javascript-sprintf

Copyright (c) Alexandru Marasteanu <alexaholic [at) gmail (dot] com>
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in the
      documentation and/or other materials provided with the distribution.
    * Neither the name of sprintf() for JavaScript nor the
      names of its contributors may be used to endorse or promote products
      derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL Alexandru Marasteanu BE LIABLE FOR ANY
DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.


Changelog:
2010.11.07 - 0.7-beta1-node
  - converted it to a node.js compatible module

2010.09.06 - 0.7-beta1
  - features: vsprintf, support for named placeholders
  - enhancements: format cache, reduced global namespace pollution

2010.05.22 - 0.6:
 - reverted to 0.4 and fixed the bug regarding the sign of the number 0
 Note:
 Thanks to Raphael Pigulla <raph (at] n3rd [dot) org> (http://www.n3rd.org/)
 who warned me about a bug in 0.5, I discovered that the last update was
 a regress. I appologize for that.

2010.05.09 - 0.5:
 - bug fix: 0 is now preceeded with a + sign
 - bug fix: the sign was not at the right position on padded results (Kamal Abdali)
 - switched from GPL to BSD license

2007.10.21 - 0.4:
 - unit test and patch (David Baird)

2007.09.17 - 0.3:
 - bug fix: no longer throws exception on empty paramenters (Hans Pufal)

2007.09.11 - 0.2:
 - feature: added argument swapping

2007.04.03 - 0.1:
 - initial release
**/

var sprintf = (function() {
	function get_type(variable) {
		return Object.prototype.toString.call(variable).slice(8, -1).toLowerCase();
	}
	function str_repeat(input, multiplier) {
		for (var output = []; multiplier > 0; output[--multiplier] = input) {/* do nothing */}
		return output.join('');
	}

	var str_format = function() {
		if (!str_format.cache.hasOwnProperty(arguments[0])) {
			str_format.cache[arguments[0]] = str_format.parse(arguments[0]);
		}
		return str_format.format.call(null, str_format.cache[arguments[0]], arguments);
	};

	// convert object to simple one line string without indentation or
	// newlines. Note that this implementation does not print array
	// values to their actual place for sparse arrays. 
	//
	// For example sparse array like this
	//    l = []
	//    l[4] = 1
	// Would be printed as "[1]" instead of "[, , , , 1]"
	// 
	// If argument 'seen' is not null and array the function will check for 
	// circular object references from argument.
	str_format.object_stringify = function(obj, depth, maxdepth, seen) {
		var str = '';
		if (obj != null) {
			switch( typeof(obj) ) {
			case 'function': 
				return '[Function' + (obj.name ? ': '+obj.name : '') + ']';
			    break;
			case 'object':
				if ( obj instanceof Error) { return '[' + obj.toString() + ']' };
				if (depth >= maxdepth) return '[Object]'
				if (seen) {
					// add object to seen list
					seen = seen.slice(0)
					seen.push(obj);
				}
				if (obj.length != null) { //array
					str += '[';
					var arr = []
					for (var i in obj) {
						if (seen && seen.indexOf(obj[i]) >= 0) arr.push('[Circular]');
						else arr.push(str_format.object_stringify(obj[i], depth+1, maxdepth, seen));
					}
					str += arr.join(', ') + ']';
				} else if ('getMonth' in obj) { // date
					return 'Date(' + obj + ')';
				} else { // object
					str += '{';
					var arr = []
					for (var k in obj) { 
						if(obj.hasOwnProperty(k)) {
							if (seen && seen.indexOf(obj[k]) >= 0) arr.push(k + ': [Circular]');
							else arr.push(k +': ' +str_format.object_stringify(obj[k], depth+1, maxdepth, seen)); 
						}
					}
					str += arr.join(', ') + '}';
				}
				return str;
				break;
			case 'string':				
				return '"' + obj + '"';
				break
			}
		}
		return '' + obj;
	}

	str_format.format = function(parse_tree, argv) {
		var cursor = 1, tree_length = parse_tree.length, node_type = '', arg, output = [], i, k, match, pad, pad_character, pad_length;
		for (i = 0; i < tree_length; i++) {
			node_type = get_type(parse_tree[i]);
			if (node_type === 'string') {
				output.push(parse_tree[i]);
			}
			else if (node_type === 'array') {
				match = parse_tree[i]; // convenience purposes only
				if (match[2]) { // keyword argument
					arg = argv[cursor];
					for (k = 0; k < match[2].length; k++) {
						if (!arg.hasOwnProperty(match[2][k])) {
							throw new Error(sprintf('[sprintf] property "%s" does not exist', match[2][k]));
						}
						arg = arg[match[2][k]];
					}
				}
				else if (match[1]) { // positional argument (explicit)
					arg = argv[match[1]];
				}
				else { // positional argument (implicit)
					arg = argv[cursor++];
				}

				if (/[^sO]/.test(match[8]) && (get_type(arg) != 'number')) {
					throw new Error(sprintf('[sprintf] expecting number but found %s "' + arg + '"', get_type(arg)));
				}
				switch (match[8]) {
					case 'b': arg = arg.toString(2); break;
					case 'c': arg = String.fromCharCode(arg); break;
					case 'd': arg = parseInt(arg, 10); break;
					case 'e': arg = match[7] ? arg.toExponential(match[7]) : arg.toExponential(); break;
					case 'f': arg = match[7] ? parseFloat(arg).toFixed(match[7]) : parseFloat(arg); break;
				    case 'O': arg = str_format.object_stringify(arg, 0, parseInt(match[7]) || 5); break;
					case 'o': arg = arg.toString(8); break;
					case 's': arg = ((arg = String(arg)) && match[7] ? arg.substring(0, match[7]) : arg); break;
					case 'u': arg = Math.abs(arg); break;
					case 'x': arg = arg.toString(16); break;
					case 'X': arg = arg.toString(16).toUpperCase(); break;
				}
				arg = (/[def]/.test(match[8]) && match[3] && arg >= 0 ? '+'+ arg : arg);
				pad_character = match[4] ? match[4] == '0' ? '0' : match[4].charAt(1) : ' ';
				pad_length = match[6] - String(arg).length;
				pad = match[6] ? str_repeat(pad_character, pad_length) : '';
				output.push(match[5] ? arg + pad : pad + arg);
			}
		}
		return output.join('');
	};

	str_format.cache = {};

	str_format.parse = function(fmt) {
		var _fmt = fmt, match = [], parse_tree = [], arg_names = 0;
		while (_fmt) {
			if ((match = /^[^\x25]+/.exec(_fmt)) !== null) {
				parse_tree.push(match[0]);
			}
			else if ((match = /^\x25{2}/.exec(_fmt)) !== null) {
				parse_tree.push('%');
			}
			else if ((match = /^\x25(?:([1-9]\d*)\$|\(([^\)]+)\))?(\+)?(0|'[^$])?(-)?(\d+)?(?:\.(\d+))?([b-fosOuxX])/.exec(_fmt)) !== null) {
				if (match[2]) {
					arg_names |= 1;
					var field_list = [], replacement_field = match[2], field_match = [];
					if ((field_match = /^([a-z_][a-z_\d]*)/i.exec(replacement_field)) !== null) {
						field_list.push(field_match[1]);
						while ((replacement_field = replacement_field.substring(field_match[0].length)) !== '') {
							if ((field_match = /^\.([a-z_][a-z_\d]*)/i.exec(replacement_field)) !== null) {
								field_list.push(field_match[1]);
							}
							else if ((field_match = /^\[(\d+)\]/.exec(replacement_field)) !== null) {
								field_list.push(field_match[1]);
							}
							else {
								throw new Error('[sprintf] ' + replacement_field);
							}
						}
					}
					else {
                        throw new Error('[sprintf] ' + replacement_field);
					}
					match[2] = field_list;
				}
				else {
					arg_names |= 2;
				}
				if (arg_names === 3) {
					throw new Error('[sprintf] mixing positional and named placeholders is not (yet) supported');
				}
				parse_tree.push(match);
			}
			else {
				throw new Error('[sprintf] ' + _fmt);
			}
			_fmt = _fmt.substring(match[0].length);
		}
		return parse_tree;
	};

	return str_format;
})();

var vsprintf = function(fmt, argv) {
	var argvClone = argv.slice();
	argvClone.unshift(fmt);
	return sprintf.apply(null, argvClone);
};

module.exports = sprintf;
sprintf.sprintf = sprintf;
sprintf.vsprintf = vsprintf;

},{}]},{},[43])(43)
});