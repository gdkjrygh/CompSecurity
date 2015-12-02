.class public Lcom/facebook/contacts/upload/f;
.super Ljava/lang/Object;
.source "ContactsUploadServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/contacts/e/e;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/contacts/g/k;

.field private final e:Lcom/facebook/contacts/g/i;

.field private final f:Lcom/facebook/contacts/data/m;

.field private final g:Lcom/facebook/prefs/shared/d;

.field private final h:Lcom/facebook/contacts/data/k;

.field private final i:Lcom/facebook/phonenumbers/PhoneNumberUtil;

.field private final j:Lcom/facebook/contacts/b/a;

.field private final k:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 56
    const-class v0, Lcom/facebook/contacts/upload/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/contacts/g/k;Lcom/facebook/contacts/g/i;Lcom/facebook/contacts/data/m;Lcom/facebook/prefs/shared/d;Lcom/facebook/contacts/data/k;Lcom/facebook/phonenumbers/PhoneNumberUtil;Lcom/facebook/contacts/b/a;Ljavax/inject/a;Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/contacts/e/e;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;",
            "Lcom/facebook/contacts/g/k;",
            "Lcom/facebook/contacts/g/i;",
            "Lcom/facebook/contacts/data/m;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/contacts/data/k;",
            "Lcom/facebook/phonenumbers/PhoneNumberUtil;",
            "Lcom/facebook/contacts/b/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p1, p0, Lcom/facebook/contacts/upload/f;->b:Ljavax/inject/a;

    .line 111
    iput-object p2, p0, Lcom/facebook/contacts/upload/f;->c:Ljavax/inject/a;

    .line 112
    iput-object p3, p0, Lcom/facebook/contacts/upload/f;->d:Lcom/facebook/contacts/g/k;

    .line 113
    iput-object p4, p0, Lcom/facebook/contacts/upload/f;->e:Lcom/facebook/contacts/g/i;

    .line 114
    iput-object p5, p0, Lcom/facebook/contacts/upload/f;->f:Lcom/facebook/contacts/data/m;

    .line 115
    iput-object p6, p0, Lcom/facebook/contacts/upload/f;->g:Lcom/facebook/prefs/shared/d;

    .line 116
    iput-object p7, p0, Lcom/facebook/contacts/upload/f;->h:Lcom/facebook/contacts/data/k;

    .line 117
    iput-object p8, p0, Lcom/facebook/contacts/upload/f;->i:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    .line 118
    iput-object p9, p0, Lcom/facebook/contacts/upload/f;->j:Lcom/facebook/contacts/b/a;

    .line 119
    iput-object p10, p0, Lcom/facebook/contacts/upload/f;->k:Ljavax/inject/a;

    .line 121
    iput-object p11, p0, Lcom/facebook/contacts/upload/f;->l:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 122
    return-void
.end method

.method private a(Lcom/facebook/contacts/server/UploadBulkContactsResult;)Lcom/google/common/a/es;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/contacts/server/UploadBulkContactsResult;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/server/UploadBulkContactChangeResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 432
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 435
    invoke-virtual {p1}, Lcom/facebook/contacts/server/UploadBulkContactsResult;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;

    .line 436
    sget-object v3, Lcom/facebook/contacts/upload/g;->a:[I

    invoke-virtual {v0}, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->a()Lcom/facebook/contacts/server/ag;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/contacts/server/ag;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 442
    :pswitch_0
    invoke-virtual {v0}, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->d()Lcom/facebook/contacts/server/af;

    move-result-object v3

    .line 443
    invoke-direct {p0, v3}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/contacts/server/af;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 444
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 446
    :cond_0
    sget-object v4, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Not including contact "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", confidence "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " too low."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 456
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0

    .line 436
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lcom/google/common/a/ev;Lcom/google/common/a/es;)Lcom/google/common/a/ex;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/contacts/server/UploadBulkContactChange;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/server/UploadBulkContactChangeResult;",
            ">;)",
            "Lcom/google/common/a/ex",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;",
            ">;"
        }
    .end annotation

    .prologue
    .line 544
    invoke-static {}, Lcom/google/common/a/ex;->j()Lcom/google/common/a/ey;

    move-result-object v2

    .line 547
    invoke-virtual {p2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;

    .line 548
    invoke-virtual {v0}, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->b()Ljava/lang/String;

    move-result-object v1

    .line 549
    invoke-virtual {v0}, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->c()Ljava/lang/String;

    move-result-object v4

    .line 550
    invoke-virtual {p1, v1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/server/UploadBulkContactChange;

    .line 551
    if-nez v1, :cond_1

    .line 552
    sget-object v1, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Got change result that did not match a local contact ID, skipping: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 558
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/contacts/server/UploadBulkContactChange;->b()Lcom/facebook/user/User;

    move-result-object v0

    .line 559
    invoke-virtual {v0}, Lcom/facebook/user/User;->k()Lcom/google/common/a/es;

    move-result-object v0

    .line 561
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserPhoneNumber;

    .line 564
    invoke-virtual {v0}, Lcom/facebook/user/UserPhoneNumber;->b()Ljava/lang/String;

    move-result-object v5

    .line 566
    :try_start_0
    iget-object v0, p0, Lcom/facebook/contacts/upload/f;->i:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    move-result-object v0

    .line 568
    invoke-virtual {v2, v4, v0}, Lcom/google/common/a/ey;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ey;
    :try_end_0
    .catch Lcom/facebook/phonenumbers/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 569
    :catch_0
    move-exception v0

    .line 570
    sget-object v6, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error parsing invalid phone number: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, " Error: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 579
    :cond_2
    invoke-virtual {v2}, Lcom/google/common/a/ey;->a()Lcom/google/common/a/ex;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/contacts/server/UploadBulkContactsResult;Lcom/facebook/contacts/upload/h;)Lcom/google/common/a/fi;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/contacts/server/UploadBulkContactsResult;",
            "Lcom/facebook/contacts/upload/h;",
            ")",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 483
    invoke-direct {p0, p1}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/contacts/server/UploadBulkContactsResult;)Lcom/google/common/a/es;

    move-result-object v0

    .line 485
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v2

    .line 487
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;

    .line 488
    const/4 v1, 0x0

    .line 489
    sget-object v4, Lcom/facebook/contacts/upload/g;->b:[I

    invoke-virtual {p2}, Lcom/facebook/contacts/upload/h;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 497
    :goto_1
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :goto_2
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 498
    invoke-virtual {v2, v1}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 491
    :pswitch_0
    invoke-virtual {v0}, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->b()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 492
    goto :goto_1

    .line 494
    :pswitch_1
    invoke-virtual {v0}, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->c()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    .line 497
    :cond_0
    const/4 v0, 0x0

    goto :goto_2

    .line 501
    :cond_1
    invoke-virtual {v2}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0

    .line 489
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/contacts/e/e;Lcom/facebook/contacts/upload/i;ILjava/lang/String;ZLcom/google/common/a/fk;)Ljava/lang/String;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/ad;",
            "Lcom/facebook/contacts/e/e;",
            "Lcom/facebook/contacts/upload/i;",
            "I",
            "Ljava/lang/String;",
            "Z",
            "Lcom/google/common/a/fk",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 219
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v2

    .line 221
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->c()Lcom/facebook/fbservice/service/g;

    move-result-object v5

    .line 222
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 223
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 224
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 228
    const/4 v1, 0x0

    move v4, v1

    move-object/from16 v3, p5

    .line 229
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lcom/facebook/contacts/e/e;->e()Lcom/facebook/user/User;

    move-result-object v9

    if-eqz v9, :cond_3

    .line 230
    move-object/from16 v0, p3

    iget v1, v0, Lcom/facebook/contacts/upload/i;->a:I

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v0, p3

    iput v1, v0, Lcom/facebook/contacts/upload/i;->a:I

    .line 232
    invoke-direct {p0, v9}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/user/User;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 237
    if-eqz p6, :cond_2

    .line 238
    iget-object v1, p0, Lcom/facebook/contacts/upload/f;->j:Lcom/facebook/contacts/b/a;

    invoke-virtual {v9}, Lcom/facebook/user/User;->k()Lcom/google/common/a/es;

    move-result-object v10

    const/16 v11, 0x14

    invoke-virtual {v1, v10, v11}, Lcom/facebook/contacts/b/a;->a(Lcom/google/common/a/es;I)Lcom/google/common/a/es;

    move-result-object v1

    .line 242
    sget-object v10, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Got contact events for user: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, ": "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    :goto_1
    invoke-virtual {v9}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lcom/facebook/contacts/server/UploadBulkContactChange;

    invoke-virtual {v9}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lcom/facebook/contacts/server/ad;->ADD:Lcom/facebook/contacts/server/ad;

    invoke-direct {v11, v12, v9, v13, v1}, Lcom/facebook/contacts/server/UploadBulkContactChange;-><init>(Ljava/lang/String;Lcom/facebook/user/User;Lcom/facebook/contacts/server/ad;Ljava/util/List;)V

    invoke-virtual {v2, v10, v11}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 255
    add-int/lit8 v1, v4, 0x1

    move/from16 v0, p4

    if-lt v1, v0, :cond_1

    .line 256
    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v1

    .line 257
    invoke-virtual {p0, v3, v1}, Lcom/facebook/contacts/upload/f;->a(Ljava/lang/String;Lcom/google/common/a/ev;)Lcom/facebook/contacts/server/UploadBulkContactsResult;

    move-result-object v2

    .line 258
    invoke-virtual {v1}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v1

    invoke-interface {v8, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 259
    sget-object v1, Lcom/facebook/contacts/upload/h;->LOCAL_CONTACT_IDS:Lcom/facebook/contacts/upload/h;

    invoke-direct {p0, v2, v1}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/contacts/server/UploadBulkContactsResult;Lcom/facebook/contacts/upload/h;)Lcom/google/common/a/fi;

    move-result-object v1

    .line 261
    invoke-interface {v6, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 262
    invoke-direct {p0, v2, v1}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/contacts/server/UploadBulkContactsResult;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 264
    invoke-virtual {v2}, Lcom/facebook/contacts/server/UploadBulkContactsResult;->a()Ljava/lang/String;

    move-result-object v3

    .line 265
    move-object/from16 v0, p3

    iget v2, v0, Lcom/facebook/contacts/upload/i;->b:I

    invoke-virtual {v1}, Lcom/google/common/a/fi;->size()I

    move-result v1

    add-int/2addr v1, v2

    move-object/from16 v0, p3

    iput v1, v0, Lcom/facebook/contacts/upload/i;->b:I

    .line 267
    const/4 v1, 0x0

    .line 268
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v2

    .line 270
    if-eqz v5, :cond_1

    .line 271
    move-object/from16 v0, p3

    iget v4, v0, Lcom/facebook/contacts/upload/i;->a:I

    move-object/from16 v0, p3

    iget v9, v0, Lcom/facebook/contacts/upload/i;->b:I

    move-object/from16 v0, p3

    iget v10, v0, Lcom/facebook/contacts/upload/i;->c:I

    invoke-static {v4, v9, v10}, Lcom/facebook/contacts/upload/ContactsUploadState;->a(III)Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v4

    invoke-interface {v5, v4}, Lcom/facebook/fbservice/service/g;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    :cond_1
    move v4, v1

    .line 279
    goto/16 :goto_0

    .line 244
    :cond_2
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    goto :goto_1

    .line 281
    :cond_3
    if-lez v4, :cond_4

    .line 282
    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v1

    .line 283
    invoke-virtual {p0, v3, v1}, Lcom/facebook/contacts/upload/f;->a(Ljava/lang/String;Lcom/google/common/a/ev;)Lcom/facebook/contacts/server/UploadBulkContactsResult;

    move-result-object v2

    .line 284
    invoke-virtual {v1}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v1

    invoke-interface {v8, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 285
    sget-object v1, Lcom/facebook/contacts/upload/h;->LOCAL_CONTACT_IDS:Lcom/facebook/contacts/upload/h;

    invoke-direct {p0, v2, v1}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/contacts/server/UploadBulkContactsResult;Lcom/facebook/contacts/upload/h;)Lcom/google/common/a/fi;

    move-result-object v1

    .line 287
    invoke-interface {v6, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 288
    invoke-direct {p0, v2, v1}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/contacts/server/UploadBulkContactsResult;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 290
    invoke-virtual {v2}, Lcom/facebook/contacts/server/UploadBulkContactsResult;->a()Ljava/lang/String;

    move-result-object v3

    .line 291
    move-object/from16 v0, p3

    iget v2, v0, Lcom/facebook/contacts/upload/i;->b:I

    invoke-virtual {v1}, Lcom/google/common/a/fi;->size()I

    move-result v1

    add-int/2addr v1, v2

    move-object/from16 v0, p3

    iput v1, v0, Lcom/facebook/contacts/upload/i;->b:I

    .line 293
    if-eqz v5, :cond_4

    .line 294
    move-object/from16 v0, p3

    iget v1, v0, Lcom/facebook/contacts/upload/i;->a:I

    move-object/from16 v0, p3

    iget v2, v0, Lcom/facebook/contacts/upload/i;->b:I

    move-object/from16 v0, p3

    iget v4, v0, Lcom/facebook/contacts/upload/i;->c:I

    invoke-static {v1, v2, v4}, Lcom/facebook/contacts/upload/ContactsUploadState;->a(III)Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    invoke-interface {v5, v1}, Lcom/facebook/fbservice/service/g;->a(Lcom/facebook/fbservice/service/OperationResult;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcom/facebook/contacts/e/e;->c()V

    .line 306
    invoke-direct {p0, v8, v6, v7}, Lcom/facebook/contacts/upload/f;->a(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    .line 310
    move-object/from16 v0, p7

    invoke-virtual {v0, v1}, Lcom/google/common/a/fk;->b(Ljava/lang/Iterable;)Lcom/google/common/a/fk;

    .line 313
    return-object v3

    .line 304
    :catchall_0
    move-exception v1

    invoke-virtual/range {p2 .. p2}, Lcom/facebook/contacts/e/e;->c()V

    .line 306
    invoke-direct {p0, v8, v6, v7}, Lcom/facebook/contacts/upload/f;->a(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    .line 310
    move-object/from16 v0, p7

    invoke-virtual {v0, v2}, Lcom/google/common/a/fk;->b(Ljava/lang/Iterable;)Lcom/google/common/a/fk;

    .line 311
    throw v1
.end method

.method private a(Lcom/facebook/contacts/server/UploadBulkContactsResult;Ljava/util/Set;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/contacts/server/UploadBulkContactsResult;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 465
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v1

    .line 467
    invoke-virtual {p1}, Lcom/facebook/contacts/server/UploadBulkContactsResult;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;

    .line 469
    invoke-virtual {v0}, Lcom/facebook/contacts/server/UploadBulkContactChangeResult;->b()Ljava/lang/String;

    move-result-object v3

    .line 470
    if-eqz v3, :cond_0

    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 471
    invoke-virtual {v1, v3}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 470
    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 474
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/common/a/kl;->a(Ljava/util/Set;Ljava/util/Set;)Lcom/google/common/a/kp;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 389
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 391
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 392
    invoke-interface {v0, p2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 393
    invoke-interface {v0, p3}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 395
    return-object v0
.end method

.method private a(Lcom/google/common/a/ev;Lcom/facebook/contacts/server/UploadBulkContactsResult;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/contacts/server/UploadBulkContactChange;",
            ">;",
            "Lcom/facebook/contacts/server/UploadBulkContactsResult;",
            ")V"
        }
    .end annotation

    .prologue
    .line 526
    invoke-direct {p0, p2}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/contacts/server/UploadBulkContactsResult;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/upload/f;->a(Lcom/google/common/a/ev;Lcom/google/common/a/es;)Lcom/google/common/a/ex;

    move-result-object v0

    .line 531
    sget-object v1, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Inserting phone indexes for contacts: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    iget-object v1, p0, Lcom/facebook/contacts/upload/f;->f:Lcom/facebook/contacts/data/m;

    invoke-virtual {v1, v0}, Lcom/facebook/contacts/data/m;->a(Lcom/google/common/a/ex;)V

    .line 533
    return-void
.end method

.method private a(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 399
    iget-object v0, p0, Lcom/facebook/contacts/upload/f;->l:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 400
    iget-object v1, p0, Lcom/facebook/contacts/upload/f;->h:Lcom/facebook/contacts/data/k;

    sget-object v2, Lcom/facebook/contacts/data/i;->e:Lcom/facebook/contacts/data/j;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/contacts/data/k;->b(Lcom/facebook/common/s/a;Ljava/lang/String;)V

    .line 403
    return-void
.end method

.method private a(Lcom/facebook/contacts/server/af;)Z
    .locals 2

    .prologue
    .line 505
    sget-object v0, Lcom/facebook/contacts/upload/g;->c:[I

    invoke-virtual {p1}, Lcom/facebook/contacts/server/af;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 510
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 508
    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 505
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lcom/facebook/user/User;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 406
    invoke-virtual {p1}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v3, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 408
    invoke-virtual {p1}, Lcom/facebook/user/User;->d()Lcom/facebook/user/Name;

    move-result-object v0

    .line 409
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 410
    :cond_0
    sget-object v0, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Skipping contact: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " (no name)"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    :goto_1
    return v2

    :cond_1
    move v0, v2

    .line 406
    goto :goto_0

    .line 414
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/user/User;->j()Lcom/google/common/a/es;

    move-result-object v0

    .line 415
    invoke-virtual {p1}, Lcom/facebook/user/User;->k()Lcom/google/common/a/es;

    move-result-object v3

    .line 416
    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 418
    sget-object v0, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Skipping contact: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " (no emails or phones)"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move v2, v1

    .line 422
    goto :goto_1
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 9

    .prologue
    const/4 v3, 0x0

    .line 135
    iget-object v0, p0, Lcom/facebook/contacts/upload/f;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/contacts/e/e;

    .line 136
    invoke-virtual {v2}, Lcom/facebook/contacts/e/e;->b()Ljava/util/Collection;

    move-result-object v1

    .line 138
    iget-object v0, p0, Lcom/facebook/contacts/upload/f;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/facebook/contacts/e/e;

    .line 139
    invoke-virtual {v8, v1}, Lcom/facebook/contacts/e/e;->a(Ljava/util/Collection;)V

    .line 141
    invoke-virtual {v2}, Lcom/facebook/contacts/e/e;->d()I

    move-result v0

    invoke-virtual {v8}, Lcom/facebook/contacts/e/e;->d()I

    move-result v1

    add-int/2addr v0, v1

    .line 144
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->c()Lcom/facebook/fbservice/service/g;

    move-result-object v1

    .line 145
    if-eqz v1, :cond_0

    .line 147
    invoke-static {v3, v3, v0}, Lcom/facebook/contacts/upload/ContactsUploadState;->a(III)Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/facebook/fbservice/service/g;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 152
    :cond_0
    new-instance v3, Lcom/facebook/contacts/upload/i;

    invoke-direct {v3, v0}, Lcom/facebook/contacts/upload/i;-><init>(I)V

    .line 156
    iget-object v0, p0, Lcom/facebook/contacts/upload/f;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/contacts/upload/a;->g:Lcom/facebook/prefs/shared/ae;

    const-string v4, "-1"

    invoke-interface {v0, v1, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 159
    const/4 v0, -0x1

    if-ne v4, v0, :cond_1

    .line 160
    const/16 v4, 0x64

    .line 163
    :cond_1
    sget-object v0, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Starting upload of "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v5, v3, Lcom/facebook/contacts/upload/i;->c:I

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, " contacts "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "(batch size "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ")"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    iget-object v0, p0, Lcom/facebook/contacts/upload/f;->k:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 168
    sget-object v0, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Contacts interaction events upload permitted: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v7

    .line 173
    sget-object v0, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    const-string v1, "Starting frequent contacts upload..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/contacts/e/e;Lcom/facebook/contacts/upload/i;ILjava/lang/String;ZLcom/google/common/a/fk;)Ljava/lang/String;

    move-result-object v5

    .line 183
    sget-object v0, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    const-string v1, "Starting remaining contacts upload..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, v8

    .line 184
    invoke-direct/range {v0 .. v7}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/contacts/e/e;Lcom/facebook/contacts/upload/i;ILjava/lang/String;ZLcom/google/common/a/fk;)Ljava/lang/String;

    .line 193
    sget-object v0, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Done uploading contacts (import ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    invoke-virtual {v7}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    .line 196
    invoke-direct {p0, v0}, Lcom/facebook/contacts/upload/f;->a(Ljava/util/Set;)V

    .line 198
    sget-object v1, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invitable contacts stored: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    if-eqz v6, :cond_2

    .line 201
    iget-object v0, p0, Lcom/facebook/contacts/upload/f;->g:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/upload/a;->e:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 207
    :cond_2
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a(Ljava/lang/String;Lcom/google/common/a/ev;)Lcom/facebook/contacts/server/UploadBulkContactsResult;
    .locals 12
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/contacts/server/UploadBulkContactChange;",
            ">;)",
            "Lcom/facebook/contacts/server/UploadBulkContactsResult;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v11, 0x3

    const/4 v4, 0x0

    .line 321
    const-wide/16 v0, 0x7

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "uploadUserBatch ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/common/a/ev;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " changes)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v8

    .line 324
    if-nez p1, :cond_1

    const-string v0, "(new import)"

    move-object v2, v0

    .line 326
    :goto_0
    const/4 v1, 0x0

    move v6, v4

    move v7, v4

    move-object v5, v1

    .line 335
    :goto_1
    if-nez v7, :cond_3

    if-ge v6, v11, :cond_3

    .line 337
    :try_start_0
    sget-object v0, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Uploading user batch "

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v9, " ("

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/common/a/ev;->size()I

    move-result v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v9, " changes)"

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    new-instance v1, Lcom/facebook/contacts/server/UploadBulkContactsParams;

    invoke-virtual {p2}, Lcom/google/common/a/ev;->c()Lcom/google/common/a/em;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/facebook/contacts/server/UploadBulkContactsParams;-><init>(Ljava/lang/String;Lcom/google/common/a/es;)V

    .line 340
    iget-object v0, p0, Lcom/facebook/contacts/upload/f;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 341
    iget-object v9, p0, Lcom/facebook/contacts/upload/f;->d:Lcom/facebook/contacts/g/k;

    invoke-interface {v0, v9, v1}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/server/UploadBulkContactsResult;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 344
    :try_start_1
    sget-object v5, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Got upload result: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v5, v9}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    sget-object v5, Lcom/facebook/contacts/upload/h;->REMOTE_CONTACT_IDS:Lcom/facebook/contacts/upload/h;

    invoke-direct {p0, v1, v5}, Lcom/facebook/contacts/upload/f;->a(Lcom/facebook/contacts/server/UploadBulkContactsResult;Lcom/facebook/contacts/upload/h;)Lcom/google/common/a/fi;

    move-result-object v5

    .line 348
    invoke-virtual {v5}, Lcom/google/common/a/fi;->size()I

    move-result v9

    if-lez v9, :cond_0

    .line 349
    new-instance v9, Lcom/facebook/contacts/server/FetchContactsParams;

    invoke-direct {v9, v5}, Lcom/facebook/contacts/server/FetchContactsParams;-><init>(Lcom/google/common/a/fi;)V

    .line 350
    iget-object v5, p0, Lcom/facebook/contacts/upload/f;->e:Lcom/facebook/contacts/g/i;

    invoke-interface {v0, v5, v9}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchContactsResult;

    .line 354
    sget-object v5, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Got fetch result: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v5, v9}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    iget-object v5, p0, Lcom/facebook/contacts/upload/f;->f:Lcom/facebook/contacts/data/m;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactsResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    sget-object v9, Lcom/facebook/contacts/data/o;->INSERT:Lcom/facebook/contacts/data/o;

    invoke-virtual {v5, v0, v9}, Lcom/facebook/contacts/data/m;->a(Lcom/google/common/a/em;Lcom/facebook/contacts/data/o;)V

    .line 360
    invoke-direct {p0, p2, v1}, Lcom/facebook/contacts/upload/f;->a(Lcom/google/common/a/ev;Lcom/facebook/contacts/server/UploadBulkContactsResult;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_0
    move v7, v3

    move-object v5, v1

    .line 373
    goto/16 :goto_1

    :cond_1
    move-object v2, p1

    .line 324
    goto/16 :goto_0

    .line 364
    :catch_0
    move-exception v0

    .line 365
    :goto_2
    add-int/lit8 v5, v6, 0x1

    .line 366
    sget-object v6, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Failed to upload user batch, (try "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " of "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "), error: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    if-lt v5, v11, :cond_2

    .line 370
    sget-object v1, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    const-string v2, "Giving up uploading user batch."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    throw v0

    :cond_2
    move v6, v5

    move-object v5, v1

    .line 373
    goto/16 :goto_1

    .line 376
    :cond_3
    const-wide/16 v0, 0x0

    invoke-virtual {v8, v0, v1}, Lcom/facebook/debug/d/e;->a(J)J

    .line 378
    sget-object v0, Lcom/facebook/contacts/upload/f;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/debug/d/e;->c(Ljava/lang/String;)V

    .line 380
    if-eqz v5, :cond_4

    move v0, v3

    :goto_3
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 382
    return-object v5

    :cond_4
    move v0, v4

    .line 380
    goto :goto_3

    .line 364
    :catch_1
    move-exception v0

    move-object v1, v5

    goto :goto_2
.end method

.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 126
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 127
    sget-object v1, Lcom/facebook/contacts/server/d;->m:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 128
    invoke-direct {p0, p1}, Lcom/facebook/contacts/upload/f;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    .line 130
    :cond_0
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
