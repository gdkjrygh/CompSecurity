.class final Lcom/roidapp/photogrid/filter/selfiecam/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/filter/selfiecam/w;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Z)V
    .locals 0

    .prologue
    .line 233
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iput-boolean p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 242
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    const v1, 0x7f070228

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    const v1, 0x7f070227

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final a([Ljava/lang/Integer;Z)V
    .locals 8

    .prologue
    .line 237
    iget-object v6, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iget-boolean v7, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->a:Z

    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/b;

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v2}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->b(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Ljava/lang/String;

    move-result-object v3

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->b:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v2}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->c(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Z

    move-result v5

    move-object v2, p1

    move v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/filter/selfiecam/b;-><init>(Landroid/app/Activity;[Ljava/lang/Integer;Ljava/lang/String;ZZ)V

    invoke-static {v6, v7, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;ZLcom/roidapp/imagelib/filter/aq;)V

    .line 238
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 247
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 252
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/f;->a:Z

    if-eqz v0, :cond_0

    const v0, 0x7f0203ea

    :goto_0
    return v0

    :cond_0
    const v0, 0x7f0203e8

    goto :goto_0
.end method
