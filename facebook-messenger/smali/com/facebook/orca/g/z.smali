.class public Lcom/facebook/orca/g/z;
.super Ljava/lang/Object;
.source "ThreadSummariesIterator.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final h:[Ljava/lang/String;


# instance fields
.field private final b:Lcom/facebook/orca/g/aa;

.field private final c:Lcom/facebook/orca/g/r;

.field private final d:Lcom/facebook/orca/g/g;

.field private final e:Lcom/facebook/common/time/a;

.field private f:Landroid/database/Cursor;

.field private g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 32
    const-class v0, Lcom/facebook/orca/g/z;

    sput-object v0, Lcom/facebook/orca/g/z;->a:Ljava/lang/Class;

    .line 43
    const/16 v0, 0x17

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "t.thread_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "t.thread_fbid"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "t.action_id"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "t.refetch_action_id"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "t.last_visible_action_id"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "t.name"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "t.participants"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "t.former_participants"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "t.object_participants"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "t.senders"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "t.single_recipient_thread"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "t.single_recipient_user_key"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "t.snippet"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "t.snippet_sender"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "t.admin_snippet"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "t.timestamp_ms"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "t.unread"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "t.pic_hash"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "t.can_reply_to"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "t.pic"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "t.is_subscribed"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "t.folder"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "t.draft"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/g/z;->h:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/r;Lcom/facebook/orca/g/g;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Lcom/facebook/orca/g/z;->b:Lcom/facebook/orca/g/aa;

    .line 75
    iput-object p2, p0, Lcom/facebook/orca/g/z;->c:Lcom/facebook/orca/g/r;

    .line 76
    iput-object p3, p0, Lcom/facebook/orca/g/z;->d:Lcom/facebook/orca/g/g;

    .line 77
    iput-object p4, p0, Lcom/facebook/orca/g/z;->e:Lcom/facebook/common/time/a;

    .line 78
    return-void
.end method

.method private c()V
    .locals 4

    .prologue
    .line 173
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    .line 174
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "thread_id"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "thread_id"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "thread_fbid"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "thread_fbid"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "action_id"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "action_id"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "refetch_action_id"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "refetch_action_id"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "last_visible_action_id"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "last_visible_action_id"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "name"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "name"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "participants"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "participants"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "former_participants"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "former_participants"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "object_participants"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "object_participants"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "senders"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "senders"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "single_recipient_thread"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "single_recipient_thread"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "snippet"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "snippet"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "snippet_sender"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "snippet_sender"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "admin_snippet"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "admin_snippet"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "timestamp_ms"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "timestamp_ms"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "unread"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "unread"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "pic_hash"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "pic_hash"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "can_reply_to"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "can_reply_to"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "pic"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "pic"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "single_recipient_user_key"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "single_recipient_user_key"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "is_subscribed"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "is_subscribed"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "folder"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "folder"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v1, "draft"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    const-string v3, "draft"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/v;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 204
    iget-object v3, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    if-nez v3, :cond_0

    .line 205
    sget-object v1, Lcom/facebook/orca/g/z;->a:Ljava/lang/Class;

    const-string v2, "next: not initialized, skipping"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 258
    :goto_0
    return-object v0

    .line 209
    :cond_0
    iget-object v3, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 210
    sget-object v1, Lcom/facebook/orca/g/z;->a:Ljava/lang/Class;

    const-string v2, "next: cursor empty"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 215
    :cond_1
    new-instance v3, Lcom/facebook/orca/threads/v;

    invoke-direct {v3}, Lcom/facebook/orca/threads/v;-><init>()V

    .line 216
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "thread_id"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 217
    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 218
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "thread_fbid"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 219
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "action_id"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/facebook/orca/threads/v;->c(J)Lcom/facebook/orca/threads/v;

    .line 220
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "refetch_action_id"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/facebook/orca/threads/v;->a(J)Lcom/facebook/orca/threads/v;

    .line 221
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "last_visible_action_id"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/facebook/orca/threads/v;->b(J)Lcom/facebook/orca/threads/v;

    .line 222
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "name"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 223
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "name"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 225
    :cond_2
    iget-object v4, p0, Lcom/facebook/orca/g/z;->c:Lcom/facebook/orca/g/r;

    iget-object v5, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v6, "participants"

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/g/r;->c(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->a(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    .line 228
    iget-object v4, p0, Lcom/facebook/orca/g/z;->c:Lcom/facebook/orca/g/r;

    iget-object v5, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v6, "former_participants"

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/g/r;->c(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->b(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    .line 231
    iget-object v4, p0, Lcom/facebook/orca/g/z;->c:Lcom/facebook/orca/g/r;

    iget-object v5, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v6, "object_participants"

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/g/r;->b(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->c(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    .line 234
    iget-object v4, p0, Lcom/facebook/orca/g/z;->c:Lcom/facebook/orca/g/r;

    iget-object v5, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v6, "senders"

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/g/r;->b(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->d(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    .line 237
    iget-object v4, p0, Lcom/facebook/orca/g/z;->c:Lcom/facebook/orca/g/r;

    iget-object v5, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v6, "snippet_sender"

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/g/r;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/v;

    .line 240
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "single_recipient_thread"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    :goto_1
    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->a(Z)Lcom/facebook/orca/threads/v;

    .line 242
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "snippet"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->d(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 243
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "admin_snippet"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->e(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 244
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "timestamp_ms"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/facebook/orca/threads/v;->d(J)Lcom/facebook/orca/threads/v;

    .line 245
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "unread"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    :goto_2
    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->b(Z)Lcom/facebook/orca/threads/v;

    .line 246
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "pic_hash"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->f(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 247
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "can_reply_to"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_6

    move v0, v1

    :goto_3
    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->c(Z)Lcom/facebook/orca/threads/v;

    .line 248
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "pic"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 249
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "pic"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->a(Landroid/net/Uri;)Lcom/facebook/orca/threads/v;

    .line 251
    :cond_3
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "single_recipient_user_key"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 253
    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/v;

    .line 254
    iget-object v4, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v5, "is_subscribed"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_7

    :goto_4
    invoke-virtual {v3, v1}, Lcom/facebook/orca/threads/v;->d(Z)Lcom/facebook/orca/threads/v;

    .line 255
    iget-object v1, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v2, "folder"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/FolderName;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/v;

    .line 256
    iget-object v1, p0, Lcom/facebook/orca/g/z;->d:Lcom/facebook/orca/g/g;

    iget-object v2, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    iget-object v0, p0, Lcom/facebook/orca/g/z;->g:Ljava/util/Map;

    const-string v4, "draft"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/g;->a(Ljava/lang/String;)Lcom/facebook/orca/compose/MessageDraft;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/compose/MessageDraft;)Lcom/facebook/orca/threads/v;

    move-object v0, v3

    .line 258
    goto/16 :goto_0

    :cond_4
    move v0, v2

    .line 240
    goto/16 :goto_1

    :cond_5
    move v0, v2

    .line 245
    goto/16 :goto_2

    :cond_6
    move v0, v2

    .line 247
    goto/16 :goto_3

    :cond_7
    move v1, v2

    .line 254
    goto :goto_4
.end method

.method public a(IJ)V
    .locals 9

    .prologue
    const/4 v5, 0x0

    .line 147
    new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;

    invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 148
    const-string v1, "group_conversations AS g INNER JOIN threads AS t ON g.thread_id = t.thread_id"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 150
    invoke-static {}, Lcom/facebook/d/d/e;->a()Lcom/facebook/d/d/f;

    move-result-object v4

    .line 151
    const-string v1, "t.name IS NOT NULL"

    invoke-static {v1}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 152
    const-wide/16 v1, 0x0

    cmp-long v1, p2, v1

    if-lez v1, :cond_0

    .line 153
    const-string v1, "t.timestamp_ms"

    iget-object v2, p0, Lcom/facebook/orca/g/z;->e:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    sub-long/2addr v2, p2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/d/d/e;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 158
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/g/z;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v1}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 159
    sget-object v2, Lcom/facebook/orca/g/z;->h:[Ljava/lang/String;

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->b()[Ljava/lang/String;

    move-result-object v4

    const-string v7, "g.rank DESC"

    if-lez p1, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    :goto_0
    move-object v6, v5

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    .line 169
    invoke-direct {p0}, Lcom/facebook/orca/g/z;->c()V

    .line 170
    return-void

    :cond_1
    move-object v8, v5

    .line 159
    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;JLjava/util/Set;Ljava/lang/String;)V
    .locals 9
    .param p4    # Ljava/util/Set;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/FolderName;",
            "J",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 87
    new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;

    invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 88
    const-string v1, "folders AS f INNER JOIN threads AS t ON f.thread_id = t.thread_id"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 90
    invoke-static {}, Lcom/facebook/d/d/e;->a()Lcom/facebook/d/d/f;

    move-result-object v4

    .line 91
    const-string v1, "f.folder"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 92
    const-wide/16 v1, 0x0

    cmp-long v1, p2, v1

    if-lez v1, :cond_0

    .line 93
    const-string v1, "f.timestamp_ms"

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/d/d/e;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 96
    :cond_0
    if-eqz p4, :cond_1

    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "t.thread_id NOT IN "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p4}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 103
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/g/z;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v1}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 104
    sget-object v2, Lcom/facebook/orca/g/z;->h:[Ljava/lang/String;

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->b()[Ljava/lang/String;

    move-result-object v4

    const-string v7, "f.timestamp_ms DESC"

    move-object v6, v5

    move-object v8, p5

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    .line 114
    invoke-direct {p0}, Lcom/facebook/orca/g/z;->c()V

    .line 115
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 9

    .prologue
    const/16 v3, 0x25

    const/4 v5, 0x0

    .line 120
    new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;

    invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 121
    const-string v1, "folders AS f INNER JOIN threads AS t ON f.thread_id = t.thread_id"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 123
    invoke-static {}, Lcom/facebook/d/d/e;->a()Lcom/facebook/d/d/f;

    move-result-object v4

    .line 124
    const-string v1, "f.folder"

    sget-object v2, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 126
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 127
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "t.name LIKE "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 129
    sget-object v1, Lcom/facebook/orca/g/z;->a:Ljava/lang/Class;

    const-string v2, "selection: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->a()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v6

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v1, p0, Lcom/facebook/orca/g/z;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v1}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 132
    sget-object v2, Lcom/facebook/orca/g/z;->h:[Ljava/lang/String;

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/facebook/d/d/f;->b()[Ljava/lang/String;

    move-result-object v4

    const-string v7, "f.timestamp_ms DESC"

    move-object v6, v5

    move-object v8, v5

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    .line 142
    invoke-direct {p0}, Lcom/facebook/orca/g/z;->c()V

    .line 144
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 262
    sget-object v0, Lcom/facebook/orca/g/z;->a:Ljava/lang/Class;

    const-string v1, "closing"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 263
    iget-object v0, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 265
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/g/z;->f:Landroid/database/Cursor;

    .line 267
    :cond_0
    return-void
.end method
