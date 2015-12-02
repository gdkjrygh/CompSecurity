.class public Lcom/facebook/orca/intents/e;
.super Ljava/lang/Object;
.source "MessagingIntents.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Intent;Ljava/lang/String;I)I
    .locals 1

    .prologue
    .line 154
    if-nez p0, :cond_1

    .line 162
    :cond_0
    :goto_0
    return p2

    .line 157
    :cond_1
    invoke-virtual {p0, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 161
    invoke-virtual {p0, p1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Intent;)Lcom/facebook/orca/compose/ai;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 103
    if-nez p0, :cond_1

    .line 120
    :cond_0
    :goto_0
    return-object v0

    .line 108
    :cond_1
    const-string v1, "show_composer"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 109
    new-instance v0, Lcom/facebook/orca/compose/ai;

    invoke-direct {v0}, Lcom/facebook/orca/compose/ai;-><init>()V

    .line 110
    const-string v1, "composer_initial_text"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/orca/compose/ai;->a:Ljava/lang/String;

    .line 111
    const-string v1, "composer_photo_uri_list"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/orca/compose/ai;->b:Ljava/util/List;

    .line 113
    const-string v1, "show_composer"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 115
    const-string v1, "open_media_picker_source"

    const/4 v2, -0x1

    invoke-static {p0, v1, v2}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;I)I

    move-result v1

    iput v1, v0, Lcom/facebook/orca/compose/ai;->c:I

    goto :goto_0
.end method

.method public static a(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 174
    if-nez p0, :cond_1

    .line 182
    :cond_0
    :goto_0
    return-object v0

    .line 177
    :cond_1
    invoke-virtual {p0, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 180
    invoke-virtual {p0, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 181
    invoke-virtual {p0, p1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Intent;Ljava/lang/String;Z)Z
    .locals 1

    .prologue
    .line 133
    if-nez p0, :cond_1

    .line 141
    :cond_0
    :goto_0
    return p2

    .line 136
    :cond_1
    invoke-virtual {p0, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    .line 140
    invoke-virtual {p0, p1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_0
.end method
