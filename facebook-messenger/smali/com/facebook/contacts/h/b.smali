.class public final enum Lcom/facebook/contacts/h/b;
.super Ljava/lang/Enum;
.source "ContactsConnectionsContract.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/h/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/h/b;

.field public static final enum CONTACTS_CONTENT:Lcom/facebook/contacts/h/b;

.field public static final enum CONTACT_ID:Lcom/facebook/contacts/h/b;

.field public static final enum FRIENDS_BIRTHDAYS:Lcom/facebook/contacts/h/b;

.field public static final enum FRIENDS_CONTENT:Lcom/facebook/contacts/h/b;

.field public static final enum FRIENDS_PREFIX_SEARCH:Lcom/facebook/contacts/h/b;

.field public static final enum FRIEND_UID:Lcom/facebook/contacts/h/b;

.field public static final enum PAGES_CONTENT:Lcom/facebook/contacts/h/b;

.field public static final enum PAGES_SEARCH:Lcom/facebook/contacts/h/b;

.field public static final enum PAGE_ID:Lcom/facebook/contacts/h/b;


# instance fields
.field public final category:Ljava/lang/String;

.field public final uriMatcherSuffix:Ljava/lang/String;

.field public final uriSuffix:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .prologue
    const/4 v12, 0x4

    const/4 v11, 0x3

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v2, 0x0

    .line 82
    new-instance v0, Lcom/facebook/contacts/h/b;

    const-string v1, "CONTACTS_CONTENT"

    const-string v3, "all_contacts"

    const-string v4, ""

    const-string v5, ""

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/h/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/h/b;->CONTACTS_CONTENT:Lcom/facebook/contacts/h/b;

    .line 83
    new-instance v3, Lcom/facebook/contacts/h/b;

    const-string v4, "CONTACT_ID"

    const-string v6, "all_contacts"

    const-string v7, "/id"

    const-string v8, "/#"

    move v5, v9

    invoke-direct/range {v3 .. v8}, Lcom/facebook/contacts/h/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/facebook/contacts/h/b;->CONTACT_ID:Lcom/facebook/contacts/h/b;

    .line 85
    new-instance v3, Lcom/facebook/contacts/h/b;

    const-string v4, "FRIENDS_CONTENT"

    const-string v6, "friends"

    const-string v7, ""

    const-string v8, ""

    move v5, v10

    invoke-direct/range {v3 .. v8}, Lcom/facebook/contacts/h/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/facebook/contacts/h/b;->FRIENDS_CONTENT:Lcom/facebook/contacts/h/b;

    .line 86
    new-instance v3, Lcom/facebook/contacts/h/b;

    const-string v4, "FRIEND_UID"

    const-string v6, "friends"

    const-string v7, "/uid"

    const-string v8, "/#"

    move v5, v11

    invoke-direct/range {v3 .. v8}, Lcom/facebook/contacts/h/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/facebook/contacts/h/b;->FRIEND_UID:Lcom/facebook/contacts/h/b;

    .line 87
    new-instance v3, Lcom/facebook/contacts/h/b;

    const-string v4, "FRIENDS_PREFIX_SEARCH"

    const-string v6, "friends"

    const-string v7, "/search"

    const-string v8, "/*"

    move v5, v12

    invoke-direct/range {v3 .. v8}, Lcom/facebook/contacts/h/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/facebook/contacts/h/b;->FRIENDS_PREFIX_SEARCH:Lcom/facebook/contacts/h/b;

    .line 88
    new-instance v3, Lcom/facebook/contacts/h/b;

    const-string v4, "FRIENDS_BIRTHDAYS"

    const/4 v5, 0x5

    const-string v6, "friends"

    const-string v7, "/birthdays"

    const-string v8, ""

    invoke-direct/range {v3 .. v8}, Lcom/facebook/contacts/h/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/facebook/contacts/h/b;->FRIENDS_BIRTHDAYS:Lcom/facebook/contacts/h/b;

    .line 90
    new-instance v3, Lcom/facebook/contacts/h/b;

    const-string v4, "PAGES_CONTENT"

    const/4 v5, 0x6

    const-string v6, "pages"

    const-string v7, ""

    const-string v8, ""

    invoke-direct/range {v3 .. v8}, Lcom/facebook/contacts/h/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/facebook/contacts/h/b;->PAGES_CONTENT:Lcom/facebook/contacts/h/b;

    .line 91
    new-instance v3, Lcom/facebook/contacts/h/b;

    const-string v4, "PAGE_ID"

    const/4 v5, 0x7

    const-string v6, "pages"

    const-string v7, "/id"

    const-string v8, "/#"

    invoke-direct/range {v3 .. v8}, Lcom/facebook/contacts/h/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/facebook/contacts/h/b;->PAGE_ID:Lcom/facebook/contacts/h/b;

    .line 92
    new-instance v3, Lcom/facebook/contacts/h/b;

    const-string v4, "PAGES_SEARCH"

    const/16 v5, 0x8

    const-string v6, "pages"

    const-string v7, "/search"

    const-string v8, "/*"

    invoke-direct/range {v3 .. v8}, Lcom/facebook/contacts/h/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/facebook/contacts/h/b;->PAGES_SEARCH:Lcom/facebook/contacts/h/b;

    .line 81
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/facebook/contacts/h/b;

    sget-object v1, Lcom/facebook/contacts/h/b;->CONTACTS_CONTENT:Lcom/facebook/contacts/h/b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/h/b;->CONTACT_ID:Lcom/facebook/contacts/h/b;

    aput-object v1, v0, v9

    sget-object v1, Lcom/facebook/contacts/h/b;->FRIENDS_CONTENT:Lcom/facebook/contacts/h/b;

    aput-object v1, v0, v10

    sget-object v1, Lcom/facebook/contacts/h/b;->FRIEND_UID:Lcom/facebook/contacts/h/b;

    aput-object v1, v0, v11

    sget-object v1, Lcom/facebook/contacts/h/b;->FRIENDS_PREFIX_SEARCH:Lcom/facebook/contacts/h/b;

    aput-object v1, v0, v12

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/contacts/h/b;->FRIENDS_BIRTHDAYS:Lcom/facebook/contacts/h/b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/contacts/h/b;->PAGES_CONTENT:Lcom/facebook/contacts/h/b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/contacts/h/b;->PAGE_ID:Lcom/facebook/contacts/h/b;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/contacts/h/b;->PAGES_SEARCH:Lcom/facebook/contacts/h/b;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/contacts/h/b;->$VALUES:[Lcom/facebook/contacts/h/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 98
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 99
    iput-object p3, p0, Lcom/facebook/contacts/h/b;->category:Ljava/lang/String;

    .line 100
    iput-object p4, p0, Lcom/facebook/contacts/h/b;->uriSuffix:Ljava/lang/String;

    .line 101
    iput-object p5, p0, Lcom/facebook/contacts/h/b;->uriMatcherSuffix:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/h/b;
    .locals 1

    .prologue
    .line 81
    const-class v0, Lcom/facebook/contacts/h/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/h/b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/h/b;
    .locals 1

    .prologue
    .line 81
    sget-object v0, Lcom/facebook/contacts/h/b;->$VALUES:[Lcom/facebook/contacts/h/b;

    invoke-virtual {v0}, [Lcom/facebook/contacts/h/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/h/b;

    return-object v0
.end method


# virtual methods
.method public getFullUri()Landroid/net/Uri;
    .locals 2

    .prologue
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/facebook/contacts/h/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/h/b;->category:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/h/b;->uriSuffix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public getMatcherPartialUri()Ljava/lang/String;
    .locals 2

    .prologue
    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/facebook/contacts/h/b;->category:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/h/b;->uriSuffix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/h/b;->uriMatcherSuffix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uriMatcherIndex()I
    .locals 1

    .prologue
    .line 116
    invoke-virtual {p0}, Lcom/facebook/contacts/h/b;->ordinal()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method
