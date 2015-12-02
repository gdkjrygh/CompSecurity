.class Lcom/facebook/orca/messageview/f;
.super Ljava/lang/Object;
.source "MessageViewFragment.java"

# interfaces
.implements Lcom/facebook/widget/text/k;


# instance fields
.field final synthetic a:Lcom/facebook/orca/messageview/MessageViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V
    .locals 0

    .prologue
    .line 228
    iput-object p1, p0, Lcom/facebook/orca/messageview/f;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/text/style/URLSpan;Landroid/widget/TextView;)Z
    .locals 4

    .prologue
    .line 231
    invoke-virtual {p1}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 232
    const-string v1, "tel"

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 234
    if-nez v0, :cond_0

    .line 235
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {p1}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 236
    iget-object v1, p0, Lcom/facebook/orca/messageview/f;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-static {v1}, Lcom/facebook/orca/messageview/MessageViewFragment;->c(Lcom/facebook/orca/messageview/MessageViewFragment;)Lcom/facebook/zero/ui/l;

    move-result-object v1

    sget-object v2, Lcom/facebook/zero/a/c;->k:Lcom/facebook/prefs/shared/ae;

    iget-object v3, p0, Lcom/facebook/orca/messageview/f;->a:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-virtual {v3}, Lcom/facebook/orca/messageview/MessageViewFragment;->p()Landroid/support/v4/app/q;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Landroid/support/v4/app/q;Landroid/os/Parcelable;)V

    .line 238
    const/4 v0, 0x1

    .line 240
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
