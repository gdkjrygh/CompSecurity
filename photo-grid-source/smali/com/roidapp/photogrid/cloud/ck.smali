.class final Lcom/roidapp/photogrid/cloud/ck;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/ch;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/ch;)V
    .locals 0

    .prologue
    .line 305
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/ck;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 310
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 312
    return-void
.end method
