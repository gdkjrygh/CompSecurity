.class public Lcom/google/android/gms/internal/hr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/hs;


# instance fields
.field final CK:I

.field final Dw:Lcom/google/android/gms/internal/hf;

.field final Dx:J

.field final Dy:I

.field final Dz:Lcom/google/android/gms/internal/hd;

.field public final pc:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/hs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hs;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/hr;->CREATOR:Lcom/google/android/gms/internal/hs;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/internal/hf;JILjava/lang/String;Lcom/google/android/gms/internal/hd;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/hr;->CK:I

    iput-object p2, p0, Lcom/google/android/gms/internal/hr;->Dw:Lcom/google/android/gms/internal/hf;

    iput-wide p3, p0, Lcom/google/android/gms/internal/hr;->Dx:J

    iput p5, p0, Lcom/google/android/gms/internal/hr;->Dy:I

    iput-object p6, p0, Lcom/google/android/gms/internal/hr;->pc:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/hr;->Dz:Lcom/google/android/gms/internal/hd;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/hf;JI)V
    .locals 10

    const/4 v7, 0x0

    const/4 v2, 0x1

    move-object v1, p0

    move-object v3, p1

    move-wide v4, p2

    move v6, p4

    move-object v8, v7

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/hr;-><init>(ILcom/google/android/gms/internal/hf;JILjava/lang/String;Lcom/google/android/gms/internal/hd;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/hf;JILjava/lang/String;Lcom/google/android/gms/internal/hd;)V
    .locals 10

    const/4 v2, 0x1

    move-object v1, p0

    move-object v3, p1

    move-wide v4, p2

    move v6, p4

    move-object v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/hr;-><init>(ILcom/google/android/gms/internal/hf;JILjava/lang/String;Lcom/google/android/gms/internal/hd;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x1

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/hr;->a(Ljava/lang/String;Landroid/content/Intent;)Lcom/google/android/gms/internal/hf;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {p2, p3, p4, p5, p6}, Lcom/google/android/gms/internal/hr;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;)Lcom/google/android/gms/internal/hd$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hd$a;->fD()Lcom/google/android/gms/internal/hd;

    move-result-object v8

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/hr;-><init>(ILcom/google/android/gms/internal/hf;JILjava/lang/String;Lcom/google/android/gms/internal/hd;)V

    return-void
.end method

.method public static a(Landroid/content/Intent;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;)Lcom/google/android/gms/internal/hd$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;",
            ">;)",
            "Lcom/google/android/gms/internal/hd$a;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/hd$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hd$a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/hr;->av(Ljava/lang/String;)Lcom/google/android/gms/internal/hh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hd$a;->a(Lcom/google/android/gms/internal/hh;)Lcom/google/android/gms/internal/hd$a;

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/hr;->f(Landroid/net/Uri;)Lcom/google/android/gms/internal/hh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hd$a;->a(Lcom/google/android/gms/internal/hh;)Lcom/google/android/gms/internal/hd$a;

    :cond_0
    if-eqz p4, :cond_1

    invoke-static {p4}, Lcom/google/android/gms/internal/hr;->b(Ljava/util/List;)Lcom/google/android/gms/internal/hh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hd$a;->a(Lcom/google/android/gms/internal/hh;)Lcom/google/android/gms/internal/hd$a;

    :cond_1
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "intent_action"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/hr;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hd$a;->a(Lcom/google/android/gms/internal/hh;)Lcom/google/android/gms/internal/hd$a;

    :cond_2
    invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "intent_data"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/hr;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hd$a;->a(Lcom/google/android/gms/internal/hh;)Lcom/google/android/gms/internal/hd$a;

    :cond_3
    invoke-virtual {p0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v2, "intent_activity"

    invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/hr;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hd$a;->a(Lcom/google/android/gms/internal/hh;)Lcom/google/android/gms/internal/hd$a;

    :cond_4
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v2, "intent_extra_data_key"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v2, "intent_extra_data"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/hr;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hd$a;->a(Lcom/google/android/gms/internal/hh;)Lcom/google/android/gms/internal/hd$a;

    :cond_5
    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/hd$a;->ar(Ljava/lang/String;)Lcom/google/android/gms/internal/hd$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hd$a;->F(Z)Lcom/google/android/gms/internal/hd$a;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Intent;)Lcom/google/android/gms/internal/hf;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/hr;->g(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/hr;->h(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hf;

    move-result-object v0

    return-object v0
.end method

.method private static av(Ljava/lang/String;)Lcom/google/android/gms/internal/hh;
    .locals 4

    const/4 v3, 0x1

    new-instance v0, Lcom/google/android/gms/internal/hh;

    new-instance v1, Lcom/google/android/gms/internal/hp$a;

    const-string v2, "title"

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/hp$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/hp$a;->Q(I)Lcom/google/android/gms/internal/hp$a;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/hp$a;->H(Z)Lcom/google/android/gms/internal/hp$a;

    move-result-object v1

    const-string v2, "name"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/hp$a;->au(Ljava/lang/String;)Lcom/google/android/gms/internal/hp$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/hp$a;->fG()Lcom/google/android/gms/internal/hp;

    move-result-object v1

    const-string v2, "text1"

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/hh;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/hp;Ljava/lang/String;)V

    return-object v0
.end method

.method private static b(Ljava/util/List;)Lcom/google/android/gms/internal/hh;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;",
            ">;)",
            "Lcom/google/android/gms/internal/hh;"
        }
    .end annotation

    new-instance v2, Lcom/google/android/gms/internal/mv$a;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mv$a;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v3, v0, [Lcom/google/android/gms/internal/mv$a$a;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v0, v3

    if-ge v1, v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/mv$a$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mv$a$a;-><init>()V

    aput-object v0, v3, v1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;

    aget-object v4, v3, v1

    iget-object v5, v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->appIndexingUrl:Landroid/net/Uri;

    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/google/android/gms/internal/mv$a$a;->afw:Ljava/lang/String;

    aget-object v4, v3, v1

    iget v5, v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->viewId:I

    iput v5, v4, Lcom/google/android/gms/internal/mv$a$a;->viewId:I

    iget-object v4, v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->webUrl:Landroid/net/Uri;

    if-eqz v4, :cond_0

    aget-object v4, v3, v1

    iget-object v0, v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->webUrl:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/internal/mv$a$a;->afx:Ljava/lang/String;

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    iput-object v3, v2, Lcom/google/android/gms/internal/mv$a;->afu:[Lcom/google/android/gms/internal/mv$a$a;

    new-instance v0, Lcom/google/android/gms/internal/hh;

    invoke-static {v2}, Lcom/google/android/gms/internal/qw;->f(Lcom/google/android/gms/internal/qw;)[B

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/hp$a;

    const-string v3, "outlinks"

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/hp$a;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hp$a;->G(Z)Lcom/google/android/gms/internal/hp$a;

    move-result-object v2

    const-string v3, ".private:outLinks"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hp$a;->au(Ljava/lang/String;)Lcom/google/android/gms/internal/hp$a;

    move-result-object v2

    const-string v3, "blob"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hp$a;->at(Ljava/lang/String;)Lcom/google/android/gms/internal/hp$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/hp$a;->fG()Lcom/google/android/gms/internal/hp;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/hh;-><init>([BLcom/google/android/gms/internal/hp;)V

    return-object v0
.end method

.method private static f(Landroid/net/Uri;)Lcom/google/android/gms/internal/hh;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/hh;

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/hp$a;

    const-string v3, "web_url"

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/hp$a;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hp$a;->Q(I)Lcom/google/android/gms/internal/hp$a;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hp$a;->G(Z)Lcom/google/android/gms/internal/hp$a;

    move-result-object v2

    const-string v3, "url"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hp$a;->au(Ljava/lang/String;)Lcom/google/android/gms/internal/hp$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/hp$a;->fG()Lcom/google/android/gms/internal/hp;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/hh;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/hp;)V

    return-object v0
.end method

.method private static g(Landroid/content/Intent;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    :try_start_0
    const-string v2, "UTF-8"

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/zip/CRC32;->update([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static h(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hf;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/hf;

    const-string v1, ""

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/internal/hf;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static i(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hh;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/hh;

    new-instance v1, Lcom/google/android/gms/internal/hp$a;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/hp$a;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/hp$a;->G(Z)Lcom/google/android/gms/internal/hp$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/hp$a;->fG()Lcom/google/android/gms/internal/hp;

    move-result-object v1

    invoke-direct {v0, p1, v1, p0}, Lcom/google/android/gms/internal/hh;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/hp;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hr;->CREATOR:Lcom/google/android/gms/internal/hs;

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    const-string v0, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d]"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/hr;->Dw:Lcom/google/android/gms/internal/hf;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-wide v4, p0, Lcom/google/android/gms/internal/hr;->Dx:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget v3, p0, Lcom/google/android/gms/internal/hr;->Dy:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/hr;->CREATOR:Lcom/google/android/gms/internal/hs;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hs;->a(Lcom/google/android/gms/internal/hr;Landroid/os/Parcel;I)V

    return-void
.end method
