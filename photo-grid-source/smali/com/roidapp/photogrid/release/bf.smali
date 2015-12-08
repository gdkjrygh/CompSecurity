.class final Lcom/roidapp/photogrid/release/bf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/roidapp/photogrid/release/be;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/be;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bf;->b:Lcom/roidapp/photogrid/release/be;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/bf;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 33
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 34
    const-string v0, "100"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bf;->a:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 35
    return-void
.end method
