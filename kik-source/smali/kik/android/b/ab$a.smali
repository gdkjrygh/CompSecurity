.class final Lkik/android/b/ab$a;
.super Lkik/android/h/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/b/ab;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/b/ab;


# direct methods
.method public constructor <init>(Lkik/android/b/ab;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 36
    iput-object p1, p0, Lkik/android/b/ab$a;->a:Lkik/android/b/ab;

    .line 37
    const-string v0, "appTable"

    const/4 v1, 0x7

    invoke-direct {p0, p2, v0, v1, p3}, Lkik/android/h/i;-><init>(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V

    .line 38
    return-void
.end method


# virtual methods
.method public final a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 53
    return-void
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .prologue
    .line 43
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 48
    return-void
.end method
