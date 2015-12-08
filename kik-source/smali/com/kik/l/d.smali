.class public final Lcom/kik/l/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/database/sqlite/SQLiteOpenHelper;

.field private final b:I


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteOpenHelper;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/kik/l/d;->a:Landroid/database/sqlite/SQLiteOpenHelper;

    .line 29
    const/16 v0, 0x13

    iput v0, p0, Lcom/kik/l/d;->b:I

    .line 30
    return-void
.end method
