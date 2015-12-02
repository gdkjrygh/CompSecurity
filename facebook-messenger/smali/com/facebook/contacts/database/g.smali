.class public Lcom/facebook/contacts/database/g;
.super Ljava/lang/Object;
.source "ContactsDatabaseSQLightHelper.java"


# static fields
.field public static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final e:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Lcom/facebook/contacts/data/a;

.field private final d:Lcom/facebook/contacts/models/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 29
    const-class v0, Lcom/facebook/contacts/database/g;

    sput-object v0, Lcom/facebook/contacts/database/g;->b:Ljava/lang/Class;

    .line 43
    const-string v0, "SELECT contact_internal_id FROM contacts_indexed_data WHERE type=\'can_message\'"

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "contacts_indexed_data AS idx1 INNER JOIN ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") AS idx2 ON idx1.contact_internal_id = idx2.contact_internal_id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") AS idx INNER JOIN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "contacts"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AS c "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ON idx.contact_internal_id = c.internal_id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/database/g;->a:Ljava/lang/String;

    .line 55
    const-string v0, "c.data"

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/database/g;->e:Lcom/google/common/a/es;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/data/a;Lcom/facebook/contacts/models/e;)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, Lcom/facebook/contacts/database/g;->c:Lcom/facebook/contacts/data/a;

    .line 81
    iput-object p2, p0, Lcom/facebook/contacts/database/g;->d:Lcom/facebook/contacts/models/e;

    .line 82
    return-void
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;)Landroid/database/sqlite/SQLiteStatement;
    .locals 1

    .prologue
    .line 130
    const-string v0, "insert into contacts_indexed_data(contact_internal_id, type, indexed_data) values ((select internal_id from contacts where contact_id = ?), ?, ?)"

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/models/Contact;)Lcom/facebook/user/User;
    .locals 3
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 86
    new-instance v0, Lcom/facebook/user/o;

    invoke-direct {v0}, Lcom/facebook/user/o;-><init>()V

    .line 88
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getProfileFbid()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 89
    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getProfileFbid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    .line 94
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/o;->a(Lcom/facebook/user/Name;)Lcom/facebook/user/o;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getBigPictureUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/user/o;->c(Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getSmallPictureUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/user/o;->b(Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/contacts/database/g;->d:Lcom/facebook/contacts/models/e;

    invoke-virtual {v2, p1}, Lcom/facebook/contacts/models/e;->a(Lcom/facebook/contacts/models/Contact;)Lcom/facebook/user/PicCropInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/user/o;->a(Lcom/facebook/user/PicCropInfo;)Lcom/facebook/user/o;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/contacts/database/g;->d:Lcom/facebook/contacts/models/e;

    invoke-virtual {v2, p1}, Lcom/facebook/contacts/models/e;->b(Lcom/facebook/contacts/models/Contact;)Lcom/facebook/user/PicCropInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/user/o;->b(Lcom/facebook/user/PicCropInfo;)Lcom/facebook/user/o;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getCommunicationRank()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/facebook/user/o;->a(F)Lcom/facebook/user/o;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getIsMobilePushable()Lcom/facebook/common/w/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/user/o;->a(Lcom/facebook/common/w/q;)Lcom/facebook/user/o;

    .line 107
    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    return-object v0

    .line 91
    :cond_0
    sget-object v1, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/facebook/contacts/database/g;->c:Lcom/facebook/contacts/data/a;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/data/a;->b(Ljava/lang/String;)Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    .line 112
    invoke-virtual {p0, v0}, Lcom/facebook/contacts/database/g;->a(Lcom/facebook/contacts/models/Contact;)Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method
