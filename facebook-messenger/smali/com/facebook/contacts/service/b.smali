.class public Lcom/facebook/contacts/service/b;
.super Ljava/lang/Object;
.source "AddressBookServiceHandler.java"

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

.field private final c:Lcom/facebook/contacts/g/a/j;

.field private final d:Lcom/facebook/contacts/g/a/e;

.field private final e:Lcom/facebook/contacts/g/a/f;

.field private final f:Lcom/facebook/contacts/g/a/g;

.field private final g:Lcom/facebook/contacts/data/m;

.field private final h:Lcom/facebook/contacts/a/d;

.field private final i:Lcom/facebook/contacts/a/e;

.field private final j:Lcom/facebook/contacts/data/k;

.field private final k:Lcom/facebook/base/broadcast/a;

.field private final l:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Lcom/facebook/contacts/g/a/h;

.field private final n:Lcom/facebook/contacts/g/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const-class v0, Lcom/facebook/contacts/service/b;

    sput-object v0, Lcom/facebook/contacts/service/b;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/contacts/g/a/j;Lcom/facebook/contacts/g/a/e;Lcom/facebook/contacts/g/a/f;Lcom/facebook/contacts/g/a/g;Lcom/facebook/contacts/g/a/h;Lcom/facebook/contacts/g/a/a;Lcom/facebook/contacts/data/m;Lcom/facebook/contacts/a/d;Lcom/facebook/contacts/a/e;Lcom/facebook/contacts/data/k;Lcom/facebook/base/broadcast/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;",
            "Lcom/facebook/contacts/g/a/j;",
            "Lcom/facebook/contacts/g/a/e;",
            "Lcom/facebook/contacts/g/a/f;",
            "Lcom/facebook/contacts/g/a/g;",
            "Lcom/facebook/contacts/g/a/h;",
            "Lcom/facebook/contacts/g/a/a;",
            "Lcom/facebook/contacts/data/m;",
            "Lcom/facebook/contacts/a/d;",
            "Lcom/facebook/contacts/a/e;",
            "Lcom/facebook/contacts/data/k;",
            "Lcom/facebook/base/broadcast/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, Lcom/facebook/contacts/service/b;->b:Ljavax/inject/a;

    .line 82
    iput-object p2, p0, Lcom/facebook/contacts/service/b;->c:Lcom/facebook/contacts/g/a/j;

    .line 83
    iput-object p3, p0, Lcom/facebook/contacts/service/b;->d:Lcom/facebook/contacts/g/a/e;

    .line 84
    iput-object p4, p0, Lcom/facebook/contacts/service/b;->e:Lcom/facebook/contacts/g/a/f;

    .line 85
    iput-object p5, p0, Lcom/facebook/contacts/service/b;->f:Lcom/facebook/contacts/g/a/g;

    .line 86
    iput-object p6, p0, Lcom/facebook/contacts/service/b;->m:Lcom/facebook/contacts/g/a/h;

    .line 87
    iput-object p7, p0, Lcom/facebook/contacts/service/b;->n:Lcom/facebook/contacts/g/a/a;

    .line 88
    iput-object p8, p0, Lcom/facebook/contacts/service/b;->g:Lcom/facebook/contacts/data/m;

    .line 89
    iput-object p9, p0, Lcom/facebook/contacts/service/b;->h:Lcom/facebook/contacts/a/d;

    .line 90
    iput-object p10, p0, Lcom/facebook/contacts/service/b;->i:Lcom/facebook/contacts/a/e;

    .line 91
    iput-object p11, p0, Lcom/facebook/contacts/service/b;->j:Lcom/facebook/contacts/data/k;

    .line 92
    iput-object p12, p0, Lcom/facebook/contacts/service/b;->k:Lcom/facebook/base/broadcast/a;

    .line 93
    iput-object p13, p0, Lcom/facebook/contacts/service/b;->l:Ljavax/inject/a;

    .line 94
    return-void
.end method

.method private a(Lcom/google/common/a/es;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 195
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->h:Lcom/facebook/contacts/a/d;

    invoke-virtual {v0}, Lcom/facebook/contacts/a/d;->a()V

    .line 196
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->g:Lcom/facebook/contacts/data/m;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/data/m;->a(Ljava/util/Collection;)V

    .line 197
    return-void
.end method

.method private b()Lcom/facebook/contacts/server/FetchMobileAppDataResult;
    .locals 9

    .prologue
    const-wide/16 v7, -0x1

    .line 122
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    .line 123
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->l:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 124
    new-instance v0, Lcom/facebook/contacts/server/FetchMobileAppDataResult;

    sget-object v2, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v0, v2, v1, v3, v4}, Lcom/facebook/contacts/server/FetchMobileAppDataResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/google/common/a/es;J)V

    .line 156
    :goto_0
    return-object v0

    .line 128
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->j:Lcom/facebook/contacts/data/k;

    sget-object v2, Lcom/facebook/contacts/data/i;->g:Lcom/facebook/contacts/data/j;

    invoke-virtual {v0, v2, v7, v8}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v3

    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 132
    cmp-long v0, v3, v7

    if-eqz v0, :cond_2

    sub-long/2addr v5, v3

    const-wide/32 v7, 0x5265c00

    cmp-long v0, v5, v7

    if-gez v0, :cond_2

    .line 133
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->i:Lcom/facebook/contacts/a/e;

    invoke-virtual {v0}, Lcom/facebook/contacts/a/e;->a()Lcom/google/common/a/es;

    move-result-object v0

    .line 135
    new-instance v2, Lcom/facebook/contacts/server/FetchMobileAppDataResult;

    sget-object v5, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    if-eqz v0, :cond_1

    :goto_1
    invoke-direct {v2, v5, v0, v3, v4}, Lcom/facebook/contacts/server/FetchMobileAppDataResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/google/common/a/es;J)V

    move-object v0, v2

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_1

    .line 142
    :cond_2
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 143
    iget-object v1, p0, Lcom/facebook/contacts/service/b;->e:Lcom/facebook/contacts/g/a/f;

    const/16 v2, 0x32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchMobileAppDataResult;

    .line 146
    iget-object v1, p0, Lcom/facebook/contacts/service/b;->i:Lcom/facebook/contacts/a/e;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchMobileAppDataResult;->a()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/a/e;->a(Lcom/google/common/a/es;)V

    .line 147
    iget-object v1, p0, Lcom/facebook/contacts/service/b;->g:Lcom/facebook/contacts/data/m;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchMobileAppDataResult;->a()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/data/m;->b(Lcom/google/common/a/es;)V

    .line 150
    iget-object v1, p0, Lcom/facebook/contacts/service/b;->j:Lcom/facebook/contacts/data/k;

    sget-object v2, Lcom/facebook/contacts/data/i;->g:Lcom/facebook/contacts/data/j;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/contacts/data/k;->b(Lcom/facebook/common/s/a;J)V

    .line 154
    sget-object v1, Lcom/facebook/contacts/service/b;->a:Ljava/lang/Class;

    const-string v2, "mobile app data loaded"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/contacts/server/FetchVoipInfoResult;
    .locals 3

    .prologue
    .line 160
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "fetchVoipInfoParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchVoipInfoParams;

    .line 162
    iget-object v1, p0, Lcom/facebook/contacts/service/b;->b:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 163
    iget-object v2, p0, Lcom/facebook/contacts/service/b;->f:Lcom/facebook/contacts/g/a/g;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchVoipInfoResult;

    .line 164
    return-object v0
.end method

.method private c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 183
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "favorites"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;

    .line 185
    iget-object v1, p0, Lcom/facebook/contacts/service/b;->b:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 186
    iget-object v2, p0, Lcom/facebook/contacts/service/b;->c:Lcom/facebook/contacts/g/a/j;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    invoke-virtual {v0}, Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/service/b;->a(Lcom/google/common/a/es;)V

    .line 191
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 168
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->j:Lcom/facebook/contacts/data/k;

    sget-object v1, Lcom/facebook/contacts/data/i;->d:Lcom/facebook/contacts/data/j;

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v0

    .line 170
    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    const-wide/32 v2, 0xa4cb80

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 179
    :goto_0
    return-void

    .line 176
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/contacts/service/b;->a()Lcom/facebook/contacts/server/FetchMessagingFavoritesResult;

    move-result-object v0

    .line 177
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchMessagingFavoritesResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/service/b;->a(Lcom/google/common/a/es;)V

    .line 178
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->k:Lcom/facebook/base/broadcast/a;

    const-string v1, "com.facebook.orca.FAVORITE_CONTACT_SYNC_PROGRESS"

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private d(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/user/User;
    .locals 4

    .prologue
    .line 201
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "phone_number"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 203
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 204
    iget-object v2, p0, Lcom/facebook/contacts/service/b;->m:Lcom/facebook/contacts/g/a/h;

    new-instance v3, Lcom/facebook/contacts/g/a/i;

    invoke-direct {v3, v1}, Lcom/facebook/contacts/g/a/i;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2, v3}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 207
    return-object v0
.end method

.method private e(Lcom/facebook/fbservice/service/ad;)V
    .locals 4

    .prologue
    .line 212
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "fbid"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 214
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 215
    iget-object v2, p0, Lcom/facebook/contacts/service/b;->n:Lcom/facebook/contacts/g/a/a;

    new-instance v3, Lcom/facebook/contacts/g/a/b;

    invoke-direct {v3, v1}, Lcom/facebook/contacts/g/a/b;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2, v3}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    return-void
.end method


# virtual methods
.method protected a()Lcom/facebook/contacts/server/FetchMessagingFavoritesResult;
    .locals 3

    .prologue
    .line 221
    iget-object v0, p0, Lcom/facebook/contacts/service/b;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 222
    iget-object v1, p0, Lcom/facebook/contacts/service/b;->d:Lcom/facebook/contacts/g/a/e;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchMessagingFavoritesResult;

    .line 224
    return-object v0
.end method

.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 98
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 99
    sget-object v1, Lcom/facebook/contacts/server/d;->g:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 100
    invoke-direct {p0}, Lcom/facebook/contacts/service/b;->c()V

    .line 101
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 115
    :goto_0
    return-object v0

    .line 102
    :cond_0
    sget-object v1, Lcom/facebook/contacts/server/d;->h:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 103
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/b;->c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 104
    :cond_1
    sget-object v1, Lcom/facebook/contacts/server/d;->i:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 105
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/b;->d(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/user/User;

    move-result-object v0

    .line 106
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 107
    :cond_2
    sget-object v1, Lcom/facebook/contacts/server/d;->j:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 108
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/b;->e(Lcom/facebook/fbservice/service/ad;)V

    .line 109
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 110
    :cond_3
    sget-object v1, Lcom/facebook/contacts/server/d;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 111
    invoke-direct {p0}, Lcom/facebook/contacts/service/b;->b()Lcom/facebook/contacts/server/FetchMobileAppDataResult;

    move-result-object v0

    .line 112
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 113
    :cond_4
    sget-object v1, Lcom/facebook/contacts/server/d;->l:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 114
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/b;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/contacts/server/FetchVoipInfoResult;

    move-result-object v0

    .line 115
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 117
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
