.class final Lcom/roidapp/photogrid/common/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lcom/roidapp/photogrid/common/ac;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 151
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/ac;->a:Landroid/content/Context;

    const-class v2, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 152
    iget-object v1, p0, Lcom/roidapp/photogrid/common/ac;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 153
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ac;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 154
    return-void
.end method
