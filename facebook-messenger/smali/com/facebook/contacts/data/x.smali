.class public final Lcom/facebook/contacts/data/x;
.super Ljava/lang/Object;
.source "FbContactsContract.java"


# static fields
.field public static final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/contacts/data/ad;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroid/net/Uri;

.field public final c:Lcom/facebook/contacts/data/z;

.field public final d:Lcom/facebook/contacts/data/aa;

.field public final e:Lcom/facebook/contacts/data/ac;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 127
    sget-object v0, Lcom/facebook/contacts/data/ad;->NAME:Lcom/facebook/contacts/data/ad;

    sget-object v1, Lcom/facebook/contacts/data/ad;->PHONE_E164:Lcom/facebook/contacts/data/ad;

    sget-object v2, Lcom/facebook/contacts/data/ad;->PHONE_NATIONAL:Lcom/facebook/contacts/data/ad;

    sget-object v3, Lcom/facebook/contacts/data/ad;->PHONE_LOCAL:Lcom/facebook/contacts/data/ad;

    invoke-static {v0, v1, v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/data/x;->f:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/d/b/a;)V
    .locals 2

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-string v0, "contacts"

    invoke-virtual {p1, v0}, Lcom/facebook/d/b/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/data/x;->a:Ljava/lang/String;

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/data/x;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/data/x;->b:Landroid/net/Uri;

    .line 34
    new-instance v0, Lcom/facebook/contacts/data/z;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/data/z;-><init>(Lcom/facebook/contacts/data/x;)V

    iput-object v0, p0, Lcom/facebook/contacts/data/x;->c:Lcom/facebook/contacts/data/z;

    .line 35
    new-instance v0, Lcom/facebook/contacts/data/aa;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/data/aa;-><init>(Lcom/facebook/contacts/data/x;)V

    iput-object v0, p0, Lcom/facebook/contacts/data/x;->d:Lcom/facebook/contacts/data/aa;

    .line 36
    new-instance v0, Lcom/facebook/contacts/data/ac;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/data/ac;-><init>(Lcom/facebook/contacts/data/x;)V

    iput-object v0, p0, Lcom/facebook/contacts/data/x;->e:Lcom/facebook/contacts/data/ac;

    .line 37
    return-void
.end method
