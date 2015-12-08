.class final Lcom/roidapp/photogrid/release/qb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/Preference;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qb;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qb;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/Preference;->a(Lcom/roidapp/photogrid/release/Preference;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qb;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/Preference;->b(Lcom/roidapp/photogrid/release/Preference;)V

    .line 121
    :goto_0
    return-void

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qb;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/Preference;->c(Lcom/roidapp/photogrid/release/Preference;)V

    goto :goto_0
.end method
