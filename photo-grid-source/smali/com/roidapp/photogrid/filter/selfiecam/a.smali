.class public final Lcom/roidapp/photogrid/filter/selfiecam/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/roidapp/photogrid/release/ParentActivity;

.field private c:Ljava/lang/String;

.field private d:I


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/ParentActivity;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->a:Ljava/util/Stack;

    .line 29
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->b:Lcom/roidapp/photogrid/release/ParentActivity;

    .line 30
    iput-object p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->c:Ljava/lang/String;

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->d:I

    .line 32
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    .prologue
    const/4 v9, 0x1

    const/4 v5, 0x0

    .line 35
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    .line 36
    if-eqz v2, :cond_0

    array-length v0, v2

    if-lez v0, :cond_0

    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->b:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->b(Landroid/content/Context;)Z

    move-result v0

    .line 38
    if-eqz v0, :cond_1

    move v3, v9

    .line 41
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->b:Lcom/roidapp/photogrid/release/ParentActivity;

    const/16 v1, 0x2046

    iget v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->d:I

    aget-object v2, v2, v4

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->b:Lcom/roidapp/photogrid/release/ParentActivity;

    const v6, 0x7f0702b8

    invoke-virtual {v4, v6}, Lcom/roidapp/photogrid/release/ParentActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->c:Ljava/lang/String;

    sget v10, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a:I

    move-object v6, v5

    move-object v8, v5

    invoke-static/range {v0 .. v10}, Lcom/roidapp/photogrid/cloud/br;->a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Z

    .line 46
    :cond_0
    return-void

    .line 38
    :cond_1
    const/4 v3, 0x2

    goto :goto_0
.end method

.method public final b()V
    .locals 11

    .prologue
    const/4 v9, 0x1

    const/4 v5, 0x0

    .line 49
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    .line 50
    if-eqz v2, :cond_0

    array-length v0, v2

    if-lez v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->b:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->b(Landroid/content/Context;)Z

    move-result v0

    .line 52
    if-eqz v0, :cond_1

    move v3, v9

    .line 55
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->b:Lcom/roidapp/photogrid/release/ParentActivity;

    const/16 v1, 0x2046

    iget v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->d:I

    aget-object v2, v2, v4

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->b:Lcom/roidapp/photogrid/release/ParentActivity;

    const v6, 0x7f0702b8

    invoke-virtual {v4, v6}, Lcom/roidapp/photogrid/release/ParentActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, Lcom/roidapp/photogrid/filter/selfiecam/a;->c:Ljava/lang/String;

    sget v10, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a:I

    move-object v6, v5

    move-object v8, v5

    invoke-static/range {v0 .. v10}, Lcom/roidapp/photogrid/cloud/bf;->a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Z

    .line 60
    :cond_0
    return-void

    .line 52
    :cond_1
    const/4 v3, 0x2

    goto :goto_0
.end method
