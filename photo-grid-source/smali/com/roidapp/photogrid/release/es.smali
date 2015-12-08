.class final Lcom/roidapp/photogrid/release/es;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/el;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/el;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/roidapp/photogrid/release/es;->a:Lcom/roidapp/photogrid/release/el;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 321
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 322
    return-void
.end method
