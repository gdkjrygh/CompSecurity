.class public final Lkik/android/util/am;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lkik/android/d/c;

.field private static b:Landroid/content/Context;


# direct methods
.method public static a(Landroid/content/Context;Lkik/android/util/ar;)V
    .locals 8

    .prologue
    .line 50
    sput-object p0, Lkik/android/util/am;->b:Landroid/content/Context;

    .line 51
    invoke-static {p0}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v7

    .line 52
    sput-object v7, Lkik/android/util/am;->a:Lkik/android/d/c;

    new-instance v0, Lkik/android/d/l;

    const-string v2, "animation-type"

    const-string v3, "regular"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v5, "regular"

    aput-object v5, v4, v1

    const/4 v1, 0x1

    const-string v5, "slide"

    aput-object v5, v4, v1

    const/4 v5, 0x0

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lkik/android/d/l;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-interface {v7, v0}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    .line 54
    return-void
.end method
