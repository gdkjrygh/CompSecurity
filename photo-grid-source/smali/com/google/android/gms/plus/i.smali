.class public final Lcom/google/android/gms/plus/i;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/content/Intent;

.field private c:Z

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/plus/i;->a:Landroid/content/Context;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.SEND"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/plus/i;->c:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Intent;
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 0
    iget-object v1, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v0, :cond_7

    move v1, v0

    :goto_0
    const-string v3, "android.intent.action.SEND_MULTIPLE"

    iget-object v4, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    iget-object v3, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v5, "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST"

    invoke-virtual {v3, v5, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v1, :cond_0

    if-nez v5, :cond_8

    :cond_0
    move v3, v0

    :goto_1
    const-string v6, "Call-to-action buttons are only available for URLs."

    invoke-static {v3, v6}, Lcom/google/android/gms/common/internal/bl;->a(ZLjava/lang/Object;)V

    if-eqz v5, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v6, "com.google.android.apps.plus.CONTENT_URL"

    invoke-virtual {v3, v6}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_1
    move v3, v0

    :goto_2
    const-string v6, "The content URL is required for interactive posts."

    invoke-static {v3, v6}, Lcom/google/android/gms/common/internal/bl;->a(ZLjava/lang/Object;)V

    if-eqz v5, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v5, "com.google.android.apps.plus.CONTENT_URL"

    invoke-virtual {v3, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v5, "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"

    invoke-virtual {v3, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_2
    move v3, v0

    :goto_3
    const-string v5, "Must set content URL or content deep-link ID to use a call-to-action button."

    invoke-static {v3, v5}, Lcom/google/android/gms/common/internal/bl;->a(ZLjava/lang/Object;)V

    iget-object v3, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v5, "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"

    invoke-virtual {v3, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v5, "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"

    invoke-virtual {v3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2000
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_b

    const-string v0, "GooglePlusPlatform"

    const-string v3, "The provided deep-link ID is empty."

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    .line 0
    :cond_3
    :goto_4
    const-string v3, "The specified deep-link ID was malformed."

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/bl;->a(ZLjava/lang/Object;)V

    :cond_4
    if-nez v1, :cond_5

    if-eqz v4, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v3, "android.intent.action.SEND"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v3, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v5, "android.intent.extra.STREAM"

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {v3, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :goto_5
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    :cond_5
    if-eqz v1, :cond_6

    if-nez v4, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND_MULTIPLE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "android.intent.extra.STREAM"

    iget-object v2, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    :cond_6
    :goto_6
    const-string v0, "com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE"

    iget-object v1, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "com.google.android.gms"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    :goto_7
    return-object v0

    :cond_7
    move v1, v2

    goto/16 :goto_0

    :cond_8
    move v3, v2

    goto/16 :goto_1

    :cond_9
    move v3, v2

    goto/16 :goto_2

    :cond_a
    move v3, v2

    goto/16 :goto_3

    .line 2000
    :cond_b
    const-string v5, " "

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v0, "GooglePlusPlatform"

    const-string v3, "Spaces are not allowed in deep-link IDs."

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    goto/16 :goto_4

    .line 0
    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v2, "android.intent.extra.STREAM"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_5

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "android.intent.extra.STREAM"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_6

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "android.intent.extra.STREAM"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "com.google.android.gms.plus.action.SHARE_GOOGLE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "com.google.android.gms"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    goto :goto_7

    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "com.google.android.apps.plus"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    goto :goto_7
.end method

.method public final a(Landroid/net/Uri;)Lcom/google/android/gms/plus/i;
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "android.intent.extra.STREAM"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    if-nez v0, :cond_0

    .line 1000
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "android.intent.extra.STREAM"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 0
    :goto_0
    return-object p0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final a(Ljava/lang/CharSequence;)Lcom/google/android/gms/plus/i;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/google/android/gms/plus/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/i;->b:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    return-object p0
.end method
