.class public Lcom/hmobile/common/RobotoTextView;
.super Landroid/widget/TextView;
.source "RobotoTextView.java"


# static fields
.field static m_typeface:Landroid/graphics/Typeface;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 10
    const/4 v0, 0x0

    sput-object v0, Lcom/hmobile/common/RobotoTextView;->m_typeface:Landroid/graphics/Typeface;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 30
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 31
    sget-object v0, Lcom/hmobile/common/RobotoTextView;->m_typeface:Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    .line 33
    invoke-virtual {p0}, Lcom/hmobile/common/RobotoTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "robotoregular.ttf"

    .line 32
    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/hmobile/common/RobotoTextView;->m_typeface:Landroid/graphics/Typeface;

    .line 35
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    sget-object v0, Lcom/hmobile/common/RobotoTextView;->m_typeface:Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    .line 25
    invoke-virtual {p0}, Lcom/hmobile/common/RobotoTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "robotoregular.ttf"

    .line 24
    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/hmobile/common/RobotoTextView;->m_typeface:Landroid/graphics/Typeface;

    .line 27
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    sget-object v0, Lcom/hmobile/common/RobotoTextView;->m_typeface:Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    .line 17
    invoke-virtual {p0}, Lcom/hmobile/common/RobotoTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "robotoregular.ttf"

    .line 16
    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/hmobile/common/RobotoTextView;->m_typeface:Landroid/graphics/Typeface;

    .line 19
    :cond_0
    return-void
.end method


# virtual methods
.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .locals 1
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "type"    # Landroid/widget/TextView$BufferType;

    .prologue
    .line 39
    sget-object v0, Lcom/hmobile/common/RobotoTextView;->m_typeface:Landroid/graphics/Typeface;

    if-eqz v0, :cond_0

    .line 40
    sget-object v0, Lcom/hmobile/common/RobotoTextView;->m_typeface:Landroid/graphics/Typeface;

    invoke-virtual {p0, v0}, Lcom/hmobile/common/RobotoTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 42
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 43
    return-void
.end method
