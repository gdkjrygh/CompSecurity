.class public Lcom/facebook/contacts/server/FetchContactResult;
.super Lcom/facebook/fbservice/c/a;
.source "FetchContactResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/contacts/server/FetchContactResult;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lcom/facebook/contacts/server/FetchContactResult;


# instance fields
.field private final b:Lcom/facebook/contacts/models/Contact;

.field private final c:Lcom/facebook/contacts/models/ContactDetails;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 21
    new-instance v0, Lcom/facebook/contacts/server/FetchContactResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    const-wide/16 v2, -0x1

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/server/FetchContactResult;-><init>(Lcom/facebook/fbservice/c/b;JLcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V

    sput-object v0, Lcom/facebook/contacts/server/FetchContactResult;->a:Lcom/facebook/contacts/server/FetchContactResult;

    .line 50
    new-instance v0, Lcom/facebook/contacts/server/l;

    invoke-direct {v0}, Lcom/facebook/contacts/server/l;-><init>()V

    sput-object v0, Lcom/facebook/contacts/server/FetchContactResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 38
    const-class v0, Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/Contact;

    iput-object v0, p0, Lcom/facebook/contacts/server/FetchContactResult;->b:Lcom/facebook/contacts/models/Contact;

    .line 39
    const-class v0, Lcom/facebook/contacts/models/ContactDetails;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/ContactDetails;

    iput-object v0, p0, Lcom/facebook/contacts/server/FetchContactResult;->c:Lcom/facebook/contacts/models/ContactDetails;

    .line 40
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/contacts/server/l;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/contacts/server/FetchContactResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;JLcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/ContactDetails;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 32
    iput-object p4, p0, Lcom/facebook/contacts/server/FetchContactResult;->b:Lcom/facebook/contacts/models/Contact;

    .line 33
    iput-object p5, p0, Lcom/facebook/contacts/server/FetchContactResult;->c:Lcom/facebook/contacts/models/ContactDetails;

    .line 34
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/models/Contact;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchContactResult;->b:Lcom/facebook/contacts/models/Contact;

    return-object v0
.end method

.method public b()Lcom/facebook/contacts/models/ContactDetails;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchContactResult;->c:Lcom/facebook/contacts/models/ContactDetails;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FetchContactResult (ts "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/contacts/server/FetchContactResult;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") (contactSummary "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/server/FetchContactResult;->b:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") (freshness "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/contacts/server/FetchContactResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 68
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 69
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchContactResult;->b:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 70
    iget-object v0, p0, Lcom/facebook/contacts/server/FetchContactResult;->c:Lcom/facebook/contacts/models/ContactDetails;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 71
    return-void
.end method
