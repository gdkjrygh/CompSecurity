.class final Lkik/android/util/ch;
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
    .line 139
    iput-object p1, p0, Lkik/android/util/ch;->a:Lkik/android/util/ce;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 144
    if-eqz p2, :cond_0

    const-string v1, "KikPreferences"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 145
    const-string v1, "KikPreferences.xml"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    .line 148
    :cond_0
    return v0
.end method
