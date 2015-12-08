this["myApp"] = this["myApp"] || {};
this["myApp"]["Templates"] = this["myApp"]["Templates"] || {};

this["myApp"]["Templates"][["fastFeedComic.hbs"]] = Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {
  this.compilerInfo = [4,'>= 1.0.0'];
helpers = this.merge(helpers, Handlebars.helpers); data = data || {};
  var buffer = "", stack1, helper, options, helperMissing=helpers.helperMissing, escapeExpression=this.escapeExpression, self=this, functionType="function";

function program1(depth0,data) {
  
  
  return "\n		<a ng-click=\"toggleDeleteModal()\" class=\"trash\">\n			<i class=\"icon-trash icon-large\"></i>\n		</a>\n	";
  }

function program3(depth0,data) {
  
  
  return "\n			<a>\n		";
  }

function program5(depth0,data) {
  
  
  return "\n			</a>\n		";
  }

function program7(depth0,data) {
  
  var buffer = "", stack1, helper, options;
  buffer += "\n				"
    + escapeExpression((helper = helpers.displayName || (depth0 && depth0.displayName),options={hash:{},data:data},helper ? helper.call(depth0, ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author), options) : helperMissing.call(depth0, "displayName", ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author), options)))
    + "\n			";
  return buffer;
  }

function program9(depth0,data,depth1) {
  
  var buffer = "", stack1, helper, options;
  buffer += "\n				";
  stack1 = (helper = helpers.isLinkable || (depth0 && depth0.isLinkable),options={hash:{},inverse:self.noop,fn:self.programWithDepth(10, program10, data, depth1),data:data},helper ? helper.call(depth0, depth0, options) : helperMissing.call(depth0, "isLinkable", depth0, options));
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n				";
  stack1 = helpers.unless.call(depth0, (data == null || data === false ? data : data.last), {hash:{},inverse:self.noop,fn:self.program(12, program12, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n			";
  return buffer;
  }
function program10(depth0,data,depth2) {
  
  var buffer = "", stack1, helper, options;
  buffer += "\n					"
    + escapeExpression((helper = helpers.displayName2 || (depth0 && depth0.displayName2),options={hash:{},data:data},helper ? helper.call(depth0, depth0, ((stack1 = (depth2 && depth2.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author), options) : helperMissing.call(depth0, "displayName2", depth0, ((stack1 = (depth2 && depth2.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author), options)))
    + "\n				";
  return buffer;
  }

function program12(depth0,data) {
  
  
  return " and ";
  }

function program14(depth0,data) {
  
  var buffer = "", stack1;
  buffer += "\n			<p class=\"feed-title caption\">"
    + escapeExpression(((stack1 = ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.comic_caption)),typeof stack1 === functionType ? stack1.apply(depth0) : stack1))
    + "</p>\n		";
  return buffer;
  }

function program16(depth0,data) {
  
  
  return "\n					<span class=\"liked\" ng-click=\"toggleLike(comic)\"><i class=\"icon-heart\"></i> Liked</span>\n				";
  }

function program18(depth0,data) {
  
  
  return "\n					 <span ng-click=\"toggleLike(comic)\"><i class=\"icon-heart\"></i> Like</span>\n				";
  }

function program20(depth0,data) {
  
  var buffer = "", stack1, helper;
  buffer += "<a ng-click=\"viewAllLikers()\">\n							";
  if (helper = helpers.numberOfLikers) { stack1 = helper.call(depth0, {hash:{},data:data}); }
  else { helper = (depth0 && depth0.numberOfLikers); stack1 = typeof helper === functionType ? helper.call(depth0, {hash:{},data:data}) : helper; }
  buffer += escapeExpression(stack1)
    + " people liked this comic\n						</a>\n					";
  return buffer;
  }

function program22(depth0,data) {
  
  var buffer = "", stack1;
  stack1 = helpers.each.call(depth0, (depth0 && depth0.likers), {hash:{},inverse:self.noop,fn:self.program(23, program23, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n\n						";
  stack1 = helpers['if'].call(depth0, (depth0 && depth0.noLikers), {hash:{},inverse:self.noop,fn:self.program(28, program28, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n					";
  return buffer;
  }
function program23(depth0,data) {
  
  var buffer = "", stack1, helper, options;
  stack1 = (helper = helpers.isLinkable || (depth0 && depth0.isLinkable),options={hash:{},inverse:self.noop,fn:self.program(24, program24, data),data:data},helper ? helper.call(depth0, depth0, options) : helperMissing.call(depth0, "isLinkable", depth0, options));
  if(stack1 || stack1 === 0) { buffer += stack1; }
  stack1 = helpers.unless.call(depth0, (data == null || data === false ? data : data.last), {hash:{},inverse:self.noop,fn:self.program(26, program26, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  return buffer;
  }
function program24(depth0,data) {
  
  var buffer = "", helper, options;
  buffer += escapeExpression((helper = helpers.displayName || (depth0 && depth0.displayName),options={hash:{},data:data},helper ? helper.call(depth0, depth0, options) : helperMissing.call(depth0, "displayName", depth0, options)));
  return buffer;
  }

function program26(depth0,data) {
  
  
  return ", ";
  }

function program28(depth0,data) {
  
  
  return "\n							<a class=\"first-to\" ng-click=\"toggleLike(comic)\">Be the first to like this</a>\n						";
  }

function program30(depth0,data) {
  
  
  return "\n				<div>\n					<i class=\"icon-comment icon-fixed-width\"></i>\n					<a class=\"first-to\" ng-click=\"comment()\">Be the first to comment</a>\n				</div>\n\n			";
  }

function program32(depth0,data) {
  
  var buffer = "", stack1;
  buffer += "\n				<div>\n					";
  stack1 = helpers['if'].call(depth0, (depth0 && depth0.manyComments), {hash:{},inverse:self.noop,fn:self.program(33, program33, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n\n					";
  stack1 = helpers.each.call(depth0, (depth0 && depth0.lastComments), {hash:{},inverse:self.noop,fn:self.programWithDepth(35, program35, data, depth0),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n				</div>\n			";
  return buffer;
  }
function program33(depth0,data) {
  
  var buffer = "", stack1, helper;
  buffer += "\n						<i class=\"icon-comment icon-fixed-width\"></i>\n						<a class=\"all\" ng-click=\"showAllComments()\">View all ";
  if (helper = helpers.numberOfComments) { stack1 = helper.call(depth0, {hash:{},data:data}); }
  else { helper = (depth0 && depth0.numberOfComments); stack1 = typeof helper === functionType ? helper.call(depth0, {hash:{},data:data}) : helper; }
  buffer += escapeExpression(stack1)
    + " comments</a>\n					";
  return buffer;
  }

function program35(depth0,data,depth1) {
  
  var buffer = "", stack1, helper, options;
  buffer += "\n					<div>\n						<div class=\"action-icon\">\n							";
  stack1 = helpers['if'].call(depth0, (data == null || data === false ? data : data.first), {hash:{},inverse:self.program(39, program39, data),fn:self.programWithDepth(36, program36, data, depth1),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n						</div>\n\n						<div class=\"comment-text\">\n\n							";
  stack1 = (helper = helpers.isLinkable || (depth0 && depth0.isLinkable),options={hash:{},inverse:self.noop,fn:self.program(41, program41, data),data:data},helper ? helper.call(depth0, (depth0 && depth0.user), options) : helperMissing.call(depth0, "isLinkable", (depth0 && depth0.user), options));
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n\n							<span>"
    + escapeExpression(((stack1 = (depth0 && depth0.text)),typeof stack1 === functionType ? stack1.apply(depth0) : stack1))
    + "</span>\n						</div>\n					</div>\n					";
  return buffer;
  }
function program36(depth0,data,depth2) {
  
  var buffer = "", stack1;
  buffer += "\n								<i class=\"";
  stack1 = helpers.unless.call(depth0, (depth2 && depth2.manyComments), {hash:{},inverse:self.noop,fn:self.program(37, program37, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += " icon-fixed-width\"></i>\n							";
  return buffer;
  }
function program37(depth0,data) {
  
  
  return "icon-comment";
  }

function program39(depth0,data) {
  
  
  return "\n								<i class=\"icon-fixed-width icon-blank\"></i>\n							";
  }

function program41(depth0,data) {
  
  var buffer = "", helper, options;
  buffer += escapeExpression((helper = helpers.displayName || (depth0 && depth0.displayName),options={hash:{},data:data},helper ? helper.call(depth0, (depth0 && depth0.user), options) : helperMissing.call(depth0, "displayName", (depth0 && depth0.user), options)));
  return buffer;
  }

function program43(depth0,data) {
  
  
  return "\n		<div>\n			<div class=\"overlay\"></div>\n			<div class=\"modal\">\n				<a ng-click=\"deleteComic(comic)\">Delete comic</a>\n				<a ng-click=\"toggleDeleteModal()\">Cancel</a>\n			</div>\n		</div>\n	";
  }

  buffer += "<div class=\"panel\" id=\"item_"
    + escapeExpression(((stack1 = ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.comic_id)),typeof stack1 === functionType ? stack1.apply(depth0) : stack1))
    + "\">\n\n	";
  stack1 = (helper = helpers.ifIAmAuthor || (depth0 && depth0.ifIAmAuthor),options={hash:{},inverse:self.noop,fn:self.program(1, program1, data),data:data},helper ? helper.call(depth0, (depth0 && depth0.comic), options) : helperMissing.call(depth0, "ifIAmAuthor", (depth0 && depth0.comic), options));
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n\n	<div class=\"author\">\n\n		";
  stack1 = (helper = helpers.isLinkable || (depth0 && depth0.isLinkable),options={hash:{},inverse:self.noop,fn:self.program(3, program3, data),data:data},helper ? helper.call(depth0, ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author), options) : helperMissing.call(depth0, "isLinkable", ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author), options));
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n\n			<div class=\"profile\"\n				ng-click=\"view_user(comic.author.fb_id)\"\n				id=\"author_"
    + escapeExpression(((stack1 = ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.comic_id)),typeof stack1 === functionType ? stack1.apply(depth0) : stack1))
    + "\"\n				queued=\""
    + escapeExpression(((stack1 = ((stack1 = ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author)),stack1 == null || stack1 === false ? stack1 : stack1.thumb)),typeof stack1 === functionType ? stack1.apply(depth0) : stack1))
    + "\"\n				q-fail=\"profile-fail.png\">\n			</div>\n\n		";
  stack1 = (helper = helpers.isLinkable || (depth0 && depth0.isLinkable),options={hash:{},inverse:self.noop,fn:self.program(5, program5, data),data:data},helper ? helper.call(depth0, ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author), options) : helperMissing.call(depth0, "isLinkable", ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author), options));
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n\n		<p> <span>\n\n			";
  stack1 = (helper = helpers.isLinkable || (depth0 && depth0.isLinkable),options={hash:{},inverse:self.noop,fn:self.program(7, program7, data),data:data},helper ? helper.call(depth0, ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author), options) : helperMissing.call(depth0, "isLinkable", ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.author), options));
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n\n			bitstripped\n\n			";
  stack1 = helpers.each.call(depth0, ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.costars), {hash:{},inverse:self.noop,fn:self.programWithDepth(9, program9, data, depth0),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n\n			</span>\n\n			<span class=\"time\"><i class=\"icon-clock icon-large\"></i>\n			"
    + escapeExpression((helper = helpers.timestamp || (depth0 && depth0.timestamp),options={hash:{},data:data},helper ? helper.call(depth0, ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.timestamp), options) : helperMissing.call(depth0, "timestamp", ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.timestamp), options)))
    + " ago</span>\n		</p>\n	</div>\n\n	<div class=\"magic-feed-img\" id=\"comic_"
    + escapeExpression(((stack1 = ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.comic_id)),typeof stack1 === functionType ? stack1.apply(depth0) : stack1))
    + "\"\n		 ng-click=\"view_comic(comic.comic_id)\"\n		 queued=\""
    + escapeExpression(((stack1 = ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.comic_url)),typeof stack1 === functionType ? stack1.apply(depth0) : stack1))
    + "\"\n		 q-fail=\"comic-fail.png\">\n	</div>\n\n	<div id=\"comic_actions\">\n		";
  stack1 = helpers['if'].call(depth0, ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.comic_caption), {hash:{},inverse:self.noop,fn:self.program(14, program14, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n\n		<ul class=\"action-bar\">\n			<li class=\"like\">\n				";
  stack1 = helpers['if'].call(depth0, ((stack1 = (depth0 && depth0.comic)),stack1 == null || stack1 === false ? stack1 : stack1.did_you_like), {hash:{},inverse:self.program(18, program18, data),fn:self.program(16, program16, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n			</li>\n			<li class=\"comment\">\n				<span ng-click=\"comment(comic.comic_id)\"><i class=\"icon-comment\"></i> Comment</span>\n			</li>\n			<!--<li class=\"reply\">\n				<i class=\"icon-reply\"></i> Reply\n			</li>-->\n			<li class=\"share\" ng-click=\"native_share(comic.comic_url, comic.comic_caption, $event)\">\n				<i class=\"icon-share\"></i>\n			</li>\n		</ul>\n\n\n		<div class=\"action-items\">\n			<div>\n				<div class=\"action-icon\">\n					<i class=\"icon-heart\"></i>\n				</div>\n				<div class=\"comment-text\">\n					";
  stack1 = helpers['if'].call(depth0, (depth0 && depth0.manyLikers), {hash:{},inverse:self.program(22, program22, data),fn:self.program(20, program20, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n				</div>\n			</div>\n\n			";
  stack1 = helpers['if'].call(depth0, (depth0 && depth0.noComments), {hash:{},inverse:self.program(32, program32, data),fn:self.program(30, program30, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n		</div>\n	</div>\n\n	";
  stack1 = helpers['if'].call(depth0, (depth0 && depth0.showDeleteModal), {hash:{},inverse:self.noop,fn:self.program(43, program43, data),data:data});
  if(stack1 || stack1 === 0) { buffer += stack1; }
  buffer += "\n</div>\n\n\n\n";
  return buffer;
  });