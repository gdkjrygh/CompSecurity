.class Lcom/facebook/contacts/data/t;
.super Ljava/lang/Object;
.source "FbContactsContentProvider.java"

# interfaces
.implements Lcom/facebook/contacts/data/w;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/data/FbContactsContentProvider;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/data/FbContactsContentProvider;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/facebook/contacts/data/t;->a:Lcom/facebook/contacts/data/FbContactsContentProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/data/FbContactsContentProvider;Lcom/facebook/contacts/data/s;)V
    .locals 0

    .prologue
    .line 182
    invoke-direct {p0, p1}, Lcom/facebook/contacts/data/t;-><init>(Lcom/facebook/contacts/data/FbContactsContentProvider;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 191
    new-instance v0, Landroid/database/sqlite/SQLiteQueryBuilder;

    invoke-direct {v0}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 192
    iget-object v1, p0, Lcom/facebook/contacts/data/t;->a:Lcom/facebook/contacts/data/FbContactsContentProvider;

    const-string v2, "contacts"

    invoke-virtual {v1, v2, p2, p3, p5}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 198
    invoke-static {}, Lcom/facebook/contacts/data/FbContactsContentProvider;->b()Lcom/google/common/a/ev;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteQueryBuilder;->setProjectionMap(Ljava/util/Map;)V

    .line 199
    iget-object v1, p0, Lcom/facebook/contacts/data/t;->a:Lcom/facebook/contacts/data/FbContactsContentProvider;

    invoke-static {v1}, Lcom/facebook/contacts/data/FbContactsContentProvider;->a(Lcom/facebook/contacts/data/FbContactsContentProvider;)Lcom/facebook/contacts/data/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, v5

    move-object v7, p5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method
