.class public Lcom/facebook/contacts/server/d;
.super Ljava/lang/Object;
.source "ContactsOperationTypes.java"


# static fields
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 22
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "sync_contacts_partial"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->a:Lcom/facebook/fbservice/service/OperationType;

    .line 33
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "create_contact_claim"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->b:Lcom/facebook/fbservice/service/OperationType;

    .line 44
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "delete_contact_claim"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->c:Lcom/facebook/fbservice/service/OperationType;

    .line 56
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "fetch_contact"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->d:Lcom/facebook/fbservice/service/OperationType;

    .line 66
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "block_contact"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->e:Lcom/facebook/fbservice/service/OperationType;

    .line 75
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "bulk_contacts_delete"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->f:Lcom/facebook/fbservice/service/OperationType;

    .line 86
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "sync_favorite_contacts"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->g:Lcom/facebook/fbservice/service/OperationType;

    .line 96
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "update_favorite_contacts"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->h:Lcom/facebook/fbservice/service/OperationType;

    .line 107
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "check_phone_number"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->i:Lcom/facebook/fbservice/service/OperationType;

    .line 115
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "add_user_to_rolodex"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->j:Lcom/facebook/fbservice/service/OperationType;

    .line 127
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "sync_mobile_app_data"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->k:Lcom/facebook/fbservice/service/OperationType;

    .line 138
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "fetch_voip_info"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->l:Lcom/facebook/fbservice/service/OperationType;

    .line 148
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "contacts_upload"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->m:Lcom/facebook/fbservice/service/OperationType;

    .line 157
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "contacts_invite_all"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->n:Lcom/facebook/fbservice/service/OperationType;

    .line 168
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "sync_top_last_active"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->o:Lcom/facebook/fbservice/service/OperationType;

    .line 179
    new-instance v0, Lcom/facebook/fbservice/service/OperationType;

    const-string v1, "sync_chat_context"

    invoke-direct {v0, v1}, Lcom/facebook/fbservice/service/OperationType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/server/d;->p:Lcom/facebook/fbservice/service/OperationType;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
