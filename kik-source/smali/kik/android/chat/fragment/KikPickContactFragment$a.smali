.class public final Lkik/android/chat/fragment/KikPickContactFragment$a;
.super Lkik/android/util/an;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikPickContactFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 293
    const-string v0, "groupIdforPick"

    sput-object v0, Lkik/android/chat/fragment/KikPickContactFragment$a;->a:Ljava/lang/String;

    .line 294
    const-string v0, "groupOnlyOneContact"

    sput-object v0, Lkik/android/chat/fragment/KikPickContactFragment$a;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 291
    invoke-direct {p0}, Lkik/android/util/an;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikPickContactFragment$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 291
    sget-object v0, Lkik/android/chat/fragment/KikPickContactFragment$a;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickContactFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikPickContactFragment$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 291
    sget-object v0, Lkik/android/chat/fragment/KikPickContactFragment$a;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickContactFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikPickContactFragment$a;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 291
    const-string v0, "kikpickcontactfrag.EXTRA_FILTERED_USERS"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickContactFragment$a;->k(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method
