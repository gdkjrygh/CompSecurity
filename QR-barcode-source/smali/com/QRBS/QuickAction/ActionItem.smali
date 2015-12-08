.class public Lcom/QRBS/QuickAction/ActionItem;
.super Ljava/lang/Object;
.source "ActionItem.java"


# instance fields
.field private icon:Landroid/graphics/drawable/Drawable;

.field private selected:Z

.field private thumb:Landroid/graphics/Bitmap;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/QRBS/QuickAction/ActionItem;->icon:Landroid/graphics/drawable/Drawable;

    .line 15
    return-void
.end method


# virtual methods
.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/QRBS/QuickAction/ActionItem;->icon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getThumb()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/QRBS/QuickAction/ActionItem;->thumb:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/QRBS/QuickAction/ActionItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public isSelected()Z
    .locals 1

    .prologue
    .line 32
    iget-boolean v0, p0, Lcom/QRBS/QuickAction/ActionItem;->selected:Z

    return v0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 23
    iput-object p1, p0, Lcom/QRBS/QuickAction/ActionItem;->icon:Landroid/graphics/drawable/Drawable;

    .line 24
    return-void
.end method

.method public setSelected(Z)V
    .locals 0
    .param p1, "selected"    # Z

    .prologue
    .line 29
    iput-boolean p1, p0, Lcom/QRBS/QuickAction/ActionItem;->selected:Z

    .line 30
    return-void
.end method

.method public setThumb(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "thumb"    # Landroid/graphics/Bitmap;

    .prologue
    .line 35
    iput-object p1, p0, Lcom/QRBS/QuickAction/ActionItem;->thumb:Landroid/graphics/Bitmap;

    .line 36
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 17
    iput-object p1, p0, Lcom/QRBS/QuickAction/ActionItem;->title:Ljava/lang/String;

    .line 18
    return-void
.end method
