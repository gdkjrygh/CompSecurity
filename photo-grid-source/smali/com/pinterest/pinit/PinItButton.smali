.class public Lcom/pinterest/pinit/PinItButton;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private _pinIt:Lcom/pinterest/pinit/PinIt;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/pinterest/pinit/PinItButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 50
    const v0, 0x1030014

    invoke-direct {p0, p1, p2, v0}, Lcom/pinterest/pinit/PinItButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    invoke-direct {p0}, Lcom/pinterest/pinit/PinItButton;->init()V

    .line 56
    return-void
.end method

.method static synthetic access$000(Lcom/pinterest/pinit/PinItButton;)Lcom/pinterest/pinit/PinIt;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    return-object v0
.end method

.method public static getPartnerId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 168
    invoke-static {}, Lcom/pinterest/pinit/PinIt;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private init()V
    .locals 1

    .prologue
    .line 62
    new-instance v0, Lcom/pinterest/pinit/PinIt;

    invoke-direct {v0}, Lcom/pinterest/pinit/PinIt;-><init>()V

    iput-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    .line 63
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/pinterest/pinit/PinItButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 64
    invoke-virtual {p0}, Lcom/pinterest/pinit/PinItButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/pinterest/pinit/assets/Assets;->getPinItDrawable(Landroid/content/Context;)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pinterest/pinit/PinItButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 65
    new-instance v0, Lcom/pinterest/pinit/PinItButton$1;

    invoke-direct {v0, p0}, Lcom/pinterest/pinit/PinItButton$1;-><init>(Lcom/pinterest/pinit/PinItButton;)V

    invoke-virtual {p0, v0}, Lcom/pinterest/pinit/PinItButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    return-void
.end method

.method public static isDebugMode()Z
    .locals 1

    .prologue
    .line 203
    invoke-static {}, Lcom/pinterest/pinit/PinIt;->isDebugMode()Z

    move-result v0

    return v0
.end method

.method public static meetsRequirements()Z
    .locals 1

    .prologue
    .line 212
    invoke-static {}, Lcom/pinterest/pinit/PinIt;->meetsRequirements()Z

    move-result v0

    return v0
.end method

.method public static setDebugMode(Z)V
    .locals 0

    .prologue
    .line 184
    invoke-static {p0}, Lcom/pinterest/pinit/PinIt;->setDebugMode(Z)V

    .line 185
    return-void
.end method

.method public static setPartnerId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 194
    invoke-static {p0}, Lcom/pinterest/pinit/PinIt;->setPartnerId(Ljava/lang/String;)V

    .line 195
    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0}, Lcom/pinterest/pinit/PinIt;->getDescription()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImageUri()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0}, Lcom/pinterest/pinit/PinIt;->getImageUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0}, Lcom/pinterest/pinit/PinIt;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getListener()Lcom/pinterest/pinit/PinItListener;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0}, Lcom/pinterest/pinit/PinIt;->getListener()Lcom/pinterest/pinit/PinItListener;

    move-result-object v0

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0}, Lcom/pinterest/pinit/PinIt;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0}, Lcom/pinterest/pinit/PinIt;->reset()V

    .line 176
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0, p1}, Lcom/pinterest/pinit/PinIt;->setDescription(Ljava/lang/String;)V

    .line 146
    return-void
.end method

.method public setImageUri(Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0, p1}, Lcom/pinterest/pinit/PinIt;->setImageUri(Landroid/net/Uri;)V

    .line 110
    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0, p1}, Lcom/pinterest/pinit/PinIt;->setImageUrl(Ljava/lang/String;)V

    .line 93
    return-void
.end method

.method public setListener(Lcom/pinterest/pinit/PinItListener;)V
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0, p1}, Lcom/pinterest/pinit/PinIt;->setListener(Lcom/pinterest/pinit/PinItListener;)V

    .line 162
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;

    invoke-virtual {v0, p1}, Lcom/pinterest/pinit/PinIt;->setUrl(Ljava/lang/String;)V

    .line 129
    return-void
.end method
