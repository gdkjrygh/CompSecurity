.class public Lcom/worklight/androidgap/plugin/WLMenuItem;
.super Ljava/lang/Object;
.source "WLMenuItem.java"


# instance fields
.field private callback:Ljava/lang/String;

.field private hasChanged:Z

.field private id:I

.field private imagePath:Ljava/lang/String;

.field private isEnabled:Z

.field private javascriptId:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1
    .param p1, "id"    # I
    .param p2, "javascriptId"    # Ljava/lang/String;
    .param p3, "callback"    # Ljava/lang/String;
    .param p4, "title"    # Ljava/lang/String;
    .param p5, "imagePath"    # Ljava/lang/String;
    .param p6, "isEnabled"    # Z

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p1, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->id:I

    .line 35
    iput-object p2, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->javascriptId:Ljava/lang/String;

    .line 36
    iput-object p3, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->callback:Ljava/lang/String;

    .line 37
    iput-object p4, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->title:Ljava/lang/String;

    .line 38
    iput-boolean p6, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->isEnabled:Z

    .line 39
    invoke-virtual {p0, p5}, Lcom/worklight/androidgap/plugin/WLMenuItem;->setImagePath(Ljava/lang/String;)V

    .line 40
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->hasChanged:Z

    .line 41
    return-void
.end method

.method private setChanged()V
    .locals 1

    .prologue
    .line 107
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->hasChanged:Z

    .line 108
    return-void
.end method


# virtual methods
.method public getCallback()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->callback:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->id:I

    return v0
.end method

.method public getImage(Lcom/worklight/androidgap/WLDroidGap;)Landroid/graphics/drawable/Drawable;
    .locals 6
    .param p1, "wlDroidGap"    # Lcom/worklight/androidgap/WLDroidGap;

    .prologue
    .line 76
    const/4 v0, 0x0

    .line 77
    .local v0, "drawable":Landroid/graphics/drawable/Drawable;
    iget-object v4, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->imagePath:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 78
    invoke-virtual {p1}, Lcom/worklight/androidgap/WLDroidGap;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 80
    .local v3, "res":Landroid/content/res/Resources;
    :try_start_0
    const-string v4, "drawable"

    iget-object v5, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->imagePath:Ljava/lang/String;

    invoke-static {p1, v4, v5}, Lcom/worklight/common/WLUtils;->getResourceId(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 81
    .local v1, "drawableId":I
    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Lcom/worklight/androidgap/NoSuchResourceException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 86
    .end local v1    # "drawableId":I
    .end local v3    # "res":Landroid/content/res/Resources;
    :cond_0
    :goto_0
    return-object v0

    .line 82
    .restart local v3    # "res":Landroid/content/res/Resources;
    :catch_0
    move-exception v2

    .line 83
    .local v2, "e":Lcom/worklight/androidgap/NoSuchResourceException;
    invoke-virtual {v2}, Lcom/worklight/androidgap/NoSuchResourceException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public getImagePath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->imagePath:Ljava/lang/String;

    return-object v0
.end method

.method public getJavaScriptId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->javascriptId:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hasChanged()Z
    .locals 1

    .prologue
    .line 103
    iget-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->hasChanged:Z

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 90
    iget-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->isEnabled:Z

    return v0
.end method

.method public setEnabled(Z)V
    .locals 0
    .param p1, "isEnabled"    # Z

    .prologue
    .line 94
    iput-boolean p1, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->isEnabled:Z

    .line 95
    invoke-direct {p0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->setChanged()V

    .line 96
    return-void
.end method

.method public setImagePath(Ljava/lang/String;)V
    .locals 1
    .param p1, "imagePath"    # Ljava/lang/String;

    .prologue
    .line 69
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->imagePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    iput-object p1, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->imagePath:Ljava/lang/String;

    .line 71
    invoke-direct {p0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->setChanged()V

    .line 73
    :cond_0
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 60
    iput-object p1, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->title:Ljava/lang/String;

    .line 61
    invoke-direct {p0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->setChanged()V

    .line 62
    return-void
.end method

.method public unsetChanged()V
    .locals 1

    .prologue
    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/worklight/androidgap/plugin/WLMenuItem;->hasChanged:Z

    .line 100
    return-void
.end method
