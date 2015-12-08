.class public final Lkik/android/util/ad;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field a:Lkik/android/e/f;

.field private b:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Lkik/android/e/f;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 31
    iput-object p1, p0, Lkik/android/util/ad;->b:Landroid/widget/EditText;

    .line 32
    iput-object p2, p0, Lkik/android/util/ad;->a:Lkik/android/e/f;

    .line 33
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    .line 39
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "built_in_msg"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 40
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "smiley_key"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 42
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "serialized_content_message"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/kik/KikMessageParcelable;

    .line 43
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    const-string v4, "launch_app"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ComponentName;

    .line 44
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "launch_card"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 45
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 46
    if-eqz v0, :cond_1

    .line 47
    iget-object v1, p0, Lkik/android/util/ad;->a:Lkik/android/e/f;

    invoke-interface {v1, v0}, Lkik/android/e/f;->a(Lcom/kik/cards/web/kik/KikMessageParcelable;)V

    .line 69
    :cond_0
    :goto_0
    return-void

    .line 49
    :cond_1
    if-eqz v2, :cond_3

    .line 50
    const-string v0, "camera"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    iget-object v0, p0, Lkik/android/util/ad;->a:Lkik/android/e/f;

    invoke-interface {v0}, Lkik/android/e/f;->g()V

    goto :goto_0

    .line 53
    :cond_2
    const-string v0, "gallery"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lkik/android/util/ad;->a:Lkik/android/e/f;

    invoke-interface {v0}, Lkik/android/e/f;->h()V

    goto :goto_0

    .line 57
    :cond_3
    if-eqz v4, :cond_4

    .line 59
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "KikChatFragment.CardIndex"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 60
    const-string v1, "KikChatFragment.CardIndex"

    invoke-virtual {v5, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 61
    iget-object v0, p0, Lkik/android/util/ad;->a:Lkik/android/e/f;

    invoke-interface {v0, v4}, Lkik/android/e/f;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 63
    :cond_4
    if-eqz v1, :cond_5

    .line 64
    iget-object v0, p0, Lkik/android/util/ad;->a:Lkik/android/e/f;

    invoke-interface {v0, v1}, Lkik/android/e/f;->a(Landroid/content/ComponentName;)V

    goto :goto_0

    .line 66
    :cond_5
    if-eqz v3, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    iget-object v0, p0, Lkik/android/util/ad;->a:Lkik/android/e/f;

    invoke-interface {v0, v3}, Lkik/android/e/f;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
