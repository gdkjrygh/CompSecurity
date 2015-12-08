.class public Lcom/google/android/gms/internal/fr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/fs;


# instance fields
.field public final mP:Ljava/lang/String;

.field final xM:I

.field final yq:Lcom/google/android/gms/internal/fi;

.field final yr:J

.field final ys:I

.field final yt:Lcom/google/android/gms/internal/fg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/fs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fs;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/fr;->CREATOR:Lcom/google/android/gms/internal/fs;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/internal/fi;JILjava/lang/String;Lcom/google/android/gms/internal/fg;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/fr;->xM:I

    iput-object p2, p0, Lcom/google/android/gms/internal/fr;->yq:Lcom/google/android/gms/internal/fi;

    iput-wide p3, p0, Lcom/google/android/gms/internal/fr;->yr:J

    iput p5, p0, Lcom/google/android/gms/internal/fr;->ys:I

    iput-object p6, p0, Lcom/google/android/gms/internal/fr;->mP:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/fr;->yt:Lcom/google/android/gms/internal/fg;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/fi;JI)V
    .locals 10

    const/4 v7, 0x0

    const/4 v2, 0x1

    move-object v1, p0

    move-object v3, p1

    move-wide v4, p2

    move v6, p4

    move-object v8, v7

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/fr;-><init>(ILcom/google/android/gms/internal/fi;JILjava/lang/String;Lcom/google/android/gms/internal/fg;)V

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

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/fr;->a(Ljava/lang/String;Landroid/content/Intent;)Lcom/google/android/gms/internal/fi;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {p2, p3, p4, p5, p6}, Lcom/google/android/gms/internal/fr;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;)Lcom/google/android/gms/internal/fg;

    move-result-object v8

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/fr;-><init>(ILcom/google/android/gms/internal/fi;JILjava/lang/String;Lcom/google/android/gms/internal/fg;)V

    return-void
.end method

.method static a(Landroid/content/Intent;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;)Lcom/google/android/gms/internal/fg;
    .locals 4
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
            "Lcom/google/android/gms/internal/fg;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/fr;->ab(Ljava/lang/String;)Lcom/google/android/gms/internal/fk;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/fr;->f(Landroid/net/Uri;)Lcom/google/android/gms/internal/fk;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz p4, :cond_1

    invoke-static {p4}, Lcom/google/android/gms/internal/fr;->a(Ljava/util/List;)Lcom/google/android/gms/internal/fk;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "intent_action"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/fr;->f(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/fk;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "intent_data"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/fr;->f(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/fk;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v2, "intent_activity"

    invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/fr;->f(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/fk;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v2, "intent_extra_data_key"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v2, "intent_extra_data"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/fr;->f(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/fk;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    new-instance v1, Lcom/google/android/gms/internal/fg;

    const/4 v2, 0x1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Lcom/google/android/gms/internal/fk;

    invoke-interface {v0, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/fk;

    invoke-direct {v1, p3, v2, v0}, Lcom/google/android/gms/internal/fg;-><init>(Ljava/lang/String;Z[Lcom/google/android/gms/internal/fk;)V

    return-object v1
.end method

.method public static a(Ljava/lang/String;Landroid/content/Intent;)Lcom/google/android/gms/internal/fi;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/fi;

    const-string v1, ""

    invoke-static {p1}, Lcom/google/android/gms/internal/fr;->f(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/fi;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static a(Ljava/util/List;)Lcom/google/android/gms/internal/fk;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;",
            ">;)",
            "Lcom/google/android/gms/internal/fk;"
        }
    .end annotation

    new-instance v2, Lcom/google/android/gms/internal/iv$a;

    invoke-direct {v2}, Lcom/google/android/gms/internal/iv$a;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v3, v0, [Lcom/google/android/gms/internal/iv$a$a;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v0, v3

    if-ge v1, v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/iv$a$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/iv$a$a;-><init>()V

    aput-object v0, v3, v1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;

    aget-object v4, v3, v1

    iget-object v5, v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->appIndexingUrl:Landroid/net/Uri;

    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/google/android/gms/internal/iv$a$a;->UA:Ljava/lang/String;

    aget-object v4, v3, v1

    iget-object v5, v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->webUrl:Landroid/net/Uri;

    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/google/android/gms/internal/iv$a$a;->UB:Ljava/lang/String;

    aget-object v4, v3, v1

    iget v0, v0, Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;->viewId:I

    iput v0, v4, Lcom/google/android/gms/internal/iv$a$a;->viewId:I

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iput-object v3, v2, Lcom/google/android/gms/internal/iv$a;->Uy:[Lcom/google/android/gms/internal/iv$a$a;

    new-instance v0, Lcom/google/android/gms/internal/fk;

    invoke-static {v2}, Lcom/google/android/gms/internal/me;->d(Lcom/google/android/gms/internal/me;)[B

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/fp$a;

    const-string v3, "outlinks"

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/fp$a;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/fp$a;->w(Z)Lcom/google/android/gms/internal/fp$a;

    move-result-object v2

    const-string v3, ".private:outLinks"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/fp$a;->aa(Ljava/lang/String;)Lcom/google/android/gms/internal/fp$a;

    move-result-object v2

    const-string v3, "blob"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/fp$a;->Z(Ljava/lang/String;)Lcom/google/android/gms/internal/fp$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/fp$a;->dQ()Lcom/google/android/gms/internal/fp;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/fk;-><init>([BLcom/google/android/gms/internal/fp;)V

    return-object v0
.end method

.method private static ab(Ljava/lang/String;)Lcom/google/android/gms/internal/fk;
    .locals 4

    const/4 v3, 0x1

    new-instance v0, Lcom/google/android/gms/internal/fk;

    new-instance v1, Lcom/google/android/gms/internal/fp$a;

    const-string v2, "title"

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/fp$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/fp$a;->I(I)Lcom/google/android/gms/internal/fp$a;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/fp$a;->x(Z)Lcom/google/android/gms/internal/fp$a;

    move-result-object v1

    const-string v2, "name"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/fp$a;->aa(Ljava/lang/String;)Lcom/google/android/gms/internal/fp$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/fp$a;->dQ()Lcom/google/android/gms/internal/fp;

    move-result-object v1

    const-string v2, "text1"

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/fk;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/fp;Ljava/lang/String;)V

    return-object v0
.end method

.method private static f(Landroid/net/Uri;)Lcom/google/android/gms/internal/fk;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/fk;

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/fp$a;

    const-string v3, "web_url"

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/fp$a;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/fp$a;->I(I)Lcom/google/android/gms/internal/fp$a;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/fp$a;->w(Z)Lcom/google/android/gms/internal/fp$a;

    move-result-object v2

    const-string v3, "url"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/fp$a;->aa(Ljava/lang/String;)Lcom/google/android/gms/internal/fp$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/fp$a;->dQ()Lcom/google/android/gms/internal/fp;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/fk;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/fp;)V

    return-object v0
.end method

.method private static f(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/fk;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/fk;

    new-instance v1, Lcom/google/android/gms/internal/fp$a;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/fp$a;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/fp$a;->w(Z)Lcom/google/android/gms/internal/fp$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/fp$a;->dQ()Lcom/google/android/gms/internal/fp;

    move-result-object v1

    invoke-direct {v0, p1, v1, p0}, Lcom/google/android/gms/internal/fk;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/fp;Ljava/lang/String;)V

    return-object v0
.end method

.method private static f(Landroid/content/Intent;)Ljava/lang/String;
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


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/fr;->CREATOR:Lcom/google/android/gms/internal/fs;

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    const-string v0, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d]"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/fr;->yq:Lcom/google/android/gms/internal/fi;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-wide v4, p0, Lcom/google/android/gms/internal/fr;->yr:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget v3, p0, Lcom/google/android/gms/internal/fr;->ys:I

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
    sget-object v0, Lcom/google/android/gms/internal/fr;->CREATOR:Lcom/google/android/gms/internal/fs;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/fs;->a(Lcom/google/android/gms/internal/fr;Landroid/os/Parcel;I)V

    return-void
.end method
