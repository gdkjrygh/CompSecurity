.class final Lcom/mobvista/sdk/m/a/a/a/b;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/a/a/a/a;


# direct methods
.method public constructor <init>(Lcom/mobvista/sdk/m/a/a/a/a;Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 36
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/a/a/b;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, v0, p4}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 38
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/b;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/a/a/a/a;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 42
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/b;->a:Lcom/mobvista/sdk/m/a/a/a/a;

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/a/a/a/a;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 46
    return-void
.end method
