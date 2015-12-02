.class public Lcom/facebook/contacts/data/i;
.super Ljava/lang/Object;
.source "DbContactsProperties.java"


# static fields
.field public static final a:Lcom/facebook/contacts/data/j;

.field public static final b:Lcom/facebook/contacts/data/j;

.field public static final c:Lcom/facebook/contacts/data/j;

.field public static final d:Lcom/facebook/contacts/data/j;

.field public static final e:Lcom/facebook/contacts/data/j;

.field public static final f:Lcom/facebook/contacts/data/j;

.field public static final g:Lcom/facebook/contacts/data/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 9
    new-instance v0, Lcom/facebook/contacts/data/j;

    const-string v1, "/sync/last_contacts_sync_client_time_ms"

    invoke-direct {v0, v1}, Lcom/facebook/contacts/data/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/data/i;->a:Lcom/facebook/contacts/data/j;

    .line 11
    new-instance v0, Lcom/facebook/contacts/data/j;

    const-string v1, "/sync/contacts_delta_cursor"

    invoke-direct {v0, v1}, Lcom/facebook/contacts/data/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/data/i;->b:Lcom/facebook/contacts/data/j;

    .line 13
    new-instance v0, Lcom/facebook/contacts/data/j;

    const-string v1, "/sync/favorite_count"

    invoke-direct {v0, v1}, Lcom/facebook/contacts/data/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/data/i;->c:Lcom/facebook/contacts/data/j;

    .line 15
    new-instance v0, Lcom/facebook/contacts/data/j;

    const-string v1, "/sync/last_favorite_contacts_sync_client_time_ms"

    invoke-direct {v0, v1}, Lcom/facebook/contacts/data/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/data/i;->d:Lcom/facebook/contacts/data/j;

    .line 17
    new-instance v0, Lcom/facebook/contacts/data/j;

    const-string v1, "/sync/invitable_contacts_local_ids"

    invoke-direct {v0, v1}, Lcom/facebook/contacts/data/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/data/i;->e:Lcom/facebook/contacts/data/j;

    .line 19
    new-instance v0, Lcom/facebook/contacts/data/j;

    const-string v1, "/sync/last_top_contacts_sync_client_time_ms"

    invoke-direct {v0, v1}, Lcom/facebook/contacts/data/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/data/i;->f:Lcom/facebook/contacts/data/j;

    .line 21
    new-instance v0, Lcom/facebook/contacts/data/j;

    const-string v1, "/sync/last_friends_mobile_app_data_sync_client_time_ms"

    invoke-direct {v0, v1}, Lcom/facebook/contacts/data/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/data/i;->g:Lcom/facebook/contacts/data/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
