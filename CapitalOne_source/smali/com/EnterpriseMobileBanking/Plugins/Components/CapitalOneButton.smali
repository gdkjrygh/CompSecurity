.class public Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneButton;
.super Landroid/widget/Button;
.source "CapitalOneButton.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 12
    invoke-direct {p0, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 13
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneButton;->setupFont()V

    .line 14
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 17
    invoke-direct {p0, p1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneButton;->setupFont()V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 22
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 23
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneButton;->setupFont()V

    .line 24
    return-void
.end method

.method private setupFont()V
    .locals 1

    .prologue
    .line 27
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 28
    return-void
.end method
