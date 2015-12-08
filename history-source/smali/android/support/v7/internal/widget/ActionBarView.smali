.class public Landroid/support/v7/internal/widget/ActionBarView;
.super Landroid/support/v7/internal/widget/AbsActionBarView;
.source "ActionBarView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;,
        Landroid/support/v7/internal/widget/ActionBarView$HomeView;,
        Landroid/support/v7/internal/widget/ActionBarView$SavedState;
    }
.end annotation


# static fields
.field private static final DEFAULT_CUSTOM_GRAVITY:I = 0x13

.field public static final DISPLAY_DEFAULT:I = 0x0

.field private static final DISPLAY_RELAYOUT_MASK:I = 0x1f

.field private static final TAG:Ljava/lang/String; = "ActionBarView"


# instance fields
.field private mCallback:Landroid/support/v7/app/ActionBar$OnNavigationListener;

.field private mContext:Landroid/content/Context;

.field private mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

.field private mCustomNavView:Landroid/view/View;

.field private mDisplayOptions:I

.field mExpandedActionView:Landroid/view/View;

.field private final mExpandedActionViewUpListener:Landroid/view/View$OnClickListener;

.field private mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

.field private mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

.field private mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

.field private mIcon:Landroid/graphics/drawable/Drawable;

.field private mIncludeTabs:Z

.field private mIndeterminateProgressStyle:I

.field private mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

.field private mIsCollapsable:Z

.field private mIsCollapsed:Z

.field private mItemPadding:I

.field private mListNavLayout:Landroid/widget/LinearLayout;

.field private mLogo:Landroid/graphics/drawable/Drawable;

.field private mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;

.field private final mNavItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

.field private mNavigationMode:I

.field private mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field private mProgressBarPadding:I

.field private mProgressStyle:I

.field private mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

.field private mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

.field private mSpinnerAdapter:Landroid/widget/SpinnerAdapter;

.field private mSubtitle:Ljava/lang/CharSequence;

.field private mSubtitleStyleRes:I

.field private mSubtitleView:Landroid/widget/TextView;

.field private mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

.field private mTabSelector:Ljava/lang/Runnable;

.field private mTitle:Ljava/lang/CharSequence;

.field private mTitleLayout:Landroid/widget/LinearLayout;

.field private mTitleStyleRes:I

.field private mTitleUpView:Landroid/view/View;

.field private mTitleView:Landroid/widget/TextView;

.field private final mUpClickListener:Landroid/view/View$OnClickListener;

.field private mUserTitle:Z

.field mWindowCallback:Landroid/view/Window$Callback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 16
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 166
    invoke-direct/range {p0 .. p2}, Landroid/support/v7/internal/widget/AbsActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 85
    const/4 v2, -0x1

    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    .line 135
    new-instance v2, Landroid/support/v7/internal/widget/ActionBarView$1;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/support/v7/internal/widget/ActionBarView$1;-><init>(Landroid/support/v7/internal/widget/ActionBarView;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    .line 149
    new-instance v2, Landroid/support/v7/internal/widget/ActionBarView$2;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/support/v7/internal/widget/ActionBarView$2;-><init>(Landroid/support/v7/internal/widget/ActionBarView;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionViewUpListener:Landroid/view/View$OnClickListener;

    .line 159
    new-instance v2, Landroid/support/v7/internal/widget/ActionBarView$3;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/support/v7/internal/widget/ActionBarView$3;-><init>(Landroid/support/v7/internal/widget/ActionBarView;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mUpClickListener:Landroid/view/View$OnClickListener;

    .line 167
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    .line 170
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setBackgroundResource(I)V

    .line 172
    sget-object v2, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I

    sget v3, Landroid/support/v7/appcompat/R$attr;->actionBarStyle:I

    const/4 v4, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v9

    .line 175
    .local v9, "a":Landroid/content/res/TypedArray;
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v10

    .line 176
    .local v10, "appInfo":Landroid/content/pm/ApplicationInfo;
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v15

    .line 177
    .local v15, "pm":Landroid/content/pm/PackageManager;
    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    .line 179
    const/4 v2, 0x1

    invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    .line 180
    const/4 v2, 0x4

    invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    .line 181
    const/16 v2, 0x8

    invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    .line 182
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_1

    .line 183
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v2, v3, :cond_1

    .line 184
    move-object/from16 v0, p1

    instance-of v2, v0, Landroid/app/Activity;

    if-eqz v2, :cond_0

    .line 186
    :try_start_0
    move-object/from16 v0, p1

    check-cast v0, Landroid/app/Activity;

    move-object v2, v0

    invoke-virtual {v2}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v15, v2}, Landroid/content/pm/PackageManager;->getActivityLogo(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    :cond_0
    :goto_0
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_1

    .line 192
    invoke-virtual {v10, v15}, Landroid/content/pm/ApplicationInfo;->loadLogo(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    .line 198
    :cond_1
    const/4 v2, 0x7

    invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    .line 199
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_3

    .line 200
    move-object/from16 v0, p1

    instance-of v2, v0, Landroid/app/Activity;

    if-eqz v2, :cond_2

    .line 202
    :try_start_1
    move-object/from16 v0, p1

    check-cast v0, Landroid/app/Activity;

    move-object v2, v0

    invoke-virtual {v2}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v15, v2}, Landroid/content/pm/PackageManager;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 207
    :cond_2
    :goto_1
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_3

    .line 208
    invoke-virtual {v10, v15}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    .line 212
    :cond_3
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v14

    .line 214
    .local v14, "inflater":Landroid/view/LayoutInflater;
    const/16 v2, 0xe

    sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_home:I

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v13

    .line 218
    .local v13, "homeResId":I
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v14, v13, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    .line 220
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v14, v13, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    .line 221
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUp(Z)V

    .line 222
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionViewUpListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 223
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Landroid/support/v7/appcompat/R$string;->abc_action_bar_up_description:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 226
    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleStyleRes:I

    .line 227
    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleStyleRes:I

    .line 228
    const/16 v2, 0xf

    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressStyle:I

    .line 229
    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressStyle:I

    .line 232
    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I

    .line 234
    const/16 v2, 0x12

    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    .line 236
    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V

    .line 238
    const/16 v2, 0xd

    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    .line 239
    .local v11, "customNavId":I
    if-eqz v11, :cond_4

    .line 240
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v14, v11, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    .line 241
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    .line 242
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    or-int/lit8 v2, v2, 0x10

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V

    .line 245
    :cond_4
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    .line 246
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 247
    new-instance v2, Landroid/support/v7/internal/view/menu/ActionMenuItem;

    const/4 v4, 0x0

    const v5, 0x102002c

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v8}, Landroid/support/v7/internal/view/menu/ActionMenuItem;-><init>(Landroid/content/Context;IIIILjava/lang/CharSequence;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;

    .line 248
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ActionBarView;->mUpClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setClickable(Z)V

    .line 250
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setFocusable(Z)V

    .line 252
    return-void

    .line 187
    .end local v11    # "customNavId":I
    .end local v13    # "homeResId":I
    .end local v14    # "inflater":Landroid/view/LayoutInflater;
    :catch_0
    move-exception v12

    .line 188
    .local v12, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    const-string v2, "ActionBarView"

    const-string v3, "Activity component name not found!"

    invoke-static {v2, v3, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 203
    .end local v12    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    :catch_1
    move-exception v12

    .line 204
    .restart local v12    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    const-string v2, "ActionBarView"

    const-string v3, "Activity component name not found!"

    invoke-static {v2, v3, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_1
.end method

.method static synthetic access$000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/app/ActionBar$OnNavigationListener;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCallback:Landroid/support/v7/app/ActionBar$OnNavigationListener;

    return-object v0
.end method

.method static synthetic access$100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    return-object v0
.end method

.method static synthetic access$1000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/SpinnerICS;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    return-object v0
.end method

.method static synthetic access$1100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/view/View;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$1200(Landroid/support/v7/internal/widget/ActionBarView;)I
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    return v0
.end method

.method static synthetic access$1300(Landroid/support/v7/internal/widget/ActionBarView;)V
    .locals 0
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initTitle()V

    return-void
.end method

.method static synthetic access$1400(Landroid/support/v7/internal/widget/ActionBarView;)I
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    return v0
.end method

.method static synthetic access$200(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/view/menu/ActionMenuItem;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;

    return-object v0
.end method

.method static synthetic access$500(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic access$600(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    return-object v0
.end method

.method static synthetic access$700(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    return-object v0
.end method

.method static synthetic access$800(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/widget/LinearLayout;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$900(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    return-object v0
.end method

.method private configPresenters(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 4
    .param p1, "builder"    # Landroid/support/v7/internal/view/menu/MenuBuilder;

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 462
    if-eqz p1, :cond_0

    .line 463
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {p1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 464
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    invoke-virtual {p1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 471
    :goto_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->updateMenuView(Z)V

    .line 472
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->updateMenuView(Z)V

    .line 473
    return-void

    .line 466
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1, v3}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 467
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1, v3}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    goto :goto_0
.end method

.method private initTitle()V
    .locals 9

    .prologue
    const/16 v6, 0x8

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 765
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    if-nez v3, :cond_4

    .line 766
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 767
    .local v1, "inflater":Landroid/view/LayoutInflater;
    sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_title_item:I

    invoke-virtual {v1, v3, p0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    .line 769
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    sget v7, Landroid/support/v7/appcompat/R$id;->action_bar_title:I

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    .line 770
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    sget v7, Landroid/support/v7/appcompat/R$id;->action_bar_subtitle:I

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    .line 771
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    sget v7, Landroid/support/v7/appcompat/R$id;->up:I

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;

    .line 773
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mUpClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 775
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleStyleRes:I

    if-eqz v3, :cond_0

    .line 776
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    iget v8, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleStyleRes:I

    invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 778
    :cond_0
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    if-eqz v3, :cond_1

    .line 779
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 782
    :cond_1
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleStyleRes:I

    if-eqz v3, :cond_2

    .line 783
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    iget v8, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleStyleRes:I

    invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 785
    :cond_2
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    if-eqz v3, :cond_3

    .line 786
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 787
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 790
    :cond_3
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v3, v3, 0x4

    if-eqz v3, :cond_7

    move v0, v4

    .line 791
    .local v0, "homeAsUp":Z
    :goto_0
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_8

    move v2, v4

    .line 792
    .local v2, "showHome":Z
    :goto_1
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;

    if-nez v2, :cond_a

    if-eqz v0, :cond_9

    move v3, v5

    :goto_2
    invoke-virtual {v7, v3}, Landroid/view/View;->setVisibility(I)V

    .line 793
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_b

    if-nez v2, :cond_b

    :goto_3
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 796
    .end local v0    # "homeAsUp":Z
    .end local v1    # "inflater":Landroid/view/LayoutInflater;
    .end local v2    # "showHome":Z
    :cond_4
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 797
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    if-nez v3, :cond_5

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 800
    :cond_5
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 802
    :cond_6
    return-void

    .restart local v1    # "inflater":Landroid/view/LayoutInflater;
    :cond_7
    move v0, v5

    .line 790
    goto :goto_0

    .restart local v0    # "homeAsUp":Z
    :cond_8
    move v2, v5

    .line 791
    goto :goto_1

    .line 792
    .restart local v2    # "showHome":Z
    :cond_9
    const/4 v3, 0x4

    goto :goto_2

    :cond_a
    move v3, v6

    goto :goto_2

    :cond_b
    move v4, v5

    .line 793
    goto :goto_3
.end method

.method private setTitleImpl(Ljava/lang/CharSequence;)V
    .locals 3
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v1, 0x0

    .line 527
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    .line 528
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    if-eqz v2, :cond_1

    .line 529
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 530
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    if-nez v2, :cond_3

    iget v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_0
    const/4 v0, 0x1

    .line 533
    .local v0, "visible":Z
    :goto_0
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_4

    :goto_1
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 535
    .end local v0    # "visible":Z
    :cond_1
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;

    if-eqz v1, :cond_2

    .line 536
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;

    invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 538
    :cond_2
    return-void

    :cond_3
    move v0, v1

    .line 530
    goto :goto_0

    .line 533
    .restart local v0    # "visible":Z
    :cond_4
    const/16 v1, 0x8

    goto :goto_1
.end method


# virtual methods
.method public bridge synthetic animateToVisibility(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->animateToVisibility(I)V

    return-void
.end method

.method public collapseActionView()V
    .locals 2

    .prologue
    .line 481
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    .line 483
    .local v0, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :goto_0
    if-eqz v0, :cond_0

    .line 484
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->collapseActionView()Z

    .line 486
    :cond_0
    return-void

    .line 481
    .end local v0    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_1
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    goto :goto_0
.end method

.method public bridge synthetic dismissPopupMenus()V
    .locals 0

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->dismissPopupMenus()V

    return-void
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 744
    new-instance v0, Landroid/support/v7/app/ActionBar$LayoutParams;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Landroid/support/v7/app/ActionBar$LayoutParams;-><init>(I)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2
    .param p1, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 1159
    new-instance v0, Landroid/support/v7/app/ActionBar$LayoutParams;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/support/v7/app/ActionBar$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0
    .param p1, "lp"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 1164
    if-nez p1, :cond_0

    .line 1165
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 1167
    :cond_0
    return-object p1
.end method

.method public bridge synthetic getAnimatedVisibility()I
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getAnimatedVisibility()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getContentHeight()I
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContentHeight()I

    move-result v0

    return v0
.end method

.method public getCustomNavigationView()Landroid/view/View;
    .locals 1

    .prologue
    .line 729
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    return-object v0
.end method

.method public getDisplayOptions()I
    .locals 1

    .prologue
    .line 737
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    return v0
.end method

.method public getDropdownAdapter()Landroid/widget/SpinnerAdapter;
    .locals 1

    .prologue
    .line 717
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;

    return-object v0
.end method

.method public getDropdownSelectedPosition()I
    .locals 1

    .prologue
    .line 725
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getSelectedItemPosition()I

    move-result v0

    return v0
.end method

.method public getNavigationMode()I
    .locals 1

    .prologue
    .line 733
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    return v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 541
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 500
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public hasEmbeddedTabs()Z
    .locals 1

    .prologue
    .line 373
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    return v0
.end method

.method public hasExpandedActionView()Z
    .locals 1

    .prologue
    .line 476
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic hideOverflowMenu()Z
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->hideOverflowMenu()Z

    move-result v0

    return v0
.end method

.method public initIndeterminateProgress()V
    .locals 5

    .prologue
    .line 320
    new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressStyle:I

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    .line 322
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    sget v1, Landroid/support/v7/appcompat/R$id;->progress_circular:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setId(I)V

    .line 323
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 324
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 325
    return-void
.end method

.method public initProgress()V
    .locals 5

    .prologue
    .line 312
    new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressStyle:I

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    .line 313
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    sget v1, Landroid/support/v7/appcompat/R$id;->progress_horizontal:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setId(I)V

    .line 314
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setMax(I)V

    .line 315
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 316
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 317
    return-void
.end method

.method public isCollapsed()Z
    .locals 1

    .prologue
    .line 813
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsed:Z

    return v0
.end method

.method public bridge synthetic isOverflowMenuShowing()Z
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->isOverflowMenuShowing()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isOverflowReserved()Z
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->isOverflowReserved()Z

    move-result v0

    return v0
.end method

.method public isSplitActionBar()Z
    .locals 1

    .prologue
    .line 369
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitActionBar:Z

    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    const/4 v2, 0x0

    .line 256
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 258
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    .line 259
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    .line 260
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;

    .line 261
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-ne v1, p0, :cond_0

    .line 262
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 264
    :cond_0
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    .line 265
    iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_1

    .line 266
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initTitle()V

    .line 269
    :cond_1
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    if-eqz v1, :cond_3

    .line 270
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 271
    .local v0, "lp":Landroid/view/ViewGroup$LayoutParams;
    if-eqz v0, :cond_2

    .line 272
    const/4 v1, -0x2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 273
    const/4 v1, -0x1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 275
    :cond_2
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setAllowCollapse(Z)V

    .line 278
    .end local v0    # "lp":Landroid/view/ViewGroup$LayoutParams;
    :cond_3
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    if-eqz v1, :cond_4

    .line 279
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 280
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initProgress()V

    .line 282
    :cond_4
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    if-eqz v1, :cond_5

    .line 283
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 284
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initIndeterminateProgress()V

    .line 286
    :cond_5
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 299
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onDetachedFromWindow()V

    .line 300
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabSelector:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 301
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z

    .line 303
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideSubMenus()Z

    .line 305
    :cond_0
    return-void
.end method

.method protected onFinishInflate()V
    .locals 2

    .prologue
    .line 749
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onFinishInflate()V

    .line 751
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 753
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    if-eqz v1, :cond_1

    iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_1

    .line 754
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 755
    .local v0, "parent":Landroid/view/ViewParent;
    if-eq v0, p0, :cond_1

    .line 756
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 757
    check-cast v0, Landroid/view/ViewGroup;

    .end local v0    # "parent":Landroid/view/ViewParent;
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 759
    :cond_0
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 762
    :cond_1
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 32
    .param p1, "changed"    # Z
    .param p2, "l"    # I
    .param p3, "t"    # I
    .param p4, "r"    # I
    .param p5, "b"    # I

    .prologue
    .line 1015
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingLeft()I

    move-result v23

    .line 1016
    .local v23, "x":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I

    move-result v25

    .line 1017
    .local v25, "y":I
    sub-int v27, p5, p3

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I

    move-result v28

    sub-int v27, v27, v28

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I

    move-result v28

    sub-int v7, v27, v28

    .line 1019
    .local v7, "contentHeight":I
    if-gtz v7, :cond_1

    .line 1155
    :cond_0
    :goto_0
    return-void

    .line 1024
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v27, v0

    if-eqz v27, :cond_c

    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    .line 1025
    .local v13, "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    :goto_1
    invoke-virtual {v13}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getVisibility()I

    move-result v27

    const/16 v28, 0x8

    move/from16 v0, v27

    move/from16 v1, v28

    if-eq v0, v1, :cond_2

    .line 1026
    invoke-virtual {v13}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getLeftOffset()I

    move-result v14

    .line 1027
    .local v14, "leftOffset":I
    add-int v27, v23, v14

    move-object/from16 v0, p0

    move/from16 v1, v27

    move/from16 v2, v25

    invoke-virtual {v0, v13, v1, v2, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I

    move-result v27

    add-int v27, v27, v14

    add-int v23, v23, v27

    .line 1030
    .end local v14    # "leftOffset":I
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v27, v0

    if-nez v27, :cond_4

    .line 1031
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v27, v0

    if-eqz v27, :cond_d

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v27

    const/16 v28, 0x8

    move/from16 v0, v27

    move/from16 v1, v28

    if-eq v0, v1, :cond_d

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    move/from16 v27, v0

    and-int/lit8 v27, v27, 0x8

    if-eqz v27, :cond_d

    const/16 v20, 0x1

    .line 1034
    .local v20, "showTitle":Z
    :goto_2
    if-eqz v20, :cond_3

    .line 1035
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v27

    move/from16 v2, v23

    move/from16 v3, v25

    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I

    move-result v27

    add-int v23, v23, v27

    .line 1038
    :cond_3
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    move/from16 v27, v0

    packed-switch v27, :pswitch_data_0

    .line 1060
    .end local v20    # "showTitle":Z
    :cond_4
    :goto_3
    :pswitch_0
    sub-int v27, p4, p2

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingRight()I

    move-result v28

    sub-int v16, v27, v28

    .line 1061
    .local v16, "menuLeft":I
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v27, v0

    if-eqz v27, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v27

    move-object/from16 v0, v27

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_5

    .line 1062
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v27

    move/from16 v2, v16

    move/from16 v3, v25

    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChildInverse(Landroid/view/View;III)I

    .line 1063
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getMeasuredWidth()I

    move-result v27

    sub-int v16, v16, v27

    .line 1066
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    if-eqz v27, :cond_6

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v27

    const/16 v28, 0x8

    move/from16 v0, v27

    move/from16 v1, v28

    if-eq v0, v1, :cond_6

    .line 1068
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v27

    move/from16 v2, v16

    move/from16 v3, v25

    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChildInverse(Landroid/view/View;III)I

    .line 1069
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredWidth()I

    move-result v27

    sub-int v16, v16, v27

    .line 1072
    :cond_6
    const/4 v8, 0x0

    .line 1073
    .local v8, "customView":Landroid/view/View;
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v27, v0

    if-eqz v27, :cond_10

    .line 1074
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    .line 1079
    :cond_7
    :goto_4
    if-eqz v8, :cond_b

    .line 1080
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    .line 1081
    .local v15, "lp":Landroid/view/ViewGroup$LayoutParams;
    instance-of v0, v15, Landroid/support/v7/app/ActionBar$LayoutParams;

    move/from16 v27, v0

    if-eqz v27, :cond_11

    check-cast v15, Landroid/support/v7/app/ActionBar$LayoutParams;

    .end local v15    # "lp":Landroid/view/ViewGroup$LayoutParams;
    move-object v4, v15

    .line 1084
    .local v4, "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
    :goto_5
    if-eqz v4, :cond_12

    iget v10, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1085
    .local v10, "gravity":I
    :goto_6
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v17

    .line 1087
    .local v17, "navWidth":I
    const/16 v21, 0x0

    .line 1088
    .local v21, "topMargin":I
    const/4 v5, 0x0

    .line 1089
    .local v5, "bottomMargin":I
    if-eqz v4, :cond_8

    .line 1090
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->leftMargin:I

    move/from16 v27, v0

    add-int v23, v23, v27

    .line 1091
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->rightMargin:I

    move/from16 v27, v0

    sub-int v16, v16, v27

    .line 1092
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->topMargin:I

    move/from16 v21, v0

    .line 1093
    iget v5, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->bottomMargin:I

    .line 1096
    :cond_8
    and-int/lit8 v12, v10, 0x7

    .line 1098
    .local v12, "hgravity":I
    const/16 v27, 0x1

    move/from16 v0, v27

    if-ne v12, v0, :cond_14

    .line 1099
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getWidth()I

    move-result v27

    sub-int v27, v27, v17

    div-int/lit8 v6, v27, 0x2

    .line 1100
    .local v6, "centeredLeft":I
    move/from16 v0, v23

    if-ge v6, v0, :cond_13

    .line 1101
    const/4 v12, 0x3

    .line 1109
    .end local v6    # "centeredLeft":I
    :cond_9
    :goto_7
    const/16 v24, 0x0

    .line 1110
    .local v24, "xpos":I
    packed-switch v12, :pswitch_data_1

    .line 1122
    :goto_8
    :pswitch_1
    and-int/lit8 v22, v10, 0x70

    .line 1124
    .local v22, "vgravity":I
    const/16 v27, -0x1

    move/from16 v0, v27

    if-ne v10, v0, :cond_a

    .line 1125
    const/16 v22, 0x10

    .line 1128
    :cond_a
    const/16 v26, 0x0

    .line 1129
    .local v26, "ypos":I
    sparse-switch v22, :sswitch_data_0

    .line 1143
    :goto_9
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    .line 1144
    .local v9, "customWidth":I
    add-int v27, v24, v9

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v28

    add-int v28, v28, v26

    move/from16 v0, v24

    move/from16 v1, v26

    move/from16 v2, v27

    move/from16 v3, v28

    invoke-virtual {v8, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 1146
    add-int v23, v23, v9

    .line 1149
    .end local v4    # "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
    .end local v5    # "bottomMargin":I
    .end local v9    # "customWidth":I
    .end local v10    # "gravity":I
    .end local v12    # "hgravity":I
    .end local v17    # "navWidth":I
    .end local v21    # "topMargin":I
    .end local v22    # "vgravity":I
    .end local v24    # "xpos":I
    .end local v26    # "ypos":I
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    if-eqz v27, :cond_0

    .line 1150
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->bringToFront()V

    .line 1151
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredHeight()I

    move-result v27

    div-int/lit8 v11, v27, 0x2

    .line 1152
    .local v11, "halfProgressHeight":I
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I

    move/from16 v28, v0

    neg-int v0, v11

    move/from16 v29, v0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I

    move/from16 v30, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v31, v0

    invoke-virtual/range {v31 .. v31}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredWidth()I

    move-result v31

    add-int v30, v30, v31

    move-object/from16 v0, v27

    move/from16 v1, v28

    move/from16 v2, v29

    move/from16 v3, v30

    invoke-virtual {v0, v1, v2, v3, v11}, Landroid/support/v7/internal/widget/ProgressBarICS;->layout(IIII)V

    goto/16 :goto_0

    .line 1024
    .end local v8    # "customView":Landroid/view/View;
    .end local v11    # "halfProgressHeight":I
    .end local v13    # "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    .end local v16    # "menuLeft":I
    :cond_c
    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    goto/16 :goto_1

    .line 1031
    .restart local v13    # "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    :cond_d
    const/16 v20, 0x0

    goto/16 :goto_2

    .line 1042
    .restart local v20    # "showTitle":Z
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    move-object/from16 v27, v0

    if-eqz v27, :cond_4

    .line 1043
    if-eqz v20, :cond_e

    .line 1044
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    move/from16 v27, v0

    add-int v23, v23, v27

    .line 1046
    :cond_e
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v27

    move/from16 v2, v23

    move/from16 v3, v25

    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I

    move-result v27

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    move/from16 v28, v0

    add-int v27, v27, v28

    add-int v23, v23, v27

    goto/16 :goto_3

    .line 1050
    :pswitch_3
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-object/from16 v27, v0

    if-eqz v27, :cond_4

    .line 1051
    if-eqz v20, :cond_f

    .line 1052
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    move/from16 v27, v0

    add-int v23, v23, v27

    .line 1054
    :cond_f
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v27

    move/from16 v2, v23

    move/from16 v3, v25

    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I

    move-result v27

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    move/from16 v28, v0

    add-int v27, v27, v28

    add-int v23, v23, v27

    goto/16 :goto_3

    .line 1075
    .end local v20    # "showTitle":Z
    .restart local v8    # "customView":Landroid/view/View;
    .restart local v16    # "menuLeft":I
    :cond_10
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    move/from16 v27, v0

    and-int/lit8 v27, v27, 0x10

    if-eqz v27, :cond_7

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    move-object/from16 v27, v0

    if-eqz v27, :cond_7

    .line 1077
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    goto/16 :goto_4

    .line 1081
    .restart local v15    # "lp":Landroid/view/ViewGroup$LayoutParams;
    :cond_11
    const/4 v4, 0x0

    goto/16 :goto_5

    .line 1084
    .end local v15    # "lp":Landroid/view/ViewGroup$LayoutParams;
    .restart local v4    # "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
    :cond_12
    const/16 v10, 0x13

    goto/16 :goto_6

    .line 1102
    .restart local v5    # "bottomMargin":I
    .restart local v6    # "centeredLeft":I
    .restart local v10    # "gravity":I
    .restart local v12    # "hgravity":I
    .restart local v17    # "navWidth":I
    .restart local v21    # "topMargin":I
    :cond_13
    add-int v27, v6, v17

    move/from16 v0, v27

    move/from16 v1, v16

    if-le v0, v1, :cond_9

    .line 1103
    const/4 v12, 0x5

    goto/16 :goto_7

    .line 1105
    .end local v6    # "centeredLeft":I
    :cond_14
    const/16 v27, -0x1

    move/from16 v0, v27

    if-ne v10, v0, :cond_9

    .line 1106
    const/4 v12, 0x3

    goto/16 :goto_7

    .line 1112
    .restart local v24    # "xpos":I
    :pswitch_4
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getWidth()I

    move-result v27

    sub-int v27, v27, v17

    div-int/lit8 v24, v27, 0x2

    .line 1113
    goto/16 :goto_8

    .line 1115
    :pswitch_5
    move/from16 v24, v23

    .line 1116
    goto/16 :goto_8

    .line 1118
    :pswitch_6
    sub-int v24, v16, v17

    goto/16 :goto_8

    .line 1131
    .restart local v22    # "vgravity":I
    .restart local v26    # "ypos":I
    :sswitch_0
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I

    move-result v19

    .line 1132
    .local v19, "paddedTop":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getHeight()I

    move-result v27

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I

    move-result v28

    sub-int v18, v27, v28

    .line 1133
    .local v18, "paddedBottom":I
    sub-int v27, v18, v19

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v28

    sub-int v27, v27, v28

    div-int/lit8 v26, v27, 0x2

    .line 1134
    goto/16 :goto_9

    .line 1136
    .end local v18    # "paddedBottom":I
    .end local v19    # "paddedTop":I
    :sswitch_1
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I

    move-result v27

    add-int v26, v27, v21

    .line 1137
    goto/16 :goto_9

    .line 1139
    :sswitch_2
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getHeight()I

    move-result v27

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I

    move-result v28

    sub-int v27, v27, v28

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v28

    sub-int v27, v27, v28

    sub-int v26, v27, v5

    goto/16 :goto_9

    .line 1038
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 1110
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_1
        :pswitch_5
        :pswitch_1
        :pswitch_6
    .end packed-switch

    .line 1129
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_0
        0x30 -> :sswitch_1
        0x50 -> :sswitch_2
    .end sparse-switch
.end method

.method protected onMeasure(II)V
    .locals 44
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    .line 818
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getChildCount()I

    move-result v7

    .line 819
    .local v7, "childCount":I
    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsable:Z

    move/from16 v40, v0

    if-eqz v40, :cond_4

    .line 820
    const/16 v38, 0x0

    .line 821
    .local v38, "visibleChildren":I
    const/16 v22, 0x0

    .local v22, "i":I
    :goto_0
    move/from16 v0, v22

    if-ge v0, v7, :cond_2

    .line 822
    move-object/from16 v0, p0

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 823
    .local v6, "child":Landroid/view/View;
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v40

    const/16 v41, 0x8

    move/from16 v0, v40

    move/from16 v1, v41

    if-eq v0, v1, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v40, v0

    move-object/from16 v0, v40

    if-ne v6, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I

    move-result v40

    if-eqz v40, :cond_1

    .line 825
    :cond_0
    add-int/lit8 v38, v38, 0x1

    .line 821
    :cond_1
    add-int/lit8 v22, v22, 0x1

    goto :goto_0

    .line 829
    .end local v6    # "child":Landroid/view/View;
    :cond_2
    if-nez v38, :cond_4

    .line 831
    const/16 v40, 0x0

    const/16 v41, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v40

    move/from16 v2, v41

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setMeasuredDimension(II)V

    .line 832
    const/16 v40, 0x1

    move/from16 v0, v40

    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsed:Z

    .line 1011
    .end local v22    # "i":I
    .end local v38    # "visibleChildren":I
    :cond_3
    :goto_1
    return-void

    .line 836
    :cond_4
    const/16 v40, 0x0

    move/from16 v0, v40

    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsed:Z

    .line 838
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v39

    .line 839
    .local v39, "widthMode":I
    const/high16 v40, 0x40000000    # 2.0f

    move/from16 v0, v39

    move/from16 v1, v40

    if-eq v0, v1, :cond_5

    .line 840
    new-instance v40, Ljava/lang/IllegalStateException;

    new-instance v41, Ljava/lang/StringBuilder;

    invoke-direct/range {v41 .. v41}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v42

    invoke-virtual/range {v42 .. v42}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v42

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    const-string v42, " can only be used "

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    const-string v42, "with android:layout_width=\"MATCH_PARENT\" (or fill_parent)"

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    invoke-virtual/range {v41 .. v41}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v41

    invoke-direct/range {v40 .. v41}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v40

    .line 844
    :cond_5
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v16

    .line 845
    .local v16, "heightMode":I
    const/high16 v40, -0x80000000

    move/from16 v0, v16

    move/from16 v1, v40

    if-eq v0, v1, :cond_6

    .line 846
    new-instance v40, Ljava/lang/IllegalStateException;

    new-instance v41, Ljava/lang/StringBuilder;

    invoke-direct/range {v41 .. v41}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v42

    invoke-virtual/range {v42 .. v42}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v42

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    const-string v42, " can only be used "

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    const-string v42, "with android:layout_height=\"wrap_content\""

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    invoke-virtual/range {v41 .. v41}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v41

    invoke-direct/range {v40 .. v41}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v40

    .line 850
    :cond_6
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v9

    .line 852
    .local v9, "contentWidth":I
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    move/from16 v40, v0

    if-lez v40, :cond_12

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    move/from16 v27, v0

    .line 855
    .local v27, "maxHeight":I
    :goto_2
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I

    move-result v40

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I

    move-result v41

    add-int v37, v40, v41

    .line 856
    .local v37, "verticalPadding":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingLeft()I

    move-result v30

    .line 857
    .local v30, "paddingLeft":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingRight()I

    move-result v31

    .line 858
    .local v31, "paddingRight":I
    sub-int v15, v27, v37

    .line 859
    .local v15, "height":I
    const/high16 v40, -0x80000000

    move/from16 v0, v40

    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 861
    .local v8, "childSpecHeight":I
    sub-int v40, v9, v30

    sub-int v5, v40, v31

    .line 862
    .local v5, "availableWidth":I
    div-int/lit8 v24, v5, 0x2

    .line 863
    .local v24, "leftOfCenter":I
    move/from16 v32, v24

    .line 865
    .local v32, "rightOfCenter":I
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v40, v0

    if-eqz v40, :cond_13

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v18, v0

    .line 867
    .local v18, "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    :goto_3
    invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getVisibility()I

    move-result v40

    const/16 v41, 0x8

    move/from16 v0, v40

    move/from16 v1, v41

    if-eq v0, v1, :cond_7

    .line 868
    invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v26

    .line 870
    .local v26, "lp":Landroid/view/ViewGroup$LayoutParams;
    move-object/from16 v0, v26

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    move/from16 v40, v0

    if-gez v40, :cond_14

    .line 871
    const/high16 v40, -0x80000000

    move/from16 v0, v40

    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .line 875
    .local v20, "homeWidthSpec":I
    :goto_4
    const/high16 v40, 0x40000000    # 2.0f

    move/from16 v0, v40

    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v40

    move-object/from16 v0, v18

    move/from16 v1, v20

    move/from16 v2, v40

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->measure(II)V

    .line 877
    invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getMeasuredWidth()I

    move-result v40

    invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getLeftOffset()I

    move-result v41

    add-int v19, v40, v41

    .line 878
    .local v19, "homeWidth":I
    const/16 v40, 0x0

    sub-int v41, v5, v19

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 879
    const/16 v40, 0x0

    sub-int v41, v5, v19

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 882
    .end local v19    # "homeWidth":I
    .end local v20    # "homeWidthSpec":I
    .end local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v40, v0

    if-eqz v40, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v40

    move-object/from16 v0, v40

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_8

    .line 883
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v40, v0

    const/16 v41, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v40

    move/from16 v2, v41

    invoke-virtual {v0, v1, v5, v8, v2}, Landroid/support/v7/internal/widget/ActionBarView;->measureChildView(Landroid/view/View;III)I

    move-result v5

    .line 885
    const/16 v40, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v41, v0

    invoke-virtual/range {v41 .. v41}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getMeasuredWidth()I

    move-result v41

    sub-int v41, v32, v41

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v32

    .line 888
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    if-eqz v40, :cond_9

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v40

    const/16 v41, 0x8

    move/from16 v0, v40

    move/from16 v1, v41

    if-eq v0, v1, :cond_9

    .line 890
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    const/16 v41, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v40

    move/from16 v2, v41

    invoke-virtual {v0, v1, v5, v8, v2}, Landroid/support/v7/internal/widget/ActionBarView;->measureChildView(Landroid/view/View;III)I

    move-result v5

    .line 892
    const/16 v40, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v41, v0

    invoke-virtual/range {v41 .. v41}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredWidth()I

    move-result v41

    sub-int v41, v32, v41

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v32

    .line 896
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    if-eqz v40, :cond_15

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v40

    const/16 v41, 0x8

    move/from16 v0, v40

    move/from16 v1, v41

    if-eq v0, v1, :cond_15

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    move/from16 v40, v0

    and-int/lit8 v40, v40, 0x8

    if-eqz v40, :cond_15

    const/16 v33, 0x1

    .line 899
    .local v33, "showTitle":Z
    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v40, v0

    if-nez v40, :cond_a

    .line 900
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    move/from16 v40, v0

    packed-switch v40, :pswitch_data_0

    .line 930
    :cond_a
    :goto_6
    const/4 v14, 0x0

    .line 931
    .local v14, "customView":Landroid/view/View;
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v40, v0

    if-eqz v40, :cond_18

    .line 932
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    .line 938
    :cond_b
    :goto_7
    if-eqz v14, :cond_f

    .line 939
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v40

    move-object/from16 v0, p0

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v26

    .line 940
    .restart local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
    move-object/from16 v0, v26

    instance-of v0, v0, Landroid/support/v7/app/ActionBar$LayoutParams;

    move/from16 v40, v0

    if-eqz v40, :cond_19

    move-object/from16 v40, v26

    check-cast v40, Landroid/support/v7/app/ActionBar$LayoutParams;

    move-object/from16 v4, v40

    .line 943
    .local v4, "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
    :goto_8
    const/16 v21, 0x0

    .line 944
    .local v21, "horizontalMargin":I
    const/16 v36, 0x0

    .line 945
    .local v36, "verticalMargin":I
    if-eqz v4, :cond_c

    .line 946
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->leftMargin:I

    move/from16 v40, v0

    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->rightMargin:I

    move/from16 v41, v0

    add-int v21, v40, v41

    .line 947
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->topMargin:I

    move/from16 v40, v0

    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->bottomMargin:I

    move/from16 v41, v0

    add-int v36, v40, v41

    .line 953
    :cond_c
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    move/from16 v40, v0

    if-gtz v40, :cond_1a

    .line 954
    const/high16 v11, -0x80000000

    .line 959
    .local v11, "customNavHeightMode":I
    :goto_9
    const/16 v40, 0x0

    move-object/from16 v0, v26

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    move/from16 v41, v0

    if-ltz v41, :cond_d

    move-object/from16 v0, v26

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    move/from16 v41, v0

    move/from16 v0, v41

    invoke-static {v0, v15}, Ljava/lang/Math;->min(II)I

    move-result v15

    .end local v15    # "height":I
    :cond_d
    sub-int v41, v15, v36

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 962
    .local v10, "customNavHeight":I
    move-object/from16 v0, v26

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    move/from16 v40, v0

    const/16 v41, -0x2

    move/from16 v0, v40

    move/from16 v1, v41

    if-eq v0, v1, :cond_1c

    const/high16 v13, 0x40000000    # 2.0f

    .line 964
    .local v13, "customNavWidthMode":I
    :goto_a
    const/16 v41, 0x0

    move-object/from16 v0, v26

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    move/from16 v40, v0

    if-ltz v40, :cond_1d

    move-object/from16 v0, v26

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    move/from16 v40, v0

    move/from16 v0, v40

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v40

    :goto_b
    sub-int v40, v40, v21

    move/from16 v0, v41

    move/from16 v1, v40

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 967
    .local v12, "customNavWidth":I
    if-eqz v4, :cond_1e

    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    move/from16 v40, v0

    :goto_c
    and-int/lit8 v17, v40, 0x7

    .line 972
    .local v17, "hgrav":I
    const/16 v40, 0x1

    move/from16 v0, v17

    move/from16 v1, v40

    if-ne v0, v1, :cond_e

    move-object/from16 v0, v26

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    move/from16 v40, v0

    const/16 v41, -0x1

    move/from16 v0, v40

    move/from16 v1, v41

    if-ne v0, v1, :cond_e

    .line 973
    move/from16 v0, v24

    move/from16 v1, v32

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v40

    mul-int/lit8 v12, v40, 0x2

    .line 976
    :cond_e
    invoke-static {v12, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v40

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v41

    move/from16 v0, v40

    move/from16 v1, v41

    invoke-virtual {v14, v0, v1}, Landroid/view/View;->measure(II)V

    .line 979
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v40

    add-int v40, v40, v21

    sub-int v5, v5, v40

    .line 982
    .end local v4    # "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
    .end local v10    # "customNavHeight":I
    .end local v11    # "customNavHeightMode":I
    .end local v12    # "customNavWidth":I
    .end local v13    # "customNavWidthMode":I
    .end local v17    # "hgrav":I
    .end local v21    # "horizontalMargin":I
    .end local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
    .end local v36    # "verticalMargin":I
    :cond_f
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v40, v0

    if-nez v40, :cond_10

    if-eqz v33, :cond_10

    .line 983
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    move/from16 v41, v0

    const/high16 v42, 0x40000000    # 2.0f

    invoke-static/range {v41 .. v42}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v41

    const/16 v42, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v40

    move/from16 v2, v41

    move/from16 v3, v42

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/support/v7/internal/widget/ActionBarView;->measureChildView(Landroid/view/View;III)I

    move-result v5

    .line 985
    const/16 v40, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v41, v0

    invoke-virtual/range {v41 .. v41}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v41

    sub-int v41, v24, v41

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 988
    :cond_10
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    move/from16 v40, v0

    if-gtz v40, :cond_21

    .line 989
    const/16 v28, 0x0

    .line 990
    .local v28, "measuredHeight":I
    const/16 v22, 0x0

    .restart local v22    # "i":I
    :goto_d
    move/from16 v0, v22

    if-ge v0, v7, :cond_1f

    .line 991
    move-object/from16 v0, p0

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->getChildAt(I)Landroid/view/View;

    move-result-object v35

    .line 992
    .local v35, "v":Landroid/view/View;
    invoke-virtual/range {v35 .. v35}, Landroid/view/View;->getMeasuredHeight()I

    move-result v40

    add-int v29, v40, v37

    .line 993
    .local v29, "paddedViewHeight":I
    move/from16 v0, v29

    move/from16 v1, v28

    if-le v0, v1, :cond_11

    .line 994
    move/from16 v28, v29

    .line 990
    :cond_11
    add-int/lit8 v22, v22, 0x1

    goto :goto_d

    .line 852
    .end local v5    # "availableWidth":I
    .end local v8    # "childSpecHeight":I
    .end local v14    # "customView":Landroid/view/View;
    .end local v18    # "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    .end local v22    # "i":I
    .end local v24    # "leftOfCenter":I
    .end local v27    # "maxHeight":I
    .end local v28    # "measuredHeight":I
    .end local v29    # "paddedViewHeight":I
    .end local v30    # "paddingLeft":I
    .end local v31    # "paddingRight":I
    .end local v32    # "rightOfCenter":I
    .end local v33    # "showTitle":Z
    .end local v35    # "v":Landroid/view/View;
    .end local v37    # "verticalPadding":I
    :cond_12
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v27

    goto/16 :goto_2

    .line 865
    .restart local v5    # "availableWidth":I
    .restart local v8    # "childSpecHeight":I
    .restart local v15    # "height":I
    .restart local v24    # "leftOfCenter":I
    .restart local v27    # "maxHeight":I
    .restart local v30    # "paddingLeft":I
    .restart local v31    # "paddingRight":I
    .restart local v32    # "rightOfCenter":I
    .restart local v37    # "verticalPadding":I
    :cond_13
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v18, v0

    goto/16 :goto_3

    .line 873
    .restart local v18    # "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    .restart local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
    :cond_14
    move-object/from16 v0, v26

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    move/from16 v40, v0

    const/high16 v41, 0x40000000    # 2.0f

    invoke-static/range {v40 .. v41}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .restart local v20    # "homeWidthSpec":I
    goto/16 :goto_4

    .line 896
    .end local v20    # "homeWidthSpec":I
    .end local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
    :cond_15
    const/16 v33, 0x0

    goto/16 :goto_5

    .line 902
    .restart local v33    # "showTitle":Z
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    if-eqz v40, :cond_a

    .line 903
    if-eqz v33, :cond_16

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    move/from16 v40, v0

    mul-int/lit8 v23, v40, 0x2

    .line 904
    .local v23, "itemPaddingSize":I
    :goto_e
    const/16 v40, 0x0

    sub-int v41, v5, v23

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 905
    const/16 v40, 0x0

    sub-int v41, v24, v23

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 906
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    const/high16 v41, -0x80000000

    move/from16 v0, v41

    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v41

    const/high16 v42, 0x40000000    # 2.0f

    move/from16 v0, v42

    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v42

    invoke-virtual/range {v40 .. v42}, Landroid/widget/LinearLayout;->measure(II)V

    .line 909
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v25

    .line 910
    .local v25, "listNavWidth":I
    const/16 v40, 0x0

    sub-int v41, v5, v25

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 911
    const/16 v40, 0x0

    sub-int v41, v24, v25

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 912
    goto/16 :goto_6

    .line 903
    .end local v23    # "itemPaddingSize":I
    .end local v25    # "listNavWidth":I
    :cond_16
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    move/from16 v23, v0

    goto :goto_e

    .line 915
    :pswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-object/from16 v40, v0

    if-eqz v40, :cond_a

    .line 916
    if-eqz v33, :cond_17

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    move/from16 v40, v0

    mul-int/lit8 v23, v40, 0x2

    .line 917
    .restart local v23    # "itemPaddingSize":I
    :goto_f
    const/16 v40, 0x0

    sub-int v41, v5, v23

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 918
    const/16 v40, 0x0

    sub-int v41, v24, v23

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 919
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-object/from16 v40, v0

    const/high16 v41, -0x80000000

    move/from16 v0, v41

    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v41

    const/high16 v42, 0x40000000    # 2.0f

    move/from16 v0, v42

    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v42

    invoke-virtual/range {v40 .. v42}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->measure(II)V

    .line 922
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getMeasuredWidth()I

    move-result v34

    .line 923
    .local v34, "tabWidth":I
    const/16 v40, 0x0

    sub-int v41, v5, v34

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 924
    const/16 v40, 0x0

    sub-int v41, v24, v34

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    goto/16 :goto_6

    .line 916
    .end local v23    # "itemPaddingSize":I
    .end local v34    # "tabWidth":I
    :cond_17
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    move/from16 v23, v0

    goto :goto_f

    .line 933
    .restart local v14    # "customView":Landroid/view/View;
    :cond_18
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    move/from16 v40, v0

    and-int/lit8 v40, v40, 0x10

    if-eqz v40, :cond_b

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    move-object/from16 v40, v0

    if-eqz v40, :cond_b

    .line 935
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    goto/16 :goto_7

    .line 940
    .restart local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
    :cond_19
    const/4 v4, 0x0

    goto/16 :goto_8

    .line 956
    .restart local v4    # "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
    .restart local v21    # "horizontalMargin":I
    .restart local v36    # "verticalMargin":I
    :cond_1a
    move-object/from16 v0, v26

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    move/from16 v40, v0

    const/16 v41, -0x2

    move/from16 v0, v40

    move/from16 v1, v41

    if-eq v0, v1, :cond_1b

    const/high16 v11, 0x40000000    # 2.0f

    .restart local v11    # "customNavHeightMode":I
    :goto_10
    goto/16 :goto_9

    .end local v11    # "customNavHeightMode":I
    :cond_1b
    const/high16 v11, -0x80000000

    goto :goto_10

    .line 962
    .end local v15    # "height":I
    .restart local v10    # "customNavHeight":I
    .restart local v11    # "customNavHeightMode":I
    :cond_1c
    const/high16 v13, -0x80000000

    goto/16 :goto_a

    .restart local v13    # "customNavWidthMode":I
    :cond_1d
    move/from16 v40, v5

    .line 964
    goto/16 :goto_b

    .line 967
    .restart local v12    # "customNavWidth":I
    :cond_1e
    const/16 v40, 0x13

    goto/16 :goto_c

    .line 997
    .end local v4    # "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
    .end local v10    # "customNavHeight":I
    .end local v11    # "customNavHeightMode":I
    .end local v12    # "customNavWidth":I
    .end local v13    # "customNavWidthMode":I
    .end local v21    # "horizontalMargin":I
    .end local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
    .end local v36    # "verticalMargin":I
    .restart local v22    # "i":I
    .restart local v28    # "measuredHeight":I
    :cond_1f
    move-object/from16 v0, p0

    move/from16 v1, v28

    invoke-virtual {v0, v9, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setMeasuredDimension(II)V

    .line 1002
    .end local v22    # "i":I
    .end local v28    # "measuredHeight":I
    :goto_11
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    move-object/from16 v40, v0

    if-eqz v40, :cond_20

    .line 1003
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    move-object/from16 v40, v0

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getMeasuredHeight()I

    move-result v41

    invoke-virtual/range {v40 .. v41}, Landroid/support/v7/internal/widget/ActionBarContextView;->setContentHeight(I)V

    .line 1006
    :cond_20
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    if-eqz v40, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v40

    const/16 v41, 0x8

    move/from16 v0, v40

    move/from16 v1, v41

    if-eq v0, v1, :cond_3

    .line 1007
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I

    move/from16 v41, v0

    mul-int/lit8 v41, v41, 0x2

    sub-int v41, v9, v41

    const/high16 v42, 0x40000000    # 2.0f

    invoke-static/range {v41 .. v42}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v41

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getMeasuredHeight()I

    move-result v42

    const/high16 v43, -0x80000000

    invoke-static/range {v42 .. v43}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v42

    invoke-virtual/range {v40 .. v42}, Landroid/support/v7/internal/widget/ProgressBarICS;->measure(II)V

    goto/16 :goto_1

    .line 999
    :cond_21
    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-virtual {v0, v9, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setMeasuredDimension(II)V

    goto :goto_11

    .line 900
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 4
    .param p1, "p"    # Landroid/os/Parcelable;

    .prologue
    .line 1186
    move-object v1, p1

    check-cast v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;

    .line 1188
    .local v1, "state":Landroid/support/v7/internal/widget/ActionBarView$SavedState;
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-super {p0, v2}, Landroid/support/v7/internal/widget/AbsActionBarView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1190
    iget v2, v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v2, :cond_0

    .line 1192
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget v3, v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    check-cast v0, Landroid/support/v4/internal/view/SupportMenuItem;

    .line 1194
    .local v0, "item":Landroid/support/v4/internal/view/SupportMenuItem;
    if-eqz v0, :cond_0

    .line 1195
    invoke-interface {v0}, Landroid/support/v4/internal/view/SupportMenuItem;->expandActionView()Z

    .line 1199
    .end local v0    # "item":Landroid/support/v4/internal/view/SupportMenuItem;
    :cond_0
    iget-boolean v2, v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z

    if-eqz v2, :cond_1

    .line 1200
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->postShowOverflowMenu()V

    .line 1202
    :cond_1
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .prologue
    .line 1172
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 1173
    .local v1, "superState":Landroid/os/Parcelable;
    new-instance v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;

    invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1175
    .local v0, "state":Landroid/support/v7/internal/widget/ActionBarView$SavedState;
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    iget-object v2, v2, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    if-eqz v2, :cond_0

    .line 1176
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    iget-object v2, v2, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getItemId()I

    move-result v2

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I

    .line 1179
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->isOverflowMenuShowing()Z

    move-result v2

    iput-boolean v2, v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z

    .line 1181
    return-object v0
.end method

.method public bridge synthetic postShowOverflowMenu()V
    .locals 0

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->postShowOverflowMenu()V

    return-void
.end method

.method public setCallback(Landroid/support/v7/app/ActionBar$OnNavigationListener;)V
    .locals 0
    .param p1, "callback"    # Landroid/support/v7/app/ActionBar$OnNavigationListener;

    .prologue
    .line 392
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCallback:Landroid/support/v7/app/ActionBar$OnNavigationListener;

    .line 393
    return-void
.end method

.method public setCollapsable(Z)V
    .locals 0
    .param p1, "collapsable"    # Z

    .prologue
    .line 809
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsable:Z

    .line 810
    return-void
.end method

.method public bridge synthetic setContentHeight(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setContentHeight(I)V

    return-void
.end method

.method public setContextView(Landroid/support/v7/internal/widget/ActionBarContextView;)V
    .locals 0
    .param p1, "view"    # Landroid/support/v7/internal/widget/ActionBarContextView;

    .prologue
    .line 805
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    .line 806
    return-void
.end method

.method public setCustomNavigationView(Landroid/view/View;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 489
    iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    .line 490
    .local v0, "showCustom":Z
    :goto_0
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 491
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 493
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    .line 494
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 495
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 497
    :cond_1
    return-void

    .line 489
    .end local v0    # "showCustom":Z
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setDisplayOptions(I)V
    .locals 11
    .param p1, "options"    # I

    .prologue
    const/16 v7, 0x8

    const/4 v0, -0x1

    const/4 v8, 0x1

    const/4 v6, 0x0

    .line 572
    iget v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    if-ne v9, v0, :cond_6

    .line 573
    .local v0, "flagsChanged":I
    :goto_0
    iput p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    .line 575
    and-int/lit8 v9, v0, 0x1f

    if-eqz v9, :cond_11

    .line 576
    and-int/lit8 v9, p1, 0x2

    if-eqz v9, :cond_7

    move v4, v8

    .line 577
    .local v4, "showHome":Z
    :goto_1
    if-eqz v4, :cond_8

    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    if-nez v9, :cond_8

    move v5, v6

    .line 578
    .local v5, "vis":I
    :goto_2
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {v9, v5}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setVisibility(I)V

    .line 580
    and-int/lit8 v9, v0, 0x4

    if-eqz v9, :cond_0

    .line 581
    and-int/lit8 v9, p1, 0x4

    if-eqz v9, :cond_9

    move v3, v8

    .line 582
    .local v3, "setUp":Z
    :goto_3
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {v9, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUp(Z)V

    .line 588
    if-eqz v3, :cond_0

    .line 589
    invoke-virtual {p0, v8}, Landroid/support/v7/internal/widget/ActionBarView;->setHomeButtonEnabled(Z)V

    .line 593
    .end local v3    # "setUp":Z
    :cond_0
    and-int/lit8 v9, v0, 0x1

    if-eqz v9, :cond_1

    .line 594
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    if-eqz v9, :cond_a

    and-int/lit8 v9, p1, 0x1

    if-eqz v9, :cond_a

    move v2, v8

    .line 596
    .local v2, "logoVis":Z
    :goto_4
    iget-object v10, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    if-eqz v2, :cond_b

    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    :goto_5
    invoke-virtual {v10, v9}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 599
    .end local v2    # "logoVis":Z
    :cond_1
    and-int/lit8 v9, v0, 0x8

    if-eqz v9, :cond_2

    .line 600
    and-int/lit8 v9, p1, 0x8

    if-eqz v9, :cond_c

    .line 601
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initTitle()V

    .line 607
    :cond_2
    :goto_6
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    if-eqz v9, :cond_4

    and-int/lit8 v9, v0, 0x6

    if-eqz v9, :cond_4

    .line 609
    iget v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v9, v9, 0x4

    if-eqz v9, :cond_d

    move v1, v8

    .line 610
    .local v1, "homeAsUp":Z
    :goto_7
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;

    if-nez v4, :cond_3

    if-eqz v1, :cond_e

    move v7, v6

    :cond_3
    :goto_8
    invoke-virtual {v9, v7}, Landroid/view/View;->setVisibility(I)V

    .line 611
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    if-nez v4, :cond_f

    if-eqz v1, :cond_f

    :goto_9
    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 614
    .end local v1    # "homeAsUp":Z
    :cond_4
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_5

    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    if-eqz v6, :cond_5

    .line 615
    and-int/lit8 v6, p1, 0x10

    if-eqz v6, :cond_10

    .line 616
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 622
    :cond_5
    :goto_a
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->requestLayout()V

    .line 628
    .end local v4    # "showHome":Z
    .end local v5    # "vis":I
    :goto_b
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->isEnabled()Z

    move-result v6

    if-nez v6, :cond_12

    .line 629
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 637
    :goto_c
    return-void

    .line 572
    .end local v0    # "flagsChanged":I
    :cond_6
    iget v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    xor-int v0, p1, v9

    goto/16 :goto_0

    .restart local v0    # "flagsChanged":I
    :cond_7
    move v4, v6

    .line 576
    goto/16 :goto_1

    .restart local v4    # "showHome":Z
    :cond_8
    move v5, v7

    .line 577
    goto/16 :goto_2

    .restart local v5    # "vis":I
    :cond_9
    move v3, v6

    .line 581
    goto :goto_3

    :cond_a
    move v2, v6

    .line 594
    goto :goto_4

    .line 596
    .restart local v2    # "logoVis":Z
    :cond_b
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    goto :goto_5

    .line 603
    .end local v2    # "logoVis":Z
    :cond_c
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v9}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    goto :goto_6

    :cond_d
    move v1, v6

    .line 609
    goto :goto_7

    .line 610
    .restart local v1    # "homeAsUp":Z
    :cond_e
    const/4 v7, 0x4

    goto :goto_8

    :cond_f
    move v8, v6

    .line 611
    goto :goto_9

    .line 618
    .end local v1    # "homeAsUp":Z
    :cond_10
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    goto :goto_a

    .line 624
    .end local v4    # "showHome":Z
    .end local v5    # "vis":I
    :cond_11
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->invalidate()V

    goto :goto_b

    .line 630
    :cond_12
    and-int/lit8 v6, p1, 0x4

    if-eqz v6, :cond_13

    .line 631
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Landroid/support/v7/appcompat/R$string;->abc_action_bar_up_description:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_c

    .line 634
    :cond_13
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Landroid/support/v7/appcompat/R$string;->abc_action_bar_home_description:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_c
.end method

.method public setDropdownAdapter(Landroid/widget/SpinnerAdapter;)V
    .locals 1
    .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;

    .prologue
    .line 710
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;

    .line 711
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    if-eqz v0, :cond_0

    .line 712
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/SpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 714
    :cond_0
    return-void
.end method

.method public setDropdownSelectedPosition(I)V
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 721
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V

    .line 722
    return-void
.end method

.method public setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
    .locals 4
    .param p1, "tabs"    # Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    .prologue
    const/4 v2, 0x1

    .line 377
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz v1, :cond_0

    .line 378
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 380
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    .line 381
    if-eqz p1, :cond_2

    move v1, v2

    :goto_0
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    .line 382
    iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    if-eqz v1, :cond_1

    iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    .line 383
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 384
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 385
    .local v0, "lp":Landroid/view/ViewGroup$LayoutParams;
    const/4 v1, -0x2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 386
    const/4 v1, -0x1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 387
    invoke-virtual {p1, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setAllowCollapse(Z)V

    .line 389
    .end local v0    # "lp":Landroid/view/ViewGroup$LayoutParams;
    :cond_1
    return-void

    .line 381
    :cond_2
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public setHomeAsUpIndicator(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 1209
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUpIndicator(I)V

    .line 1210
    return-void
.end method

.method public setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "indicator"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 1205
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUpIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 1206
    return-void
.end method

.method public setHomeButtonEnabled(Z)V
    .locals 3
    .param p1, "enable"    # Z

    .prologue
    .line 557
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setEnabled(Z)V

    .line 558
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setFocusable(Z)V

    .line 560
    if-nez p1, :cond_0

    .line 561
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 569
    :goto_0
    return-void

    .line 562
    :cond_0
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    .line 563
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Landroid/support/v7/appcompat/R$string;->abc_action_bar_up_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 566
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Landroid/support/v7/appcompat/R$string;->abc_action_bar_home_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setIcon(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 651
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 652
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 640
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    .line 641
    if-eqz p1, :cond_1

    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    .line 643
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 645
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 646
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 648
    :cond_2
    return-void
.end method

.method public setLogo(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 662
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->setLogo(Landroid/graphics/drawable/Drawable;)V

    .line 663
    return-void
.end method

.method public setLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "logo"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 655
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    .line 656
    if-eqz p1, :cond_0

    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 657
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 659
    :cond_0
    return-void
.end method

.method public setMenu(Landroid/support/v4/internal/view/SupportMenu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
    .locals 8
    .param p1, "menu"    # Landroid/support/v4/internal/view/SupportMenu;
    .param p2, "cb"    # Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    .prologue
    const/4 v7, -0x1

    .line 396
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-ne p1, v4, :cond_0

    .line 459
    :goto_0
    return-void

    .line 400
    :cond_0
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v4, :cond_1

    .line 401
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 402
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    :cond_1
    move-object v0, p1

    .line 405
    check-cast v0, Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 406
    .local v0, "builder":Landroid/support/v7/internal/view/menu/MenuBuilder;
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 407
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    if-eqz v4, :cond_2

    .line 408
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 409
    .local v3, "oldParent":Landroid/view/ViewGroup;
    if-eqz v3, :cond_2

    .line 410
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 413
    .end local v3    # "oldParent":Landroid/view/ViewGroup;
    :cond_2
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    if-nez v4, :cond_3

    .line 414
    new-instance v4, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-direct {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    .line 415
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4, p2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 416
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    sget v5, Landroid/support/v7/appcompat/R$id;->action_menu_presenter:I

    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setId(I)V

    .line 417
    new-instance v4, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;-><init>(Landroid/support/v7/internal/widget/ActionBarView;Landroid/support/v7/internal/widget/ActionBarView$1;)V

    iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    .line 421
    :cond_3
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v1, v4, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 423
    .local v1, "layoutParams":Landroid/view/ViewGroup$LayoutParams;
    iget-boolean v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitActionBar:Z

    if-nez v4, :cond_5

    .line 424
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Landroid/support/v7/appcompat/R$bool;->abc_action_bar_expanded_action_views_exclusive:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v5

    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V

    .line 427
    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->configPresenters(Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 428
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v2

    check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 429
    .local v2, "menuView":Landroid/support/v7/internal/view/menu/ActionMenuView;
    invoke-virtual {v2, v0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->initialize(Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 430
    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 431
    .restart local v3    # "oldParent":Landroid/view/ViewGroup;
    if-eqz v3, :cond_4

    if-eq v3, p0, :cond_4

    .line 432
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 434
    :cond_4
    invoke-virtual {p0, v2, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 458
    .end local v3    # "oldParent":Landroid/view/ViewGroup;
    :goto_1
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    goto/16 :goto_0

    .line 436
    .end local v2    # "menuView":Landroid/support/v7/internal/view/menu/ActionMenuView;
    :cond_5
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V

    .line 438
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v6}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V

    .line 441
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const v5, 0x7fffffff

    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V

    .line 443
    iput v7, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 444
    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->configPresenters(Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 445
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v2

    check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 446
    .restart local v2    # "menuView":Landroid/support/v7/internal/view/menu/ActionMenuView;
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v4, :cond_7

    .line 447
    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 448
    .restart local v3    # "oldParent":Landroid/view/ViewGroup;
    if-eqz v3, :cond_6

    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eq v3, v4, :cond_6

    .line 449
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 451
    :cond_6
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getAnimatedVisibility()I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setVisibility(I)V

    .line 452
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v4, v2, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 455
    .end local v3    # "oldParent":Landroid/view/ViewGroup;
    :cond_7
    invoke-virtual {v2, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1
.end method

.method public setNavigationMode(I)V
    .locals 6
    .param p1, "mode"    # I

    .prologue
    const/4 v5, 0x0

    .line 666
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    .line 667
    .local v0, "oldMode":I
    if-eq p1, v0, :cond_2

    .line 668
    packed-switch v0, :pswitch_data_0

    .line 680
    :cond_0
    :goto_0
    packed-switch p1, :pswitch_data_1

    .line 704
    :cond_1
    :goto_1
    iput p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    .line 705
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->requestLayout()V

    .line 707
    :cond_2
    return-void

    .line 670
    :pswitch_0
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    if-eqz v2, :cond_0

    .line 671
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    goto :goto_0

    .line 675
    :pswitch_1
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    if-eqz v2, :cond_0

    .line 676
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    goto :goto_0

    .line 682
    :pswitch_2
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    if-nez v2, :cond_3

    .line 683
    new-instance v2, Landroid/support/v7/internal/widget/SpinnerICS;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    sget v4, Landroid/support/v7/appcompat/R$attr;->actionDropDownStyle:I

    invoke-direct {v2, v3, v5, v4}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    .line 685
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_view_list_nav_layout:I

    invoke-virtual {v2, v3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    .line 687
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 689
    .local v1, "params":Landroid/widget/LinearLayout$LayoutParams;
    const/16 v2, 0x11

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 690
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v2, v3, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 692
    .end local v1    # "params":Landroid/widget/LinearLayout$LayoutParams;
    :cond_3
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v2

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;

    if-eq v2, v3, :cond_4

    .line 693
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 695
    :cond_4
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS;->setOnItemSelectedListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;)V

    .line 696
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 699
    :pswitch_3
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    if-eqz v2, :cond_1

    .line 700
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 668
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 680
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public setSplitActionBar(Z)V
    .locals 4
    .param p1, "splitActionBar"    # Z

    .prologue
    const/4 v2, 0x0

    .line 329
    iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitActionBar:Z

    if-eq v1, p1, :cond_5

    .line 330
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    if-eqz v1, :cond_2

    .line 331
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 332
    .local v0, "oldParent":Landroid/view/ViewGroup;
    if-eqz v0, :cond_0

    .line 333
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 335
    :cond_0
    if-eqz p1, :cond_6

    .line 336
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v1, :cond_1

    .line 337
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;)V

    .line 339
    :cond_1
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const/4 v3, -0x1

    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 344
    :goto_0
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->requestLayout()V

    .line 346
    .end local v0    # "oldParent":Landroid/view/ViewGroup;
    :cond_2
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v1, :cond_3

    .line 347
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz p1, :cond_7

    move v1, v2

    :goto_1
    invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 350
    :cond_3
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    if-eqz v1, :cond_4

    .line 351
    if-nez p1, :cond_8

    .line 352
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Landroid/support/v7/appcompat/R$bool;->abc_action_bar_expanded_action_views_exclusive:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V

    .line 364
    :cond_4
    :goto_2
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitActionBar(Z)V

    .line 366
    :cond_5
    return-void

    .line 341
    .restart local v0    # "oldParent":Landroid/view/ViewGroup;
    :cond_6
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 342
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const/4 v3, -0x2

    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0

    .line 347
    .end local v0    # "oldParent":Landroid/view/ViewGroup;
    :cond_7
    const/16 v1, 0x8

    goto :goto_1

    .line 356
    :cond_8
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V

    .line 358
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V

    .line 361
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const v2, 0x7fffffff

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V

    goto :goto_2
.end method

.method public bridge synthetic setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/internal/widget/ActionBarContainer;

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V

    return-void
.end method

.method public bridge synthetic setSplitWhenNarrow(Z)V
    .locals 0
    .param p1, "x0"    # Z

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitWhenNarrow(Z)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 5
    .param p1, "subtitle"    # Ljava/lang/CharSequence;

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 545
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    .line 546
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    if-eqz v1, :cond_1

    .line 547
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 548
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    if-eqz p1, :cond_2

    move v1, v2

    :goto_0
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 549
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    if-nez v1, :cond_3

    iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_0
    const/4 v0, 0x1

    .line 552
    .local v0, "visible":Z
    :goto_1
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_4

    :goto_2
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 554
    .end local v0    # "visible":Z
    :cond_1
    return-void

    :cond_2
    move v1, v3

    .line 548
    goto :goto_0

    :cond_3
    move v0, v2

    .line 549
    goto :goto_1

    .restart local v0    # "visible":Z
    :cond_4
    move v2, v3

    .line 552
    goto :goto_2
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 510
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mUserTitle:Z

    .line 511
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setTitleImpl(Ljava/lang/CharSequence;)V

    .line 512
    return-void
.end method

.method public bridge synthetic setVisibility(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setVisibility(I)V

    return-void
.end method

.method public setWindowCallback(Landroid/view/Window$Callback;)V
    .locals 0
    .param p1, "cb"    # Landroid/view/Window$Callback;

    .prologue
    .line 294
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mWindowCallback:Landroid/view/Window$Callback;

    .line 295
    return-void
.end method

.method public setWindowTitle(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 521
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mUserTitle:Z

    if-nez v0, :cond_0

    .line 522
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setTitleImpl(Ljava/lang/CharSequence;)V

    .line 524
    :cond_0
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    .prologue
    .line 308
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic showOverflowMenu()Z
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->showOverflowMenu()Z

    move-result v0

    return v0
.end method
