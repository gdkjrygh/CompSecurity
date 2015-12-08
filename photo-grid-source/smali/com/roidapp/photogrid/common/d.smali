.class final Lcom/roidapp/photogrid/common/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/roidapp/photogrid/common/d;->a:Landroid/app/Activity;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 134
    const-string v0, ""

    .line 135
    iget-object v1, p0, Lcom/roidapp/photogrid/common/d;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/d;->b:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 137
    return-void
.end method
