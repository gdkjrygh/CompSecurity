.class final Lcom/roidapp/photogrid/release/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ab;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ab;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ac;->a:Lcom/roidapp/photogrid/release/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    .line 66
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 67
    return-void
.end method
