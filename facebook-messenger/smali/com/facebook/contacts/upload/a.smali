.class public Lcom/facebook/contacts/upload/a;
.super Ljava/lang/Object;
.source "ContactsUploadPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field public static final c:Lcom/facebook/prefs/shared/ae;

.field public static final d:Lcom/facebook/prefs/shared/ae;

.field public static final e:Lcom/facebook/prefs/shared/ae;

.field public static final f:Lcom/facebook/prefs/shared/ae;

.field public static final g:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 15
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "contacts_upload/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/contacts/upload/a;->a:Lcom/facebook/prefs/shared/ae;

    .line 16
    sget-object v0, Lcom/facebook/contacts/upload/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "contacts_upload_in_progress"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/contacts/upload/a;->b:Lcom/facebook/prefs/shared/ae;

    .line 18
    sget-object v0, Lcom/facebook/contacts/upload/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_upload_succeeded"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/contacts/upload/a;->c:Lcom/facebook/prefs/shared/ae;

    .line 20
    sget-object v0, Lcom/facebook/contacts/upload/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_upload_failed"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/contacts/upload/a;->d:Lcom/facebook/prefs/shared/ae;

    .line 22
    sget-object v0, Lcom/facebook/contacts/upload/a;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "contact_interaction_events_sent"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/contacts/upload/a;->e:Lcom/facebook/prefs/shared/ae;

    .line 25
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "contacts/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/contacts/upload/a;->f:Lcom/facebook/prefs/shared/ae;

    .line 26
    sget-object v0, Lcom/facebook/contacts/upload/a;->f:Lcom/facebook/prefs/shared/ae;

    const-string v1, "upload_contacts_batch_size"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/contacts/upload/a;->g:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
