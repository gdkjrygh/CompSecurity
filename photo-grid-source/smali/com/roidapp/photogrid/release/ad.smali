.class final Lcom/roidapp/photogrid/release/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ab;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ab;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ad;->a:Lcom/roidapp/photogrid/release/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 59
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 60
    return-void
.end method
