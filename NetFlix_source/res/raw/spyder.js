/*
 * (c) 1997-2011 Netflix, Inc.  All content herein is protected by
 * U.S. copyright and other applicable intellectual property laws and
 * may not be copied without the express permission of Netflix, Inc.,
 * which reserves all rights.  Reuse of any of this content for any
 * purpose without the permission of Netflix, Inc. is strictly
 * prohibited.
 */

/*
 * all nrdp communication helpers are required to do four things:
 *
 * 1. add function to nrdp._backchannels for initialization
 * 2. provide nrdp._setProperty()
 * 3. provide nrdp._invoke()
 * 4. call nrdp._gotEvent() when an event comes in.
 */

/*
 * Additional NOTES: 
 * 1. This helper is exactly similar to qt.js except for the fact that JS running
 * on Android's WebKit cannot call methods of a subobject of the object attahced to webview.
 * In other words if you have attached foo to the webview then you cannot call foo.bar.someMethodOfFoo()
 * 
 * 
 */
(function() {

function _gotEvent(event) {
    nrdp._gotEvent(event);
};

function _setupBackchannel(url) {
    if (typeof nrdp_platform === "undefined" )
        return null;

    var backchannel = {
        name: "spyder",
        setProperty: function(subobj, prop, val) {
            var obj = subobj ? "nrdp." + subobj : "nrdp";
            nrdp_platform.bridge.bridgeSetProperty(obj, prop, val);
        },
        invoke: function(obj, method, args) {
            obj = obj ? "nrdp." + obj : "nrdp";
            nrdp_platform.bridge.bridgeInvoke(obj, method, args);
        }
    };
    return backchannel;
};

nrdp._backchannels.unshift(_setupBackchannel);

})();
