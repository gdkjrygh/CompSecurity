.class public Lcom/facebook/contacts/models/Contact;
.super Ljava/lang/Object;
.source "Contact.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/contacts/models/Contact;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lcom/facebook/contacts/models/Contact;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/facebook/user/Name;

.field private final f:Lcom/facebook/user/Name;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:F

.field private final k:Ljava/lang/String;

.field private final l:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/ContactPhone;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Z

.field private final o:Lcom/facebook/common/w/q;

.field private final p:Z

.field private final q:Lcom/facebook/contacts/models/a/a;

.field private final r:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 26
    invoke-static {}, Lcom/facebook/contacts/models/Contact;->newBuilder()Lcom/facebook/contacts/models/b;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/models/a/a;->UNMATCHED:Lcom/facebook/contacts/models/a/a;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/models/b;->a(Lcom/facebook/contacts/models/a/a;)Lcom/facebook/contacts/models/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/models/b;->u()Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/models/Contact;->a:Lcom/facebook/contacts/models/Contact;

    .line 238
    new-instance v0, Lcom/facebook/contacts/models/a;

    invoke-direct {v0}, Lcom/facebook/contacts/models/a;-><init>()V

    sput-object v0, Lcom/facebook/contacts/models/Contact;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->b:Ljava/lang/String;

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->c:Ljava/lang/String;

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->d:Ljava/lang/String;

    .line 89
    const-class v0, Lcom/facebook/user/Name;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/Name;

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->e:Lcom/facebook/user/Name;

    .line 90
    const-class v0, Lcom/facebook/user/Name;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/Name;

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->f:Lcom/facebook/user/Name;

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->g:Ljava/lang/String;

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->h:Ljava/lang/String;

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->i:Ljava/lang/String;

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/facebook/contacts/models/Contact;->j:F

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->k:Ljava/lang/String;

    .line 96
    const-class v0, Lcom/facebook/contacts/models/ContactPhone;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->l:Lcom/google/common/a/es;

    .line 100
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/contacts/models/Contact;->n:Z

    .line 101
    const-class v0, Lcom/facebook/common/w/q;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->o:Lcom/facebook/common/w/q;

    .line 102
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/facebook/contacts/models/Contact;->p:Z

    .line 103
    const-class v0, Lcom/facebook/contacts/models/a/a;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/a/a;

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->q:Lcom/facebook/contacts/models/a/a;

    .line 107
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->r:Ljava/lang/String;

    .line 108
    const-class v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->m:Lcom/google/common/a/es;

    .line 109
    return-void

    :cond_0
    move v0, v2

    .line 100
    goto :goto_0

    :cond_1
    move v1, v2

    .line 102
    goto :goto_1
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/models/a;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/contacts/models/Contact;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/contacts/models/b;)V
    .locals 18

    .prologue
    .line 63
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p1 .. p1}, Lcom/facebook/contacts/models/Contact;->a(Lcom/facebook/contacts/models/b;)Lcom/facebook/user/Name;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->e()Lcom/facebook/user/Name;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->j()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->k()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->l()F

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->m()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->n()Lcom/google/common/a/es;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->o()Z

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->p()Lcom/facebook/common/w/q;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->q()Z

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->r()Lcom/facebook/contacts/models/a/a;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->s()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/contacts/models/b;->t()Lcom/google/common/a/es;

    move-result-object v17

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v17}, Lcom/facebook/contacts/models/Contact;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/user/Name;Lcom/facebook/user/Name;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Lcom/google/common/a/es;ZLcom/facebook/common/w/q;ZLcom/facebook/contacts/models/a/a;Ljava/lang/String;Lcom/google/common/a/es;)V

    .line 82
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/user/Name;Lcom/facebook/user/Name;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Lcom/google/common/a/es;ZLcom/facebook/common/w/q;ZLcom/facebook/contacts/models/a/a;Ljava/lang/String;Lcom/google/common/a/es;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "contactId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "profileFbid"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "graphApiWriteId"
        .end annotation
    .end param
    .param p4    # Lcom/facebook/user/Name;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "name"
        .end annotation
    .end param
    .param p5    # Lcom/facebook/user/Name;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "phoneticName"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "smallPictureUrl"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "bigPictureUrl"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "hugePictureUrl"
        .end annotation
    .end param
    .param p9    # F
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "communicationRank"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "lookupKey"
        .end annotation
    .end param
    .param p11    # Lcom/google/common/a/es;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "phones"
        .end annotation
    .end param
    .param p12    # Z
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "canMessage"
        .end annotation
    .end param
    .param p13    # Lcom/facebook/common/w/q;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "isMobilePushable"
        .end annotation
    .end param
    .param p14    # Z
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "isMemorialized"
        .end annotation
    .end param
    .param p15    # Lcom/facebook/contacts/models/a/a;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "contactType"
        .end annotation
    .end param
    .param p16    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "timelineCoverPhoto"
        .end annotation
    .end param
    .param p17    # Lcom/google/common/a/es;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "nameSearchTokens"
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/facebook/user/Name;",
            "Lcom/facebook/user/Name;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "F",
            "Ljava/lang/String;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/ContactPhone;",
            ">;Z",
            "Lcom/facebook/common/w/q;",
            "Z",
            "Lcom/facebook/contacts/models/a/a;",
            "Ljava/lang/String;",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput-object p1, p0, Lcom/facebook/contacts/models/Contact;->b:Ljava/lang/String;

    .line 131
    iput-object p2, p0, Lcom/facebook/contacts/models/Contact;->c:Ljava/lang/String;

    .line 132
    iput-object p3, p0, Lcom/facebook/contacts/models/Contact;->d:Ljava/lang/String;

    .line 133
    iput-object p4, p0, Lcom/facebook/contacts/models/Contact;->e:Lcom/facebook/user/Name;

    .line 134
    iput-object p5, p0, Lcom/facebook/contacts/models/Contact;->f:Lcom/facebook/user/Name;

    .line 135
    iput-object p6, p0, Lcom/facebook/contacts/models/Contact;->g:Ljava/lang/String;

    .line 136
    iput-object p7, p0, Lcom/facebook/contacts/models/Contact;->h:Ljava/lang/String;

    .line 137
    iput-object p8, p0, Lcom/facebook/contacts/models/Contact;->i:Ljava/lang/String;

    .line 138
    iput p9, p0, Lcom/facebook/contacts/models/Contact;->j:F

    .line 139
    iput-object p10, p0, Lcom/facebook/contacts/models/Contact;->k:Ljava/lang/String;

    .line 140
    iput-object p11, p0, Lcom/facebook/contacts/models/Contact;->l:Lcom/google/common/a/es;

    .line 141
    iput-boolean p12, p0, Lcom/facebook/contacts/models/Contact;->n:Z

    .line 142
    iput-object p13, p0, Lcom/facebook/contacts/models/Contact;->o:Lcom/facebook/common/w/q;

    .line 143
    iput-boolean p14, p0, Lcom/facebook/contacts/models/Contact;->p:Z

    .line 144
    if-eqz p15, :cond_0

    :goto_0
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->q:Lcom/facebook/contacts/models/a/a;

    .line 146
    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->r:Ljava/lang/String;

    .line 147
    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/facebook/contacts/models/Contact;->m:Lcom/google/common/a/es;

    .line 148
    return-void

    .line 144
    :cond_0
    sget-object p15, Lcom/facebook/contacts/models/a/a;->UNMATCHED:Lcom/facebook/contacts/models/a/a;

    goto :goto_0
.end method

.method private static a(Lcom/facebook/contacts/models/b;)Lcom/facebook/user/Name;
    .locals 4

    .prologue
    .line 156
    invoke-virtual {p0}, Lcom/facebook/contacts/models/b;->d()Lcom/facebook/user/Name;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 157
    invoke-virtual {p0}, Lcom/facebook/contacts/models/b;->d()Lcom/facebook/user/Name;

    move-result-object v0

    .line 159
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/facebook/user/Name;

    invoke-virtual {p0}, Lcom/facebook/contacts/models/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/contacts/models/b;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/facebook/contacts/models/b;->f()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/user/Name;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static newBuilder()Lcom/facebook/contacts/models/b;
    .locals 1

    .prologue
    .line 152
    new-instance v0, Lcom/facebook/contacts/models/b;

    invoke-direct {v0}, Lcom/facebook/contacts/models/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 260
    const/4 v0, 0x0

    return v0
.end method

.method public getBigPictureUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bigPictureUrl"
    .end annotation

    .prologue
    .line 195
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getCanMessage()Z
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "canMessage"
    .end annotation

    .prologue
    .line 220
    iget-boolean v0, p0, Lcom/facebook/contacts/models/Contact;->n:Z

    return v0
.end method

.method public getCommunicationRank()F
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "communicationRank"
    .end annotation

    .prologue
    .line 205
    iget v0, p0, Lcom/facebook/contacts/models/Contact;->j:F

    return v0
.end method

.method public getContactId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "contactId"
    .end annotation

    .prologue
    .line 165
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getContactProfileType()Lcom/facebook/contacts/models/a/a;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "contactType"
    .end annotation

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->q:Lcom/facebook/contacts/models/a/a;

    return-object v0
.end method

.method public getGraphApiWriteId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "graphApiWriteId"
    .end annotation

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getHugePictureUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "hugePictureUrl"
    .end annotation

    .prologue
    .line 200
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getIsMemorialized()Z
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "isMemorialized"
    .end annotation

    .prologue
    .line 230
    iget-boolean v0, p0, Lcom/facebook/contacts/models/Contact;->p:Z

    return v0
.end method

.method public getIsMobilePushable()Lcom/facebook/common/w/q;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "isMobilePushable"
    .end annotation

    .prologue
    .line 225
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->o:Lcom/facebook/common/w/q;

    return-object v0
.end method

.method public getLookupKey()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lookupKey"
    .end annotation

    .prologue
    .line 210
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->k:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Lcom/facebook/user/Name;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "name"
    .end annotation

    .prologue
    .line 180
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->e:Lcom/facebook/user/Name;

    return-object v0
.end method

.method public getNameSearchTokens()Lcom/google/common/a/es;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "nameSearchTokens"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 235
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->m:Lcom/google/common/a/es;

    return-object v0
.end method

.method public getPhones()Lcom/google/common/a/es;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "phones"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/ContactPhone;",
            ">;"
        }
    .end annotation

    .prologue
    .line 215
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->l:Lcom/google/common/a/es;

    return-object v0
.end method

.method public getPhoneticName()Lcom/facebook/user/Name;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "phoneticName"
    .end annotation

    .prologue
    .line 185
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->f:Lcom/facebook/user/Name;

    return-object v0
.end method

.method public getProfileFbid()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "profileFbid"
    .end annotation

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getSmallPictureUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "smallPictureUrl"
    .end annotation

    .prologue
    .line 190
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getTimelineCoverPhoto()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "timelineCoverPhoto"
    .end annotation

    .prologue
    .line 255
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->r:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 288
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " (phonetic name: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getPhoneticName()Lcom/facebook/user/Name;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") <contactId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "> <profileFbid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getProfileFbid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "> <commRank:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getCommunicationRank()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "> <canMessage:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/contacts/models/Contact;->getCanMessage()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "<isMemorialized:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/contacts/models/Contact;->p:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "<contactType:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/models/Contact;->q:Lcom/facebook/contacts/models/a/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 265
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 266
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 267
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 268
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->e:Lcom/facebook/user/Name;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 269
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->f:Lcom/facebook/user/Name;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 270
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 271
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 272
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 273
    iget v0, p0, Lcom/facebook/contacts/models/Contact;->j:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 274
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 275
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->l:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 278
    iget-boolean v0, p0, Lcom/facebook/contacts/models/Contact;->n:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 279
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->o:Lcom/facebook/common/w/q;

    invoke-virtual {v0}, Lcom/facebook/common/w/q;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 280
    iget-boolean v0, p0, Lcom/facebook/contacts/models/Contact;->p:Z

    if-eqz v0, :cond_1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 281
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->q:Lcom/facebook/contacts/models/a/a;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/a/a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 282
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->r:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 283
    iget-object v0, p0, Lcom/facebook/contacts/models/Contact;->m:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 284
    return-void

    :cond_0
    move v0, v2

    .line 278
    goto :goto_0

    :cond_1
    move v1, v2

    .line 280
    goto :goto_1
.end method
