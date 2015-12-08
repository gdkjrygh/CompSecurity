.class public Lcom/hmobile/tooltip/ToolTip;
.super Ljava/lang/Object;
.source "ToolTip.java"


# static fields
.field public static final ANIMATIONTYPE_FROMMASTERVIEW:I = 0x65

.field public static final ANIMATIONTYPE_FROMTOP:I = 0x66


# instance fields
.field private animationType:I

.field private color:I

.field private contentView:Landroid/view/View;

.field private shadow:Z

.field private text:Ljava/lang/CharSequence;

.field private textResId:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object v1, p0, Lcom/hmobile/tooltip/ToolTip;->text:Ljava/lang/CharSequence;

    .line 37
    iput v0, p0, Lcom/hmobile/tooltip/ToolTip;->textResId:I

    .line 38
    iput v0, p0, Lcom/hmobile/tooltip/ToolTip;->color:I

    .line 39
    iput-object v1, p0, Lcom/hmobile/tooltip/ToolTip;->contentView:Landroid/view/View;

    .line 40
    const/16 v0, 0x65

    iput v0, p0, Lcom/hmobile/tooltip/ToolTip;->animationType:I

    .line 41
    return-void
.end method


# virtual methods
.method public getAnimationType()I
    .locals 1

    .prologue
    .line 122
    iget v0, p0, Lcom/hmobile/tooltip/ToolTip;->animationType:I

    return v0
.end method

.method public getColor()I
    .locals 1

    .prologue
    .line 114
    iget v0, p0, Lcom/hmobile/tooltip/ToolTip;->color:I

    return v0
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTip;->contentView:Landroid/view/View;

    return-object v0
.end method

.method public getShadow()Z
    .locals 1

    .prologue
    .line 126
    iget-boolean v0, p0, Lcom/hmobile/tooltip/ToolTip;->shadow:Z

    return v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTip;->text:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTextResId()I
    .locals 1

    .prologue
    .line 110
    iget v0, p0, Lcom/hmobile/tooltip/ToolTip;->textResId:I

    return v0
.end method

.method public withAnimationType(I)Lcom/hmobile/tooltip/ToolTip;
    .locals 0
    .param p1, "animationType"    # I

    .prologue
    .line 91
    iput p1, p0, Lcom/hmobile/tooltip/ToolTip;->animationType:I

    .line 92
    return-object p0
.end method

.method public withColor(I)Lcom/hmobile/tooltip/ToolTip;
    .locals 0
    .param p1, "color"    # I

    .prologue
    .line 71
    iput p1, p0, Lcom/hmobile/tooltip/ToolTip;->color:I

    .line 72
    return-object p0
.end method

.method public withContentView(Landroid/view/View;)Lcom/hmobile/tooltip/ToolTip;
    .locals 0
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 81
    iput-object p1, p0, Lcom/hmobile/tooltip/ToolTip;->contentView:Landroid/view/View;

    .line 82
    return-object p0
.end method

.method public withShadow(Z)Lcom/hmobile/tooltip/ToolTip;
    .locals 0
    .param p1, "shadow"    # Z

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/hmobile/tooltip/ToolTip;->shadow:Z

    .line 102
    return-object p0
.end method

.method public withText(I)Lcom/hmobile/tooltip/ToolTip;
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 60
    iput p1, p0, Lcom/hmobile/tooltip/ToolTip;->textResId:I

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/tooltip/ToolTip;->text:Ljava/lang/CharSequence;

    .line 62
    return-object p0
.end method

.method public withText(Ljava/lang/CharSequence;)Lcom/hmobile/tooltip/ToolTip;
    .locals 1
    .param p1, "text"    # Ljava/lang/CharSequence;

    .prologue
    .line 49
    iput-object p1, p0, Lcom/hmobile/tooltip/ToolTip;->text:Ljava/lang/CharSequence;

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lcom/hmobile/tooltip/ToolTip;->textResId:I

    .line 51
    return-object p0
.end method
