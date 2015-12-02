.class public Lcom/facebook/orca/server/aq;
.super Ljava/lang/Object;
.source "OperationTypes.java"


# static fields
.field public static final A:Lcom/facebook/fbservice/service/OperationType;

.field public static final B:Lcom/facebook/fbservice/service/OperationType;

.field public static final C:Lcom/facebook/fbservice/service/OperationType;

.field public static final D:Lcom/facebook/fbservice/service/OperationType;

.field public static final E:Lcom/facebook/fbservice/service/OperationType;

.field public static final F:Lcom/facebook/fbservice/service/OperationType;

.field public static final G:Lcom/facebook/fbservice/service/OperationType;

.field public static final H:Lcom/facebook/fbservice/service/OperationType;

.field public static final I:Lcom/facebook/fbservice/service/OperationType;

.field public static final J:Lcom/facebook/fbservice/service/OperationType;

.field public static final K:Lcom/facebook/fbservice/service/OperationType;

.field public static final L:Lcom/facebook/fbservice/service/OperationType;

.field public static final a:Lcom/facebook/fbservice/service/OperationType;

.field public static final b:Lcom/facebook/fbservice/service/OperationType;

.field public static final c:Lcom/facebook/fbservice/service/OperationType;

.field public static final d:Lcom/facebook/fbservice/service/OperationType;

.field public static final e:Lcom/facebook/fbservice/service/OperationType;

.field public static final f:Lcom/facebook/fbservice/service/OperationType;

.field public static final g:Lcom/facebook/fbservice/service/OperationType;

.field public static final h:Lcom/facebook/fbservice/service/OperationType;

.field public static final i:Lcom/facebook/fbservice/service/OperationType;

.field public static final j:Lcom/facebook/fbservice/service/OperationType;

.field public static final k:Lcom/facebook/fbservice/service/OperationType;

.field public static final l:Lcom/facebook/fbservice/service/OperationType;

.field public static final m:Lcom/facebook/fbservice/service/OperationType;

.field public static final n:Lcom/facebook/fbservice/service/OperationType;

.field public static final o:Lcom/facebook/fbservice/service/OperationType;

.field public static final p:Lcom/facebook/fbservice/service/OperationType;

.field public static final q:Lcom/facebook/fbservice/service/OperationType;

.field public static final r:Lcom/facebook/fbservice/service/OperationType;

.field public static final s:Lcom/facebook/fbservice/service/OperationType;

.field public static final t:Lcom/facebook/fbservice/service/OperationType;

.field public static final u:Lcom/facebook/fbservice/service/OperationType;

.field public static final v:Lcom/facebook/fbservice/service/OperationType;

.field public static final w:Lcom/facebook/fbservice/service/OperationType;

.field public static final x:Lcom/facebook/fbservice/service/OperationType;

.field public static final y:Lcom/facebook/fbservice/service/OperationType;

.field public static final z:Lcom/facebook/fbservice/service/OperationType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 32
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "get_wildfire_gks"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->a:Lcom/facebook/fbservice/service/OperationType;

    .line 51
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "verify_reg_data"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->b:Lcom/facebook/fbservice/service/OperationType;

    .line 65
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "register_partial_acct"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->c:Lcom/facebook/fbservice/service/OperationType;

    .line 76
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "user_lookup"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->d:Lcom/facebook/fbservice/service/OperationType;

    .line 86
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "create_thread"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->e:Lcom/facebook/fbservice/service/OperationType;

    .line 96
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "broadcast_message"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->f:Lcom/facebook/fbservice/service/OperationType;

    .line 106
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "delete_thread"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->g:Lcom/facebook/fbservice/service/OperationType;

    .line 116
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "delete_messages"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->h:Lcom/facebook/fbservice/service/OperationType;

    .line 126
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "fetch_thread_list"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->i:Lcom/facebook/fbservice/service/OperationType;

    .line 136
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "fetch_more_threads"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->j:Lcom/facebook/fbservice/service/OperationType;

    .line 146
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "fetch_thread"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    .line 157
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "fetch_multiple_threads"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->l:Lcom/facebook/fbservice/service/OperationType;

    .line 169
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "fetch_group_threads"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->m:Lcom/facebook/fbservice/service/OperationType;

    .line 180
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "add_members"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->n:Lcom/facebook/fbservice/service/OperationType;

    .line 190
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "remove_member"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->o:Lcom/facebook/fbservice/service/OperationType;

    .line 200
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "mark_thread"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->p:Lcom/facebook/fbservice/service/OperationType;

    .line 211
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "read_receipt"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->q:Lcom/facebook/fbservice/service/OperationType;

    .line 222
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "delivered_receipt"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->r:Lcom/facebook/fbservice/service/OperationType;

    .line 233
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "mark_folder_seen"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->s:Lcom/facebook/fbservice/service/OperationType;

    .line 244
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "save_draft"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->t:Lcom/facebook/fbservice/service/OperationType;

    .line 255
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "fetch_more_messages"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->u:Lcom/facebook/fbservice/service/OperationType;

    .line 265
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "modify_thread"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->v:Lcom/facebook/fbservice/service/OperationType;

    .line 275
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "send"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->w:Lcom/facebook/fbservice/service/OperationType;

    .line 285
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "queue_message"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->x:Lcom/facebook/fbservice/service/OperationType;

    .line 294
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "pushed_message"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->y:Lcom/facebook/fbservice/service/OperationType;

    .line 306
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "webrtc_send"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->z:Lcom/facebook/fbservice/service/OperationType;

    .line 317
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "get_device_location"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->A:Lcom/facebook/fbservice/service/OperationType;

    .line 327
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "image_search"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->B:Lcom/facebook/fbservice/service/OperationType;

    .line 332
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "ping_ack"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->C:Lcom/facebook/fbservice/service/OperationType;

    .line 342
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "request_sms_confirmation_code"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->D:Lcom/facebook/fbservice/service/OperationType;

    .line 353
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "update_user_settings"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->E:Lcom/facebook/fbservice/service/OperationType;

    .line 364
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "push_trace_confirmation"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->F:Lcom/facebook/fbservice/service/OperationType;

    .line 379
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "verify_phone_number"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->G:Lcom/facebook/fbservice/service/OperationType;

    .line 392
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "verify_phone_number_manual"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->H:Lcom/facebook/fbservice/service/OperationType;

    .line 403
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "fetch_sticker_packs"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->I:Lcom/facebook/fbservice/service/OperationType;

    .line 413
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "add_sticker_pack"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->J:Lcom/facebook/fbservice/service/OperationType;

    .line 423
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "update_recent_stickers"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->K:Lcom/facebook/fbservice/service/OperationType;

    .line 433
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "photo_upload"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/aq;->L:Lcom/facebook/fbservice/service/OperationType;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
