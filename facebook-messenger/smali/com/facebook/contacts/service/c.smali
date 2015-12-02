.class public Lcom/facebook/contacts/service/c;
.super Ljava/lang/Object;
.source "ContactsServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/contacts/g/f;

.field private final d:Lcom/facebook/contacts/g/j;

.field private final e:Lcom/facebook/contacts/g/h;

.field private final f:Lcom/facebook/contacts/g/b;

.field private final g:Lcom/facebook/contacts/g/a;

.field private final h:Lcom/facebook/contacts/g/d;

.field private final i:Lcom/facebook/contacts/g/e;

.field private final j:Lcom/facebook/contacts/service/a;

.field private final k:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

.field private final l:Lcom/facebook/contacts/a/b;

.field private final m:Lcom/facebook/contacts/data/l;

.field private final n:Lcom/facebook/contacts/data/m;

.field private final o:Lcom/facebook/contacts/data/b;

.field private final p:Lcom/facebook/base/broadcast/a;

.field private final q:Lcom/facebook/contacts/data/k;

.field private final r:Lcom/facebook/common/time/a;

.field private final s:Lcom/facebook/analytics/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 64
    const-class v0, Lcom/facebook/contacts/service/c;

    sput-object v0, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/contacts/g/f;Lcom/facebook/contacts/g/j;Lcom/facebook/contacts/g/h;Lcom/facebook/contacts/g/b;Lcom/facebook/contacts/g/a;Lcom/facebook/contacts/g/d;Lcom/facebook/contacts/g/e;Lcom/facebook/contacts/database/AddressBookPeriodicRunner;Lcom/facebook/contacts/service/a;Lcom/facebook/contacts/a/b;Lcom/facebook/contacts/data/l;Lcom/facebook/contacts/data/m;Lcom/facebook/contacts/data/b;Lcom/facebook/base/broadcast/a;Lcom/facebook/contacts/data/k;Lcom/facebook/common/time/a;Lcom/facebook/analytics/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;",
            "Lcom/facebook/contacts/g/f;",
            "Lcom/facebook/contacts/g/j;",
            "Lcom/facebook/contacts/g/h;",
            "Lcom/facebook/contacts/g/b;",
            "Lcom/facebook/contacts/g/a;",
            "Lcom/facebook/contacts/g/d;",
            "Lcom/facebook/contacts/g/e;",
            "Lcom/facebook/contacts/database/AddressBookPeriodicRunner;",
            "Lcom/facebook/contacts/service/a;",
            "Lcom/facebook/contacts/a/b;",
            "Lcom/facebook/contacts/data/l;",
            "Lcom/facebook/contacts/data/m;",
            "Lcom/facebook/contacts/data/b;",
            "Lcom/facebook/base/broadcast/a;",
            "Lcom/facebook/contacts/data/k;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/analytics/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    iput-object p1, p0, Lcom/facebook/contacts/service/c;->b:Ljavax/inject/a;

    .line 128
    iput-object p2, p0, Lcom/facebook/contacts/service/c;->c:Lcom/facebook/contacts/g/f;

    .line 129
    iput-object p3, p0, Lcom/facebook/contacts/service/c;->d:Lcom/facebook/contacts/g/j;

    .line 130
    iput-object p4, p0, Lcom/facebook/contacts/service/c;->e:Lcom/facebook/contacts/g/h;

    .line 131
    iput-object p5, p0, Lcom/facebook/contacts/service/c;->f:Lcom/facebook/contacts/g/b;

    .line 132
    iput-object p6, p0, Lcom/facebook/contacts/service/c;->g:Lcom/facebook/contacts/g/a;

    .line 133
    iput-object p7, p0, Lcom/facebook/contacts/service/c;->h:Lcom/facebook/contacts/g/d;

    .line 134
    iput-object p8, p0, Lcom/facebook/contacts/service/c;->i:Lcom/facebook/contacts/g/e;

    .line 135
    iput-object p9, p0, Lcom/facebook/contacts/service/c;->k:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    .line 136
    iput-object p10, p0, Lcom/facebook/contacts/service/c;->j:Lcom/facebook/contacts/service/a;

    .line 137
    iput-object p11, p0, Lcom/facebook/contacts/service/c;->l:Lcom/facebook/contacts/a/b;

    .line 138
    iput-object p12, p0, Lcom/facebook/contacts/service/c;->m:Lcom/facebook/contacts/data/l;

    .line 139
    iput-object p13, p0, Lcom/facebook/contacts/service/c;->n:Lcom/facebook/contacts/data/m;

    .line 140
    iput-object p14, p0, Lcom/facebook/contacts/service/c;->o:Lcom/facebook/contacts/data/b;

    .line 141
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/facebook/contacts/service/c;->p:Lcom/facebook/base/broadcast/a;

    .line 142
    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/facebook/contacts/service/c;->q:Lcom/facebook/contacts/data/k;

    .line 143
    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/facebook/contacts/service/c;->r:Lcom/facebook/common/time/a;

    .line 144
    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/facebook/contacts/service/c;->s:Lcom/facebook/analytics/a;

    .line 145
    return-void
.end method

.method private a()Lcom/facebook/fbservice/service/OperationResult;
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 245
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->s:Lcom/facebook/analytics/a;

    const-string v1, "download_contacts"

    invoke-virtual {v0, v1, v6, v7}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 247
    invoke-direct {p0}, Lcom/facebook/contacts/service/c;->b()Ljava/lang/String;

    move-result-object v0

    .line 248
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->r:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 252
    if-nez v0, :cond_0

    .line 253
    invoke-direct {p0}, Lcom/facebook/contacts/service/c;->c()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 273
    :goto_0
    if-eqz v1, :cond_2

    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 277
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->q:Lcom/facebook/contacts/data/k;

    sget-object v4, Lcom/facebook/contacts/data/i;->a:Lcom/facebook/contacts/data/j;

    invoke-virtual {v0, v4, v2, v3}, Lcom/facebook/contacts/data/k;->b(Lcom/facebook/common/s/a;J)V

    .line 280
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->q:Lcom/facebook/contacts/data/k;

    sget-object v2, Lcom/facebook/contacts/data/i;->b:Lcom/facebook/contacts/data/j;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/contacts/data/k;->b(Lcom/facebook/common/s/a;Ljava/lang/String;)V

    .line 284
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    .line 256
    :cond_0
    :try_start_0
    invoke-direct {p0, v0}, Lcom/facebook/contacts/service/c;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lcom/facebook/http/protocol/e; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 268
    goto :goto_0

    .line 257
    :catch_0
    move-exception v1

    .line 258
    iget-object v4, p0, Lcom/facebook/contacts/service/c;->s:Lcom/facebook/analytics/a;

    const-string v5, "download_contacts_delta_failed"

    invoke-virtual {v4, v5, v6, v7}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 259
    invoke-virtual {v1}, Lcom/facebook/http/protocol/e;->b()Lcom/facebook/http/protocol/ApiErrorResult;

    move-result-object v4

    .line 260
    invoke-virtual {v4}, Lcom/facebook/http/protocol/ApiErrorResult;->d()Lcom/facebook/http/protocol/d;

    move-result-object v5

    sget-object v6, Lcom/facebook/http/protocol/d;->GRAPHQL_KERROR_DOMAIN:Lcom/facebook/http/protocol/d;

    if-ne v5, v6, :cond_1

    invoke-virtual {v4}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v4

    const v5, 0x19f871

    if-ne v4, v5, :cond_1

    .line 262
    sget-object v1, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Delta sync cursor "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " no longer valid, falling "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "back to full sync."

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 264
    invoke-direct {p0}, Lcom/facebook/contacts/service/c;->c()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 266
    :cond_1
    throw v1

    .line 273
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private a(Lcom/facebook/user/UserKey;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 235
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->j:Lcom/facebook/contacts/service/a;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/service/a;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/server/FetchContactResult;

    move-result-object v0

    .line 237
    sget-object v1, Lcom/facebook/contacts/server/FetchContactResult;->a:Lcom/facebook/contacts/server/FetchContactResult;

    if-ne v0, v1, :cond_0

    .line 238
    sget-object v0, Lcom/facebook/fbservice/service/t;->OTHER:Lcom/facebook/fbservice/service/t;

    const-string v1, "Contact not found in android db."

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 241
    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 360
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->s:Lcom/facebook/analytics/a;

    const-string v1, "download_contacts_delta"

    invoke-virtual {v0, v1, v6, v7}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 365
    :cond_0
    const/16 v0, 0x32

    .line 367
    const-wide/16 v1, 0x5

    invoke-static {v1, v2}, Lcom/facebook/debug/d/e;->b(J)V

    .line 368
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syncContactsDelta ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " contacts)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 370
    iget-object v2, p0, Lcom/facebook/contacts/service/c;->s:Lcom/facebook/analytics/a;

    const-string v3, "download_contacts_deta_next"

    invoke-virtual {v2, v3, v6, v7}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 371
    new-instance v2, Lcom/facebook/contacts/server/FetchDeltaContactsParams;

    invoke-direct {v2, v0, p1}, Lcom/facebook/contacts/server/FetchDeltaContactsParams;-><init>(ILjava/lang/String;)V

    .line 372
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 373
    iget-object v3, p0, Lcom/facebook/contacts/service/c;->d:Lcom/facebook/contacts/g/j;

    invoke-interface {v0, v3, v2}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchDeltaContactsResult;

    .line 375
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchDeltaContactsResult;->a()Lcom/google/common/a/es;

    move-result-object v2

    .line 376
    sget-object v3, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Inserting contacts: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 377
    iget-object v3, p0, Lcom/facebook/contacts/service/c;->n:Lcom/facebook/contacts/data/m;

    sget-object v4, Lcom/facebook/contacts/data/o;->INSERT:Lcom/facebook/contacts/data/o;

    invoke-virtual {v3, v2, v4}, Lcom/facebook/contacts/data/m;->a(Lcom/google/common/a/em;Lcom/facebook/contacts/data/o;)V

    .line 379
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchDeltaContactsResult;->b()Lcom/google/common/a/es;

    move-result-object v2

    .line 380
    sget-object v3, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Deleting contacts: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 381
    iget-object v3, p0, Lcom/facebook/contacts/service/c;->n:Lcom/facebook/contacts/data/m;

    invoke-virtual {v3, v2}, Lcom/facebook/contacts/data/m;->a(Lcom/google/common/a/em;)V

    .line 383
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchDeltaContactsResult;->c()Ljava/lang/String;

    move-result-object p1

    .line 385
    iget-object v2, p0, Lcom/facebook/contacts/service/c;->p:Lcom/facebook/base/broadcast/a;

    const-string v3, "com.facebook.orca.ACTION_FRIEND_SYNC_PROGRESS"

    invoke-virtual {v2, v3}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 387
    sget-object v1, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    .line 388
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchDeltaContactsResult;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 391
    return-object p1
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 169
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 170
    const-string v1, "fetchContactParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchContactParams;

    .line 171
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactParams;->a()Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 173
    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v1

    sget-object v2, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-ne v1, v2, :cond_0

    .line 174
    invoke-direct {p0, v0}, Lcom/facebook/contacts/service/c;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 177
    :goto_0
    return-object v0

    .line 175
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v1

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-eq v1, v2, :cond_1

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_2

    .line 177
    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/c;->c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 179
    :cond_2
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Unsupported UserKey type"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private b(Lcom/facebook/user/UserKey;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 463
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 465
    new-instance v1, Lcom/facebook/contacts/server/FetchContactParams;

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {v1, v2, p1}, Lcom/facebook/contacts/server/FetchContactParams;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/user/UserKey;)V

    .line 467
    iget-object v2, p0, Lcom/facebook/contacts/service/c;->e:Lcom/facebook/contacts/g/h;

    invoke-interface {v0, v2, v1}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchContactResult;

    .line 470
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->n:Lcom/facebook/contacts/data/m;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->b()Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/contacts/data/m;->a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    .line 473
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->l:Lcom/facebook/contacts/a/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->b()Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/contacts/a/b;->a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    .line 477
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private b()Ljava/lang/String;
    .locals 7

    .prologue
    const-wide/16 v3, -0x1

    const/4 v0, 0x0

    .line 288
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->q:Lcom/facebook/contacts/data/k;

    sget-object v2, Lcom/facebook/contacts/data/i;->a:Lcom/facebook/contacts/data/j;

    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v1

    .line 291
    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    .line 292
    sget-object v1, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    const-string v2, "No last sync timestamp; forcing full sync."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 311
    :goto_0
    return-object v0

    .line 296
    :cond_0
    iget-object v3, p0, Lcom/facebook/contacts/service/c;->r:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    sub-long v1, v3, v1

    .line 297
    const-wide/32 v3, 0x48190800

    cmp-long v3, v1, v3

    if-lez v3, :cond_1

    .line 298
    sget-object v3, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Last sync was "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-wide/32 v5, 0x5265c00

    div-long/2addr v1, v5

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " days ago; forcing full sync."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 303
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->q:Lcom/facebook/contacts/data/k;

    sget-object v1, Lcom/facebook/contacts/data/i;->b:Lcom/facebook/contacts/data/j;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v0

    .line 305
    if-eqz v0, :cond_2

    .line 306
    sget-object v1, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Doing delta sync, cursor: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 308
    :cond_2
    sget-object v1, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    const-string v2, "No delta sync cursor; forcing full sync."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 185
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 186
    const-string v1, "fetchContactParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchContactParams;

    .line 187
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactParams;->a()Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 188
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactParams;->b()Lcom/facebook/fbservice/service/s;

    move-result-object v2

    .line 192
    sget-object v3, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-eq v2, v3, :cond_0

    .line 193
    sget-object v3, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Checking contacts cache: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 194
    iget-object v3, p0, Lcom/facebook/contacts/service/c;->l:Lcom/facebook/contacts/a/b;

    invoke-virtual {v3, v1}, Lcom/facebook/contacts/a/b;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/models/Contact;

    move-result-object v4

    .line 195
    iget-object v3, p0, Lcom/facebook/contacts/service/c;->l:Lcom/facebook/contacts/a/b;

    invoke-virtual {v3, v1}, Lcom/facebook/contacts/a/b;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v5

    .line 196
    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    .line 197
    sget-object v0, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got cached contact: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 198
    new-instance v0, Lcom/facebook/contacts/server/FetchContactResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/server/FetchContactResult;-><init>(Lcom/facebook/fbservice/c/b;JLcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    .line 203
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 230
    :goto_0
    return-object v0

    .line 208
    :cond_0
    sget-object v3, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-eq v2, v3, :cond_1

    .line 209
    sget-object v2, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Checking contacts DB: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 210
    iget-object v2, p0, Lcom/facebook/contacts/service/c;->m:Lcom/facebook/contacts/data/l;

    invoke-virtual {v2, v1}, Lcom/facebook/contacts/data/l;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/server/FetchContactResult;

    move-result-object v1

    .line 211
    sget-object v2, Lcom/facebook/contacts/server/FetchContactResult;->a:Lcom/facebook/contacts/server/FetchContactResult;

    if-eq v1, v2, :cond_1

    invoke-virtual {v1}, Lcom/facebook/contacts/server/FetchContactResult;->b()Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 212
    sget-object v0, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got DB contact: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/contacts/server/FetchContactResult;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 213
    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 217
    :cond_1
    sget-object v1, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    const-string v2, "Fetching contact from server"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 218
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->b:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 219
    iget-object v2, p0, Lcom/facebook/contacts/service/c;->e:Lcom/facebook/contacts/g/h;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchContactResult;

    .line 220
    sget-object v1, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got contact from server: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 223
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->n:Lcom/facebook/contacts/data/m;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->b()Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/contacts/data/m;->a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    .line 226
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->l:Lcom/facebook/contacts/a/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->b()Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/contacts/a/b;->a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    .line 230
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto/16 :goto_0
.end method

.method private c()Ljava/lang/String;
    .locals 10

    .prologue
    const-wide/16 v8, 0x1

    .line 315
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->s:Lcom/facebook/analytics/a;

    const-string v1, "download_contacts_full"

    invoke-virtual {v0, v1, v8, v9}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 316
    const/4 v3, 0x0

    .line 317
    const/4 v2, 0x0

    .line 320
    const-string v1, "download_contacts_full_first"

    .line 321
    sget-object v0, Lcom/facebook/contacts/data/o;->REPLACE_ALL:Lcom/facebook/contacts/data/o;

    move-object v4, v3

    move v3, v2

    move-object v2, v1

    move-object v1, v0

    .line 324
    :cond_0
    if-nez v3, :cond_1

    const/16 v0, 0x14

    .line 327
    :goto_0
    const-wide/16 v5, 0x5

    invoke-static {v5, v6}, Lcom/facebook/debug/d/e;->b(J)V

    .line 328
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "syncContactsFull ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " contacts)"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v5

    .line 330
    iget-object v6, p0, Lcom/facebook/contacts/service/c;->s:Lcom/facebook/analytics/a;

    invoke-virtual {v6, v2, v8, v9}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 333
    invoke-static {v0, v4}, Lcom/facebook/contacts/server/FetchAllContactsParams;->a(ILjava/lang/String;)Lcom/facebook/contacts/server/FetchAllContactsParams;

    move-result-object v2

    .line 334
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 335
    iget-object v4, p0, Lcom/facebook/contacts/service/c;->c:Lcom/facebook/contacts/g/f;

    invoke-interface {v0, v4, v2}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchAllContactsResult;

    .line 337
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchAllContactsResult;->a()Lcom/google/common/a/es;

    move-result-object v2

    .line 338
    sget-object v4, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Inserting contacts: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 339
    iget-object v4, p0, Lcom/facebook/contacts/service/c;->n:Lcom/facebook/contacts/data/m;

    invoke-virtual {v4, v2, v1}, Lcom/facebook/contacts/data/m;->a(Lcom/google/common/a/em;Lcom/facebook/contacts/data/o;)V

    .line 341
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchAllContactsResult;->b()Ljava/lang/String;

    move-result-object v4

    .line 342
    sget-object v1, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Got "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v2}, Lcom/google/common/a/em;->size()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " contacts in batch"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 343
    invoke-virtual {v2}, Lcom/google/common/a/em;->size()I

    move-result v1

    add-int/2addr v3, v1

    .line 345
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->p:Lcom/facebook/base/broadcast/a;

    const-string v2, "com.facebook.orca.ACTION_FRIEND_SYNC_PROGRESS"

    invoke-virtual {v1, v2}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 346
    invoke-virtual {v5}, Lcom/facebook/debug/d/e;->a()J

    .line 347
    sget-object v1, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    .line 350
    sget-object v1, Lcom/facebook/contacts/data/o;->INSERT:Lcom/facebook/contacts/data/o;

    .line 351
    const-string v2, "download_contacts_full_next"

    .line 352
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchAllContactsResult;->c()Z

    move-result v5

    if-nez v5, :cond_0

    .line 354
    sget-object v1, Lcom/facebook/contacts/service/c;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Got "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " contacts."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 356
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchAllContactsResult;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 324
    :cond_1
    const/16 v0, 0x32

    goto/16 :goto_0
.end method

.method private d()Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 446
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 447
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->f:Lcom/facebook/contacts/g/b;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->o:Lcom/facebook/contacts/data/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/b;->c()V

    .line 452
    iget-object v0, p0, Lcom/facebook/contacts/service/c;->k:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->d()V

    .line 454
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private d(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 396
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 397
    const-string v1, "createContactClaimParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/CreateContactClaimParams;

    .line 400
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->b:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 401
    iget-object v2, p0, Lcom/facebook/contacts/service/c;->h:Lcom/facebook/contacts/g/d;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 406
    new-instance v2, Lcom/facebook/user/UserKey;

    sget-object v3, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/CreateContactClaimParams;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 410
    invoke-direct {p0, v2}, Lcom/facebook/contacts/service/c;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/fbservice/service/OperationResult;

    .line 411
    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private e(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 416
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 417
    const-string v1, "deleteContactClaimParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/DeleteContactClaimParams;

    .line 420
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->b:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 421
    iget-object v2, p0, Lcom/facebook/contacts/service/c;->i:Lcom/facebook/contacts/g/e;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    new-instance v1, Lcom/facebook/user/UserKey;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/DeleteContactClaimParams;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 429
    invoke-direct {p0, v1}, Lcom/facebook/contacts/service/c;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private f(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 434
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 435
    const-string v1, "blockContactParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/BlockContactParams;

    .line 438
    iget-object v1, p0, Lcom/facebook/contacts/service/c;->b:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 439
    iget-object v2, p0, Lcom/facebook/contacts/service/c;->g:Lcom/facebook/contacts/g/a;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 149
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 150
    sget-object v1, Lcom/facebook/contacts/server/d;->d:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 151
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/c;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 161
    :goto_0
    return-object v0

    .line 152
    :cond_0
    sget-object v1, Lcom/facebook/contacts/server/d;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 153
    invoke-direct {p0}, Lcom/facebook/contacts/service/c;->a()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 154
    :cond_1
    sget-object v1, Lcom/facebook/contacts/server/d;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 155
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/c;->d(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 156
    :cond_2
    sget-object v1, Lcom/facebook/contacts/server/d;->c:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 157
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/c;->e(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 158
    :cond_3
    sget-object v1, Lcom/facebook/contacts/server/d;->e:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 159
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/c;->f(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 160
    :cond_4
    sget-object v1, Lcom/facebook/contacts/server/d;->f:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 161
    invoke-direct {p0}, Lcom/facebook/contacts/service/c;->d()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 163
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown operation type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
