.class final Lcom/roidapp/photogrid/release/lz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PhotoGridActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V
    .locals 0

    .prologue
    .line 5662
    iput-object p1, p0, Lcom/roidapp/photogrid/release/lz;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 5664
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5665
    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 5668
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/lz;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0xaa03

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5672
    :goto_0
    return-void

    .line 5670
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto :goto_0
.end method
