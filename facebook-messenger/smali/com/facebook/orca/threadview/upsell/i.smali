.class public Lcom/facebook/orca/threadview/upsell/i;
.super Landroid/support/v4/a/a;
.source "MergedThreadsUpsellLoader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/a/a",
        "<",
        "Lcom/facebook/contacts/models/Contact;",
        ">;"
    }
.end annotation


# static fields
.field private static final m:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Lcom/facebook/contacts/e/c;

.field private final o:Ljava/lang/String;

.field private final p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/facebook/orca/threadview/upsell/i;

    sput-object v0, Lcom/facebook/orca/threadview/upsell/i;->m:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 33
    invoke-direct {p0, p1}, Landroid/support/v4/a/a;-><init>(Landroid/content/Context;)V

    .line 34
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 35
    const-class v1, Lcom/facebook/contacts/e/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/e/c;

    iput-object v0, p0, Lcom/facebook/orca/threadview/upsell/i;->n:Lcom/facebook/contacts/e/c;

    .line 36
    iput-object p2, p0, Lcom/facebook/orca/threadview/upsell/i;->o:Ljava/lang/String;

    .line 37
    iput-object p3, p0, Lcom/facebook/orca/threadview/upsell/i;->p:Ljava/lang/String;

    .line 38
    return-void
.end method

.method private a(Lcom/facebook/contacts/e/b;)Lcom/facebook/contacts/models/Contact;
    .locals 3

    .prologue
    .line 78
    sget-object v1, Lcom/facebook/contacts/models/Contact;->a:Lcom/facebook/contacts/models/Contact;

    .line 79
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/contacts/e/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    invoke-virtual {p1}, Lcom/facebook/contacts/e/b;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getProfileFbid()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 86
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/contacts/e/b;->close()V

    .line 87
    return-object v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method private s()Lcom/facebook/contacts/models/Contact;
    .locals 4

    .prologue
    .line 58
    const/4 v0, 0x0

    .line 60
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/i;->n:Lcom/facebook/contacts/e/c;

    iget-object v2, p0, Lcom/facebook/orca/threadview/upsell/i;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/e/c;->a(Ljava/lang/String;)Lcom/facebook/contacts/e/b;
    :try_end_0
    .catch Lcom/facebook/phonenumbers/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 64
    :goto_0
    if-nez v0, :cond_0

    .line 65
    sget-object v0, Lcom/facebook/contacts/models/Contact;->a:Lcom/facebook/contacts/models/Contact;

    .line 67
    :goto_1
    return-object v0

    .line 61
    :catch_0
    move-exception v1

    .line 62
    sget-object v1, Lcom/facebook/orca/threadview/upsell/i;->m:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not parse number: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/threadview/upsell/i;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 67
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/upsell/i;->a(Lcom/facebook/contacts/e/b;)Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    goto :goto_1
.end method

.method private t()Lcom/facebook/contacts/models/Contact;
    .locals 3

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/i;->n:Lcom/facebook/contacts/e/c;

    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/i;->p:Ljava/lang/String;

    sget-object v2, Lcom/facebook/contacts/models/a/a;->MESSAGABLE_TYPES:Lcom/google/common/a/es;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/contacts/e/c;->a(Ljava/lang/String;Lcom/google/common/a/es;)Lcom/facebook/contacts/e/b;

    move-result-object v0

    .line 74
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/upsell/i;->a(Lcom/facebook/contacts/e/b;)Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/upsell/i;->r()Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    return-object v0
.end method

.method protected i()V
    .locals 0

    .prologue
    .line 42
    invoke-super {p0}, Landroid/support/v4/a/a;->i()V

    .line 43
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/upsell/i;->j()V

    .line 44
    return-void
.end method

.method public r()Lcom/facebook/contacts/models/Contact;
    .locals 2

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/threadview/upsell/i;->s()Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    .line 49
    sget-object v1, Lcom/facebook/contacts/models/Contact;->a:Lcom/facebook/contacts/models/Contact;

    if-eq v0, v1, :cond_0

    .line 52
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadview/upsell/i;->t()Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    goto :goto_0
.end method
