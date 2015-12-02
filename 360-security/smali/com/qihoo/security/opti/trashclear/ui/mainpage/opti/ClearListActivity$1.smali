.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    .line 160
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 161
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->a()Ljava/util/Map;

    move-result-object v0

    .line 162
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->p:Landroid/content/Context;

    const-string/jumbo v2, "sp_key_has_clear_memory"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    .line 163
    new-instance v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;-><init>()V

    .line 164
    const/16 v2, 0x25

    iput v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    .line 165
    iput v6, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    .line 166
    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 167
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    .line 168
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0217

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    .line 169
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 170
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    sget-object v1, Lcom/qihoo/security/clearengine/TrashType;->CATE_MEMORY:Lcom/qihoo/security/clearengine/TrashType;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(J)V

    .line 174
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(Ljava/util/Map;)V

    .line 179
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 180
    return-void
.end method
