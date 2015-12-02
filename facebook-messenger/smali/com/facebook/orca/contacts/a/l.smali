.class public Lcom/facebook/orca/contacts/a/l;
.super Ljava/lang/Object;
.source "ShouldShowInviteAllContactsProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/config/a/a;

.field private final d:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-string v0, "messenger_contacts_invite_all_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/contacts/a/l;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/config/a/a;Lcom/facebook/common/time/a;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/facebook/orca/contacts/a/l;->b:Lcom/facebook/prefs/shared/d;

    .line 37
    iput-object p2, p0, Lcom/facebook/orca/contacts/a/l;->c:Lcom/facebook/config/a/a;

    .line 38
    iput-object p3, p0, Lcom/facebook/orca/contacts/a/l;->d:Lcom/facebook/common/time/a;

    .line 39
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 43
    iget-object v1, p0, Lcom/facebook/orca/contacts/a/l;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/o;->G:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    .line 45
    iget-object v2, p0, Lcom/facebook/orca/contacts/a/l;->b:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/orca/prefs/o;->E:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v2

    .line 47
    iget-object v4, p0, Lcom/facebook/orca/contacts/a/l;->b:Lcom/facebook/prefs/shared/d;

    sget-object v5, Lcom/facebook/orca/prefs/o;->F:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v4, v5, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v4

    .line 50
    iget-object v5, p0, Lcom/facebook/orca/contacts/a/l;->b:Lcom/facebook/prefs/shared/d;

    sget-object v6, Lcom/facebook/orca/contacts/a/l;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v5, v6, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, p0, Lcom/facebook/orca/contacts/a/l;->c:Lcom/facebook/config/a/a;

    invoke-virtual {v5}, Lcom/facebook/config/a/a;->h()Lcom/facebook/config/a/b;

    move-result-object v5

    sget-object v6, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    if-eq v5, v6, :cond_1

    :cond_0
    if-nez v1, :cond_1

    const/4 v1, 0x3

    if-ge v4, v1, :cond_1

    iget-object v1, p0, Lcom/facebook/orca/contacts/a/l;->d:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    sub-long v1, v4, v2

    const-wide/32 v3, 0x48190800

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 20
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/a/l;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
