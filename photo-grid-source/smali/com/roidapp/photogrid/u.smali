.class final Lcom/roidapp/photogrid/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/template/h;


# instance fields
.field private a:Landroid/content/SharedPreferences;


# direct methods
.method private constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .prologue
    .line 407
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 408
    iput-object p1, p0, Lcom/roidapp/photogrid/u;->a:Landroid/content/SharedPreferences;

    .line 409
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/SharedPreferences;B)V
    .locals 0

    .prologue
    .line 403
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/u;-><init>(Landroid/content/SharedPreferences;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/cloudlib/template/i;)V
    .locals 3

    .prologue
    .line 416
    iget-object v0, p0, Lcom/roidapp/photogrid/u;->a:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 417
    iget v0, p1, Lcom/roidapp/cloudlib/template/i;->a:I

    iget v1, p1, Lcom/roidapp/cloudlib/template/i;->b:I

    if-le v0, v1, :cond_0

    .line 418
    iget-object v0, p0, Lcom/roidapp/photogrid/u;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "template_new"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 421
    :cond_0
    return-void
.end method
