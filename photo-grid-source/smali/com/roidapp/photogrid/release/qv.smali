.class final Lcom/roidapp/photogrid/release/qv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ShareEntryBase;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ShareEntryBase;)V
    .locals 0

    .prologue
    .line 212
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qv;->a:Lcom/roidapp/photogrid/release/ShareEntryBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 214
    const-string v0, "400"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qv;->a:Lcom/roidapp/photogrid/release/ShareEntryBase;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 216
    return-void
.end method
