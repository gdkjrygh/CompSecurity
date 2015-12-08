.class final Lkik/android/util/cf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field final synthetic a:Lkik/android/util/ce;


# direct methods
.method constructor <init>(Lkik/android/util/ce;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lkik/android/util/cf;->a:Lkik/android/util/ce;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 71
    if-eqz p2, :cond_0

    iget-object v0, p0, Lkik/android/util/cf;->a:Lkik/android/util/ce;

    invoke-static {v0}, Lkik/android/util/ce;->a(Lkik/android/util/ce;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
