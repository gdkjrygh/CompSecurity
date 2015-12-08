.class public final Lkik/android/i;
.super Lkik/a/d/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/i$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lkik/a/d/a;-><init>()V

    .line 20
    iput-object p1, p0, Lkik/android/i;->a:Landroid/content/Context;

    .line 21
    return-void
.end method

.method private b()Landroid/database/Cursor;
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 35
    iget-object v0, p0, Lkik/android/i;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "data1"

    aput-object v5, v2, v4

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method private c()Landroid/database/Cursor;
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 40
    iget-object v0, p0, Lkik/android/i;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Email;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "data1"

    aput-object v5, v2, v4

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/Iterator;
    .locals 4

    .prologue
    .line 46
    new-instance v0, Lkik/android/i$a;

    invoke-direct {p0}, Lkik/android/i;->b()Landroid/database/Cursor;

    move-result-object v1

    invoke-direct {p0}, Lkik/android/i;->c()Landroid/database/Cursor;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lkik/android/i$a;-><init>(Lkik/android/i;Landroid/database/Cursor;Landroid/database/Cursor;Lcom/c/a/c/c;)V

    return-object v0
.end method

.method public final a(Lcom/c/a/c/c;)Ljava/util/Iterator;
    .locals 3

    .prologue
    .line 52
    new-instance v0, Lkik/android/i$a;

    invoke-direct {p0}, Lkik/android/i;->b()Landroid/database/Cursor;

    move-result-object v1

    invoke-direct {p0}, Lkik/android/i;->c()Landroid/database/Cursor;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2, p1}, Lkik/android/i$a;-><init>(Lkik/android/i;Landroid/database/Cursor;Landroid/database/Cursor;Lcom/c/a/c/c;)V

    return-object v0
.end method
