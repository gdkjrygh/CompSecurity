.class public Lcom/hmobile/tab/TabView;
.super Ljava/lang/Object;
.source "TabView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/tab/TabView$Orientation;
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$hmobile$tab$TabView$Orientation:[I

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private backgroundID:I

.field private context:Landroid/content/Context;

.field private currentView:Landroid/view/View;

.field private iconSeparator:Landroid/graphics/Bitmap;

.field private mHeader:Landroid/graphics/Bitmap;

.field private mHeaderHeight:I

.field private mHeaderWidth:I

.field private orientation:Lcom/hmobile/tab/TabView$Orientation;

.field private selectedTabId:I

.field private separatorID:I

.field private tabSet:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/hmobile/tab/Tab;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static synthetic $SWITCH_TABLE$com$hmobile$tab$TabView$Orientation()[I
    .locals 3

    .prologue
    .line 19
    sget-object v0, Lcom/hmobile/tab/TabView;->$SWITCH_TABLE$com$hmobile$tab$TabView$Orientation:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/hmobile/tab/TabView$Orientation;->values()[Lcom/hmobile/tab/TabView$Orientation;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/hmobile/tab/TabView$Orientation;->BOTTOM:Lcom/hmobile/tab/TabView$Orientation;

    invoke-virtual {v1}, Lcom/hmobile/tab/TabView$Orientation;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1

    :goto_1
    :try_start_1
    sget-object v1, Lcom/hmobile/tab/TabView$Orientation;->TOP:Lcom/hmobile/tab/TabView$Orientation;

    invoke-virtual {v1}, Lcom/hmobile/tab/TabView$Orientation;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    sput-object v0, Lcom/hmobile/tab/TabView;->$SWITCH_TABLE$com$hmobile$tab$TabView$Orientation:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/hmobile/tab/TabView;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/hmobile/tab/TabView;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/tab/TabView;->tabSet:Ljava/util/List;

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lcom/hmobile/tab/TabView;->selectedTabId:I

    .line 41
    iput-object p1, p0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    .line 43
    return-void
.end method

.method private getSeparatorView()Landroid/view/View;
    .locals 5

    .prologue
    .line 137
    iget-object v3, p0, Lcom/hmobile/tab/TabView;->iconSeparator:Landroid/graphics/Bitmap;

    if-nez v3, :cond_0

    .line 139
    iget-object v3, p0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    iget v4, p0, Lcom/hmobile/tab/TabView;->separatorID:I

    .line 138
    invoke-static {v3, v4}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/hmobile/tab/TabView;->iconSeparator:Landroid/graphics/Bitmap;

    .line 141
    :cond_0
    iget-object v3, p0, Lcom/hmobile/tab/TabView;->iconSeparator:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    .line 143
    .local v0, "separatorHeigth":I
    new-instance v1, Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    invoke-direct {v1, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 144
    .local v1, "separatorView":Landroid/widget/ImageView;
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 145
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setMinimumHeight(I)V

    .line 146
    const/16 v3, 0xa

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 148
    const/4 v2, 0x0

    .line 149
    .local v2, "topPadding":I
    iget v3, p0, Lcom/hmobile/tab/TabView;->mHeaderHeight:I

    if-le v3, v0, :cond_1

    .line 150
    iget v3, p0, Lcom/hmobile/tab/TabView;->mHeaderHeight:I

    sub-int/2addr v3, v0

    div-int/lit8 v2, v3, 0x2

    .line 154
    :cond_1
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 155
    iget-object v3, p0, Lcom/hmobile/tab/TabView;->iconSeparator:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 156
    return-object v1
.end method

.method private preapareViewResources()V
    .locals 2

    .prologue
    .line 46
    iget-object v0, p0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 47
    iget v1, p0, Lcom/hmobile/tab/TabView;->backgroundID:I

    .line 46
    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/tab/TabView;->mHeader:Landroid/graphics/Bitmap;

    .line 48
    iget-object v0, p0, Lcom/hmobile/tab/TabView;->mHeader:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/hmobile/tab/TabView;->mHeaderWidth:I

    .line 49
    iget-object v0, p0, Lcom/hmobile/tab/TabView;->mHeader:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/hmobile/tab/TabView;->mHeaderHeight:I

    .line 51
    return-void
.end method


# virtual methods
.method public addTab(Lcom/hmobile/tab/Tab;)V
    .locals 1
    .param p1, "tab"    # Lcom/hmobile/tab/Tab;

    .prologue
    .line 54
    iget v0, p0, Lcom/hmobile/tab/TabView;->mHeaderHeight:I

    iput v0, p1, Lcom/hmobile/tab/Tab;->preferedHeight:I

    .line 55
    iget-object v0, p0, Lcom/hmobile/tab/TabView;->tabSet:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    return-void
.end method

.method public getTab(Ljava/lang/String;)Lcom/hmobile/tab/Tab;
    .locals 5
    .param p1, "tag"    # Ljava/lang/String;

    .prologue
    .line 244
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v2, p0, Lcom/hmobile/tab/TabView;->tabSet:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v0, v2, :cond_0

    .line 250
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Tab \""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\" not found"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 245
    :cond_0
    iget-object v2, p0, Lcom/hmobile/tab/TabView;->tabSet:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/tab/Tab;

    .line 246
    .local v1, "t":Lcom/hmobile/tab/Tab;
    invoke-virtual {v1}, Lcom/hmobile/tab/Tab;->getTag()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 247
    return-object v1

    .line 244
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public render(I)Landroid/view/View;
    .locals 2
    .param p1, "selectedTabId"    # I

    .prologue
    .line 59
    iput p1, p0, Lcom/hmobile/tab/TabView;->selectedTabId:I

    .line 60
    invoke-static {}, Lcom/hmobile/tab/TabView;->$SWITCH_TABLE$com$hmobile$tab$TabView$Orientation()[I

    move-result-object v0

    iget-object v1, p0, Lcom/hmobile/tab/TabView;->orientation:Lcom/hmobile/tab/TabView$Orientation;

    invoke-virtual {v1}, Lcom/hmobile/tab/TabView$Orientation;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 68
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 62
    :pswitch_0
    invoke-virtual {p0}, Lcom/hmobile/tab/TabView;->renderTOP()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 65
    :pswitch_1
    invoke-virtual {p0}, Lcom/hmobile/tab/TabView;->renderBOTTOM()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 60
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public renderBOTTOM()Landroid/view/View;
    .locals 17

    .prologue
    .line 73
    invoke-direct/range {p0 .. p0}, Lcom/hmobile/tab/TabView;->preapareViewResources()V

    .line 74
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/hmobile/tab/TabView;->tabSet:Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v13

    .line 75
    .local v13, "tabsize":I
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 76
    const/4 v15, -0x1

    .line 77
    const/16 v16, -0x1

    .line 75
    move/from16 v0, v16

    invoke-direct {v8, v15, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 79
    .local v8, "pTable":Landroid/widget/FrameLayout$LayoutParams;
    new-instance v12, Landroid/widget/TableLayout;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    invoke-direct {v12, v15}, Landroid/widget/TableLayout;-><init>(Landroid/content/Context;)V

    .line 80
    .local v12, "table":Landroid/widget/TableLayout;
    invoke-virtual {v12, v8}, Landroid/widget/TableLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    new-instance v10, Landroid/widget/TableRow;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    invoke-direct {v10, v15}, Landroid/widget/TableRow;-><init>(Landroid/content/Context;)V

    .line 84
    .local v10, "rowTop":Landroid/widget/TableRow;
    new-instance v5, Landroid/widget/TableLayout$LayoutParams;

    .line 85
    const/4 v15, -0x1

    .line 86
    const/16 v16, -0x1

    .line 84
    move/from16 v0, v16

    invoke-direct {v5, v15, v0}, Landroid/widget/TableLayout$LayoutParams;-><init>(II)V

    .line 87
    .local v5, "pRowTop":Landroid/widget/TableLayout$LayoutParams;
    const/high16 v15, 0x3f800000    # 1.0f

    iput v15, v5, Landroid/widget/TableLayout$LayoutParams;->weight:F

    .line 89
    new-instance v6, Landroid/widget/TableRow$LayoutParams;

    .line 90
    const/4 v15, -0x1

    .line 91
    const/16 v16, -0x1

    .line 89
    move/from16 v0, v16

    invoke-direct {v6, v15, v0}, Landroid/widget/TableRow$LayoutParams;-><init>(II)V

    .line 92
    .local v6, "pSpan":Landroid/widget/TableRow$LayoutParams;
    iput v13, v6, Landroid/widget/TableRow$LayoutParams;->span:I

    .line 93
    const/high16 v15, 0x3f800000    # 1.0f

    iput v15, v6, Landroid/widget/TableRow$LayoutParams;->weight:F

    .line 95
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/hmobile/tab/TabView;->currentView:Landroid/view/View;

    invoke-virtual {v10, v15, v6}, Landroid/widget/TableRow;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 97
    new-instance v9, Landroid/widget/TableRow;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    invoke-direct {v9, v15}, Landroid/widget/TableRow;-><init>(Landroid/content/Context;)V

    .line 99
    .local v9, "rowBottom":Landroid/widget/TableRow;
    move-object/from16 v0, p0

    iget v15, v0, Lcom/hmobile/tab/TabView;->backgroundID:I

    invoke-virtual {v9, v15}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    .line 101
    new-instance v4, Landroid/widget/TableLayout$LayoutParams;

    .line 102
    const/4 v15, -0x1

    .line 103
    const/16 v16, -0x1

    .line 101
    move/from16 v0, v16

    invoke-direct {v4, v15, v0}, Landroid/widget/TableLayout$LayoutParams;-><init>(II)V

    .line 104
    .local v4, "pRowBottom":Landroid/widget/TableLayout$LayoutParams;
    const/4 v2, 0x0

    .line 105
    .local v2, "j":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-lt v1, v13, :cond_0

    .line 129
    invoke-virtual {v12, v10, v5}, Landroid/widget/TableLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    invoke-virtual {v12, v9, v4}, Landroid/widget/TableLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    return-object v12

    .line 106
    :cond_0
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/hmobile/tab/TabView;->tabSet:Ljava/util/List;

    invoke-interface {v15, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/hmobile/tab/Tab;

    .line 107
    .local v11, "tab":Lcom/hmobile/tab/Tab;
    move-object/from16 v0, p0

    iget v15, v0, Lcom/hmobile/tab/TabView;->selectedTabId:I

    if-ne v1, v15, :cond_1

    .line 108
    const/4 v15, 0x1

    invoke-virtual {v11, v15}, Lcom/hmobile/tab/Tab;->setSelected(Z)V

    .line 109
    :cond_1
    invoke-virtual {v11}, Lcom/hmobile/tab/Tab;->getView()Landroid/view/View;

    move-result-object v14

    .line 111
    .local v14, "view":Landroid/view/View;
    new-instance v3, Landroid/widget/TableRow$LayoutParams;

    invoke-direct {v3}, Landroid/widget/TableRow$LayoutParams;-><init>()V

    .line 115
    .local v3, "pCol":Landroid/widget/TableRow$LayoutParams;
    invoke-virtual {v9, v14, v3}, Landroid/widget/TableRow;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 118
    rem-int/lit8 v15, v2, 0x2

    if-nez v15, :cond_2

    add-int/lit8 v15, v13, -0x1

    if-ge v1, v15, :cond_2

    .line 119
    new-instance v7, Landroid/widget/TableRow$LayoutParams;

    invoke-direct {v7}, Landroid/widget/TableRow$LayoutParams;-><init>()V

    .line 120
    .local v7, "pSpanCol":Landroid/widget/TableRow$LayoutParams;
    const/high16 v15, 0x3f800000    # 1.0f

    iput v15, v6, Landroid/widget/TableRow$LayoutParams;->weight:F

    .line 121
    invoke-direct/range {p0 .. p0}, Lcom/hmobile/tab/TabView;->getSeparatorView()Landroid/view/View;

    move-result-object v15

    invoke-virtual {v9, v15, v7}, Landroid/widget/TableRow;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    add-int/lit8 v2, v2, 0x1

    .line 125
    .end local v7    # "pSpanCol":Landroid/widget/TableRow$LayoutParams;
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 105
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public renderTOP()Landroid/view/View;
    .locals 15

    .prologue
    .line 163
    iget-object v13, p0, Lcom/hmobile/tab/TabView;->tabSet:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v11

    .line 165
    .local v11, "tabsize":I
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 166
    const/4 v13, -0x1

    .line 167
    const/4 v14, -0x1

    .line 165
    invoke-direct {v4, v13, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 169
    .local v4, "pTable":Landroid/widget/FrameLayout$LayoutParams;
    new-instance v10, Landroid/widget/TableLayout;

    iget-object v13, p0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    invoke-direct {v10, v13}, Landroid/widget/TableLayout;-><init>(Landroid/content/Context;)V

    .line 170
    .local v10, "table":Landroid/widget/TableLayout;
    invoke-virtual {v10, v4}, Landroid/widget/TableLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 172
    new-instance v5, Landroid/widget/TableRow;

    iget-object v13, p0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    invoke-direct {v5, v13}, Landroid/widget/TableRow;-><init>(Landroid/content/Context;)V

    .line 173
    .local v5, "rowContent":Landroid/widget/TableRow;
    new-instance v2, Landroid/widget/TableRow$LayoutParams;

    invoke-direct {v2}, Landroid/widget/TableRow$LayoutParams;-><init>()V

    .line 174
    .local v2, "pRowContent":Landroid/widget/TableRow$LayoutParams;
    iput v11, v2, Landroid/widget/TableRow$LayoutParams;->span:I

    .line 175
    const/4 v13, -0x1

    iput v13, v2, Landroid/widget/TableRow$LayoutParams;->width:I

    .line 176
    const/4 v13, -0x2

    iput v13, v2, Landroid/widget/TableRow$LayoutParams;->height:I

    .line 177
    const/high16 v13, 0x3f800000    # 1.0f

    iput v13, v2, Landroid/widget/TableRow$LayoutParams;->weight:F

    .line 179
    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    .line 180
    const/4 v13, -0x1

    .line 181
    const/4 v14, -0x1

    .line 179
    invoke-direct {v8, v13, v14}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 183
    .local v8, "scrollerParams":Landroid/view/ViewGroup$LayoutParams;
    new-instance v7, Landroid/widget/ScrollView;

    iget-object v13, p0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    invoke-direct {v7, v13}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 184
    .local v7, "scroller":Landroid/widget/ScrollView;
    invoke-virtual {v7, v8}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 186
    iget-object v13, p0, Lcom/hmobile/tab/TabView;->currentView:Landroid/view/View;

    invoke-virtual {v7, v13, v8}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 187
    invoke-virtual {v5, v7, v2}, Landroid/widget/TableRow;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 189
    new-instance v6, Landroid/widget/TableRow;

    iget-object v13, p0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    invoke-direct {v6, v13}, Landroid/widget/TableRow;-><init>(Landroid/content/Context;)V

    .line 190
    .local v6, "rowTabs":Landroid/widget/TableRow;
    iget v13, p0, Lcom/hmobile/tab/TabView;->backgroundID:I

    invoke-virtual {v6, v13}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    .line 193
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-lt v0, v11, :cond_0

    .line 203
    new-instance v3, Landroid/widget/TableRow$LayoutParams;

    invoke-direct {v3}, Landroid/widget/TableRow$LayoutParams;-><init>()V

    .line 204
    .local v3, "pRowTabs":Landroid/widget/TableRow$LayoutParams;
    const/4 v13, -0x2

    iput v13, v3, Landroid/widget/TableRow$LayoutParams;->height:I

    .line 205
    const/high16 v13, -0x40800000    # -1.0f

    iput v13, v3, Landroid/widget/TableRow$LayoutParams;->weight:F

    .line 207
    invoke-virtual {v10, v6, v3}, Landroid/widget/TableLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 208
    invoke-virtual {v10, v5}, Landroid/widget/TableLayout;->addView(Landroid/view/View;)V

    .line 210
    return-object v10

    .line 194
    .end local v3    # "pRowTabs":Landroid/widget/TableRow$LayoutParams;
    :cond_0
    iget-object v13, p0, Lcom/hmobile/tab/TabView;->tabSet:Ljava/util/List;

    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/hmobile/tab/Tab;

    .line 195
    .local v9, "tab":Lcom/hmobile/tab/Tab;
    iget v13, p0, Lcom/hmobile/tab/TabView;->selectedTabId:I

    if-ne v0, v13, :cond_1

    .line 196
    const/4 v13, 0x1

    invoke-virtual {v9, v13}, Lcom/hmobile/tab/Tab;->setSelected(Z)V

    .line 197
    :cond_1
    invoke-virtual {v9}, Lcom/hmobile/tab/Tab;->getView()Landroid/view/View;

    move-result-object v12

    .line 198
    .local v12, "view":Landroid/view/View;
    new-instance v1, Landroid/widget/TableRow$LayoutParams;

    invoke-direct {v1}, Landroid/widget/TableRow$LayoutParams;-><init>()V

    .line 200
    .local v1, "pCol":Landroid/widget/TableRow$LayoutParams;
    invoke-virtual {v6, v12, v1}, Landroid/widget/TableRow;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 193
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public setBackgroundID(I)V
    .locals 0
    .param p1, "backgroundID"    # I

    .prologue
    .line 236
    iput p1, p0, Lcom/hmobile/tab/TabView;->backgroundID:I

    .line 237
    return-void
.end method

.method public setCurrentView(I)V
    .locals 4
    .param p1, "resourceViewID"    # I

    .prologue
    .line 225
    iget-object v2, p0, Lcom/hmobile/tab/TabView;->context:Landroid/content/Context;

    .line 226
    const-string v3, "layout_inflater"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 225
    check-cast v0, Landroid/view/LayoutInflater;

    .line 227
    .local v0, "inflater":Landroid/view/LayoutInflater;
    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 228
    .local v1, "view":Landroid/view/View;
    invoke-virtual {p0, v1}, Lcom/hmobile/tab/TabView;->setCurrentView(Landroid/view/View;)V

    .line 229
    return-void
.end method

.method public setCurrentView(Landroid/view/View;)V
    .locals 0
    .param p1, "currentView"    # Landroid/view/View;

    .prologue
    .line 221
    iput-object p1, p0, Lcom/hmobile/tab/TabView;->currentView:Landroid/view/View;

    .line 222
    return-void
.end method

.method public setOrientation(Lcom/hmobile/tab/TabView$Orientation;)V
    .locals 0
    .param p1, "orientation"    # Lcom/hmobile/tab/TabView$Orientation;

    .prologue
    .line 232
    iput-object p1, p0, Lcom/hmobile/tab/TabView;->orientation:Lcom/hmobile/tab/TabView$Orientation;

    .line 233
    return-void
.end method

.method public setSeparatorID(I)V
    .locals 0
    .param p1, "separatorID"    # I

    .prologue
    .line 240
    iput p1, p0, Lcom/hmobile/tab/TabView;->separatorID:I

    .line 241
    return-void
.end method
