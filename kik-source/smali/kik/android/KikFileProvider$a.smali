.class final Lkik/android/KikFileProvider$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/KikFileProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/KikFileProvider;


# direct methods
.method private constructor <init>(Lkik/android/KikFileProvider;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lkik/android/KikFileProvider$a;->a:Lkik/android/KikFileProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lkik/android/KikFileProvider;B)V
    .locals 0

    .prologue
    .line 160
    invoke-direct {p0, p1}, Lkik/android/KikFileProvider$a;-><init>(Lkik/android/KikFileProvider;)V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .prologue
    .line 160
    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method
