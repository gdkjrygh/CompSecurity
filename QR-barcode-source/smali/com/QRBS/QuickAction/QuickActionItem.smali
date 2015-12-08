.class public Lcom/QRBS/QuickAction/QuickActionItem;
.super Ljava/lang/Object;
.source "QuickActionItem.java"


# instance fields
.field private actionId:I

.field private icon:Landroid/graphics/drawable/Drawable;

.field private sticky:Z

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 21
    const/4 v0, -0x1

    invoke-direct {p0, v0, v1, v1}, Lcom/QRBS/QuickAction/QuickActionItem;-><init>(ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 22
    return-void
.end method

.method public constructor <init>(ILandroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "actionId"    # I
    .param p2, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 36
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/QRBS/QuickAction/QuickActionItem;-><init>(ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 37
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1
    .param p1, "actionId"    # I
    .param p2, "title"    # Ljava/lang/String;

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/QRBS/QuickAction/QuickActionItem;-><init>(ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 27
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "actionId"    # I
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const/4 v0, -0x1

    iput v0, p0, Lcom/QRBS/QuickAction/QuickActionItem;->actionId:I

    .line 14
    iput-object p2, p0, Lcom/QRBS/QuickAction/QuickActionItem;->title:Ljava/lang/String;

    .line 15
    iput-object p3, p0, Lcom/QRBS/QuickAction/QuickActionItem;->icon:Landroid/graphics/drawable/Drawable;

    .line 16
    iput p1, p0, Lcom/QRBS/QuickAction/QuickActionItem;->actionId:I

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 2
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 31
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, Lcom/QRBS/QuickAction/QuickActionItem;-><init>(ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 32
    return-void
.end method


# virtual methods
.method public getActionId()I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/QRBS/QuickAction/QuickActionItem;->actionId:I

    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionItem;->icon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/QRBS/QuickAction/QuickActionItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public isSticky()Z
    .locals 1

    .prologue
    .line 73
    iget-boolean v0, p0, Lcom/QRBS/QuickAction/QuickActionItem;->sticky:Z

    return v0
.end method

.method public setActionId(I)V
    .locals 0
    .param p1, "actionId"    # I

    .prologue
    .line 58
    iput p1, p0, Lcom/QRBS/QuickAction/QuickActionItem;->actionId:I

    .line 59
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 49
    iput-object p1, p0, Lcom/QRBS/QuickAction/QuickActionItem;->icon:Landroid/graphics/drawable/Drawable;

    .line 50
    return-void
.end method

.method public setSticky(Z)V
    .locals 0
    .param p1, "sticky"    # Z

    .prologue
    .line 68
    iput-boolean p1, p0, Lcom/QRBS/QuickAction/QuickActionItem;->sticky:Z

    .line 69
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 41
    iput-object p1, p0, Lcom/QRBS/QuickAction/QuickActionItem;->title:Ljava/lang/String;

    .line 42
    return-void
.end method
